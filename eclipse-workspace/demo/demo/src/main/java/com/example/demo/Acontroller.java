package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
	@RestController
	public class Acontroller {
		@Autowired
		LogicServiceImpl logic;
		Data data;
		ParcelCostResponse response;
			
		@GetMapping("/")
		public ParcelCostResponse getParcel(@RequestParam(value="weight",defaultValue="0")int weight){	
			data.setWeight(weight);
		    response.setCost(logic.compute(data.getWeight()));

		 return response;
		}
	}