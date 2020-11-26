package com.company;

import java.util.Arrays;

public class PointsList {

    private Point[] points = new Point[4];
    private int size = 0;

    public void add (Point p) {
        if (size() == points.length - 1) points = Arrays.copyOf(points, (int) (points.length * 1.5) + 1);

        points[size] = p;
        size++;
    }

    public void set (int index, Point p) {
        checkIndex(index);
        points[index] = p;
    }

    public Point get(int index) {
        checkIndex(index);
        return points[index];
    }

    public void remove (int index) {
        checkIndex(index);
        Point[] buffer = new Point[points.length - 1];
        size--;

        for (int i = 0; i < size; i++) {
            buffer [i] = points[i < index ? i : i + 1];
        }
        points = buffer;
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        points = new Point[4];
    }


    @Override
    public String toString() {

        if (size == 0) return "[]";

        Point[] buffer = new Point[size];
        System.arraycopy(points, 0, buffer, 0, size);
        return Arrays.toString(buffer);

    }
}

