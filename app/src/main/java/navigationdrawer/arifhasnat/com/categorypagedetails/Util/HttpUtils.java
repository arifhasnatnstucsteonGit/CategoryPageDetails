package navigationdrawer.arifhasnat.com.categorypagedetails.Util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by arifhasnat on 1/13/16.
 */
public class HttpUtils  {
    private URL url=null;

    public String download(String urlStr){

        StringBuffer sb=new StringBuffer();
        String line=null;
        BufferedReader bufferedReader=null;

        try {
            url=new URL(urlStr);
            HttpURLConnection urlConnection= (HttpURLConnection) url.openConnection();
            bufferedReader =new BufferedReader(new InputStreamReader(urlConnection.getErrorStream()));
            while((line=bufferedReader.readLine()) !=null){
               sb.append(line);


            }

        }catch (Exception ex){
            ex.printStackTrace();



        }finally {
            try {

                bufferedReader.close();

            }catch (Exception e){
                e.printStackTrace();

            }
        }

        return  sb.toString();

    }
}
