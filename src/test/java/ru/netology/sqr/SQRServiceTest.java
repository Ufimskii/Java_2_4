package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSQRLimitTest() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.SQRCount(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSQRMoreExpectedTest() {
        SQRService service = new SQRService();

        int expected = 5; //изменили ожидаемый предел
        int actual = service.SQRCount(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSQROtherLimitTest() {
        SQRService service = new SQRService();

        int expected = 3; // верное условие при заявленных граничных значениях -- int expected = 90;
        int actual = service.SQRCount(100, 10000);

        assertEquals(expected, actual);
    }
}