package com.company.autodealer.web.screens.purchaserequest;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.PurchaseRequest;

@UiController("autodealer_PurchaseRequest.edit")
@UiDescriptor("purchase-request-edit.xml")
@EditedEntityContainer("purchaseRequestDc")
@LoadDataBeforeShow
public class PurchaseRequestEdit extends StandardEditor<PurchaseRequest> {
}