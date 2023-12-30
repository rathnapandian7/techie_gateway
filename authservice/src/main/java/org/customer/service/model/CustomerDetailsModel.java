package org.customer.service.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CUST_DTL")
@Getter
@Setter
public class CustomerDetailsModel implements Serializable {

    @Id
    @GeneratedValue(generator = "CUST_DETL_GEN", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "CUST_DETL_GEN", sequenceName = "CUSTOMER_SEQUENCE", initialValue = 70000, allocationSize = 1)
    @Column(name = "CUST_ID")
    public Long id;
    @Column(name = "PREFIX_CUST_ID")
    public String prefixCUstomerId;
    @Column(name = "CUST_NAME")
    public String customerName;
    @Column(name = "CUST_DESC")
    public String customerDescription;
    @Column(name = "ULTY_ID")
    public String utilityId;
    @Column(name = "CUST_PRFL_LOG")
    public String customerProfileLog;
    @Column(name = "CUST_PYMT_TYP")
    public String customerPaymentType;
    @Column(name = "CUST_EML_ID")
    public String customerMailId;
    @Column(name = "CUST_PH_NUM")
    public String customerPhoneNumber;
    @Column(name = "CUST_MBL_NUM")
    public String customerMbleNumber;
    @Column(name = "CUST_ADD_ID")
    public String customerAddId;
    @Column(name = "CUST_CONT_CODE")
    public String customerContactCode;
    @Column(name = "CUST_MOD_TYP")
    public String customerModType;
    @Column(name = "CUST_IS_ACT")
    public String customerIsActive;
    @Column(name = "CUST_STUS")
    public String customerStatus;


    @OneToMany(mappedBy = "cutomerCustomerDetailsModel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<UserDetailsModel> userDetailsModelHashSet = new HashSet<>();



}

