package com.mwj.vegetable.entry;

import javax.persistence.*;

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
}
