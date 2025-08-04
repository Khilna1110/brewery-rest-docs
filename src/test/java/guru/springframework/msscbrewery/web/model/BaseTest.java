package guru.springframework.msscbrewery.web.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getDto() {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("BeerName")
                .beerStyle("ALE")
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .upc(1234567890L)
                .build();
    }
}
