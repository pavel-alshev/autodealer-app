package com.company.autodealer.web.screens.vehiclemodel;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.VehicleModel;

@UiController("autodealer_VehicleModel.browse")
@UiDescriptor("vehicle-model-browse.xml")
@LookupComponent("vehicleModelsTable")
@LoadDataBeforeShow
public class VehicleModelBrowse extends StandardLookup<VehicleModel> {
}