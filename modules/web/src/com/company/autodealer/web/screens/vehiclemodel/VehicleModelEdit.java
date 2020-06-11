package com.company.autodealer.web.screens.vehiclemodel;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.VehicleModel;

@UiController("autodealer_VehicleModel.edit")
@UiDescriptor("vehicle-model-edit.xml")
@EditedEntityContainer("vehicleModelDc")
@LoadDataBeforeShow
public class VehicleModelEdit extends StandardEditor<VehicleModel> {
}