package 권수민_HomeWork;

public class Item {
	//필드
	String name;
	int price;
	//생성자
	Item(String name, int price){
		this.name = name;
		this.price = price;
	}
	//메소드
	void getInfo(){
		System.out.println(name + " : " + price);
	}
	
	}

