package basic.codelab02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.HashMap;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class HumanVampireTest {

//	@Test
//	void whenVampireBitesHuman_turnHumanIntoVampire() {
//		//When
//		Human vampire = new Human();
//		vampire.setVampire();
//		Human human = new Human();
//		vampire.bite(human);
//		//Then
//		Assertions.assertThat(human.isVampire()).isEqualTo(true);
//	}

	@Test
	void whenVampireBitesHuman_AfterMidnight_BeforeSevenAM_turnHumanIntoVampire() {
		//When
		LocalTime time = LocalTime.of(1, 0, 0);
		Human vampire = new Human();
		vampire.setVampire();
		Human human = new Human();
		vampire.bite(human, time);
		//Then
		Assertions.assertThat(human.isVampire()).isEqualTo(true);
	}

	@Test
	void whenVampireBitesHuman_BeforeMidnight_turnHumanIntoVampire() {
		//When
		LocalTime time = LocalTime.of(23, 0, 0);
		Human vampire = new Human();
		vampire.setVampire();
		Human human = new Human();
		vampire.bite(human, time);
		//Then
		Assertions.assertThat(human.isVampire()).isEqualTo(false);
	}

	@Test
	void whenVampireBitesHuman_AfterSevenAM_dontTurnHumanIntoVampire() {
		//When
		LocalTime time = LocalTime.of(8, 0, 0);
		Human vampire = new Human();
		vampire.setVampire();
		Human human = new Human();
		vampire.bite(human, time);
		//Then
		Assertions.assertThat(human.isVampire()).isEqualTo(false);
	}

	@Test
	void whenVampireBitesHuman_AtSevenAM_dontTurnHumanIntoVampire() {
		//When
		LocalTime time = LocalTime.of(7, 0, 0);
		Human vampire = new Human();
		vampire.setVampire();
		Human human = new Human();
		vampire.bite(human, time);
		//Then
		Assertions.assertThat(human.isVampire()).isEqualTo(false);
	}

	@Test
	void whenVampireBitesHuman_AtMidnight_turnHumanIntoVampire() {
		//When
		LocalTime time = LocalTime.of(0, 0, 0);
		Human vampire = new Human();
		vampire.setVampire();
		Human human = new Human();
		vampire.bite(human, time);
		//Then
		Assertions.assertThat(human.isVampire()).isEqualTo(true);
	}
}
