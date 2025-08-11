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

        String jsonString = "{\"beerName\":\"BeerName\",\"beerStyle\":\"ALE\",\"upc\":1234567890,\"price\":\"11.99\",\"createdDate\":\"2025-08-11T18:14:14:52.046396+05:30\",\"lastUpdatedDate\":\"2025-08-11T18:14:52.0463962+05:30\",\"myLocalDate\":\"20250811\",\"beerId\":\"f41f7d05-6140-4cd1-960e-e53e07329c27\"}";

        BeerDto dto = objectMapper.readValue(jsonString, BeerDto.class);

        System.out.println(dto);
    }
}