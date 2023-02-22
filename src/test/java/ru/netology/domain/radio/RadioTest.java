package ru.netology.domain.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetSize() {
        Radio radio = new Radio(15);
        Assertions.assertEquals(0, radio.getMinNumberRadio());
        Assertions.assertEquals(14, radio.getMaxNumberRadio());
        Assertions.assertEquals(0, radio.getNumberRadio());

    }

    @Test
    public void shouldSetDefaultRadio() {
        Assertions.assertEquals(9, 9);
    }

    @Test
    public void shouldSetRadio10() {

        radio.setNumberRadio(10);

        int expected = 0;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadio5() {

        radio.setNumberRadio(5);

        int expected = 5;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadio0() {

        radio.setNumberRadio(-1);

        int expected = 0;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextNumberRadio() {
        radio.setNumberRadio(9);
        radio.nextNumberRadio();

        int exp = 0;
        int act = radio.getNumberRadio();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNextNumberRadio1() {
        radio.setNumberRadio(0);
        radio.nextNumberRadio();

        int exp = 1;
        int act = radio.getNumberRadio();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNextNumberRadio2() {
        radio.setNumberRadio(1);
        radio.nextNumberRadio();

        int exp = 2;
        int act = radio.getNumberRadio();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldPrevNumberRadio() {
        radio.setNumberRadio(0);
        radio.prevNumberRadio();

        int exp = 9;
        int act = radio.getNumberRadio();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldPrevNumberRadio8() {
        radio.setNumberRadio(9);
        radio.prevNumberRadio();

        int exp = 8;
        int act = radio.getNumberRadio();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldDefaultVolume() {
        Assertions.assertEquals(100, 100);

    }

    @Test
    public void shouldNextVolume() {
        radio.setVolume(-1);
        radio.nextVolume();

        int exp = 1;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNextVolume1() {
        radio.setVolume(0);
        radio.nextVolume();

        int exp = 1;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNextVolume100() {
        radio.setVolume(101);
        radio.nextVolume();

        int exp = 100;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldPrevVolume() {
        radio.setVolume(100);
        radio.prevVolume();

        int exp = 99;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldPrevVolume0() {
        radio.setVolume(1);
        radio.prevVolume();

        int exp = 0;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldPrevVolume00() {
        radio.setVolume(0);
        radio.prevVolume();

        int exp = 0;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }


    @Test
    void getNumberRadio() {
    }

    @Test
    void getMaxNumberRadio() {
    }

    @Test
    void getMinNumberRadio() {
    }

    @Test
    void getVolume() {
    }

    @Test
    void setNumberRadio() {
    }

    @Test
    void setVolume() {
    }

    @Test
    void nextNumberRadio() {
    }

    @Test
    void prevNumberRadio() {
    }

    @Test
    void nextVolume() {
    }

    @Test
    void prevVolume() {
    }

    @Test
    void getMaxVolume() {
    }

    @Test
    void getMinVolume() {
    }

    @Test
    void setMaxNumberRadio() {
    }

    @Test
    void setMinNumberRadio() {
    }

    @Test
    void setMaxVolume() {
    }

    @Test
    void setMinVolume() {
    }

    @Test
    void testGetNumberRadio() {
    }

    @Test
    void testGetMaxNumberRadio() {
    }

    @Test
    void testGetMinNumberRadio() {
    }

    @Test
    void testGetVolume() {
    }

    @Test
    void testSetNumberRadio() {
    }

    @Test
    void testSetVolume() {
    }

    @Test
    void testNextNumberRadio() {
    }

    @Test
    void testPrevNumberRadio() {
    }

    @Test
    void testNextVolume() {
    }

    @Test
    void testPrevVolume() {
    }

    @Test
    void testGetMaxVolume() {
    }

    @Test
    void testGetMinVolume() {
    }

    @Test
    void testSetMaxNumberRadio() {
    }

    @Test
    void testSetMinNumberRadio() {
    }

    @Test
    void testSetMaxVolume() {
    }

    @Test
    void testSetMinVolume() {
    }
}