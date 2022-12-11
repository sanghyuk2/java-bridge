package bridge.domain.enums;

import java.util.Arrays;

public enum Movement {
    UP(1,"U"),
    DOWN(0,"D");

    private final int key;
    private final String movement;

    Movement(int key, String movement) {
        this.key = key;
        this.movement = movement;
    }

    public static Movement findMovement(int key) {
        return Arrays.stream(Movement.values())
                .filter(movement -> movement.key == key)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 1과 2중 하나를 선택하셔야합니다."));
    }

    public String getMovement() {
        return movement;
    }
}
