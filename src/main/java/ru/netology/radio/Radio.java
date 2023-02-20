package ru.netology.radio;

public class Radio {
    private int numberRadio;
    private int volume;

    public int getNumberRadio() {
        return numberRadio;
    }

    public int getVolume() {
        return volume;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio < 0) {
            return;
        }
        if (newNumberRadio > 9) {
            return;
        }
        this.numberRadio = newNumberRadio;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            newVolume = 0;
        }
        if (newVolume > 10) {
            newVolume = 10;
        }
        this.volume = newVolume;
    }

    public void nextNumberRadio() {
        if (numberRadio < 9) {
            numberRadio++;
        } else {
            setNumberRadio(0);
        }
    }

    public void prevNumberRadio() {
        if (numberRadio > 0) {
            numberRadio--;
        } else {
            setNumberRadio(9);
        }
    }

    public void nextVolume() {
        if (volume < 10) {
            volume++;
        } else {
            setVolume(10);
        }
    }

    public void prevVolume() {
        if (volume > 0) {
            volume--;
        } else {
            setVolume(0);
        }
    }
}
