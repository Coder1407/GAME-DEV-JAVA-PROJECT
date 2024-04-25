package com.amitesh.gaming.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player extends Sprite {
	public Player() {
		w = 200;
		h = 200;
		x = 50;
		y = 450;
		image = new ImageIcon(Player.class.getResource("player3.gif"));
		
	}
	
	public void move() {
		x = x + speed;
	}
	
	public boolean outOfScreen() {
		return x>1500;
	}
}
