package com.co.conduit.tasks;

import com.co.conduit.userinterfaces.OptionComponent;
import com.co.conduit.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Stay implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(OptionComponent.BTN_REGISTER));
        actor.attemptsTo(Enter.theValue("Morrisito.cerquita@gmail.com").into(OptionComponent.TXT_ENTERYOUREMAILADDRESS));
        actor.attemptsTo(Click.on(OptionComponent.BTN_REGISTER));

    }







}
