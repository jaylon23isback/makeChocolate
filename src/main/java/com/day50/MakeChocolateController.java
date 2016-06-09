package com.day50;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Jaylon Breckenridge on 6/6/2016.
 */
@Controller
public class MakeChocolateController {
    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String home(Model model, HttpSession session) {


        return "home";
    }
}
