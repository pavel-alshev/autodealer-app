package com.company.autodealer.web.screens.purchaserequest;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.PurchaseRequest;

@UiController("autodealer_PurchaseRequest.browse")
@UiDescriptor("purchase-request-browse.xml")
@LookupComponent("purchaseRequestsTable")
@LoadDataBeforeShow
public class PurchaseRequestBrowse extends StandardLookup<PurchaseRequest> {
}