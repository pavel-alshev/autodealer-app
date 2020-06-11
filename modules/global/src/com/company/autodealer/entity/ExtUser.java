package com.company.autodealer.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Extends(User.class)
@Entity(name = "autodealer_ExtUser")
public class ExtUser extends User {
    private static final long serialVersionUID = -39054246635888977L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @ManyToOne // (fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    protected Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


}