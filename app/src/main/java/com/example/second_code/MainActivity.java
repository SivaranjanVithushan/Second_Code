package com.example.second_code;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int[] images = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};
    ImageView im1;
    ImageView im2;
    Button btn;
    Button btn2;
    int num = 0;
    int num2 = 0;

    public static boolean open;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        open =false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        open =true;
        setTitle("Game Page");
        im1 = findViewById(R.id.image);
        im1.setOnClickListener(this);
        im2 = findViewById(R.id.image2);
        im2.setOnClickListener(this);
        btn = findViewById(R.id.btn1);
        btn.setOnClickListener(this);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);



        ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);

        }

    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
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

        } else if (item.getItemId() == R.id.contact) {
            Log.d(TAG, "Click Contact!");
            Intent conctact = new Intent(this, MainActivity2.class);
            startActivity(conctact);

        } else if (item.getItemId() == R.id.exit) {
            Log.d(TAG, "Click Exit!");
            System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {
            Random random1 = new Random();
            num2 = random1.nextInt(6);
            num = random1.nextInt(6);
            im1.setImageResource(images[num2]);
            im2.setImageResource(images[num]);
            btn.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btn2) {
            Random random1 = new Random();
            num2 = random1.nextInt(6);
            num = random1.nextInt(6);
            im1.setImageResource(images[num2]);
            im2.setImageResource(images[num]);
        }
    }
}









