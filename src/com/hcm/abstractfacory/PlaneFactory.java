package com.hcm.abstractfacory;

public class PlaneFactory implements VehicleFactory{

	public Moveable create() {
		return new Plane();
	}

}
