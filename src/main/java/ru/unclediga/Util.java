package ru.unclediga;

import javax.validation.ConstraintViolation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class Util {
    public static Date getDate(String str) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> void printViolation(ConstraintViolation<T> violation) {
        System.out.println(">> Constraint Violation:");
        System.out.println("    Bean : " + violation.getRootBeanClass().getName());
        System.out.println("    Field: " + violation.getPropertyPath());
        System.out.println("    Value: " + violation.getInvalidValue());
        System.out.println("    Msg  : " + violation.getMessage());
        System.out.println("    Tmpl : " + violation.getMessageTemplate());
    }

    public static <T> void printViolations(Set<ConstraintViolation<T>> violations) {
        if (violations.size() == 0) {
            System.out.println("No validation errors");
            return;
        }
        for (ConstraintViolation<T> violation : violations) {
            printViolation(violation);
        }
    }
}


