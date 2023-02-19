package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadio10() {
        Radio radio = new Radio();

        radio.setNumberRadio(10);

        int expected = 0;
        int actual = radio.numberRadio;

        Assertions.assertEquals(expected, actual);
        }
    @Test
    public void shouldSetRadio5() {
        Radio radio = new Radio();

        radio.setNumberRadio(5);

        int expected = 5;
        int actual = radio.numberRadio;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadio0() {
        Radio radio = new Radio();

        radio.setNumberRadio(-1);

        int expected = 0;
        int actual = radio.numberRadio;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextNumberRadio() {
        Radio radio = new Radio();
        radio.setNumberRadio(9);
        radio.nextNumberRadio();

        int exp = 0;
        int act = radio.getNumberRadio();

        Assertions.assertEquals(exp, act);
    }
    @Test
    public void shouldNextNumberRadio1() {
        Radio radio = new Radio();
        radio.setNumberRadio(0);
        radio.nextNumberRadio();

        int exp = 1;
        int act = radio.getNumberRadio();

        Assertions.assertEquals(exp, act);
    }
    @Test
    public void shouldNextNumberRadio2() {
        Radio radio = new Radio();
        radio.setNumberRadio(1);
        radio.nextNumberRadio();

        int exp = 2;
        int act = radio.getNumberRadio();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldPrevNumberRadio() {
        Radio radio = new Radio();
        radio.setNumberRadio(0);
        radio.prevNumberRadio();

        int exp = 9;
        int act = radio.getNumberRadio();

        Assertions.assertEquals(exp, act);
    }
    @Test
    public void shouldPrevNumberRadio8() {
        Radio radio = new Radio();
        radio.setNumberRadio(9);
        radio.prevNumberRadio();

        int exp = 8;
        int act = radio.getNumberRadio();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNextVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.nextVolume();

        int exp = 1;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }
    @Test
    public void shouldNextVolume1() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.nextVolume();

        int exp = 1;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }
    @Test
    public void shouldNextVolume10() {
        Radio radio = new Radio();
        radio.setVolume(11);
        radio.nextVolume();

        int exp = 10;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldPrevVolume() {
        Radio radio = new Radio();
        radio.setVolume(11);
        radio.prevVolume();

        int exp = 9;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }
    @Test
    public void shouldPrevVolume0() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.prevVolume();

        int exp = 0;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }
    @Test
    public void shouldPrevVolume00() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.prevVolume();

        int exp = 0;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

}
