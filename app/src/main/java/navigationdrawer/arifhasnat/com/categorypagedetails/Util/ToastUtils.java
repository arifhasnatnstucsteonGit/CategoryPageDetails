package navigationdrawer.arifhasnat.com.categorypagedetails.Util;

import android.content.Context;
import android.widget.Toast;

import navigationdrawer.arifhasnat.com.categorypagedetails.App;

/**
 * Created by arifhasnat on 1/13/16.
 */
public class ToastUtils {

    Context mContext;

    private ToastUtils(){


    }
    private static void show(Context context,int resId ,int duration){
        Toast.makeText(context,resId,duration).show();


    }
    private static void show(Context context,String message ,int duration){
        Toast.makeText(context,message,duration).show();


    }
    private static void show(int resId){
        Toast.makeText(App.getContext(),resId,Toast.LENGTH_LONG).show();


    }
    private static void show(String message){
        Toast.makeText(App.getContext(),message,Toast.LENGTH_LONG).show();


    }
}
