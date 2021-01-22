package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.security.SecureRandom;

public class Zombie extends Element implements Actor{
    protected int power ;
    private enum type{coneHead , normal , bucketHead}
    private type zombieType;

    public Zombie(type zombieType) throws Exception {
        setX(1270);
        int random = new SecureRandom().nextInt(5);
        int y = 136 * random + 20 ; // margin = 20 , 136 = height of each row
        setY(y);
        this.zombieType = zombieType;
        setFields();
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public type getZombieType() {
        return zombieType;
    }

    public void setZombieType(type zombieType) throws Exception {
        this.zombieType = zombieType;
    }

    public void setDyingGif(){
        if(zombieType == type.normal){
            this.image = new ImageIcon("images\\Gifs\\zombie_normal_dying.gif").getImage();
        }//88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888 for the rest
    }
    private void setFields() throws Exception {
        if(zombieType == type.normal){

            this.power = 200;
            img = ImageIO.read(new File("images\\zombie1.png"));
            this.image = new ImageIcon("images\\Gifs\\zombie_normal.gif").getImage();

        }else if(zombieType == type.coneHead){

            this.power = 560;
            img = ImageIO.read(new File("images\\zombie2.png"));
            image = new ImageIcon("images\\Gifs\\coneheadzombie.gif").getImage();

        }else if(zombieType == type.bucketHead){

            this.power = 1300;
            img = ImageIO.read(new File("images\\StrongZombie.png"));
            this.image = new ImageIcon("images\\Gifs\\bucketheadzombie.gif").getImage();

        }else throw new Exception(" No type detected !!!!");
    }

    @Override
    public void move() {

    }

    public void setBurntGif(){
        this.image = new ImageIcon("images\\Gifs\\burntZombie.gif").getImage();
    }
}
