package co.in.springdemo;


import co.in.springdemo.Coach;
import co.in.springdemo.FortuneService;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new fields for emaolAddress and team 
	
	private String emailAddress;
	private String team;
	
	// create a no-arg constructor
	
	public CricketCoach() {
		System.out.println("Cricket: inside no-arg constructor");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Cricket: inside setter method - setTeam");
		this.team = team;
	}


	// our Setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
