package com.company.autodealer.web.screens.country;

import com.company.autodealer.service.DefaultCountryService;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.Country;

import javax.inject.Inject;

@UiController("autodealer_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countriesTable")
@LoadDataBeforeShow
public class CountryBrowse extends StandardLookup<Country> {


    @Inject
    private DefaultCountryService defaultCountryService;

    @Inject
    private Notifications notifications;

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        defaultCountryService.putDefaultCountry();
    }


}