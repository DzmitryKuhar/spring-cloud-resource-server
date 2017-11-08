package com.iukalyptus.spring.cloud.resource.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 * Date: 10/08/2017
 *
 * @author Dzmitry Kuhar
 */

@Controller
public class ViewController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
