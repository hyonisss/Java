package edu.scsa.day3.device;

public class SmartPhone extends Device{

	//변수
	private int ram;
	
	//생성자
	public SmartPhone(String model, double size, String category, int price, int ram)
	{
		super(model, size, category, price);
		this.ram = ram;
	}
	public SmartPhone(String model, double size, String category, int price) 
	{
		super(model, size, category, price);
	}
	public int getRam() 
	{
		return ram;
	}
	public void setRam(int ram) 
	{
		this.ram = ram;
	}
	
	//메소드

	public void call(String num)
	{
		System.out.println(num+"으로 전화를 겁니다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", ram: "+this.ram;
	}
}
