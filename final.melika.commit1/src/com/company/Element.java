package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Element {
    protected BufferedImage img;
    protected Image image;
    protected int x;
    protected int y;
    Element(){}
    public void moveRight() {
        x = x + 1;
    }
    public void moveLeft() {
        x = x - 1;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

