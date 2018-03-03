package com.workaround.ajeesh.ajr_02032018_workaround_sqlite.SQLiteHelpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.workaround.ajeesh.ajr_02032018_workaround_sqlite.SQLiteHelpers.ArbritaryData.DataWorkerHelper;

/**
 * Package Name : com.workaround.ajeesh.ajr_02032018_workaround_sqlite.Helpers
 * Created by ajesh on 03-03-2018.
 * Project Name : AJR-02032018-WORKAROUND-SQLITE
 */

public class NoteKeeperOpenHelper extends SQLiteOpenHelper {
    //NO FACTORY NEEDED
    public static final String DATABASE_NAME = "NoteKeeper.db";
    public static final int DATABASE_VERSION = 1;

    public NoteKeeperOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NoteKeeperDatabaseContract.CourseInfoEntry.SQL_CREATE_TABLE);
        db.execSQL(NoteKeeperDatabaseContract.NoteInfoEntry.SQL_CREATE_TABLE);

        DataWorkerHelper worker = new DataWorkerHelper(db);
        worker.insertCourses();
        worker.insertSampleNotes();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
