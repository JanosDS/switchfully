package com.switchfully.programming.advanced.integration.testing.laundry;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LaundryControllerIntegrationTest {

    @Autowired
    private LaundryController laundryController;

    @Test
    void givenEmptyRepository_whenAddingLaundry_thenReturnSingleLaundry() {
        //given
        LaundryDTO laundryDTO = new LaundryDTO("white", "Ben", "a polo shirt", 30L, false);
        laundryController.addLaundry(laundryDTO);
        //when
        List<LaundryDTO> allLaundries = laundryController.getAllLaundries();
        //then
        Assertions.assertThat(allLaundries)
                .hasSize(2)
                .contains(laundryDTO);
    }
}
