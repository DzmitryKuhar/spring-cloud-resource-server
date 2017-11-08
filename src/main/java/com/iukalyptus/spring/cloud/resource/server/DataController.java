package com.iukalyptus.spring.cloud.resource.server;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * <p>
 * Date: 10/08/2017
 *
 * @author Dzmitry Kuhar
 */

@RestController
public class DataController {

    @PreAuthorize("#oauth2.hasScope('write_users')")
    @PostMapping("/user2")
    public String test(@RequestHeader(value = "Authorization") String authorizationHeader,
                       Principal currentUser) {
        return "hello";
    }

    @PreAuthorize("#oauth2.hasScope('read_users')")
    @GetMapping("/user")
    public String test2(@RequestHeader(value = "Authorization") String authorizationHeader,
                        Principal currentUser) {
        return "world";
    }
}
