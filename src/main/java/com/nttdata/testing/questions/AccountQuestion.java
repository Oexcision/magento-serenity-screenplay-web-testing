package com.nttdata.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class AccountQuestion implements Question<String> {

    private final Target label;

    public AccountQuestion(Target label) {
        this.label = label;
    }

    public static AccountQuestion visibleEn(Target label){
        return new AccountQuestion((label));
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(label).answeredBy(actor);
    }
}
