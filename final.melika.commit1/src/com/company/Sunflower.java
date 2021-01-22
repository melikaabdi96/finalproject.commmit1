package com.company;

import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Sunflower extends Plant {
    private Image image;
    private Sound sound;
    public Sunflower(int x, int y ) throws IOException, LineUnavailableException, UnsupportedAudioFileException {
        super();
        setX(x);
        setY(y);
        this.cost = 50;
        this.health = 50;
        this.alive = true;
        this.sound = new Sound("pacman_eatghost.wav");
        //img = ImageIO.read(new File("images\\Cards\\card_sunflower.png"));
        setDarkSunflower();

    }

    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }
    public void setDyingSunflower(){
        image = new ImageIcon("images\\Gifs\\sun_flower_dying.gif").getImage();
    }
    public void setLightSunflower(){
        image = new ImageIcon("images\\Gifs\\sun_flower.gif").getImage();
    }
    public void setDarkSunflower(){
        image = new ImageIcon("images\\Gifs\\sunflower.gif").getImage();
    }

}
