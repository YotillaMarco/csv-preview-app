package com.exasol.csv.workshop;

import com.exasol.csv.stereotypes.Action;
import lombok.extern.java.Log;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Log
@Action
public class PersonAction {

    @Inject
    private PersonModel personModel;

    public void saveListener(final ActionEvent e) {
        log.info("Person Save Listener " + e);
    }

    public void save() {
        log.info("Person Save Action");
        final String msg = String.format("Welcome %s %s %s", personModel.getFirstName(), personModel.getMiddleName(), personModel.getLastName());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));
    }

}
