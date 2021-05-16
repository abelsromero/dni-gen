package dni.gen;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class DniGeneratorTest {

    @ParameterizedTest
    @MethodSource("dni.gen.TestData#validValues")
    void should_generate_valid_letter(String dni) {
        final String numbers = dni.substring(0, dni.length() - 1);
        final char letter = dni.charAt(dni.length() - 1);

        char actualLetter = new DniGenerator().letter(numbers);

        assertThat(actualLetter).isEqualTo(letter);
    }

}
