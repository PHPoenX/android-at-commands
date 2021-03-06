package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMGL extends ATcommand {
    public AtDolQCMGL(Context ctx) {
        super("$QCMGL", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_dol_qcmgl_description);
    }
}
