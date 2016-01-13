package navigationdrawer.arifhasnat.com.categorypagedetails.Util;

import android.os.AsyncTask;
import android.os.Build;

/**
 * Created by arifhasnat on 1/13/16.
 */
public class TaskUtils  {

    public static <Params ,Progress,Result>void executeAsyncTask(
            AsyncTask<Params,Progress,Result>task ,Params...paramses)

    {
        if(Build.VERSION.SDK_INT>=11){
            task.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,paramses);
        }else{
            task.execute(paramses);
        }

    }
}
