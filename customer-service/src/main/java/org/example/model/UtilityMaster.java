package org.example.model;


import lombok.Data;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ulty_mstr")
@Data
public class UtilityMaster {

    @Id
    @GeneratedValue(generator = "ULTY_MSTR_GEN", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "ULTY_MSTR_GEN", sequenceName = "UTLY_MSTR_SEQUENCE", initialValue = 20000, allocationSize = 1)
    @Column(name = "ULTY_ID")
    public Long id;

    @Column(name = "ULTY_NAME")
    public String utilityName;

    @Column(name = "ULTY_IS_ACT")
    public String utilityIsActive;

    @OneToMany(mappedBy = "utilityMaster",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonManagedReference("utility")
    public Set<UserDetailsModel> utilityUserDetail;

}
