package org.customer.service.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "city_mstr")
@Getter
@Setter
public class Citymaster {


    @Id
    @GeneratedValue(generator = "CITY_MSTR_GEN", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "CITY_MSTR_GEN", sequenceName = "CITY_MSTR_SEQUENCE", initialValue = 8000, allocationSize = 1)
    @Column(name = "CITY_ID")
    public Long id;

    @Column(name = "CITY_NAME")
    public String cityName;

    @Column(name = "STAT_ID")
    public String stateId;


    @OneToMany(mappedBy = "cityMaster",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonManagedReference("cityMstr")
    public Set<LocalMaster> localMaster;
}
