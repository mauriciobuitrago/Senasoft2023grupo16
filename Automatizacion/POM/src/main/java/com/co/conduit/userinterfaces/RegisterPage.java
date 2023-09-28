package com.co.conduit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {




    public static final Target TXT_ENTERYOUREMAILADDRESS = Target.the("ingresar Enter your email address")
            .locatedBy("//*[@placeholder='Enter your email address']");


    public static final Target BTN_CONTINUEWITHEMAIL = Target.the("clic boton continue with email")
            .locatedBy("//button[@type='submit']");
        }