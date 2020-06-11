package com.company.autodealer.web.screens.vehiclecolour;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.VehicleColour;

@UiController("autodealer_Colour.browse")
@UiDescriptor("vehicle-colour-browse.xml")
@LookupComponent("vehicleColoursTable")
@LoadDataBeforeShow
public class VehicleColourBrowse extends StandardLookup<VehicleColour> {
}