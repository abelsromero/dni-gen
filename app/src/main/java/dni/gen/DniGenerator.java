package dni.gen;

public class DniGenerator {

    public char letter(String numbers) {
        Integer integerValue = Integer.valueOf(numbers);
        return Utils.calculateLetter(integerValue);
    }

    public char letter(int numbers) {
        return Utils.calculateLetter(numbers);
    }
}
