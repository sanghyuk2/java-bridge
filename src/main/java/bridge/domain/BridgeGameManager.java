package bridge.domain;

import bridge.view.InputView;
import bridge.view.OutputView;

public class BridgeGameManager {
    private final InputView inputView;
    private final OutputView outputView;

    public BridgeGameManager() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start() {
        inputView.readBridgeSize();
    }
}
