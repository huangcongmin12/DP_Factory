package com.hcm.abstractfacory;

public class Client {
	
	public static void main(String[] args) {
		VehicleFactory factory = new PlaneFactory();
		//VehicleFactory factory = new PlaneFactory();
		Moveable m = factory.create();
		m.run();
	}

}
