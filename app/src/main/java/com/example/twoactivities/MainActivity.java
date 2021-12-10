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
    private int mCount;
    private EditText text_edit;
    private TextView txtCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCount=0;
        txtCount= (TextView)findViewById(R.id.text_count);

        text_edit=(EditText) findViewById(R.id.editText_main);

        if(savedInstanceState!=null){
            mCount= savedInstanceState.getInt("count");
            text_edit.setText(savedInstanceState.getString("textSave"));
            txtCount.setText(Integer.toString(mCount));
        }
    }


    public void countClick(View view) {
        mCount++;
        if(this.txtCount != null)
            this.txtCount.setText(Integer.toString(mCount));

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mCount !=0){
            outState.putInt("count", mCount);
        }
        if (text_edit.getText()!=null){
            outState.putString("textSave",text_edit.getText().toString());
        }
    }
}