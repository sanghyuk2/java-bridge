package bridge.validator;

import bridge.domain.enums.GameCommand;

public class ValidateGameCommand implements Validator{
    @Override
    public void validate(String input) {
        GameCommand.findGameMovement(input);
    }
}
