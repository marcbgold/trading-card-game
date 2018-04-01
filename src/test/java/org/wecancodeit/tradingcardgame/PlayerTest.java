package org.wecancodeit.tradingcardgame;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	Player underTest;

	@Before
	public void setup() {
		underTest = new Player(30, 0);
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
		assertThat(underTest.getManaSlots(), is(0));
	}

	@Test
	public void playerShouldGainOneManaSlot() {
		underTest.gainManaSlot();

		assertThat(underTest.getManaSlots(), is(1));
	}

}
