package com.cimcitech.cimcly.task;

import android.content.Context;

import com.cimcitech.cimcly.activity.message.MessageData;
import com.cimcitech.cimcly.sql.MsgSqlDao;
import com.cimcitech.cimcly.utils.BaseAsyncTask;
import com.cimcitech.cimcly.utils.OnTaskFinishedListener;

import java.util.List;

/**
 * Created by Jimmy on 2016/10/11 0011.
 */
public class QueryMessageTask extends BaseAsyncTask<List<MessageData>> {
    private Context context;

    public QueryMessageTask(Context context, OnTaskFinishedListener<List<MessageData>> onTaskFinishedListener) {
        super(context, onTaskFinishedListener);
        this.context = context;
    }

    @Override
    protected List<MessageData> doInBackground(Void... params) {
        MsgSqlDao dao = MsgSqlDao.getInstance(context);
        return dao.query();
    }
}
