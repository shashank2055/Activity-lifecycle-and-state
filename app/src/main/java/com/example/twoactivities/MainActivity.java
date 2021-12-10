package com.example.twoactivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE
            = "com.example.twoactivities.extra.MESSAGE";
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 =findViewById(R.id.textView1);
        textView2 =findViewById(R.id.textView2);
        textView3 =findViewById(R.id.textView3);
        textView4 =findViewById(R.id.textView4);
        textView5 =findViewById(R.id.textView5);
        textView6 =findViewById(R.id.textView6);
        textView7 =findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 =findViewById(R.id.textView9);
        textView10 =findViewById(R.id.textView10);


        textView1.setText("");
        textView2.setText("");
        textView3.setText("");
        textView4.setText("");
        textView5.setText("");
        textView6.setText("");
        textView7.setText("");
        textView8.setText("");
        textView9.setText("");
        textView10.setText("");

        Intent replyIntent =getIntent();


        if (savedInstanceState != null) {

            if (savedInstanceState.getString("text_1")!= null) {
                textView1.setText(savedInstanceState.getString("text_1"));
            }if (savedInstanceState.getString("text_2")!= null) {
                textView2.setText(savedInstanceState.getString("text_2"));
            }if (savedInstanceState.getString("text_3")!= null) {
                textView3.setText(savedInstanceState.getString("text_3"));
            }if (savedInstanceState.getString("text_4")!= null) {
                textView4.setText(savedInstanceState.getString("text_4"));
            }if (savedInstanceState.getString("text_5")!= null) {
                textView5.setText(savedInstanceState.getString("text_5"));
            }if (savedInstanceState.getString("text_6")!= null) {
                textView6.setText(savedInstanceState.getString("text_6"));
            }if (savedInstanceState.getString("text_7")!= null) {
                textView7.setText(savedInstanceState.getString("text_7"));
            }if (savedInstanceState.getString("text_8")!= null) {
                textView8.setText(savedInstanceState.getString("text_8"));
            }if (savedInstanceState.getString("text_9")!= null) {
                textView9.setText(savedInstanceState.getString("text_9"));
            }if (savedInstanceState.getString("text_10")!= null) {
                textView10.setText(savedInstanceState.getString("text_10"));
            }
        }
    }


    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (textView1.getText() != "") {
            outState.putString("text_1",
                    textView1.getText().toString());
        }
        if (textView2.getText() != "") {
            outState.putString("text_2",
                    textView2.getText().toString());
        }
        if (textView3.getText() != "") {
            outState.putString("text_3",
                    textView3.getText().toString());
        }
        if (textView4.getText() != "") {
            outState.putString("text_4",
                    textView4.getText().toString());
        }
        if (textView5.getText() != "") {
            outState.putString("text_5",
                    textView5.getText().toString());
        }
        if (textView6.getText() != "") {
            outState.putString("text_6",
                    textView6.getText().toString());
        }
        if (textView7.getText() != "") {
            outState.putString("text_7",
                    textView7.getText().toString());
        }
        if (textView8.getText() != "") {
            outState.putString("text_8",
                    textView8.getText().toString());
        }
        if (textView9.getText() != "") {
            outState.putString("text_9",
                    textView9.getText().toString());
        }
        if (textView10.getText() != "") {
            outState.putString("text_10",
                    textView10.getText().toString());
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        Log.d(LOG_TAG, "here d!");
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply =
                        data.getStringExtra(SecondActivity.EXTRA_REPLY);


                if (textView1.getText() == "") {
                    textView1.setText(reply);
                } else if (textView2.getText() == "") {
                    textView2.setText(reply);
                } else if (textView3.getText() == "") {
                    textView3.setText(reply);
                } else if (textView4.getText() == "") {
                    textView4.setText(reply);
                } else if (textView5.getText() == "") {
                    textView5.setText(reply);
                } else if (textView6.getText() == "") {
                    textView6.setText(reply);
                } else if (textView7.getText() == "") {
                    textView7.setText(reply);
                } else if (textView8.getText() == "") {
                    textView8.setText(reply);
                } else if (textView9.getText() == "") {
                    textView9.setText(reply);
                } else if (textView10.getText() == "") {
                    textView10.setText(reply);
                }
            }
        }
    }
}