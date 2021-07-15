package com.example.second_code;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ManeBar extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manu_bar);

        setTitle("Main Page");

        ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    String TAG = "MYTAG";

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu) {
            Log.d(TAG, "Click MENU!");
            Intent menu1 = new Intent(this,MainActivity.class);
            startActivity(menu1);
        } else if (item.getItemId() == R.id.contact) {
            Log.d(TAG, "Click Contact!");
            Intent conctact = new Intent(this,MainActivity2.class);
            startActivity(conctact);
        } else if (item.getItemId() == R.id.exit) {
            Log.d(TAG, "Click Exit!");
            System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onClick(View v) {

    }
}