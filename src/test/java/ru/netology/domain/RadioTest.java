package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.awt.dnd.DragSourceAdapter;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSwitchRadioStationOnMIn() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.switchRadioStationOnMin();
        radio.switchRadioStationOnMin();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationOnMax() {
        Radio radio = new Radio();
        radio.setMinRadioStation(0);
        radio.switchRadioStationOnMax();
        radio.switchRadioStationOnMax();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseRadioStationByOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.increaseRadioStationByOne();
        radio.setCurrentRadioStation(1);
        radio.increaseRadioStationByOne();
        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseRadioStationByOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.decreaseRadioStationByOne();
        radio.setCurrentRadioStation(7);
        radio.decreaseRadioStationByOne();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void shouldSetNumberRadioStationTest1() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(11);
        radio.setNumberRadioStation(2);
        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRadioStationTest2() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(-1);
        radio.setNumberRadioStation(4);
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.increaseSoundVolumeByOne();
        radio.setCurrentSoundVolume(3);
        radio.increaseSoundVolumeByOne();
        int expected = 4;
        int actual = radio.getCurrentSoundVolume() ;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.decreaseSoundVolumeByOne();
        radio.setCurrentSoundVolume(5);
        radio.decreaseSoundVolumeByOne();
        int expected = 4;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeStayOnMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolumeMaxMin(11);
        radio.setCurrentSoundVolumeMaxMin(10);
        int expected = 10;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeStayMaxMin() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolumeMaxMin(0);
        radio.setCurrentSoundVolumeMaxMin(-1);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

}