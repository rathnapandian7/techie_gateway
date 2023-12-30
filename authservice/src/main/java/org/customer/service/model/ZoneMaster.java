package org.customer.service.model;


import lombok.Data;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "zone_mstr")
@Data
public class ZoneMaster {

    @Id
    @GeneratedValue(generator = "ZONE_MSTR_GEN", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "ZONE_MSTR_GEN", sequenceName = "ZONE_MSTR_SEQUENCE", initialValue = 60000, allocationSize = 1)
    @Column(name = "ZN_ID")
    public Long id;

    @Column(name = "ZN_NAME")
    public String zoneName;

    @Column(name = "CUST_ID")
    public String customerId;

    @Column(name = "CITY_ID")
    public String cityId;

    @Column(name = "STAT_ID")
    public String stateId;

    @Column(name = "CONT_ID")
    public String countryId;

    @Column(name = "PN_CD_ID")
    public String pinCodeId;

    @Column(name = "ZN_IS_ACT")
    public String zoneIsActive;

    @OneToMany(mappedBy = "zoneMaster",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonManagedReference("zonemstr")
    public Set<UserDetailsModel> userDetails;



    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference("pinMstr")
    @JoinColumn(name = "PN_CD_ID", referencedColumnName = "PN_CD_ID", insertable = false, updatable = false)
    public PinMaster pinMaster;

}
