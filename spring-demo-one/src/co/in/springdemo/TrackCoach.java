package co.in.springdemo;

public class TrackCoach implements Coach {
	
	
	// define a private field for the dependency
		private FortuneService fortuneService;
		
		// define a constructor for dependency injection
		
		public TrackCoach() {
			
		}
		
		public TrackCoach(FortuneService theFortuneService) {
			
			fortuneService = theFortuneService;
		}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It: "+ fortuneService.getFortune();
	}
	
	// add an init method
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

}
