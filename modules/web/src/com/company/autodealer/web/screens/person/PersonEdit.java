package com.company.autodealer.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.company.autodealer.entity.Person;

@UiController("autodealer_Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
@LoadDataBeforeShow
public class PersonEdit extends StandardEditor<Person> {
}