package com.Homework.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(


		
		features= "Features" ,
		
		glue = "com.Homework.steps"
		
		
		
		
		
		)



public class TestRunner extends  AbstractTestNGCucumberTests {

}

