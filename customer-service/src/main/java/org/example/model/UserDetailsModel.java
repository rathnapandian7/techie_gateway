package org.example.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USER_DTL")
@Getter
@Setter
public class UserDetailsModel {

    @Id
    @GeneratedValue(generator = "USER_DETL_GEN", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "USER_DETL_GEN", sequenceName = "USER_SEQUENCE", initialValue = 80000, allocationSize = 1)

    @Column(name = "USR_ID")
    public Long userId;

    @Column(name = "USR_NAME")
    public String userName;

    @Column(name = "USR_PASWD")
    public String userPassword;

    @Column(name = "PREFIX_USER_ID")
    public String prefixUserId;
    @Column(name = "USR_FST_NAME")
    public String userFirstName;

    @Column(name = "USR_MDL_NAME")
    public String userMiddleName;

    @Column(name = "USR_LST_NAME")
    public String userLastName;


    @Column(name = "USR_IS_ACT")
    public String userIsActive;

    @Column(name = "USR_PH_NUM")
    public String userPhoneNumber;

    @Column(name = "USR_MBL_NUM")
    public String userMblNumber;

    @Column(name = "CONT_ID")
    public String contCode;

    @Column(name = "ZN_ID")
    public String zoneCodeId;

    @Column(name = "LOC_ID")
    public String locId;

    @Column(name = "USR_EML_ID")
    public String usermailId;

    @Column(name = "CUST_ID_FK")
    public Long customerId;

    @Column(name = "SIT_ID")
    public String sitId;

    @Column(name = "ROLE_ID")
    public String roleId;

    @Column(name = "USR_STUS")
    public String userStatus;

    @Column(name = "ULTY_ID")
    public String utilityId;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CUST_ID_FK", referencedColumnName = "CUST_ID",insertable = false, updatable = false)
    @JsonBackReference
    public CustomerDetailsModel cutomerCustomerDetailsModel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID", insertable = false, updatable = false)
    @JsonBackReference("role")
    public RoleMaster roleMaster;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ULTY_ID", referencedColumnName = "ULTY_ID", insertable = false, updatable = false)
    @JsonBackReference("utility")
    public UtilityMaster utilityMaster;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference("siteMstr")
    @JoinColumn(name = "SIT_ID", referencedColumnName = "SIT_ID", insertable = false, updatable = false)
    public SiteMaster siteMaster;


    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference("localMstr")
    @JoinColumn(name = "LOC_ID", referencedColumnName = "LOC_ID", insertable = false, updatable = false)
    public LocalMaster localMaster;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference("zonemstr")
    @JoinColumn(name = "ZN_ID", referencedColumnName = "ZN_ID", insertable = false, updatable = false)
    public ZoneMaster zoneMaster;


    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference("country")
    @JoinColumn(name="CONT_ID",referencedColumnName = "CONT_ID", insertable = false, updatable = false)
    public CountryMaster countryMaster;



//    @ManyToOne(fetch = FetchType.EAGER)
//    @JsonBackReference("state")
//    @JoinColumn(name="STAT_ID",referencedColumnName = "STAT_ID", insertable = false, updatable = false)
//    public StateMaster stateMaster;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JsonBackReference("pin")
//    @JoinColumn(name="PN_CD_ID",referencedColumnName = "PN_CD_ID", insertable = false, updatable = false)
//    public StateMaster pinMaster;
}