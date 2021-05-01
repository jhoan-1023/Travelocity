package co.com.certificacion.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.travelocity.userinterface.Paquetes.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ReservarPaquete implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MENSAJE_PAQUETE, isEnabled()).forNoMoreThan(15).seconds());
        return Text.of(MENSAJE_PAQUETE).viewedBy(actor).asString();
    }

    public static ReservarPaquete conHotel(){
        return new ReservarPaquete();
    }
}
