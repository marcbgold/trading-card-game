package org.wecancodeit.tradingcardgame;

import java.util.LinkedList;

public class Player {

	private int hp;
	private int manaSlots;
	private int currentMana;
	private LinkedList<Integer> cardDeck;

	public Player(int hp, int manaSlots) {
		this.hp = hp;
		this.manaSlots = manaSlots;
		currentMana = manaSlots;
		cardDeck = new LinkedList<Integer>();
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

	public LinkedList<Integer> getCardDeck() {
		return cardDeck;
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
