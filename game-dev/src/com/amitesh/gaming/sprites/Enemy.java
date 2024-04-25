package com.amitesh.gaming.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy extends Sprite {
	
	public Enemy(int x, int speed) {
		y=30;
		this.x=x;
		this.speed = speed;
		w=200;
		h=200;
		image = new ImageIcon(Enemy.class.getResource("spider-enemy.gif"));
	}

	
	public void move() {
		if(y>800) {
			y=0;
		}
		y = y + speed;
	}
}
