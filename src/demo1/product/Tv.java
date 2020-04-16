package demo1.product;

public class Tv extends Product{

	private double inch;
	
	public Tv() {
		// TODO Auto-generated constructor stub
	}

	public Tv(String name, int price, double inch) {
		super(name, price);
		this.inch = inch;
	}

	public double getInch() {
		return inch;
	}

	public void setInch(double inch) {
		this.inch = inch;
	}
	
	
}
