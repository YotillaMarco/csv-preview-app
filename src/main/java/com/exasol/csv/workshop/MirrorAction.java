package com.exasol.csv.workshop;

import com.exasol.csv.stereotypes.Action;

import javax.inject.Inject;

@Action
public class MirrorAction {

    @Inject
    private MirrorModel model;

    public void onKeyUpEvent() {
        model.setText(model.getText().toUpperCase());
    }
}
