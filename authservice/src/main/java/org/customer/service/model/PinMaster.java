package org.customer.service.model;


import lombok.Data;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "city_mstr")
@Data
public class PinMaster {


    @Id
    @GeneratedValue(generator = "PIN_MSTR_GEN", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "PIN_MSTR_GEN", sequenceName = "PIN_MSTR_SEQUENCE", initialValue = 10000, allocationSize = 1)
    @Column(name = "PN_CD_ID")
    public Long id;

    @Column(name = "PN_NAME")
    public String pinName;
    @Column(name = "CITY_ID")
    public String cityId;


    @OneToMany(mappedBy = "pinMaster",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonManagedReference("pinMstr")
    public Set<ZoneMaster> zoneMaster;
}
