package com.company.autodealer.web.screens.manufacturer;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.Manufacturer;

@UiController("autodealer_Manufacturer.edit")
@UiDescriptor("manufacturer-edit.xml")
@EditedEntityContainer("manufacturerDc")
@LoadDataBeforeShow
public class ManufacturerEdit extends StandardEditor<Manufacturer> {
}