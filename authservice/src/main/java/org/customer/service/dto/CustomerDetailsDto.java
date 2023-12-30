package org.customer.service.dto;


import lombok.Data;
import org.customer.service.model.SiteMaster;
import org.customer.service.model.UserDetailsModel;

import java.util.Set;

@Data
public class CustomerDetailsDto {
    public Long id;

    public String prefixCUstomerId;

    public String customerName;

    public String customerDescription;

    public String utilityId;

    public String customerProfileLog;

    public String customerPaymentType;

    public String customerMailId;

    public String customerPhoneNumber;

    public String customerMbleNumber;

    public String customerAddId;

    public String customerContactCode;

    public String customerModType;

    public String customerIsActive;

    public String customerStatus;

    public Set<UserDetailsModel> userDetailsModelList;

    public Set<SiteMaster> siteMasterList;

}
