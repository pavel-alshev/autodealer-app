package com.company.autodealer.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.Client;

@UiController("autodealer_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}