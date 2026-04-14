package section3;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="E:\\self-automation-script\\prac1\\cucumber_project1\\src\\test\\java\\section3\\featuresFiles\\firstProgram.feature",
		glue="section3.stepDefinitions",
		monochrome = true)
public class TestNGRunner extends AbstractTestNGCucumberTests{
	

}
