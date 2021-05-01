package co.com.certificacion.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static co.com.certificacion.travelocity.userinterface.Carros.*;

public class AlquilarCarro implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MENSAJE_ALQUILER_CARRO, isEnabled()).forNoMoreThan(15).seconds());
        return Text.of(MENSAJE_ALQUILER_CARRO).viewedBy(actor).asString();
    }

    public static AlquilarCarro enElAeropuerto(){
        return new AlquilarCarro();
    }
}
