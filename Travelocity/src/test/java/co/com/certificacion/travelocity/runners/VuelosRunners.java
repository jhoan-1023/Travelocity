package co.com.certificacion.travelocity.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/vuelos.feature",
        glue = "co.com.certificacion.travelocity.stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "",dryRun = false)

public class VuelosRunners {
}
