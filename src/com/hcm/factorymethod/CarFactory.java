package com.hcm.factorymethod;

public class CarFactory implements VehicleFactory{

	public Moveable create() {
		return new Car();
	}

}
