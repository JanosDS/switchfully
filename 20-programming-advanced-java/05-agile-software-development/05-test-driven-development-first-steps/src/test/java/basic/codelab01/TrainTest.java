package basic.codelab01;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class TrainTest {

	@Test
	void whenCreatingTrain_thenHoursDelayedIsZero() {
		//When
		Train train = new Train();
		//Then
		Assertions.assertThat(train.getHoursDelayed()).isEqualTo(0);
	}

	@Test
	void whenHoursDelayedGivenIsNegative_thenSetZero() {
		//When
		Train train = new Train();
		train.setHoursDelayed(-1);
		//Then
		Assertions.assertThat(train.getHoursDelayed()).isEqualTo(0);
	}

	@Test
	void customerSatisfactionTest() {
		Train train1 = new Train();
		Train train2 = new Train(1);
		Train train3 = new Train(2);
		Train train4 = new Train(3);
		Train train5 = new Train(4);
		//Then
		Assertions.assertThat(train1.customerSatisfaction()).isEqualTo("Nice ‘n’ rolling!");
		Assertions.assertThat(train2.customerSatisfaction()).isEqualTo("Just another day at the train …");
		Assertions.assertThat(train3.customerSatisfaction()).isEqualTo("This train is annoying me!");
		Assertions.assertThat(train4.customerSatisfaction()).isEqualTo("B-u-u-urn it!");
		assertThrows(IllegalArgumentException.class, () -> {
			Assertions.assertThat(train5.customerSatisfaction()).isEqualTo(new IllegalArgumentException("The world explodes"));
		});

	}
}
