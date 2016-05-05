package br.uol.ps.campanha.tests.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/", plugin = { "pretty", "html:target/cucumber" })
public class RunCampanhaTest {

}
