package navigationdrawer.arifhasnat.com.categorypagedetails;

import android.database.sqlite.SQLiteDatabase;

import org.litepal.LitePalApplication;
import org.litepal.tablemanager.Connector;

/**
 * Created by arifhasnat on 1/13/16.
 */
public class App extends LitePalApplication{

    @Override
    public void onCreate(){
        super.onCreate();
        SQLiteDatabase db= Connector.getDatabase();

    }

}
