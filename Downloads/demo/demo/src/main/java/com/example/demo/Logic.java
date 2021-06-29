package com.example.demo;

public class Logic {
	int cost=0;
	String costString;
	public String compute(int weight){
		if(weight<6 && weight>-1) {
			cost = weight*10; 
			}else if(weight>4 && weight<11) {
			cost = weight*20; 	
			}else if(weight>9 && weight<21) {
			cost = weight*30; 	
			}else {
			
			return "rejected Parcel";
			}
			costString=Integer.toString(cost);
			
			return "Php "+costString;
	}

}
