package com.co.conduit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OptionComponent {



    public static final Target BTN_REGISTER = Target.the("clic en el elemento register")
            .locatedBy("//*[contains(@href,'https://account.booking.com/auth/oauth2?client_id=v') and @data-testid = 'header-sign-up-button']");

    public static final Target BTN_LOGIN = Target.the("clic en el elemento register")
            .locatedBy("//*[contains(@href,'https://account.booking.com/auth/oauth2?client_id=v') and @data-testid = 'header-sign-up-button']");

    public static final Target BTN_CONTINUITIES = Target.the("clic boton continue with email")
            .locatedBy("//button[@type='submit']");
    public static final Target TXT_ENTERYOUREMAILADDRESS = Target.the("ingresar Enter your email address")
            .locatedBy("//*[@autocomplete = 'username']");

    public static final Target TXT_ENTERPASSWORD = Target.the("ingresar Enter password")
            .locatedBy("//*[@id= 'new_password']");
    public static final Target TXT_ENTERPASSWORDLOGIN = Target.the("ingresar Enter password")
            .locatedBy("//*[@id= 'password']");



}
