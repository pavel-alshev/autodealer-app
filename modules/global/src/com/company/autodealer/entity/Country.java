package com.company.autodealer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;
import com.haulmont.cuba.core.entity.annotation.ConversionType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "AUTODEALER_COUNTRY")
@Entity(name = "autodealer_Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = 1633905478066743871L;

    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @CaseConversion(type = ConversionType.UPPER)
    @Column(name = "CODE", nullable = false, unique = true)
    protected String code;

    @Column(name = "DEFCOUNTRY")
    protected String defcountry;

    public String getDefcountry() {
        return defcountry;
    }

    public void setDefcountry(String defcountry) {
        this.defcountry = defcountry;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}