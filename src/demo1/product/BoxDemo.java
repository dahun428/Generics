package demo1.product;

public class BoxDemo {
	public static void main(String[] args) {
	
		//String 이 타입파라미터로 지정된 BOX 객체
		Box<String> box1 = new Box<String>();
		box1.add("hi");
		String x = box1.get();
		System.out.println(x);
		
		
		//Product가 타입파라미터로 지정된 BOX 객체
		Box<Product> box2 = new Box<Product>();
		box2.add(new Product());
		box2.get().setName("jung");
		box2.get().setPrice(1000);
		String name = box2.get().getName();
		int price = box2.get().getPrice();
		System.out.println("["+name+"] , ["+price+"]");
		
	}
}
