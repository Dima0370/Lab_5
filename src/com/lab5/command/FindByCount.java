package com.lab5.command;

import java.util.ArrayList;

import com.lab5.gameroom.GameRoom;

public class FindByCount implements Command {

	private ArrayList<GameRoom> gameRoom;

	public FindByCount(ArrayList<GameRoom> gameRoom) {

		this.gameRoom = gameRoom;
	}

	public void findByCount() {

	}

	@Override
	public void execute() {

		findByCount();
	}

}
