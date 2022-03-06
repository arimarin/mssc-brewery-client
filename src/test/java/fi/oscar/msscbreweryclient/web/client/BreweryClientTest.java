package fi.oscar.msscbreweryclient.web.client;

import fi.oscar.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ari on 06.03.2022
 */
@SpringBootTest
class BreweryClientTest {

	@Autowired
	BreweryClient client;

	@Test
	void getBeerById() {
		BeerDto beerDto = client.getBeerById(UUID.randomUUID());

		assertNotNull(beerDto);
	}

	@Test
	void saveNewBeer() {
		// Given
		BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();

		URI uri = client.saveNewBeer(beerDto);

		assertNotNull(uri);
		System.out.println(uri);
	}

	@Test
	void updateBeer() {
		// Given
		BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();

		client.updateBeer(UUID.randomUUID(), beerDto);
	}
}