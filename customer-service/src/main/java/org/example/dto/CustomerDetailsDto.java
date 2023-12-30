package org.example.dto;


import lombok.Data;
import org.example.model.SiteMaster;
import org.example.model.UserDetailsModel;

import java.util.Set;

@Data
public class CustomerDetailsDto {
    private Long id;

    private String prefixCUstomerId;

    private String customerName;

    private String customerDescription;

    private String utilityId;

    private String customerProfileLog;

    private String customerPaymentType;

    private String customerMailId;

    private String customerPhoneNumber;

    private String customerMbleNumber;

    private String customerAddId;

    private String customerContactCode;

    private String customerModType;

    private String customerIsActive;

    private String customerStatus;

    private Set<UserDetailsModel> userDetailsModelList;

    private Set<SiteMaster> siteMasterList;

}
