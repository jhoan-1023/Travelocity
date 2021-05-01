package co.com.certificacion.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Vuelos {

    public static final Target BOTON_VUELO = Target.the("boton vuelo")
            .locatedBy("//*[@id='uitk-tabs-button-container']/li[2]/a");

    public static final Target SELCCIONAR_PASAJEROS = Target.the("seleccionar pasajeros")
            .locatedBy("//a[@data-testid='travelers-field']");

    public static final Target AGREGAR_ADULTO = Target.the("agregar adulto")
            .locatedBy("//*[@id='adaptive-menu']/div/div/section/div[1]/div[1]/div/button[2]");

    public static final Target BOTON_DONE_TRAVELERS = Target.the("boton done travelers")
            .locatedBy("//button[@data-testid='guests-done-button']");

    public static final Target BOTON_CLASE = Target.the("boton clase")
            .locatedBy("//*[@id='preferred-class-input-trigger']");

    public static final Target SELECCIONAR_CLASE = Target.the("seleccionar clase")
            .locatedBy("//*[@id='preferred-class-input']/div/div/a[3]");

    public static final Target LEAVING_FROM = Target.the("Leaving From")
            .locatedBy("//button[@aria-label='Leaving from']");

    public static final Target CIUDAD_ORIGEN = Target.the("ciudad origen")
            .locatedBy("//input[@placeholder='Where are you leaving from?']");

    public static final Target CIUDAD_DESTINO = Target.the("Ciudad destino")
            .located(By.id("location-field-leg1-destination"));

    public static final Target MENSAJE = Target.the("mensaje")
            .locatedBy("//*[@id='app-layer-base']/div[2]/div[3]/div[1]/section/main/div[1]/div[2]");


}
