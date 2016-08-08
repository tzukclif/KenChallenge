package com.gnirt69.gcmexample;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by koopke on 8/8/2016.
 */

public class DbConnector extends AsyncTask<String,Void,Void> {

    Context context;

    DbConnector (Context ctx) {
        context = ctx;
    }



    @Override
    protected Void doInBackground(String... params) {



        String login_url = "http://www.kenchallenge.eu.pn/DBInsert.PHP";
        String token = params[0];



        try {


            URL url = new URL(login_url);



            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            String post_data = URLEncoder.encode("token", "UTF-8")+ '='+'"' +URLEncoder.encode(token, "UTF-8")+'"';
            Log.e("EASYEASY",post_data);
            bufferedWriter.write(post_data);
            bufferedWriter.flush();
            bufferedWriter.close();
            httpURLConnection.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
            Log.e("MalformedURLException","COULDNT CONNECT");
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("IOException","COULDNT CONNECT");
        }


        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }


}
