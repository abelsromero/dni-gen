package dni.gen;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class DniValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "74579823R",
            "61648189W",
            "84162660A",
            "49370239G",
            "13201130M",
            "78491139Y",
            "94407462F",
            "56423423P",
            "47292470D",
            "09146879X",
            "82034409B",
            "66218575N",
            "55443904J",
            "36694351Z",
            "55628665S",
            "84283561Q",
            "51986617H",
            "71393122V",
            "46177209L",
            "83415568C",
            "98134028K",
            "09530577E",
            "91563022T",

    })
    void should_not_validate_invalid(String invalid) {
        DniValidator validator = new DniValidator();

        boolean result = validator.validate(invalid);

        assertThat(result).isFalse();
    }

    @ParameterizedTest
    @MethodSource("dni.gen.TestData#validValues")
    void should_validate_dni(String valid) {
        DniValidator validator = new DniValidator();

        boolean result = validator.validate(valid);

        assertThat(result).isTrue();
    }

}
