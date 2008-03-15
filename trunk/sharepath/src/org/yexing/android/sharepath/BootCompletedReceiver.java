package org.yexing.android.sharepath;

import android.content.Context;
import android.content.Intent;
import android.content.IntentReceiver;
import android.util.Log;
import android.widget.Toast;

public class BootCompletedReceiver extends IntentReceiver {
	private static final String LOG_TAG = "SharePath";

	/* package */static final String ACTION = "android.intent.action.BOOT_COMPLETED";

	public void onReceiveIntent(Context context, Intent intent) {
        if (intent.getAction().equals(ACTION)) {
        	String info = "boot completed!";
            Log.i(LOG_TAG, info);
            Toast.makeText(context, info, Toast.LENGTH_LONG).show();

            context.startService(new Intent(context, SharePathService.class), null);
        }
    }
}
