package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Pea extends Plant {
    private enum Type{ peaShooter , snowPea}
    private Type peaType;
    public Pea(int x , int y , Type peaType) throws IOException {
        setX(x);
        setY(y);
        this.plantsBullets = new ArrayList<>();
        this.peaType = peaType;
        setFields();
    }
    private void setFields() throws IOException {
        if(peaType == Type.peaShooter){
            this.cost = 100;
            this.health = 70;
            img = ImageIO.read(new File("images\\Cards\\card_peashooter.png"));
            this.cost = 175;
            this.health = 100;
            img = ImageIO.read(new File("images\\Cards\\card_freezepeashooter.png"));
        }
    }
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    public void setDyingpea(){
        if(peaType == Type.peaShooter){
            image = new ImageIcon("images\\Gifs\\pea_shooter_dying.gif").getImage();
        }else
            image = new ImageIcon("images\\Gifs\\sun_flower_dying.gif").getImage(); //88888888888888888888888888888888

    }

    public void setpea(){
        if(peaType == Type.peaShooter){
            image = new ImageIcon("images\\Gifs\\pea_shooter.gif").getImage();
        }else
            image = new ImageIcon("images\\Gifs\\freezepeashooter.gif").getImage();

    }


    public ArrayList<Bullet> getBullets(){
        return plantsBullets;
    }
}

