package bridge.domain;

import bridge.BridgeMaker;
import bridge.BridgeRandomNumberGenerator;
import bridge.view.InputView;
import bridge.view.OutputView;

public class BridgeGameManager {
    private final InputView inputView;
    private final OutputView outputView;
    private final BridgeMaker bridgeMaker;


    public BridgeGameManager() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
    }

    public void start() {
        int bridgeSize = inputView.readBridgeSize();
        bridgeMaker.makeBridge(bridgeSize);
    }
}
