package com.company.autodealer.web.screens.vehicle;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.Vehicle;

@UiController("autodealer_Vehicle.browse")
@UiDescriptor("vehicle-browse.xml")
@LookupComponent("vehiclesTable")
@LoadDataBeforeShow
public class VehicleBrowse extends StandardLookup<Vehicle> {
}