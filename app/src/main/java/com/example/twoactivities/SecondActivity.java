package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY =
            "com.example.twoactivities.extra.REPLY";

    private Button button_apple;
    private Button button_cheese;
    private Button button_orange;
    private Button button_rice;
    private Button button_icecream;
    private Button button_egg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        button_apple =findViewById(R.id.button_apple);
        button_egg =findViewById(R.id.button_egg);
        button_rice =findViewById(R.id.button_rice);
        button_orange =findViewById(R.id.button_orange);
        button_icecream =findViewById(R.id.button_icecream);
        button_cheese =findViewById(R.id.button_cheese);



    }



    public void btnApple(View view) {
        String reply = "Apple";


        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void btnCheese(View view) {
        String reply = "Cheese";


        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void btnEgg(View view) {
        String reply = "Egg";


        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void btnIcecream(View view) {
        String reply = "Ice Cream";


        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void btnOrange(View view) {
        String reply = "Orange";


        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void btnRice(View view) {
        String reply = "Rice";


        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}