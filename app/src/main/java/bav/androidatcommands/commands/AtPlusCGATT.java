package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCGATT extends ATcommand {
    public AtPlusCGATT() {
        super("+CGATT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
