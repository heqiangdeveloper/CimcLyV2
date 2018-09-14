package com.cimcitech.cimcly.task;

import android.content.Context;

import com.cimcitech.cimcly.sql.MsgSqlDao;
import com.cimcitech.cimcly.utils.BaseAsyncTask;
import com.cimcitech.cimcly.utils.OnTaskFinishedListener;

/**
 * Created by Jimmy on 2016/10/11 0011.
 */
public class QueryUnReadMessageTask extends BaseAsyncTask<Integer> {
    private Context context;

    public QueryUnReadMessageTask(Context context, OnTaskFinishedListener<Integer>
            onTaskFinishedListener) {
        super(context, onTaskFinishedListener);
        this.context = context;
    }

    @Override
    protected Integer doInBackground(Void... params) {
        MsgSqlDao dao = MsgSqlDao.getInstance(context);
        return dao.queryUnReadMsg();
    }
}
