package com.day50;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by Jaylon Breckenridge on 6/6/2016.
 */
@RestController
public class MakeChocolateJSON {
    @RequestMapping(path = "/make.json", method = RequestMethod.GET)
    public ChocolateSolution getAllBars(int small, int big, int goal) {
        ChocolateSolver chocolateSolver = new ChocolateSolver();
        ChocolateSolution getChoco =  chocolateSolver.makeChocolate(small, big, goal);

        return getChoco;
    }
    @RequestMapping(path = "/addInput.json", method = RequestMethod.POST)
    public ChocolateSolution getBars(HttpSession session, @RequestBody ChocolateInput input) throws Exception {
        ChocolateSolver chocolateSolver = new ChocolateSolver();
        ChocolateSolution getChoco =  chocolateSolver.makeChocolate(input.small, input.bigs,input.goal);

        return getChoco;
    }


}
