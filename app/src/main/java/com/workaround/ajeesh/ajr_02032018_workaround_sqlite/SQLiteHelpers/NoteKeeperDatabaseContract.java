package com.workaround.ajeesh.ajr_02032018_workaround_sqlite.SQLiteHelpers;

import android.provider.BaseColumns;

/**
 * Package Name : com.workaround.ajeesh.ajr_02032018_workaround_sqlite.SQLiteHelpers
 * Created by ajesh on 03-03-2018.
 * Project Name : AJR-02032018-WORKAROUND-SQLITE
 */

public final class NoteKeeperDatabaseContract {
    private NoteKeeperDatabaseContract() {
    } // make non-creatable

    public static final class CourseInfoEntry implements BaseColumns {
        public static final String TABLE_NAME = "course_info";
        public static final String COLUMN_COURSE_ID = "course_id";
        public static final String COLUMN_COURSE_TITLE = "course_title";

        //CREATE_TABLE course_info (course_id, course_title);

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
                _ID + " INTEGER PRIMARY KEY, " +
                COLUMN_COURSE_ID + " TEXT UNIQUE NOT NULl, " +
                COLUMN_COURSE_TITLE + " TEXT NOT NULL)";
    }

    public static final class NoteInfoEntry implements BaseColumns {
        public static final String TABLE_NAME = "note_info";
        public static final String COLUMN_NOTE_TITLE = "note_title";
        public static final String COLUMN_NOTE_TEXT = "note_text";
        public static final String COLUMN_COURSE_ID = "course_id";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_NOTE_TITLE + " TEXT NOT NULL, " +
                        COLUMN_NOTE_TEXT + " TEXT, " +
                        COLUMN_COURSE_ID + " TEXT NOT NULL)";
    }
}
