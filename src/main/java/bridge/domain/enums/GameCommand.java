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
                .filter(movement -> movement.key == key)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 1과 2중 하나를 선택하셔야합니다."));
    }

    public String getGameCommand() {
        return movement;
    }
}
