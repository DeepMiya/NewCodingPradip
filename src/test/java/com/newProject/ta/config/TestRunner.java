package com.newProject.ta.config;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (features="src/test/resources/features",
                glue="com.newProject.ta.steps",
                stepNotifications = true,
                tags = "(@Valid)",
                dryRun=true,
                monochrome =true,
                plugin = {
                        "pretty",                                        // For pretty console output
                        "json:target/test-result/cucumber.json",         // Generates JSON report
                        "html:target/test-result/cucumber-html-report"   // Generates HTML report
                }

        )

public class TestRunner {
}
