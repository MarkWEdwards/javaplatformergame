package com.MarkEdwards.framework;

import java.util.LinkedList;
import java.awt.Graphics;

public abstract class GameObject
{
    protected float x, y;
    protected ObjectId id;
    protected float velX = 0;
    protected float velY = 0;

    public GameObject(float x, float y, ObjectId id)
    {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick(LinkedList<GameObject> object);
    public abstract void render(Graphics g);

    public abstract float getX();
    public abstract float getY();
    public abstract void setX(float x);
    public abstract void setY(float y);

    public abstract float getVelX();
    public abstract float getVelY();
    public abstract void setVelX(float velX);
    public abstract void setVelY(float velY);

    public abstract ObjectId getId();
}