package com.example.hshack.destress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.*;


public class Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        Button button = (Button) findViewById(R.id.queryButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RetrieveMessageTask retrieve = new RetrieveMessageTask();
                retrieve.execute();
                Log.i("clicked","button is clicked!");

                String quote = retrieve.getQuote();

                TextView text = (TextView) findViewById(R.id.responseView);
                text.setText(quote);
            }

        });

    }

}


      /*  Button button = (Button) findViewById(R.id.queryButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                protected String doInBackground(URL... urls) {
                    try {
                        URL url = new URL("http://quotes.rest/qod.json?category=inspire");
                        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                            StringBuilder stringBuilder = new StringBuilder();
                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                stringBuilder.append(line).append("\n");
                            }
                            bufferedReader.close();
                            return stringBuilder.toString();
                        } finally {
                            urlConnection.disconnect();
                        }
                    } catch (Exception e) {
                        Log.e("ERROR", e.getMessage(), e);
                        return null;
                    }
                }
            }

            protected void onPostExecute(String response) {
                if (response == null) {
                    response = "THERE WAS AN ERROR";
                }
                Log.i("INFO", response);
                TextView responseView = (TextView) findViewById(R.id.responseView);
                responseView.setText(response);
            }



        });
    }*/



