package com.company.autodealer.web.screens.manufacturer;

import com.company.autodealer.entity.VehicleModel;
import com.company.autodealer.service.CountModelsService;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.Manufacturer;

import javax.inject.Inject;

@UiController("autodealer_Manufacturer.browse")
@UiDescriptor("manufacturer-browse.xml")
@LookupComponent("manufacturersTable")
@LoadDataBeforeShow
public class ManufacturerBrowse extends StandardLookup<Manufacturer> {
//    @Inject
//    private CountModelsService countModelsService;
//
//    @Subscribe(id = "manufacturersDl", target = Target.DATA_LOADER)
//    public void onManufacturersDlPostLoad(CollectionLoader.PostLoadEvent<Manufacturer> event) {
//
//        countModelsService.countModels(new Manufacturer());
//        for (Manufacturer manufacturer : event.getLoadedEntities()) {
//            System.out.println(manufacturer);
//
//        };
//
//
//    }







}