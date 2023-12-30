package org.example.service;


import org.example.dto.Response;
import org.example.dto.UserDetailsDto;
import org.example.model.UserDetailsModel;
import org.example.repository.UserMasterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailService {
    private static final Logger log = LoggerFactory.getLogger(UserDetailService.class);
    @Autowired
    UserMasterRepository userMasterRepository;

    public Response createUser(UserDetailsModel userDetailsModel) {

        try {
            int nextVal = userMasterRepository.getUserSequence();
            userDetailsModel.setPrefixUserId("U-" + String.valueOf(nextVal));
            userMasterRepository.save(userDetailsModel);
            Response response = new Response<>();
            response.setMessage("user created successfully");
            response.setStatus(HttpStatus.OK.value());
            log.info("user created successfully");
            return response;
        } catch (Exception e) {
            log.error("User creation failed due to " + e.getCause());
        }
        return null;
    }

    public UserDetailsDto getUserDetails(Long userId) {

        Optional<UserDetailsModel> userObj = userMasterRepository.findById(userId);
        UserDetailsDto userDetailsDto = new UserDetailsDto();
        if (userObj.isPresent()) {
            UserDetailsModel model = userObj.get();
            userDetailsDto.setUserId(model.getUserId());
            userDetailsDto.setUserName(model.getUserName());
            userDetailsDto.setUserStatus(model.getUserStatus());
        }
        return userDetailsDto;

    }

}
