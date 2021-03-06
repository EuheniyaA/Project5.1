package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"range1, 0, 99, 0",
            "range2, 0, 100, 1",
            "range3, 100, 1000, 22",
            "range4, 100, 9801, 90",
            "range5, 200, 300, 3",
            "range6, 400, 600, 5",
            "range7, 9800, 9801, 1",
            "range8, 9802, 10000, 0"})
    void shouldNumberOfSqr(String testName, int lowerRange, int upperRange, int expected) {
        SQRService service = new SQRService();
        int actual = service.numberOfSqr(lowerRange, upperRange);
        assertEquals(expected, actual);
    }
}