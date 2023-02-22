package ru.netology.domain.radio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
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

    public int getNumberRadio() {
        return this.numberRadio;
    }

    public int getMaxNumberRadio() {
        return this.maxNumberRadio;
    }

    public int getMinNumberRadio() {
        return this.minNumberRadio;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio >= this.minNumberRadio) {
            if (newNumberRadio <= this.maxNumberRadio) {
                this.numberRadio = newNumberRadio;
            }
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume < this.minVolume) {
            newVolume = this.minVolume;
        }

        if (newVolume > this.maxVolume) {
            newVolume = this.maxVolume;
        }

        this.volume = newVolume;
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