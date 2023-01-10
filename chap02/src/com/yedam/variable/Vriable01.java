package com.yedam.variable;

public class Vriable01 {
	public static void main(String[] args){
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간"+minute+"분");
		
		int totalMinute = (hour*60)+minute;
		System.out.println("총"+totalMinute+"분");
		
		int value = 0;
		int result = value + 10;
		System.out.println(result);
		
		int x = 3;
		int y = 5;
		//x를 y값으로 변경하고 
		//y는 x의값으로 변경
		
		//대신 담아줄수 있는 변수
		int z = 0;
		//x의 데이터를 미리 z에 담아둔다
		//1) x->z
		//2) y->x(x=5)
		//3) z->y(y=3)
		
		z=x; //1) x->z
		x=y; //2) y->x(x=5)
		y=z; //3) z->y(y=3)
		System.out.println(x + "," + y);
	}
}
