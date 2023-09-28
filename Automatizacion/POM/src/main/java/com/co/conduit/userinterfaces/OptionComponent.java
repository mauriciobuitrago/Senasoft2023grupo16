package com.co.conduit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OptionComponent {

    public  static final Target BTN_IGNORE = Target.the("clic en el elemento ignore")
            .locatedBy("//button[@type = 'button'  and @class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561' ]");


    public static final Target BTN_REGISTER = Target.the("clic en el elemento register")
            .locatedBy("//*[contains(@href,'https://account.booking.com/auth/oauth2?client_id=v') and @aria-label = 'Create an account']");

}
