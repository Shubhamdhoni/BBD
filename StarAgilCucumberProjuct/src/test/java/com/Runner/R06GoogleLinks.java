package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/MyCucumberProjuct/MyCucumberProjuct/F06GoogleLinks.feature"},
                 glue= {"com.stepDefenation"} ,
                 tags = "@AllLinks" ,
                 publish = true)
  //tags is used to run single or double      
// tags ="@Gmail" it will run only Gmail
//tags ="@GmailTest OR ImageTest" it will run both gmail & image
//tags = "Not @Gmail" it will skip only Gmail & rum all  
// tags = "@AllLinks" Run all tags
// publish = true    it will generate Report 
public class R06GoogleLinks {

}
