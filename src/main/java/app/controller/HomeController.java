package app.controller;

import app.model.Value;
import app.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Matts on 19.04.2017.
 */
@Controller
public class HomeController {

    @Autowired
    StatsService service;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String upload() {

        return "upload";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uploadPost(Model model, @RequestParam(value = "value") double value) {
        service.updateStats(new Value(value));

        return "upload";
    }

    @RequestMapping(value = "/uploadJson", method = RequestMethod.POST)
    public String uploadJsonPost(Model model, @RequestParam(value = "value") String json) {
        service.updateStatsJson(json);

        return "upload";
    }

    @RequestMapping(value = "/stats", method = RequestMethod.GET)
    public String stats(Model model) {
        model.addAttribute("valuesList", service.getValues());
        model.addAttribute("statsJson", service.getStatsJSON());
        return "stats";
    }

}
