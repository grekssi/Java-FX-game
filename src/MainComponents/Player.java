package MainComponents;

import Monsters.BaseMonster;

import java.util.ArrayList;

public class Player {
	private int magicPoints;
	private ArrayList<BaseMonster> monsters;

	public Player(int magicPoints) {
		this.magicPoints = magicPoints;
		this.monsters = new ArrayList<>();
	}
}
