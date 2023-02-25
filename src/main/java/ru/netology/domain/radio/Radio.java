package ru.netology.domain.radio;

import lombok.*;


@Getter
@NoArgsConstructor


public class Radio {
    private int maxNumberRadio = 9;
    private int minNumberRadio = 0;
    private int numberRadio = minNumberRadio;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;

   public Radio(int number) {
        maxNumberRadio = minNumberRadio + number - 1;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio < minNumberRadio) {
            return;
        }
        if (newNumberRadio > maxNumberRadio) {
            return;
        }
        this.numberRadio = newNumberRadio;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            newVolume = minVolume;
        }
        if (newVolume > maxVolume) {
            newVolume = maxVolume;
        }
        this.volume = newVolume;
    }

    public void nextNumberRadio() {
        if (numberRadio < maxNumberRadio) {
            numberRadio++;
        } else {
            setNumberRadio(minNumberRadio);
        }
    }

    public void prevNumberRadio() {
        if (numberRadio > minNumberRadio) {
            numberRadio--;
        } else {
            setNumberRadio(maxNumberRadio);
        }
    }

    public void nextVolume() {
        if (volume < maxVolume) {
            volume++;
        } else {
            setVolume(maxVolume);
        }
    }

    public void prevVolume() {
        if (volume > minVolume) {
            volume--;
        } else {
            setVolume(minVolume);
        }
    }
}