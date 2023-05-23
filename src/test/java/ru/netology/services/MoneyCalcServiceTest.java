package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyCalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    public void TestCounter (int expected, int income, int expences, int threshhold) {

        MoneyCalcService service = new MoneyCalcService();

        int actual = service.calculate(income,expences,threshhold);


        Assertions.assertEquals(expected,actual);

    }
}