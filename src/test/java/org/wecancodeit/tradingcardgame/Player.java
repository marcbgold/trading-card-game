package org.wecancodeit.tradingcardgame;

public class Player {

	private int hp;

	public Player(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void takeDamage(int amount) {
		hp -= amount;

	}

}
