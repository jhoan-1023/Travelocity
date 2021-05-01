package co.com.certificacion.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import static co.com.certificacion.travelocity.userinterface.Vuelos.MENSAJE;

public class ValidarPrecioVuelo implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MENSAJE, isEnabled()).forNoMoreThan(15).seconds());
        return Text.of(MENSAJE).viewedBy(actor).asString();
    }

    public static ValidarPrecioVuelo enLaOferta(){
        return new ValidarPrecioVuelo();
    }
}
