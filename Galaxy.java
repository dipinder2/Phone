package com.dipinder.phone;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via fingerprint";
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("carrier:"+getCarrier()+" v:"+getVersionNumber());
	}

}
