package org.wecancodeit.tradingcardgame;

public class Player {

	private int hp;
	private int manaSlots;

	public Player(int hp, int manaSlots) {
		this.hp = hp;
		this.manaSlots = manaSlots;
	}

	public int getHp() {
		return hp;
	}

	public int getManaSlots() {
		return manaSlots;
	}

	public void takeDamage(int amount) {
		hp -= amount;

	}

}
