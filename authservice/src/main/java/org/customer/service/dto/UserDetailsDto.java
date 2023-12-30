package org.customer.service.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UserDetailsDto {

    public Long userId;

    public String customerId;
    public String userName;

    public String userPassword;

    public String userFirstName;

    public String userMiddleName;

    public String userLastName;


    public String userIsActive;

    public String userPhoneNumber;

    public String userMblNumber;

    public String contCode;

    public String zoneCodeId;

    public String locId;

    public String usermailId;


    public String sitId;

    public String roleid;

    public String userStatus;

    public String utilityId;

}
