package org.example.model;


import lombok.Data;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cont_mstr")
@Data
public class CountryMaster {

    @Id
    @GeneratedValue(generator = "CONT_MSTR_GEN", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "CONT_MSTR_GEN", sequenceName = "CONT_MSTR_SEQUENCE", initialValue = 50000, allocationSize = 1)
    @Column(name = "CONT_ID")
    public Long id;

    @Column(name = "CONT_NAME")
    public String countryName;

    @OneToMany(mappedBy = "countryMaster",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonManagedReference("country")
    public Set<UserDetailsModel> countryUserModelList;

}
