package com.workaround.ajeesh.ajr_02032018_workaround_sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.workaround.ajeesh.ajr_02032018_workaround_sqlite.SQLiteHelpers.NoteKeeperOpenHelper;

public class ActivityDatabaseOperation extends AppCompatActivity {
    String logName = "SQLITE-ACT-DB-OPR";
    private NoteKeeperOpenHelper mDbOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_operation);

        mDbOpenHelper = new NoteKeeperOpenHelper(this);
        InitializeDatabase();
    }


    @Override
    protected void onDestroy() {
        mDbOpenHelper.close();
        super.onDestroy();
    }

    private void InitializeDatabase() {
        SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();
    }
}
