package com.example.spopescu.testapplication.activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.spopescu.testapplication.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void addPlayerClicked(View view) {
        Intent intent = new Intent(this, AddPlayerActivity.class);
        startActivity(intent);
    }

    public void applicationDetailsClicked(View view) {
        Toast.makeText(this, "Eu sunt Dani din Berceni", Toast.LENGTH_LONG).show();
    }

    public void viewPlayersClicked(View view) {
        Intent intent = new Intent(this, ViewAllPlayersActivity.class);
        startActivity(intent);
    }
}
