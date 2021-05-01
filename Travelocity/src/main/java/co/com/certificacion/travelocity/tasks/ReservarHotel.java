package co.com.certificacion.travelocity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.certificacion.travelocity.userinterface.Hoteles.*;

public class ReservarHotel implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(GOING_TO),
                Enter.theValue("Santa Marta").into(CIUDAD).thenHit(Keys.ENTER),
                Click.on(CHECK_IN),
                Click.on(FECHA_IDA),
                Click.on(BOTON_DONE),
                Click.on(CHECK_OUT),
                Click.on(FECHA_REGRESO),
                Click.on(BOTON_DONE),
                Click.on(BOTON_VIAJEROS),
                Click.on(SELECCIONAR_ADULTOS),
                Click.on(BOTON_DONE_VIAJEROS),
                Click.on(BOTON_SEARCH));


    }

    public static ReservarHotel conDatos(){
        return Tasks.instrumented(ReservarHotel.class);
    }
}
