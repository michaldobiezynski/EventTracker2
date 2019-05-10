package com.pluralsight.controller;

import com.pluralsight.Model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

    @RequestMapping(value="/event.html", method = RequestMethod.GET)
        public String displayEventPage(Model model) {
            Event event = new Event();
            event.setName("Java User Group");
            model.addAttribute("event", event);

            return "event";
        }

    @RequestMapping(value="/event.html", method = RequestMethod.POST)
        public String processEvent(@ModelAttribute("event") Event event) {
        System.out.println(event);

        return "event";
    }
}
