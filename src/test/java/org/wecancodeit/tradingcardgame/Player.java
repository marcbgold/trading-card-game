package org.wecancodeit.tradingcardgame;

public class Player {

	private int hp;
	private int manaSlots;
	private int currentMana;

	public Player(int hp, int manaSlots) {
		this.hp = hp;
		this.manaSlots = manaSlots;
		currentMana = manaSlots;
	}

	public int getHp() {
		return hp;
	}

	public int getManaSlots() {
		return manaSlots;
	}

	public int getCurrentMana() {
		return currentMana;
	}

	public void takeDamage(int amount) {
		hp -= amount;

	}

	public void gainManaSlot() {
		if (manaSlots < 10) {
			manaSlots++;
		}
	}

	public void spendMana(int amount) {
		if (currentMana >= amount) {
			currentMana -= amount;
		}
	}

	public void refillMana() {
		currentMana = manaSlots;
	}

}
