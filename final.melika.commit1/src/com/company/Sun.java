package com.company;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class Sun extends Element{
    private final int value = 25;
    private final int lastingTime = 10;
    private int bornTime;

    public Sun(int x, int y) throws IOException {
        setX(x);
        setY(y);
        img = ImageIO.read(new File("images\\sun.png"));
        this.bornTime = 0;

    }

    public int getValue() {
        return value;
    }

    public int getLastingTime() {
        return lastingTime;
    }

    public int getBornTime() {
        return bornTime;
    }

    public void setBornTime(int bornTime) {
        this.bornTime = bornTime;
    }
}
