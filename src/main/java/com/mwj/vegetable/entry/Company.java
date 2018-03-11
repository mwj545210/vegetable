package com.mwj.vegetable.entry;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Table
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "COMPANY_ID", unique = true, nullable = false, insertable = true, updatable = true)
    private int companyId;

    @Column(name = "COMPANY_NAME", unique = false, nullable = false, insertable = true, updatable = true)
    private int companyName;

    @Column(name = "COMPANY_CODE", unique = false, nullable = false, insertable = true, updatable = true)
    private int companyCode;

    @Column(name = "OWNER_NAME", unique = false, nullable = false, insertable = true, updatable = true)
    private int ownerName;

    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.REMOVE}, fetch = FetchType.EAGER, mappedBy = "vegetable")
    private Set<Vegetable> vegetables = new HashSet<>();

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getCompanyName() {
        return companyName;
    }

    public void setCompanyName(int companyName) {
        this.companyName = companyName;
    }

    public int getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(int companyCode) {
        this.companyCode = companyCode;
    }

    public int getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(int ownerName) {
        this.ownerName = ownerName;
    }

    public Set<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(Set<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }
}
