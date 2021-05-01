package co.com.certificacion.travelocity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.certificacion.travelocity.userinterface.Hoteles.*;

public class IngresarATravelocity implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(TRAVELOCITY));

    }

    public static IngresarATravelocity conClick(){
        return Tasks.instrumented(IngresarATravelocity.class);
    }
}
