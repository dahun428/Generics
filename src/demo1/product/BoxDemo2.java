package demo1.product;

public class BoxDemo2 {
	public static void main(String[] args) {

		
		// Tv가 타입파라미터로 지정된 Box 객체
		Box<Tv> box1 = new Box<Tv>();
		box1.add(new Tv("초대형 Tv",50000,100.5));
		
		
		// SmartPhone이 타입파라미터로 지정된 Box 객체
		Box<SmartPhone> box2 = new Box<SmartPhone>();
		box2.add(new SmartPhone("IPhone", 150500,"010-1234-4245", "121.454.2121.21."));
		
		
		//Product가 타입파라미터로 지정된 Box 객체
		//Product , Product의 자손인 Tv, Product의 자손인 SmartPhone객체도 다룰 수있다.
		Box<Product> box3 = new Box<Product>();
		box3.add(new Product("노트북",2000000));
		box3.add(new Tv("초대형 Tv",50000,100.5));
		box3.add(new SmartPhone("IPhone", 150500,"010-1234-4245", "121.454.2121.21."));
		String name = box3.get().getName();
		int price = box3.get().getPrice();
		System.out.println(name);
		System.out.println(price);
		
		
		
	}
}
