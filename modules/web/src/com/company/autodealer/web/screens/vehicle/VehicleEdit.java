package com.company.autodealer.web.screens.vehicle;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.Vehicle;

@UiController("autodealer_Vehicle.edit")
@UiDescriptor("vehicle-edit.xml")
@EditedEntityContainer("vehicleDc")
@LoadDataBeforeShow
public class VehicleEdit extends StandardEditor<Vehicle> {
}