package com.company.autodealer.web.screens.legal;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.Legal;

@UiController("autodealer_Legal.edit")
@UiDescriptor("legal-edit.xml")
@EditedEntityContainer("legalDc")
@LoadDataBeforeShow
public class LegalEdit extends StandardEditor<Legal> {
}