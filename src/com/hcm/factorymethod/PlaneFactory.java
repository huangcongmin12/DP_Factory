package com.hcm.factorymethod;

public class PlaneFactory implements VehicleFactory{

	public Moveable create() {
		return new Plane();
	}

}
