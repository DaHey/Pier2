package com.example.android.fivethings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page1 extends Activity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        addListenerOnButton();
    }


    public void addListenerOnButton() {

        final Context context = this;
        button = (Button) findViewById(R.id.button_for_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Page2.class);
                startActivity(intent);
            }
        });

    }

    public void getInformation(View v){
        Uri uri = Uri.parse("http://ppt.cc/v3NlF"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }




}