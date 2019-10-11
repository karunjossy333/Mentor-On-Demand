package com.mod.client;

import com.mod.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("authentication")
public interface AuthenticationClient {

    @RequestMapping("/user")
    public UserEntity Users();

}
