package bridge.validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidateGameCommandTest {
    ValidateGameCommand validateGameCommand;

    @BeforeEach
    void setUp() {
        validateGameCommand = new ValidateGameCommand();
    }

    @ParameterizedTest
    @CsvSource(value = {"U", "D"})
    void 게임_커맨드_테스트(String input) {
        assertDoesNotThrow(() -> validateGameCommand.validate(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"1", "E", "가"})
    void 게임_커맨드_예외_테스트(String input) {
        assertThrows(IllegalArgumentException.class, () -> validateGameCommand.validate(input));
    }

}