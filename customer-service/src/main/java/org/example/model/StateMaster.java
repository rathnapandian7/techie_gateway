package org.example.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "stat_mstr")
@Data
public class StateMaster {

    @Id
    @GeneratedValue(generator = "STAT_MSTR_GEN", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "STAT_MSTR_GEN", sequenceName = "STAT_MSTR_SEQUENCE", initialValue = 90000, allocationSize = 1)
    @Column(name = "STAT_ID")
    public Long id;

    @Column(name = "STAT_NAME")
    public String stateName;
    @Column(name = "CONT_ID")
    public String countryId;


//    @OneToMany(mappedBy = "stateMaster",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    @JsonManagedReference("localmstr1")
//    public Set<LocalMaster> localMasterlist;
}
