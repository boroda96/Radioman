package ru.netology.radio;

public class Radio {
    public int numberRadio;

    public int getNumberRadio() {
        return numberRadio;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio < 0) {
            return;
        }
        if (newNumberRadio > 9) {
            return;
        }
        numberRadio = newNumberRadio;
    }

    public void nextNumberRadio() {
        if (numberRadio < 9) {
            numberRadio++;
        } else {
            numberRadio = 0;
        }
    }

    public void prevNumberRadio() {
        if (numberRadio > 0) {
            numberRadio--;
        } else {
            numberRadio = 9;
        }
    }

    public int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            newVolume = 0;
        }
        if (newVolume > 10) {
            newVolume = 10;
        }
        volume = newVolume;
    }

    public void nextVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    public void prevVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
