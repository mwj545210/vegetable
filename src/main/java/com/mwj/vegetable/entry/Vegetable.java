package com.mwj.vegetable.entry;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by MWJ on 2017/12/25.
 */
@Table
@Entity
public class Vegetable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "VEGETABLE_ID", unique = true, nullable = false, insertable = true, updatable = true)
    private int vegetableId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID", nullable = false)
    private Company company;

    @Column(name = "VEGETABLE_NAME", unique = false, nullable = false, insertable = true, updatable = true)
    private String vegetableName;

    @Column(name = "PRICE", unique = false, nullable = false, insertable = true, updatable = true)
    private String price;

    @Column(name = "TOTAL", unique = false, nullable = false, insertable = true, updatable = true)
    private String total;

    @Column(name = "REMARK", unique = false, nullable = false, insertable = true, updatable = true)
    private String remark;

    public Vegetable() {
    }

    public int getVegetableId() {
        return vegetableId;
    }

    public void setVegetableId(int vegetableId) {
        this.vegetableId = vegetableId;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

