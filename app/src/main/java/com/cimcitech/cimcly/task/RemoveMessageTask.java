package com.cimcitech.cimcly.task;

import android.content.Context;

import com.cimcitech.cimcly.sql.MsgSqlDao;
import com.cimcitech.cimcly.utils.BaseAsyncTask;
import com.cimcitech.cimcly.utils.OnTaskFinishedListener;

/**
 * Created by Jimmy on 2016/10/11 0011.
 */
public class RemoveMessageTask extends BaseAsyncTask<Boolean> {
    private Context context;
    private int id;

    public RemoveMessageTask(Context context, OnTaskFinishedListener<Boolean>
            onTaskFinishedListener, int id) {
        super(context, onTaskFinishedListener);
        this.context = context;
        this.id = id;
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        MsgSqlDao dao = MsgSqlDao.getInstance(context);
        return dao.delete(id);
    }
}
