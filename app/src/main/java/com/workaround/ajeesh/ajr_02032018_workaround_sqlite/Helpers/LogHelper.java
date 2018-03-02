package com.workaround.ajeesh.ajr_02032018_workaround_sqlite.Helpers;

import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Package Name : com.workaround.ajeesh.ajr_02032018_workaround_sqlite.Helpers
 * Created by ajesh on 02-03-2018.
 * Project Name : AJR-02032018-WORKAROUND-SQLITE
 */

public class LogHelper {
    public static void LogThreadId(String logName, String message) {
        long processId = android.os.Process.myPid();
        long threadId = Thread.currentThread().getId();
        Log.d(logName, String.format(Locale.US, "[ Process: %d | Thread: %d | Processed Time : %s] %s",
                processId, threadId, getDateTime(), message));
    }

    private static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        Date date = new Date();
        return dateFormat.format(date);
    }
}
