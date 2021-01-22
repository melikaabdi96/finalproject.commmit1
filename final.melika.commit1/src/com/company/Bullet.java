package com.company;

import javax.imageio.ImageIO;
import java.io.File;


public class Bullet extends Element implements Actor{
    protected int damage ;

    private enum type{normal , frozen}
    private type bulletType;
    public Bullet(int x , int y , type bulletType) throws Exception {
        setX(x);
        setY(y);
        this.bulletType = bulletType;
        setFields();
    }

    public Bullet.type getType() {
        return bulletType;
    }

    public void setType(Bullet.type type) {
        this.bulletType = type;
    }
    private void setFields() throws Exception {
        if(bulletType == type.normal){

            this.damage = 30;
            img = ImageIO.read(new File("images\\pea.png"));

        }else if(bulletType == type.frozen){

            this.damage = 35;
            img = ImageIO.read(new File("images\\freezepea.png"));


        }else throw new Exception(" No bullet type found !!!!");
    }
    @Override
    public void move() {

    }
}

