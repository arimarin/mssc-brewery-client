package fi.oscar.msscbreweryclient.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by Ari on 05.03.2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;
}
