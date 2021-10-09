package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(
            10,
            100
    );

    @Test
    public void shouldSwitchRadioStationOnMIn() {
        radio.setCurrentRadioStation(8);
        radio.switchRadioStationOnMin();
        radio.switchRadioStationOnMin();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationOnMax() {
        radio.setCurrentRadioStation(1);
        radio.switchRadioStationOnMax();
        radio.switchRadioStationOnMax();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationByOne() {
        radio.setCurrentRadioStation(10);
        radio.increaseRadioStationByOne();
        radio.setCurrentRadioStation(4);
        radio.increaseRadioStationByOne();
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationByOne() {
        radio.setCurrentRadioStation(10);
        radio.decreaseRadioStationByOne();
        radio.setCurrentRadioStation(7);
        radio.decreaseRadioStationByOne();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRadioStationTest1() {
        radio.setNumberRadioStation(11);
        radio.setNumberRadioStation(2);
        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRadioStationTest2() {
        radio.setNumberRadioStation(-1);
        radio.setNumberRadioStation(4);
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeByOne() {
        radio.setCurrentSoundVolume(0);
        radio.increaseSoundVolumeByOne();
        radio.setCurrentSoundVolume(99);
        radio.increaseSoundVolumeByOne();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeByOne() {
        radio.setCurrentSoundVolume(100);
        radio.decreaseSoundVolumeByOne();
        radio.setCurrentSoundVolume(99);
        radio.decreaseSoundVolumeByOne();
        int expected = 98;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeStayOnMax() {
        radio.setCurrentSoundVolumeMaxMin(101);
        radio.setCurrentSoundVolumeMaxMin(100);
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeStayMaxMin() {
        radio.setCurrentSoundVolumeMaxMin(0);
        radio.setCurrentSoundVolumeMaxMin(-1);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldInitFields() {
        assertEquals(10, radio.getNumberRadioStation());
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(9, radio.getMaxRadioStation());
        assertEquals(0, radio.getMinSoundVolume());
        assertEquals(100, radio.getMaxSoundVolume());
    }

}