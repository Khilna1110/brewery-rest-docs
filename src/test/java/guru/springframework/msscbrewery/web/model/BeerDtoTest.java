package guru.springframework.msscbrewery.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;


@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {

        BeerDto beerDto = getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);

    }

    @Test
    void testDeserializeDto() throws JsonProcessingException {

        String jsonString = "{\"beerId\":\"eff74f78-1ff5-4ed2-aeb8-1be033888fca\",\"beerName\":\"BeerName\",\"beerStyle\":\"ALE\",\"upc\":1234567890,\"price\":\"12.99\",\"createdDate\":\"2025-08-04T13:56:25.2527178+05:30\",\"lastUpdatedDate\":\"2025-08-04T13:56:25.2527178+05:30\"}";

        BeerDto dto = objectMapper.readValue(jsonString, BeerDto.class);

        System.out.println(dto);
    }
}