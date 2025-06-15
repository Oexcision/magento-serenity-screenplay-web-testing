package com.nttdata.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class SearchQuestion implements Question<String> {

    private final Target label;

    public SearchQuestion(Target label) {
        this.label = label;
    }

    public static SearchQuestion visibleEn(Target label){
        return new SearchQuestion((label));
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(label).answeredBy(actor);
    }
}
