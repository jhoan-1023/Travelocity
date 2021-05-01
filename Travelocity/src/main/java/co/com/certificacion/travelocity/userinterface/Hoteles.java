package co.com.certificacion.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Hoteles {

    public static final Target TRAVELOCITY = Target.the("hotel")
            .locatedBy("//*[@id='app-layer-base']/div[1]/header/section/div/div/a");

    public static final Target GOING_TO = Target.the("Going to")
            .locatedBy("//button[@aria-label='Going to']");

    public static final Target CIUDAD = Target.the("Ciudad")
            .locatedBy("//*[@id = 'location-field-destination']");

    public static final Target CHECK_IN = Target.the("boton check-in")
            .locatedBy("//*[@id = 'd1-btn']");

    public static final Target FECHA_IDA = Target.the("Fecha ida")
            .locatedBy("//button[@aria-label = 'May 22, 2021']");

    public static final Target BOTON_DONE = Target.the("boton done fecha ida")
            .locatedBy("//span[text () = 'Done']");

    public static final Target CHECK_OUT = Target.the("check-out")
            .locatedBy("//*[@id = 'd2-btn']");

    public static final Target FECHA_REGRESO = Target.the("fecha regreso")
            .locatedBy("//button[@aria-label = 'May 30, 2021']");

    public static final Target BOTON_VIAJEROS = Target.the("boton viajeros")
            .locatedBy("//*[@id= 'adaptive-menu']/div[1]/button");

    public static final Target SELECCIONAR_ADULTOS = Target.the("seleccionar adultos")
            .locatedBy("//*[@id= 'adaptive-menu']/div[2]/div/section/div[1]/div[2]/div/button[2]");

    public static final Target BOTON_DONE_VIAJEROS = Target.the("boton done viajeros")
            .locatedBy("//button[@data-testid='guests-done-button']");

    public static final Target BOTON_SEARCH = Target.the("Boton Search")
            .locatedBy("//button[@data-testid='submit-button']");

    public static final Target ALERTA_COVID = Target.the("aletar covid")
            .locatedBy("//*[@id='app-layer-base']/div/main/div/div/div[1]/section/div[1]/div/div/div/p");


}
