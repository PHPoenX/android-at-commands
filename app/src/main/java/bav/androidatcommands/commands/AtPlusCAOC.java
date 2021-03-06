package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCAOC extends ATcommand {
    public AtPlusCAOC(Context ctx) {
        super("+CAOC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_caoc_description);
    }
}
