package com.company.autodealer.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.Client;

@UiController("autodealer_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}