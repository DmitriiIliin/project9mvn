package ru.netology.project9.project9mvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // номер радиостанции
    @Test
    public void middleNumberStation5() {
        Radio radio = new Radio();
        radio.setNumberStation(5);
        int expected = 5;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beforeLatestNumberStation8() {
        Radio radio = new Radio();
        radio.setNumberStation(8);
        int expected = 8;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void latestNumberStation9() {
        Radio radio = new Radio();
        radio.setNumberStation(9);
        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveHighLimitNumberStation10() {
        Radio radio = new Radio();
        radio.setNumberStation(10);
        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroNumberStation0() {
        Radio radio = new Radio();
        radio.setNumberStation(0);
        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstNumberStation1() {
        Radio radio = new Radio();
        radio.setNumberStation(1);
        int expected = 1;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void unrealNumberStationMinus5() {
        Radio radio = new Radio();
        radio.setNumberStation(-5);
        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    // уровень громкости
    @Test
    public void middleLevelVolume50() {
        Radio radio = new Radio();
        radio.setLevelVolume(50);
        int expected = 50;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstLevelVolume1() {
        Radio radio = new Radio();
        radio.setLevelVolume(1);
        int expected = 1;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroLevelVolume0() {
        Radio radio = new Radio();
        radio.setLevelVolume(0);
        int expected = 0;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void unrealLevelVolumeMinus5() {
        Radio radio = new Radio();
        radio.setLevelVolume(-5);
        int expected = 0;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beforeMaxLevelVolume99() {
        Radio radio = new Radio();
        radio.setLevelVolume(99);
        int expected = 99;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxLevelVolume100() {
        Radio radio = new Radio();
        radio.setLevelVolume(100);
        int expected = 100;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxLevelVolume101() {
        Radio radio = new Radio();
        radio.setLevelVolume(101);
        int expected = 100;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void afterMaxLevelVolume() {
        Radio radio = new Radio();
        radio.setLevelVolume(150);
        int expected = 100;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }
}
