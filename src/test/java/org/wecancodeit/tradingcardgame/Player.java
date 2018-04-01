package org.wecancodeit.tradingcardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Player {

	private int hp;
	private int manaSlots;
	private int currentMana;
	private LinkedList<Integer> cardDeck;
	private Collection<Integer> hand;

	public Player(int hp, int manaSlots) {
		this.hp = hp;
		this.manaSlots = manaSlots;
		currentMana = manaSlots;
		cardDeck = new LinkedList<Integer>(Arrays.asList(1, 2, 3));
		hand = new ArrayList<Integer>();
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

	public Collection<Integer> getHand() {
		return hand;
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

	public void drawCard() {
		int card = cardDeck.pop();
		hand.add(card);
	}

}
