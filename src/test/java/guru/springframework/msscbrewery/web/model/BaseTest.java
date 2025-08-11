package guru.springframework.msscbrewery.web.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    BeerDto getDto() {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("BeerName")
                .beerStyle("ALE")
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .upc(1234567890L)
                .price(new BigDecimal("11.99"))
                .myLocalDate(LocalDate.now())
                .build();
    }
}
