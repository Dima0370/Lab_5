package com.lab5.command;

import java.util.ArrayList;

import com.lab5.gameroom.GameRoom;

public class AllocateMoneyBudget implements Command {

	private ArrayList<GameRoom> gameRoom;

	public AllocateMoneyBudget(ArrayList<GameRoom> gameRoom) {

		this.gameRoom = gameRoom;
	}

	public void allocateMoneyBudget() {

	}

	@Override
	public void execute() {

		allocateMoneyBudget();
	}

}
