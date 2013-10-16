package com.hcm.abstractfacory;

public class CarFactory implements VehicleFactory{

	public Moveable create() {
		return new Car();
	}

}
