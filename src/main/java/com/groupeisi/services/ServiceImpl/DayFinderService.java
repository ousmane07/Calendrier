package com.groupeisi.services.ServiceImpl;

import com.groupeisi.services.ServiceInterface.DayFinderServiceInterface;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class DayFinderService implements DayFinderServiceInterface {

    @Override
    public String findDayOfWeek(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.FRANCE);
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRANCE);
    }


}

