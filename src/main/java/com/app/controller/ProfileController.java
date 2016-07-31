package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Marcin on 31.07.2016.
 */

@Controller
public class ProfileController {
    @RequestMapping("/profile")
    public String displayProfile() {
        return "profile/profilePage";
    }
}
