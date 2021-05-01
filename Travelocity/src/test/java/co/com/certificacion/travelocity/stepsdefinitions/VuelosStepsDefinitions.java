package co.com.certificacion.travelocity.stepsdefinitions;

import co.com.certificacion.travelocity.questions.ValidarPrecioVuelo;
import co.com.certificacion.travelocity.tasks.IngresarATravelocity;
import co.com.certificacion.travelocity.tasks.ReservarVuelo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VuelosStepsDefinitions {

    @Dado("^que el usuario esta en la pagina de travelocity reservando (.*)$")
    public void queElUsuarioEstaEnLaPaginaDeTravelocityReservandoVuelos(String opcion) {
        theActorInTheSpotlight().attemptsTo(IngresarATravelocity.conClick());

    }

    @Cuando("^el usuario selecciona un vuelo de ida y regreso en la clase de negocios$")
    public void elUsuarioSeleccionaUnVueloDeIdaYRegresoEnLaClaseDeNegocios() {
        theActorInTheSpotlight().attemptsTo(ReservarVuelo.conInformacion());
    }

    @Entonces("^podra ver el mensaje (.*)$")
    public void podraVerElPrecioDelVuelo$(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ValidarPrecioVuelo.enLaOferta(), is(equalTo(mensaje))));
    }


}
