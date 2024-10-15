package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features= {"src/test/resources/MyCucumberProjuct/F05UserName&Password.feature"},
                 glue ={"com.stepDefenation"})
public class R05UserName {

}
