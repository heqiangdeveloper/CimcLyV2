package com.cimcitech.cimcly.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.cimcitech.cimcly.activity.message.MessageContent;
import com.cimcitech.cimcly.activity.message.MessageData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qianghe on 2018/7/5.
 */

public class MsgSqlDao {
    private MsgSQLiteOpenHelper helper;
    private SQLiteDatabase db;

    public MsgSqlDao(Context context) {
        helper = new MsgSQLiteOpenHelper(context);
    }

    public static MsgSqlDao getInstance(Context context) {
        return new MsgSqlDao(context);
    }

    //新增
    public boolean add(MessageData msgData) {
        db = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(MsgSQLiteOpenHelper.FLAG, msgData.getFlag());
        values.put(MsgSQLiteOpenHelper.TIME, msgData.getTime());
        values.put(MsgSQLiteOpenHelper.OPENED, 0);//默认是未读

        values.put(MsgSQLiteOpenHelper.TITLE, msgData.getMessageContent().getTitle());
        values.put(MsgSQLiteOpenHelper.MSG, msgData.getMessageContent().getMsg());

        values.put(MsgSQLiteOpenHelper.FSTATUS, msgData.getMessageContent().getfStatus());
        values.put(MsgSQLiteOpenHelper.FSTATE, msgData.getMessageContent().getfState());
        values.put(MsgSQLiteOpenHelper.CONTRACTNO, msgData.getMessageContent().getContractNo());
        values.put(MsgSQLiteOpenHelper.SORDERID, msgData.getMessageContent().getsOrderId());

        values.put(MsgSQLiteOpenHelper.QUOTEID, msgData.getMessageContent().getQuoteid());
        values.put(MsgSQLiteOpenHelper.QUOTESTATUSVALUE, msgData.getMessageContent().getQuoteStatusValue());
        values.put(MsgSQLiteOpenHelper.QUOTESTATUS, msgData.getMessageContent().getQuoteStatus());

        long row = db.insert(MsgSQLiteOpenHelper.TABLE_NAME, null, values);
        db.close();
        return row != -1;
    }

    //查找
    public List<MessageData> query() {
        List<MessageData> messageDatas = new ArrayList<>();
        db = helper.getReadableDatabase();
        Cursor cursor = db.query(MsgSQLiteOpenHelper.TABLE_NAME, null,
                null,null, null, null, null, null);
        MessageData messageData;
        MessageContent messageContent;
        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex(MsgSQLiteOpenHelper.ID));
            String flag = cursor.getString(cursor.getColumnIndex(MsgSQLiteOpenHelper.FLAG));
            String time = cursor.getString(cursor.getColumnIndex(MsgSQLiteOpenHelper.TIME));
            int opened = cursor.getInt(cursor.getColumnIndex(MsgSQLiteOpenHelper.OPENED));

            String title = cursor.getString(cursor.getColumnIndex(MsgSQLiteOpenHelper.TITLE));
            String msg = cursor.getString(cursor.getColumnIndex(MsgSQLiteOpenHelper.MSG));

            String fStatus = cursor.getString(cursor.getColumnIndex(MsgSQLiteOpenHelper.FSTATUS));
            String fState = cursor.getString(cursor.getColumnIndex(MsgSQLiteOpenHelper.FSTATE));
            String contractNo = cursor.getString(cursor.getColumnIndex(MsgSQLiteOpenHelper.CONTRACTNO));
            int sOrderId= cursor.getInt(cursor.getColumnIndex(MsgSQLiteOpenHelper.SORDERID));

            int quoteid= cursor.getInt(cursor.getColumnIndex(MsgSQLiteOpenHelper.QUOTEID));
            String quoteStatusValue = cursor.getString(cursor.getColumnIndex(MsgSQLiteOpenHelper.QUOTESTATUSVALUE));
            String quoteStatus = cursor.getString(cursor.getColumnIndex(MsgSQLiteOpenHelper.QUOTESTATUS));

            messageContent = new MessageContent(title,msg,sOrderId,fStatus,fState,contractNo,
                    quoteid,quoteStatusValue,quoteStatus);
            messageData = new MessageData(flag,opened,time,messageContent);
            messageData.setId(id);
            messageDatas.add(messageData);
        }
        cursor.close();
        db.close();
        helper.close();
        return messageDatas;
    }

    //查找
    public int queryUnReadMsg() {
        db = helper.getReadableDatabase();
        Cursor cursor = db.query(MsgSQLiteOpenHelper.TABLE_NAME, null,
                null,null, null, null, null, null);
        int num = 0;
        while (cursor.moveToNext()) {
            int opened = cursor.getInt(cursor.getColumnIndex(MsgSQLiteOpenHelper.OPENED));
           if(opened == 0){
               num++;
           }
        }
        cursor.close();
        db.close();
        helper.close();
        return num;
    }

    //删除
    public boolean delete(int id) {
        db = helper.getWritableDatabase();
        int row = db.delete(MsgSQLiteOpenHelper.TABLE_NAME, String.format("%s=?",
                MsgSQLiteOpenHelper.ID), new String[]{String.valueOf(id)});
        db.close();
        helper.close();
        return row != 0;
    }

    //更新
    public boolean update(int id, int opened){
        db = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(MsgSQLiteOpenHelper.OPENED,opened);
        int row = db.update(MsgSQLiteOpenHelper.TABLE_NAME, values, String.format("%s=?",
                MsgSQLiteOpenHelper.ID), new String[]{String.valueOf(id)});
        db.close();
        helper.close();
        return row > 0;
    }

}
