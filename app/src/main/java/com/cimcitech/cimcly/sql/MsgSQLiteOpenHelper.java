package com.cimcitech.cimcly.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by qianghe on 2018/7/5.
 */

public class MsgSQLiteOpenHelper extends SQLiteOpenHelper {
    public static final String NAME = "msgsqlite.db";
    public static final int VERSION = 1;
    public static final String TABLE_NAME = "msg";

    public static final String ID = "id";
    public static final String FLAG = "flag";
    public static final String TIME = "time";
    public static final String OPENED = "opened";//是否读取，0未读，1已读

    public static final String TITLE = "title";
    public static final String MSG = "msg";

    //报价单的字段
    public static final String FSTATUS = "fStatus";
    public static final String FSTATE = "fState";//审批结果id
    public static final String CONTRACTNO = "contractNo";
    public static final String SORDERID = "sOrderId";

    //合同的字段
    public static final String QUOTEID = "quoteid";
    public static final String QUOTESTATUSVALUE = "quoteStatusValue";
    public static final String QUOTESTATUS = "quoteStatus";//审批结果id

    public MsgSQLiteOpenHelper(Context context) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME + "("
                + ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + FLAG + " VARCHAR(20), "
                + TIME + " VARCHAR(128), "
                + OPENED + " INTEGER, "
                + TITLE + " VARCHAR(128), "
                + MSG + " VARCHAR(48), "
                + FSTATE + " VARCHAR(10), "
                + FSTATUS + " VARCHAR(48), "
                + CONTRACTNO + " VARCHAR(48), "
                + SORDERID + " VARCHAR(48), "
                + QUOTEID + " INTEGER, "
                + QUOTESTATUSVALUE + " VARCHAR(48),"
                + QUOTESTATUS + " VARCHAR(10)"
                + ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE " + TABLE_NAME;
        if (oldVersion != newVersion) {
            db.execSQL(sql);
            onCreate(db);
        }
    }
}
