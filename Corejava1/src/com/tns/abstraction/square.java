package com.tns.abstraction;

public class square extends shape {
	private float side;
	public square() {
		super();
	this.side=2.0f;
	}
public square(float side) {
	super();
	this.side=side;
}
	void calarea() {
		super.area=side*side;
	}
public String toString() {
	return"square[side="+side+"]";
}


}
