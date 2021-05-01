package co.com.certificacion.travelocity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.certificacion.travelocity.userinterface.CosasAHacer.*;
import static co.com.certificacion.travelocity.userinterface.Hoteles.*;

public class MirarCosasAHacer implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(OPCION_COSAS_A_HACER),
                Click.on(COSAS_A_HACER_EN),
                Enter.theValue("San Andres y Providencia").into(CIUDAD_ELEGIDA).thenHit(Keys.ENTER),
                Click.on(CHECK_IN),
                Click.on(FECHA_IDA),
                Click.on(BOTON_DONE),
                Click.on(CHECK_OUT),
                Click.on(FECHA_REGRESO),
                Click.on(BOTON_DONE),
                Click.on(BOTON_SEARCH));

    }

    public static MirarCosasAHacer enUnHotel(){
        return Tasks.instrumented(MirarCosasAHacer.class);
    }
}
