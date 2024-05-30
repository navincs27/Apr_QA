package com.LimeRoad.hooks;

import com.LimeRoad.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	
	

	@After
	public void getScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			screenshot();
			System.out.println("Hooks executed");
		}
		
	}
}
