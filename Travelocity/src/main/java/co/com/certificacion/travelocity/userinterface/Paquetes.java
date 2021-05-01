package co.com.certificacion.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Paquetes {

    public static final Target BOTON_PAQUETE = Target.the("boton paquete")
            .locatedBy("//*[@id='uitk-tabs-button-container']/li[4]/a");

    public static final Target MENSAJE_PAQUETE = Target.the("mensaje paquete")
            .locatedBy("//*[@id='app-layer-base']/div/main/div/div/div[1]/section/div[3]/div/div[2]/section[2]/ol/li[3]/div/div/div[1]/h3");


}
