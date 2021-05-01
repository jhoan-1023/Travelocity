package co.com.certificacion.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Carros {

    public static final Target CARROS = Target.the("opcion carros")
            .locatedBy("//*[@id='uitk-tabs-button-container']/li[3]/a");

    public static final Target AIRPORT_TRANSPORTATION = Target.the("seleccionar airport transportation")
            .locatedBy("//span[contains(text(),'Airport transportation')]");

    public static final Target BUTTON_AIRPORT = Target.the("boton airport")
            .locatedBy("//button[@aria-label='Airport']");

    public static final Target SEARCH_AIRPORT = Target.the("escribir nombre aeropuerto")
            .locatedBy("//*[@id='location-field-location']");

    public static final Target BUTTON_HOTEL_NAME = Target.the("boton nombre hotel")
            .locatedBy("//button[@aria-label='Hotel name']");

    public static final Target SEARCH_HOTEL_NAME = Target.the("buscar hotel")
            .locatedBy("//*[@id='location-field-hotelName']");

    public static final Target FLIGHT_ARRIVAL_TIME = Target.the("hora de llegada del vuelo")
            .locatedBy("//select[@aria-label='Flight arrival time']");

    public static final Target MENSAJE_ALQUILER_CARRO = Target.the("mensaje alquiler carro")
            .locatedBy("//*[@id='app-layer-base']/main/div[1]/div[2]/div/section/div/section/div[1]/section/div[2]/a");


}
