package co.com.certificacion.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CosasAHacer {

    public static final Target OPCION_COSAS_A_HACER = Target.the("opcion cosas a hacer")
            .locatedBy("//*[@id='uitk-tabs-button-container']/li[5]/a");

    public static final Target COSAS_A_HACER_EN = Target.the("cosas a hacer en")
            .locatedBy("//*[@id='location-field-location-menu']/div[1]/button");

    public static final Target CIUDAD_ELEGIDA = Target.the("ciudad")
            .located(By.id("location-field-location"));

    public static final Target ADVENTURE_OUTDOOR = Target.the("adventure and outdoor")
            .locatedBy("//*[@id='slim-category-list']/div/div/ul/li[2]/a");
}
