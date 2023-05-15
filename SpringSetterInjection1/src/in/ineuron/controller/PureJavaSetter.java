package in.ineuron.controller;

import java.util.Date;

import in.ineuron.Bean.WishMessageGenerator;

public class PureJavaSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WishMessageGenerator wmg=new WishMessageGenerator();
		System.out.println("TARGET OBJECT IS::"+wmg);
		
		Date date = new java.util.Date();
		System.out.println("DEPENDENT OBJECT IS::"+date);
		
		wmg.setDate(date);
		
		wmg.wishMessage("sachin");

	}

}
