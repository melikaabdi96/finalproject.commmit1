package com.company;

import java.util.ArrayList;


public class Plant extends Element{
    protected int cost ;
    protected boolean alive;
    protected long startLifeTime;
    protected int health;
    protected int preparingTime;
    protected boolean available;
    protected ArrayList<Bullet> plantsBullets;

    public Plant(){
        this.alive = true;
        this.preparingTime = 0;
        this.startLifeTime = System.currentTimeMillis();
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void calHealth(int damage) {
        this.health -= damage;
        if(this.health<=0){
            this.alive=false;
        }
    }


    public void shoot(){}
}

