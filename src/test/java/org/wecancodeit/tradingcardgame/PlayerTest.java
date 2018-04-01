package org.wecancodeit.tradingcardgame;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PlayerTest {

	Player underTest;

	@Test
	public void playerShouldHaveHp() {
		underTest = new Player(30);

		assertThat(underTest.getHp(), is(30));
	}

}
