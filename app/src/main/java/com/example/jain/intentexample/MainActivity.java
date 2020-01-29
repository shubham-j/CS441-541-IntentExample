package com.example.jain.intentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText myMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button okButton = (Button) findViewById(R.id.ok);
        okButton.setOnClickListener(this);
        Button cancelButton = (Button) findViewById(R.id.Cancel);
        cancelButton.setOnClickListener(this);
        myMsg = findViewById(R.id.mystring);
    }

    public void sendMessage(View view){
        Intent myintent = new Intent(this, DisplayMsg.class);
        String msg = myMsg.getText().toString();
        myintent.putExtra("displayText", msg);
        startActivity(myintent);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ok:
                sendMessage(v);
                break;
            case R.id.Cancel:
                Log.d("LOG","Trying to clear");
                myMsg.getText().clear();
                break;
        }
    }
}



