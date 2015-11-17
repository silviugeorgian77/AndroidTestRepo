package com.example.spopescu.testapplication.activites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.spopescu.testapplication.R;
import com.example.spopescu.testapplication.controllers.ListViewAdapter;

public class ViewAllPlayersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_players);

        ListView lv = (ListView) findViewById(R.id.lv);
        ListViewAdapter adapter = new ListViewAdapter(getLayoutInflater());
        lv.setAdapter(adapter);
    }
}
