package com.miniapps.gtasklist;

public final class Constants {

    public static final Double APP_VERSION = 1.0;
    public static final String DATABASE_NAME = "GTaskList.db";
    public static final String DATABASE_TABLE_NAME = "Tasks";
    public static final String TABLE_TASKS_COL_1 = "ID";
    public static final String TABLE_TASKS_COL_2 = "Name";
    public static final String TABLE_TASKS_COL_3 = "Description";
    public static final String TABLE_TASKS_COL_4 = "Status";

    public static final String CREATE_TABLE_TASKS = "CREATE TABLE " + DATABASE_TABLE_NAME + " (" +
            TABLE_TASKS_COL_1 + " INTEGER AUTOINCREMENT NOT NULL, " + TABLE_TASKS_COL_2 + " TEXT NOT NULL , " +
            TABLE_TASKS_COL_3 + " TEXT, " + TABLE_TASKS_COL_4 + " INTEGER NOT NULL);";

    public static final String INSERT_TABLE_TASKS = "INSERT INTO Tasks " + TABLE_TASKS_COL_2 + ", " +
            TABLE_TASKS_COL_3 + ", " + TABLE_TASKS_COL_4 + " Values (";

    private Constants() {}
}
