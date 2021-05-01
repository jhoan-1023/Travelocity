package co.com.certificacion.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.certificacion.travelocity.userinterface.Hoteles.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ValidarAlertaCovid implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ALERTA_COVID, isEnabled()).forNoMoreThan(15).seconds());
        return Text.of(ALERTA_COVID).viewedBy(actor).asString();
    }

    public static ValidarAlertaCovid EnLaPagina(){
        return new ValidarAlertaCovid();
    }
}
