package com.litmon.app.singlechoicelistviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        SingeChoiceListAdapter adapter = new SingeChoiceListAdapter(this);
        listView.setAdapter(adapter);

        for(int i = 0; i < 10; i++){
            adapter.add("position: " + i);
        }

        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }
}
