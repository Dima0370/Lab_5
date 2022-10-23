package com.lab5.command;

import java.util.ArrayList;

import com.lab5.gameroom.GameRoom;

public class SortByPrice implements Command {

	private ArrayList<GameRoom> gameRoom;

	public SortByPrice(ArrayList<GameRoom> gameRoom) {

		this.gameRoom = gameRoom;
	}

	public ArrayList<GameRoom> sortByPrice() {

		return gameRoom;
	}

	@Override
	public void execute() {

		sortByPrice();
	}

}
