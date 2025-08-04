package guru.springframework.msscbrewery.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
class BeerDtoKebabTest extends BaseTest {

    @Test
    void testKebabDto() throws JsonProcessingException {

        BeerDto beerDto = getDto();

        String json = objectMapper.writeValueAsString(beerDto);

        System.out.println(json);
    }
}