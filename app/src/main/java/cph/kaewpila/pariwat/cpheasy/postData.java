package cph.kaewpila.pariwat.cpheasy;

import android.content.Context;
import android.os.AsyncTask;
import android.speech.tts.Voice;
import android.util.Log;

/**
 * Created by Group172-144 on 26/4/2560.
 */

public class postData extends AsyncTask<String,Void,String>{
    private Context context;
    private static final String urlPHP = "http://swiftcodingthai.com/cph/addUserpariwat.php";

    public postData(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {

        try {


        } catch (Exception e) {
            Log.d("26Aprilv1", "e doin ==>" + e.toString());
        }

        return null;
    }
}  //main class
