package bridge.validator;

public class ValidateBridgeSize implements Validator{
    private static final String DIGIT_ERROR = "[ERROR] 숫자만 입력해주세요.";
    private static final String RANGE_ERROR = "[ERROR] 3에서 20 사이의 값을 입력해주세요.";

    @Override
    public void validate(String input) {
        if (!input.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException(DIGIT_ERROR);
        }

        if (Integer.parseInt(input) < 3 || Integer.parseInt(input) > 20) {
            throw new IllegalArgumentException(RANGE_ERROR);
        }
    }
}
