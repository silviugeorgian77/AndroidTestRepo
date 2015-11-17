package com.example.spopescu.testapplication.activites;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.spopescu.testapplication.R;
import com.example.spopescu.testapplication.beans.Attacker;
import com.example.spopescu.testapplication.beans.Defender;
import com.example.spopescu.testapplication.beans.Goalkeeper;
import com.example.spopescu.testapplication.beans.Midfielder;
import com.example.spopescu.testapplication.controllers.MainController;
import com.example.spopescu.testapplication.interfaces.FootballPlayer;

import java.util.ArrayList;

public class AddPlayerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private LayoutInflater inflater;
    private LinearLayout mainLayout;
    private ArrayList<View> addedViews;
    private ArrayList<EditText> addedEditTextViews;
    private EditText nameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);

        Spinner spinner = (Spinner) findViewById(R.id.player_type_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.player_types_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        mainLayout = (LinearLayout) findViewById(R.id.main_layout);

        inflater = getLayoutInflater();

        LinearLayout addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
        TextView attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
        attributeLabel.setText("Name");
        nameEditText = (EditText) addPlayerField.findViewById(R.id.attribute_field);
        nameEditText.setText("");
        mainLayout.addView(addPlayerField);

        addedViews = new ArrayList<>();
        addedEditTextViews = new ArrayList<>();
    }

    private int currentPosition;
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Log.d("position", position + "");
        for (View v:addedViews) {
            mainLayout.removeView(v);
        }
        addedViews.clear();
        addedEditTextViews.clear();
        LinearLayout addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
        TextView attributeLabel;
        if (position == 0) {
            currentPosition = 0;

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("positioning");
            mainLayout.addView(addPlayerField);
            addedViews.add(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("reflexes");
            mainLayout.addView(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));
        } else if (position == 1) {
            currentPosition = 1;

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("header");
            mainLayout.addView(addPlayerField);
            addedViews.add(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("standingTackle");
            mainLayout.addView(addPlayerField);
            addedViews.add(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("slidingTackle");
            mainLayout.addView(addPlayerField);
            addedViews.add(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));
        } else if (position == 2) {
            currentPosition = 2;

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("shot");
            mainLayout.addView(addPlayerField);
            addedViews.add(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("pass");
            mainLayout.addView(addPlayerField);
            addedViews.add(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("speed");
            mainLayout.addView(addPlayerField);
            addedViews.add(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));
        } else if (position == 3) {
            currentPosition = 3;

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("positioning");
            mainLayout.addView(addPlayerField);
            addedViews.add(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("shot");
            mainLayout.addView(addPlayerField);
            addedViews.add(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("speed");
            mainLayout.addView(addPlayerField);
            addedViews.add(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));

            addPlayerField = (LinearLayout) inflater.inflate(R.layout.add_player_field, null);
            attributeLabel = (TextView) addPlayerField.findViewById(R.id.attribute_label);
            attributeLabel.setText("header");
            mainLayout.addView(addPlayerField);
            addedViews.add(addPlayerField);
            addedEditTextViews.add((EditText) addPlayerField.findViewById(R.id.attribute_field));
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void addButtonClicked(View view) {
        FootballPlayer player = null;
        String name = nameEditText.getText().toString();
        if (currentPosition == 0) {
            int positioning = Integer.parseInt(addedEditTextViews.get(0).getText().toString());
            int reflexes = Integer.parseInt(addedEditTextViews.get(1).getText().toString());
            player = new Goalkeeper(name, positioning, reflexes);
        } else if (currentPosition == 1) {
            int header = Integer.parseInt(addedEditTextViews.get(0).getText().toString());
            int standingTackle = Integer.parseInt(addedEditTextViews.get(1).getText().toString());
            int slidingTackle = Integer.parseInt(addedEditTextViews.get(2).getText().toString());
            player = new Defender(name, header, standingTackle, slidingTackle);
        } else if (currentPosition == 2) {
            int shot = Integer.parseInt(addedEditTextViews.get(0).getText().toString());
            int pass = Integer.parseInt(addedEditTextViews.get(1).getText().toString());
            int speed = Integer.parseInt(addedEditTextViews.get(2).getText().toString());
            player = new Midfielder(name, shot, pass, speed);
        } else if (currentPosition == 3) {
            int positioning = Integer.parseInt(addedEditTextViews.get(0).getText().toString());
            int shot = Integer.parseInt(addedEditTextViews.get(1).getText().toString());
            int speed = Integer.parseInt(addedEditTextViews.get(2).getText().toString());
            int header = Integer.parseInt(addedEditTextViews.get(3).getText().toString());
            player = new Attacker(name, positioning, shot, speed, header);
        }
        MainController.instance.getFootballPlayersList().add(player);

        Toast.makeText(this, "Player added", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
