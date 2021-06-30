package com.example.demo.parcelcalculator.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.parcelcalculator.logicservice.LogicServiceImpl;
import com.example.demo.parcelcalculator.parcelcostparser.ParcelCostResponse;
	@RestController
	public class WeightParseController {
		@Autowired
		LogicServiceImpl logic;
		WeightGetterSetter weightGetterSetter = new WeightGetterSetter();
		ParcelCostResponse response = new ParcelCostResponse();
		
		@GetMapping("/")
		public ParcelCostResponse getParcel(@RequestParam(value="weight",defaultValue="0")int weight){	
		weightGetterSetter.setWeight(weight);
		response.setCost(logic.compute(weightGetterSetter.getWeight()));
		return response;
		}

	}