package edu.scsa.day3.device;

public class DeviceMgr {
	
	private static DeviceMgr devMgr = new DeviceMgr();
	
	//폰, TV 저장할 배열 선언 : 5개
	private Device devArr[];
	private int index;
	
	//생성자
	private DeviceMgr() {
		devArr = new Device[5];
	}
	

	//정상 추가되면 true, 추가 x false 리턴
	public boolean addDevice(Device dev) {
		//기존에 값이 추가되어 있으면 추가하지 말것...
		if(index>=devArr.length) return false;
		for (Device device : devArr) {
			if(device.equals(dev)) return false;
		}
		devArr[index++] = dev;
		return true;
	}
	
	//전체 디바이스 정보 출력...
	public void showAllDevInfo() {
		for (Device device : getAllDevice()) {
			System.out.println(device.toString());
		}
	}
	
	//정상적으로 들어가 있는 데이터만 배열로 만들어 return
	public Device[] getAllDevice() {
		Device tmpArr[] = new Device[index];
		System.arraycopy(devArr, 0, tmpArr, 0, devArr.length);
		return tmpArr;
	}
	
}
