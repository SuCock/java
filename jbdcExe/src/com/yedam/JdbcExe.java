package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExe {
	public static void main(String[] args) {
		// jdbc 라이브러리로 오라클 데이터 CRUD작업.
		// 1.ojdbc.jar라이브러리 추가.
		// 2.Connection 객체. db연결 쿼리를 실행하고 그 실행결과를 받아오는 통로.
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "insert into employees(employee_id, job_id, last_name, email, hire_date)"
				+ "values(300, 'IT_PROG', '홍', 'Hong@email.com',sysdate)";

		// sql = "delete from employees where employee_id = 300";

		sql = "update employees set first_name = '길동' where employee_id = 300"; // 300번의 first_name을 길동으로 지정

		// jdbc driver정상인지 확인.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 에러.");
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "hr";

		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("연결성공!!");

			stmt = conn.createStatement(); // 쿼리해석, 실행, 처리결과를 가져오는 클래스.

			int r = stmt.executeUpdate(sql); // insert, update, delete

			rs = stmt.executeQuery("select * from employees order by employee_id"); // 가지고 온 데이터를 rs에 담아둔다.(조회)

			while (rs.next()) {
				System.out.println("사원번호 : " + rs.getInt("employee_id") + " / " + // rs의 칼럼값을 int타입으로 가져오겠다.
						"이름 : " + rs.getString("first_name") + " / " + "이메일 : " + rs.getString("email") + " / " + "급여 : "
						+ rs.getInt("salary"));
			}
			System.out.println("end of records");
		} catch (SQLException e) {
			System.out.println("처리실패!!");
			e.printStackTrace();
		}
	}
}
