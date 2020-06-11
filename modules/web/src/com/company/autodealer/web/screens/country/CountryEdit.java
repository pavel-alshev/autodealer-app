package com.company.autodealer.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.Country;

@UiController("autodealer_Country.edit")
@UiDescriptor("country-edit.xml")
@EditedEntityContainer("countryDc")
@LoadDataBeforeShow
public class CountryEdit extends StandardEditor<Country> {
}