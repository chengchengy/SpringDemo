package com.luv2code.springdemo;

import com.luv2code.springdemo.FortuneService;

public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}
