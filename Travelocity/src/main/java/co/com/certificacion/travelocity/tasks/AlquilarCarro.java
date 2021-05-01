package co.com.certificacion.travelocity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.certificacion.travelocity.userinterface.Carros.*;
import static co.com.certificacion.travelocity.userinterface.Hoteles.*;

public class AlquilarCarro implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CARROS),
                Click.on(AIRPORT_TRANSPORTATION),
                Click.on(BUTTON_AIRPORT),
                Enter.theValue("Buenos Aires (EZE-Ministro Pistarini Intl.)").into(SEARCH_AIRPORT).thenHit(Keys.ENTER),
                Click.on(BUTTON_HOTEL_NAME),
                Enter.theValue("Arc Abasto Studios").into(SEARCH_HOTEL_NAME).thenHit(Keys.ENTER),
                Click.on(CHECK_IN),
                Click.on(FECHA_IDA),
                Click.on(BOTON_DONE),
                SelectFromOptions.byVisibleText("11:00").from(FLIGHT_ARRIVAL_TIME),
                Click.on(BOTON_SEARCH));

    }

    public static AlquilarCarro conTransporteAeropuerto(){
        return Tasks.instrumented(AlquilarCarro.class);
    }
}
