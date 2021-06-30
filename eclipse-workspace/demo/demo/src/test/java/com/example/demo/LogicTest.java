package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LogicTest {


	LogicService logic = new LogicService();
	Data data = new Data();
	@Test
	public void initialValue(){
		// 0 will be the 
		assertEquals("Php 0",logic.compute(data.getWeight()));
		System.out.println(data.getWeight()+" is the initial value of weight");
	}
	@Test
	public void notVoid(){
		// 0 will be the 
		assertNotNull(logic.compute(data.getWeight()));
		System.out.println("Not Null");
	}

}
