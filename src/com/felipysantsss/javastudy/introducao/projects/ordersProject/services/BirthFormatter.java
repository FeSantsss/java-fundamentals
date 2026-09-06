package com.felipysantsss.javastudy.introducao.projects.ordersProject.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;


// convert String -> LocalDate
public class BirthFormatter {
    public static LocalDate formatter(String birth){
        DateTimeFormatter formatterParttern = DateTimeFormatter
                .ofPattern("dd/MM/uuuu")
                .withResolverStyle(ResolverStyle.STRICT);

        try {
            return LocalDate.parse(birth, formatterParttern);
        } catch (DateTimeParseException e){
            throw new DateTimeParseException("Invalid date! Try again.",
                    e.getParsedString(),
                    e.getErrorIndex());
        }
    }
}
