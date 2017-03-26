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
import java.util.*;

import org.json.*;
import org.json.JSONException;

public class RetrieveMessageTask extends AsyncTask<Void, Void, String>{

        private Exception exception;

        private static String response;

        public  String quote;
        private InterestingEvent ie;
        private boolean somethingHappened;

        public RetrieveMessageTask (InterestingEvent event)
        {
            ie = event;
            somethingHappened = false;
        }

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
            String quote1 = "";
            try
            {
                Log.v("tag", "Inside the try");
                JSONObject obj = new JSONObject(response);
                Log.v("tag", "Created JSONObject");
                JSONArray array = obj.getJSONObject("contents").getJSONArray("quotes");
                Log.v("tag", "the array did create");
                quote1 =  array.optJSONObject(0).getString("quote");
                Log.v("tag", "Retrieved quote1: " + quote1);
            }
            catch(JSONException e)
            {
                Log.e("error", "error   is occurring");
            }

            quote = quote1;

            Log.v("tag","this should be the second to last log statement");

            somethingHappened = true;

            if (somethingHappened)
            {
                ie.interestingEvent();
            }

        }




        public String getQuote()
        {
            return quote;
        }

//        public boolean getBoolean()
//        {
//            return done;
//        }

        public void interestingEvent(){

        }

    }

