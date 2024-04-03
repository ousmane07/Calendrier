package com.groupeisi.entities;


import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

@Entity
public class DayFinder {

    public Long id;
    public LocalDate date;
    public String dayOfWeek;

    public DayFinder(Long id, String dateString) {
        this.id = id;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.FRANCE);
        this.date = LocalDate.parse(dateString, formatter);
        this.dayOfWeek = this.date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRANCE);
    }



    public LocalDate getDate() {
        return date;
    }
    public LocalDate getId() {
        return date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

}
