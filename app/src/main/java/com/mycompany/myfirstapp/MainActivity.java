package com.mycompany.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;


public class MainActivity extends ActionBarActivity {

    TextView textBox;
    EditText editText;
    SwipeView swipeText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBox = (TextView) findViewById(R.id.myTextView);
        editText = (EditText) findViewById(R.id.text_box);
        swipeText = (SwipeView) findViewById(R.id.mySwipeView);

        final Button myButton = (Button) findViewById(R.id.myButton);
        myButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textBox.setText(editText.getText());
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(id) {
            case (R.id.action_settings):
                return true;
            case (R.id.action_discard):
                swipeText.discard();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
