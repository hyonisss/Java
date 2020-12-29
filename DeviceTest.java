package edu.scsa.day3.device;

public class DeviceTest {

	public static void main(String[] args) {
		
		//DeviceMgr mgr = new DeviceMgr();
		DeviceMgr mgr = DeviceMgr.getInstance();
		SmartPhone sp1 = new SmartPhone("GA_SM_001",8.8, "SP", 150000, 128);
		SmartPhone sp2 = new SmartPhone("GA_SM_001",8.8, "SP", 150000, 128);
		SmartTV st1 =  new SmartTV("SM_TV_001", 75, "TV", 3000000, "스탠드");
		SmartTV st2 =  new SmartTV("SM_TV_001", 75, "TV", 3000000, "스탠드");
		
		boolean res1 = mgr.addDevice(st1);
		boolean res2 = mgr.addDevice(st2);
		System.out.println("res1 : " + res1 + ", res2 :" + res2);
		 
		mgr.showAllDevInfo();
		
//		for(int i=0; i<mgr.getAllDevice().length; i++)
//		{
//			System.out.println(mgr.getAllDevice()[i].toString());
//		}
	}

}
