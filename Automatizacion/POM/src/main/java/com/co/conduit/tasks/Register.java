package com.co.conduit.tasks;

import com.co.conduit.models.RegisterData;
import com.co.conduit.userinterfaces.OptionComponent;
import com.co.conduit.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {
RegisterData registerData;

    public Register(RegisterData registerData) {
        this.registerData = registerData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OptionComponent.BTN_REGISTER),
                Enter.theValue(registerData.getEmail()).into(RegisterPage.TXT_ENTERYOUREMAILADDRESS),
                Click.on(OptionComponent.BTN_CONTINUITIES),
                Enter.theValue(registerData.getPassword()).into(RegisterPage.TXT_ENTERPASSWORD),
                Enter.theValue(registerData.getPassword()).into(RegisterPage.TXT_ENTERPASSWORDCOMFIRM   ),
                Click.on(OptionComponent.BTN_CONTINUITIES));




    }


    public static Register enter(RegisterData registerData){

        return Tasks.instrumented(Register.class, registerData);
    }


}
