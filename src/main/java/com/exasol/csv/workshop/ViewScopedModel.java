package com.exasol.csv.workshop;

import lombok.Getter;
import lombok.Setter;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class ViewScopedModel {

    @Getter
    @Setter
    private String value;

}
