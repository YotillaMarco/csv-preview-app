package com.exasol.csv.workshop;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.inject.Model;

@Model
public class MirrorModel {

    @Getter
    @Setter
    private String text;
}
