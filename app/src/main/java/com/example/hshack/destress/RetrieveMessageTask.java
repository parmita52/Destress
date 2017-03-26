package com.example.hshack.destress;

/**
 * Created by hshack on 3/26/17.
 */

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.*;
import org.json.JSONException;

public class RetrieveMessageTask extends AsyncTask<Void, Void, String>{

        private Exception exception;

        private String response;

        protected void onPreExecute() {
            response = "";
        }

        protected String doInBackground(Void... urls) {

            try {
                URL url = new URL("http://quotes.rest/qod.json?category=inspire" );
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                Log.v("tag","URL connection worked");
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        stringBuilder.append(line).append("\n");
                    }
                    bufferedReader.close();
                    Log.v("tag", "appending worked");
                    return stringBuilder.toString();
                }
                finally{
                    urlConnection.disconnect();
                }
            }
            catch(Exception e) {
                Log.e("ERROR", e.getMessage(), e);
                return null;
            }
        }

        protected void onPostExecute(String responses) {
            if(responses == null) {
                responses = "THERE WAS AN ERROR";
            }

            Log.i("INFO", responses);
            response = responses;

        }

//        public String getQuote()
//        {
//            try
//            {
//                JSONObject obj = new JSONObject(response);
//                String quote = obj.getJSONObject("quotes").getString("quote");
//                return quote;
//            }
//
//            catch JSONException (JSONException e)
//            {
//                Log.e("error", "error   is occurring");
//            }
//
//        }

    }

