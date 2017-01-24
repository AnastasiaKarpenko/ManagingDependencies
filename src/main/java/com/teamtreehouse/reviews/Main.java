package com.teamtreehouse.reviews;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

import static java.lang.System.out;

/**
 * Created by anastasia on 24/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer = new CSVPrinter(out, CSVFormat.EXCEL);
            printer.printRecord("Ana", "Karpenko", 5, "Loved it!");
            printer.printRecord("Craig", "Dennis", 4, "Pretty good, would be better with annotation or two");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
