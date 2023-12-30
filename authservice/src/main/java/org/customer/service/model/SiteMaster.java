package org.customer.service.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "site_mstr")
@Getter
@Setter
public class SiteMaster {

    @Id
    @GeneratedValue(generator = "SITE_MSTR_GEN", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SITE_MSTR_GEN", sequenceName = "SITE_MSTR_SEQUENCE", initialValue = 3000, allocationSize = 1)
    @Column(name = "SIT_ID")
    public Long id;

    @Column(name = "SIT_NAME")
    public String siteName;

    @Column(name = "SIT_DESC")
    public String siteDescription;

    @Column(name = "SIT_LOG")
    public String siteLog;

    @Column(name = "SIT_EML_ID")
    public String siteEmailId;

    @Column(name = "SIT_PH_NUM")
    public String sitePhoneNumber;

    @Column(name = "SIT_MBL_NUM")
    public String siteMobNumber;

    @Column(name = "ADD_ID")
    public String siteAddId;

    @Column(name = "SIT_CONT_CODE")
    public String siteContCode;
    @Column(name = "CUST_ID")
    public String customerId;
    @Column(name = "ULTY_ID")
    public String utilityId;
    @Column(name = "ZN_ID")
    public String zoneId;
    @Column(name = "LOC_ID")
    public String localId;

    @OneToMany(mappedBy = "siteMaster", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("siteMstr")
    public Set<UserDetailsModel> userDetails;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "CUST_ID", referencedColumnName = "CUST_ID",insertable = false,updatable = false)
//    @JsonBackReference("siteMaster")
//    public CustomerDetailsModel siteCustomerDetailsModel;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID", insertable = false, updatable = false)
//    @JsonBackReference("role")
//    public RoleMaster roleMaster;


}
