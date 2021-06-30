package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Data{
int weight;

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}
}
