package co.com.certificacion.travelocity.stepsdefinitions;

import co.com.certificacion.travelocity.questions.CosasAHacer;
import co.com.certificacion.travelocity.tasks.IngresarATravelocity;
import co.com.certificacion.travelocity.tasks.MirarCosasAHacer;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CosasAHacerStepsDefinitions {

    @Dado("^que el usuario esta en la pagina de travelocity mirando (.*) en un hotel$")
    public void queElUsuarioEstaEnLaPaginaDeTravelocityMirandoCosasQueHacerEnUnHotel(String opcion) {
        theActorInTheSpotlight().attemptsTo(IngresarATravelocity.conClick());
    }

    @Cuando("^se ingresa la informacion del hotel y las fechas$")
    public void seIngresaLaInformacionDelHotelYLasFechas() {
        theActorInTheSpotlight().attemptsTo(MirarCosasAHacer.enUnHotel());
    }

    @Entonces("^podra ver una opcion para hacer (.*)$")
    public void podraVerUnaOpcionParaHacerAdventureAndOutdoor(String cosasAHacer) {
        theActorInTheSpotlight().should(seeThat(CosasAHacer.enUnHotel(), is(equalTo(cosasAHacer))));
    }

}
