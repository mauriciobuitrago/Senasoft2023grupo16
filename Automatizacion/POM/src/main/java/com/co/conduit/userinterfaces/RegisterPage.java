package com.co.conduit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class RegisterPage {


    public static final Target TXT_ENTERYOUREMAILADDRESS = Target.the("ingresar Enter your email address")
            .locatedBy("//*[@autocomplete = 'username']");

    public static final Target TXT_ENTERPASSWORD = Target.the("ingresar Enter password")
            .locatedBy("//*[@id= 'new_password']");

    public static final Target TXT_ENTERPASSWORDCOMFIRM = Target.the("ingresar Enter password comfirm")
            .locatedBy("//*[@id= 'confirmed_password']");



}
