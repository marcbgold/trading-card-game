package org.wecancodeit.tradingcardgame;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	Player underTest;

	@Before
	public void setup() {
		underTest = new Player(30, 1);
	}

	@Test
	public void playerShouldHaveHp() {
		assertThat(underTest.getHp(), is(30));
	}

	@Test
	public void playerHpShouldGoDownWhenPlayerTakesDamage() {
		underTest.takeDamage(1);

		assertThat(underTest.getHp(), is(29));
	}

	@Test
	public void playerShouldHaveManaSlots() {
		assertThat(underTest.getManaSlots(), is(1));
	}

	@Test
	public void playerShouldGainOneManaSlot() {
		underTest.gainManaSlot();

		assertThat(underTest.getManaSlots(), is(2));
	}

	@Test
	public void playerShouldNotGoOverTenManaSlots() {
		underTest = new Player(30, 10);

		underTest.gainManaSlot();

		assertThat(underTest.getManaSlots(), is(10));
	}

	@Test
	public void playerShouldSpendAvailableMana() {
		underTest.spendMana(1);

		assertThat(underTest.getCurrentMana(), is(0));
	}

	@Test
	public void playerShouldNotBeAbleToSpendMoreManaThanIsAvailable() {
		underTest = new Player(30, 3);

		underTest.spendMana(4);

		assertThat(underTest.getCurrentMana(), is(3));
	}

	@Test
	public void playerShouldRefillCurrentManaToMatchManaSlots() {
		underTest.spendMana(1);
		underTest.refillMana();

		assertThat(underTest.getCurrentMana(), is(1));
	}

	@Test
	public void playerShouldHaveCardDeck() {
		assertThat(underTest.getCardDeck().size(), is(greaterThanOrEqualTo(0)));
	}

	@Test
	public void playerCardDeckShouldStartWithCardsInIt() {
		underTest = new Player(30, 3, 1);

		assertThat(underTest.getCardDeck().size(), is(1));
	}

	@Test
	public void playerShouldDrawCardFromTopOfDeckAndPlaceInHand() {
		underTest = new Player(30, 3, 1);

		underTest.drawCard();

		assertThat(underTest.getCardDeck(), not(contains(1)));
		assertThat(underTest.getHand(), contains(1));
	}

	@Test
	public void playerShouldNotDrawFromEmptyDeck() {
		underTest.drawCard();

		assertThat(underTest.getCardDeck().size(), is(0));
	}

	// @Test
	// public void playerShouldDiscardDrawnCardIfHandSizeIs5() {
	// underTest = new Player(30, 3, 1);
	//
	// underTest.drawCard();
	//
	// assertThat(underTest.getCardDeck(), not(contains(1)));
	// assertThat(underTest.getHand(), contains(1));
	// }

}
