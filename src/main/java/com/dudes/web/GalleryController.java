package com.dudes.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by green on 26.05.16.
 */
@RestController
public class GalleryController {
    @RequestMapping(value="/photo", method= RequestMethod.GET)
    public String galleryForm(Model model) {
       // model.addAttribute("gallery", new Gallery());
          model.addAttribute("index");
        return "index";
    }

   /* @RequestMapping(value="/"photo, method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Gallery gallery, Model model) {
        model.addAttribute("Gallery", gallery);
        return "result";
    }*/
}
