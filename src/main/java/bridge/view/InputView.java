package bridge.view;

import bridge.validator.ValidateBridgeSize;
import bridge.validator.Validator;

import static camp.nextstep.edu.missionutils.Console.readLine;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        return Integer.parseInt(getValidValue("다리 건너기 게임을 시작합니다.\n\n다리의 길이를 입력해주세요.", new ValidateBridgeSize()));
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    private String getValidValue(String message, Validator validator) {
        System.out.println(message);
        while (true) {
            try {
                String input = readLine();
                validator.validate(input);
                return input;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
