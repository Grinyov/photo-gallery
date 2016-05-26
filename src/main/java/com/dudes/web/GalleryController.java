package com.dudes.web;

import com.dudes.model.Gallery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by green on 26.05.16.
 */
//@RestController
@Controller
public class GalleryController {
    @RequestMapping(value="/photo", method= RequestMethod.GET)
    public String galleryForm(Model model) {
        //model.addAttribute("gallery", new Gallery());
        return "index";
    }

    @RequestMapping(value="/photo", method=RequestMethod.POST)
    public String Submit(@ModelAttribute Gallery gallery, Model model) {
        model.addAttribute("Gallery", gallery);
        return "result";
    }
}
