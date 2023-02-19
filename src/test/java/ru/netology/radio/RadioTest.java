package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioAndVolume() {
        Radio radio = new Radio();

        radio.setNumberRadio(12);
        radio.setVolume(-1);

        int expectedN = 0;
        int expectedV = 0;

        int actualN = radio.numberRadio;
        int actualV = radio.volume;

        Assertions.assertEquals(expectedN, actualN);
        Assertions.assertEquals(expectedV, actualV);
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
    public void shouldPrevNumberRadio() {
        Radio radio = new Radio();
        radio.setNumberRadio(0);
        radio.prevNumberRadio();

        int exp = 9;
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
    public void shouldPrevVolume() {
        Radio radio = new Radio();
        radio.setVolume(9);
        radio.prevVolume();

        int exp = 8;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

}
