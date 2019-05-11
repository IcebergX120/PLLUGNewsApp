package com.example.newsapplication.utill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Utill {

    public static String DateFormat(String oldstringDate) throws ParseException {
        String newDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("E, d MMM yyyy");
        Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(oldstringDate);
        newDate = dateFormat.format(date);

        return newDate;
    }
}
