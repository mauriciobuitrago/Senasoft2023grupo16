package com.co.conduit.tasks;

import com.co.conduit.models.LoginData;
import com.co.conduit.userinterfaces.OptionComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    LoginData loginData;

    public Login(LoginData loginData) {
        this.loginData = loginData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OptionComponent.BTN_LOGIN),
                Enter.theValue(loginData.getEmail()).into(OptionComponent.TXT_ENTERYOUREMAILADDRESS),
                Click.on(OptionComponent.BTN_CONTINUITIES),
                Enter.theValue(loginData.getPassword()).into(OptionComponent.TXT_ENTERPASSWORDLOGIN),
                Click.on(OptionComponent.BTN_CONTINUITIES));




    }


    public static Login enter(LoginData loginData){

        return Tasks.instrumented(Login.class, loginData);
    }


}


