package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.myapplication.Activity.Activity.AddUserActivity;
import com.example.myapplication.R;

public class User_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("NGƯỜI DÙNG");
        setContentView(R.layout.activity_user_activity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_user, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void add(MenuItem item) {
        Intent intent = new Intent(User_activity.this, AddUserActivity.class);
        startActivity(intent);
    }
}