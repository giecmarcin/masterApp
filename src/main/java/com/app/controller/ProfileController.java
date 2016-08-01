package com.app.controller;

import com.app.dto.ProfileForm;
import com.app.services.UsLocalDateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Locale;

/**
 * Created by Marcin on 31.07.2016.
 */

@Controller
public class ProfileController {
    @RequestMapping("/profile")
    public String displayProfile(ProfileForm profileForm) {
        return "profile/profilePage";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String saveProfile(@Valid ProfileForm  profileForm, BindingResult result){
        if(result.hasErrors()){
            return "/profile/profilePage";
        }
        System.out.println("Pomyślnie zapisano");
        return  "redirect:/profile";
    }

    @ModelAttribute("dateFormat")
    public String localeFormat(Locale locale) {
        return UsLocalDateFormatter.getPattern(locale);
    }
}
