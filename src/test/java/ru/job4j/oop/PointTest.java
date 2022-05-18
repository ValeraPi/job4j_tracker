package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to31Then2() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 1);
        double dist = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when04to74Then7() {
        Point a = new Point(0, 4);
        Point b = new Point(7, 4);
        double dist = a.distance(b);
        double expected = 7;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to22Then1dot41() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double dist = a.distance(b);
        double expected = 1.41;
        Assert.assertEquals(expected, dist, 0.01);
    }
}