package com.exasol.csv.stereotypes;

import javax.enterprise.inject.Stereotype;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@ViewScoped
@Named
@Retention(RUNTIME)
@Stereotype
@Target(ElementType.TYPE)
public @interface ViewModel {
}
