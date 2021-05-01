package co.com.certificacion.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.travelocity.userinterface.CosasAHacer.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class CosasAHacer implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ADVENTURE_OUTDOOR, isEnabled()).forNoMoreThan(15).seconds());
        return Text.of(ADVENTURE_OUTDOOR).viewedBy(actor).asString();
    }

    public static CosasAHacer enUnHotel(){
        return new CosasAHacer();
    }
}
