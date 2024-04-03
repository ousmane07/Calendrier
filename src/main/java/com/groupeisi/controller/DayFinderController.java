package com.groupeisi.controller;

import com.groupeisi.services.ServiceImpl.DayFinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/calendar")
public class DayFinderController {

    private final DayFinderService dayFinderService;

    @Autowired
    public DayFinderController(DayFinderService dayFinderService) {
        this.dayFinderService = dayFinderService;
    }

    @GetMapping("/services/calendar/dayfinder")
    public String findDayOfWeek(@RequestParam String date)
    {
        return dayFinderService.findDayOfWeek(date);
    }
}
