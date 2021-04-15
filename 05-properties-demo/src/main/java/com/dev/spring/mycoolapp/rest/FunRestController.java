package com.dev.spring.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@Value("${coach.name}")
	public String coachName;
	@Value("${team.name}")
	public String teamName;
	
	@GetMapping("/teaminfo")
	public String getTeamInfo()
	{
		return "Coach : "+coachName+" , Team Name : "+teamName;
	}
	@GetMapping("/")
	public String sayHello()
	{
		return "Hello Tabish Today's Date and Time is Happening Right Now is "+LocalDateTime.now();
	}
	
	// expose a new endpoint for "workout"
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5K!"; 
	}
	
	@GetMapping("/fortune")
	public String gatDailyFortune()
	{
		return "Today is your lucky day!"; 
	}
	
	@GetMapping("/greet")
	public String Hello()
	{
		return "Good Morning Tabish";
	}
}
