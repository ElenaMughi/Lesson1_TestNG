package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldBuyIfLess1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldBuyIfMore1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldBuyIfSumma1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldBuyIfSumma0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);

    }

}