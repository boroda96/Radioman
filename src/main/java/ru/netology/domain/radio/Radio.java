package ru.netology.domain.radio;

import lombok.*;

@NoArgsConstructor
@Data
public class Radio {
    private int maxNumberRadio = 9;
    private int minNumberRadio = 0;
    private int numberRadio = minNumberRadio;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;

    public Radio(int number) {
        this.maxNumberRadio = this.minNumberRadio + number - 1;
    }

    public void nextNumberRadio() {
        if (this.numberRadio < this.maxNumberRadio) {
            ++this.numberRadio;
        } else {
            this.setNumberRadio(this.minNumberRadio);
        }

    }

    public void prevNumberRadio() {
        if (this.numberRadio > this.minNumberRadio) {
            --this.numberRadio;
        } else {
            this.setNumberRadio(this.maxNumberRadio);
        }

    }

    public void nextVolume() {
        if (this.volume < this.maxVolume) {
            ++this.volume;
        } else {
            this.setVolume(this.maxVolume);
        }

    }

    public void prevVolume() {
        if (this.volume > this.minVolume) {
            --this.volume;
        } else {
            this.setVolume(this.minVolume);
        }

    }

}