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

        public static String quote;

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
            String quotes = retrieveQuote();
            quote = quotes;

        }

        public static String retrieveQuote()
        {
            String quote1 = "\"quote\":\"Do not be afraid to give up the good for the great.\",\"length\":\"51\",\"author\":\"Kenny Rogers\",\"tags\":[\"g";
//            try
//            {
//                Log.v("tag", "Inside the try");
//                JSONObject obj = new JSONObject(response);
//                Log.v("tag", "Created JSONObject");
//                JSONArray array = obj.getJSONObject("contents").getJSONArray("quotes");
//                Log.v("tag", "the array did create");
//                quote1 =  array.getString(0);
//                Log.v("tag", "Retrieved quote: " + quote1);
                StringTokenizer st = new StringTokenizer(quote1, ",");
                String quote2 = st.nextToken();
                quote2 = quote2.substring(9, quote2.length() - 1);
                Log.v("tag", "final quote " + quote2);
                return quote2;
//            }
//            catch(JSONException e)
//            {
//                Log.e("error", "error   is occurring");
//                return quote1;
//            }


        }

        public static String getQuote()
        {
            quote = retrieveQuote();
            return quote;
        }

    }

