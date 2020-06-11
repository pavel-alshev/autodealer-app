package com.company.autodealer.web.screens.vehiclecolour;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.VehicleColour;

@UiController("autodealer_Colour.edit")
@UiDescriptor("vehicle-colour-edit.xml")
@EditedEntityContainer("vehicleColourDc")
@LoadDataBeforeShow
public class VehicleColourEdit extends StandardEditor<VehicleColour> {
}