package bridge.domain.enums;

import java.util.Arrays;

public enum GameCommand {
    UP(1,"U"),
    DOWN(0,"D");

    private final int key;
    private final String movement;

    GameCommand(int key, String movement) {
        this.key = key;
        this.movement = movement;
    }

    public static GameCommand findGameCommand(int key) {
        return Arrays.stream(GameCommand.values())
                .filter(command -> command.key == key)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 1과 2중 하나를 선택하셔야합니다."));
    }

    public static void findGameMovement(String input) {
        Arrays.stream(GameCommand.values())
                .filter(movement -> movement.movement.equals(input))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] U와 D중 하나를 입력해주세요."));
    }

    public String getGameCommand() {
        return movement;
    }
}
