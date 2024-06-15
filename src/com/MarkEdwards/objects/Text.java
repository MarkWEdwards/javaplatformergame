package com.MarkEdwards.objects;

import java.awt.Graphics;
import java.util.LinkedList;

import com.MarkEdwards.framework.GameObject;
import com.MarkEdwards.framework.ObjectId;

public class Text extends GameObject
{


    public Text(float x, float y, ObjectId id) {
        super(x, y, id);

    }


    public ObjectId getId() {

        return id;
    }


    public float getVelX() {
        return velX;
    }

  
    public float getVelY() {
        return velY;
    }


    public float getX() {
        return x;
    }


    public float getY() {
        return y;
    }

    public void render(Graphics g) {
        
    }


    public void setVelX(float velX) {
        this.velX = velX;
    }


    public void setVelY(float velY) {
        this.velY = velY;
    }

    public void setX(float x) {
        this.x = x;
    }


    public void setY(float y) {
        this.y = y;
    }

    public void tick(LinkedList<GameObject> object) {
        
    }
    
}