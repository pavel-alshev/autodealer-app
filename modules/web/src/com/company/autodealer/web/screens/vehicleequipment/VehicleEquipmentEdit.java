package com.company.autodealer.web.screens.vehicleequipment;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.VehicleEquipment;

@UiController("autodealer_VehicleEquipment.edit")
@UiDescriptor("vehicle-equipment-edit.xml")
@EditedEntityContainer("vehicleEquipmentDc")
@LoadDataBeforeShow
public class VehicleEquipmentEdit extends StandardEditor<VehicleEquipment> {
}