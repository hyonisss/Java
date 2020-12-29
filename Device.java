package edu.scsa.day3.device;

public class Device {
	//변수 선언
	private String model;
	private double size;
	private String category;
	private int price;
	//생성자
	public Device(String model, double size, String category, int price)
	{
		this.model = model;
		this.size = size;
		this.category= category;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//메소드
	public void showDevInfo()
	{
		System.out.println(toString());
	}
	
	public String toString()
	{
		return "model: "+this.model+", size: "+this.size+", category: "+this.category+", price: "+this.price;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Device) {
			Device cmp = (Device) obj;
			if(model.equals(cmp.model) &&category.equals(cmp.category)) {
				return true;
			}
		}
		return false;
	}
}
