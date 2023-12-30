package org.customer.service.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "loc_mstr")
@Data
public class LocalMaster {

    @Id
    @GeneratedValue(generator = "LOCAL_MSTR_GEN", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LOCAL_MSTR_GEN", sequenceName = "LOCAL_MSTR_SEQUENCE", initialValue = 40000, allocationSize = 1)
    @Column(name = "LOC_ID")
    public Long id;

    @Column(name = "LOC_NAME")
    public String localName;

    @Column(name = "CUST_ID")
    public String customerId;

    @Column(name = "CITY_ID")
    public String cityId;

    @Column(name = "STAT_ID")
    public String stateId;

    @Column(name = "PN_CD_ID")
    public String pinCodeId;

    @Column(name = "LOC_IS_ACT")
    public String localIsActive;


    @Column(name = "LOC_STUS")
    public String localStatus;

    @Column(name = "ULTY_ID")
    public Long utilityId;

    @OneToMany(mappedBy = "localMaster",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonManagedReference("localMstr")
    public Set<UserDetailsModel> userDetails;


    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference("cityMstr")
    @JoinColumn(name="CITY_ID",referencedColumnName = "CITY_ID", insertable = false, updatable = false)
    public Citymaster cityMaster;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JsonBackReference("localmstr1")
//    @JoinColumn(name="STAT_ID",referencedColumnName = "STAT_ID", insertable = false, updatable = false)
//    public StateMaster stateMaster;


}
