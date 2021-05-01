package co.com.certificacion.travelocity.interations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BuscarInformacionDeInteres implements Interaction {

    String opcion;

    public BuscarInformacionDeInteres(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on("//span[contains(text(),'" + opcion + "')]"));

    }

    public static BuscarInformacionDeInteres enSesion(String opcion){
        return Tasks.instrumented(BuscarInformacionDeInteres.class, opcion);
    }
}
