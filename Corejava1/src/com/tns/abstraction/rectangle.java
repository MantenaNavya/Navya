package com.tns.abstraction;

public class rectangle extends shape {
	private float width;
	private float height;
	void calarea() {
		super.area =height*width;
		}
	public rectangle() {
		super();
	this.width=0.5f;
	this.height=2.5f;
	}

public rectangle(float height,float width) {
				super();
				this.width=width;
				this.height=height;
}
			public String toString() {
				return"rectangle[height="+height+",width="+width+"]";
				
			}
			
		}


