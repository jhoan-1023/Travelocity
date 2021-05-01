package co.com.certificacion.travelocity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.certificacion.travelocity.userinterface.Paquetes.*;
import static co.com.certificacion.travelocity.userinterface.Vuelos.*;
import static co.com.certificacion.travelocity.userinterface.Hoteles.*;

public class ReservarPaquete implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BOTON_PAQUETE),
                Click.on(LEAVING_FROM),
                Enter.theValue("Medellin (MDE - Jose Maria Cordova Intl.)").into(CIUDAD_ORIGEN).thenHit(Keys.ENTER),
                Click.on(GOING_TO),
                Enter.theValue("Santa Marta (SMR - Simon Bolivar)").into(CIUDAD).thenHit(Keys.ENTER),
                Click.on(CHECK_IN),
                Click.on(FECHA_IDA),
                Click.on(BOTON_DONE),
                Click.on(CHECK_OUT),
                Click.on(FECHA_REGRESO),
                Click.on(BOTON_DONE),
                Click.on(BOTON_SEARCH));

    }

    public static ReservarPaquete conHotel(){
        return Tasks.instrumented(ReservarPaquete.class);
    }
}
