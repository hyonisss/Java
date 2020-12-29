package edu.scsa.day3.device;

public class SmartTV extends Device {
	private String installType;

	// 생성자

	public SmartTV(String model, double size, String category, int price) {
		super(model, size, category, price);
	}

	public SmartTV(String model, double size, String category, int price, String installType) {
		super(model, size, category, price);
		this.installType = installType;
	}

	public String getInstallType() {
		return installType;
	}

	public void setInstallType(String installType) {
		this.installType = installType;
	}

	// 메소드
	public void playMovie(String title) {
		System.out.println(title + "을 play 합니다...");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", installType: "+installType;
	}
}
