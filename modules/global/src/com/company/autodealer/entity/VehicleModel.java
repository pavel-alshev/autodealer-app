package com.company.autodealer.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "AUTODEALER_VEHICLE_MODEL")
@Entity(name = "autodealer_VehicleModel")
public class VehicleModel extends StandardEntity {
    private static final long serialVersionUID = -7551410446395949811L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "vehicleModel")
    protected List<VehicleEquipment> equipment;
    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MANUFACTURER_ID")
    protected Manufacturer manufacturer;

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<VehicleEquipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<VehicleEquipment> equipment) {
        this.equipment = equipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}