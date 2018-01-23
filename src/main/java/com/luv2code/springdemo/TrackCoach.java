package com.luv2code.springdemo;

import com.luv2code.springdemo.Coach;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

	//add an init method
	//during initilaze
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: init");
	}


	//add a destroy method. during destroy bean
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: cleanup");
	}
}










