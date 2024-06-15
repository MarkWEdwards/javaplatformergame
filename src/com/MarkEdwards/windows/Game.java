package com.MarkEdwards.windows;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable
{
    
    public void run()
    {

    }

    public static void main(String[] args) {
        new Window(800, 600, "Practice", new Game());
    }
}