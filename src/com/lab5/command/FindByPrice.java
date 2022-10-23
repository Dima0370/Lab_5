package com.lab5.command;

import java.util.ArrayList;

import com.lab5.gameroom.GameRoom;

public class FindByPrice implements Command {

	private ArrayList<GameRoom> gameRoom;

	public FindByPrice(ArrayList<GameRoom> gameRoom) {
		
		this.gameRoom = gameRoom;
	}

	public void findByPrice() {

	}

	@Override
	public void execute() {

		findByPrice();
	}

}
