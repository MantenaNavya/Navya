package com.tns.overload;

public class overloadtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sphere s=new sphere();
		System.out.println(s.volume(6));
		System.out.println(s.volume(6.6f));
		System.out.println(s.volume(6.2f,3.4f,7.8f));
	}

}
