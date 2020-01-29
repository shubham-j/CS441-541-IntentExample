package com.example.jain.intentexample;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by shubham on 1/28/20.
 */

public class DisplayMsg extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_msg);
        TextView passedMsg = findViewById(R.id.receivedmsg);
        Intent thisIntent = getIntent();
        String displayMsg = thisIntent.getStringExtra("displayText");
        passedMsg.setText(displayMsg);
    }
}
