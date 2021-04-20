package com.exasol.csv.stereotypes;

import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@ConversationScoped
@Named
@Retention(RUNTIME)
@Stereotype
@Target(ElementType.TYPE)
public @interface ConversationModel {
}
