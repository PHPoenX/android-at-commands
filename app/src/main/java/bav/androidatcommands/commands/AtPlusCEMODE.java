package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCEMODE extends ATcommand {
    public AtPlusCEMODE() {
        super("+CEMODE", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
