package dni.gen;

import static dni.gen.Utils.calculateLetter;

public class DniValidator {

    public boolean validate(String value) {
        final Integer numberValue = Integer.valueOf(value.substring(0, value.length() - 1));
        try {
            char letter = calculateLetter(numberValue);
            return value.charAt(value.length() - 1) == letter;
        } catch (RuntimeException e) {
            return false;
        }
    }
}
