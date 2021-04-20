package com.exasol.csv.stereotypes;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@SessionScoped
@Named
@Retention(RUNTIME)
@Stereotype
@Target(ElementType.TYPE)
public @interface SessionModel {
}
