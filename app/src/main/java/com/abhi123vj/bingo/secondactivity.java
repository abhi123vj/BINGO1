package com.abhi123vj.bingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class secondactivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(secondactivity.this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_secondactivity);

    }
}
