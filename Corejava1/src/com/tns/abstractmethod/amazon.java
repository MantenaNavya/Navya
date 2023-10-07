package com.tns.abstractmethod;
import java.util.Scanner;

public class amazon {
	public static void main(String[] args) {
		int amt;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		amt=sc.nextInt();
		Accounts a;
		a=new Nonprime(amt);
		a.delivarycharges(amt);
	}

}
