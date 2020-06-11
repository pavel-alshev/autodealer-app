package com.company.autodealer.web.screens.vehicleequipment;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.VehicleEquipment;

@UiController("autodealer_VehicleEquipment.browse")
@UiDescriptor("vehicle-equipment-browse.xml")
@LookupComponent("vehicleEquipmentsTable")
@LoadDataBeforeShow
public class VehicleEquipmentBrowse extends StandardLookup<VehicleEquipment> {
}