package com.lab5.command;

import java.util.ArrayList;

import com.lab5.gameroom.GameRoom;

public class BuyToys implements Command {

	private ArrayList<GameRoom> gameRoom;

	public BuyToys(ArrayList<GameRoom> gameRoom) {
		
		this.gameRoom = gameRoom;
	}

	public void buyToys() {

	}

	@Override
	public void execute() {

		buyToys();
	}

}
