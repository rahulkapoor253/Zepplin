package com.example.rahulkapoor.zeplinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.rahulkapoor.zeplinapp.listdata.ListData;

import java.util.ArrayList;

public class SideMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_menu);

        ArrayList<ListData> word = new ArrayList<>();

        word.add(new ListData(R.drawable.icon_networks, getString(R.string.network_view)));
        word.add(new ListData(R.drawable.icon_payment_normal, getString(R.string.payment)));
        word.add(new ListData(R.drawable.icon_job_normal, getString(R.string.job_history)));
        word.add(new ListData(R.drawable.icon_emergency_normal, getString(R.string.Emergency_contacts)));
        word.add(new ListData(R.drawable.icon_help_normal, getString(R.string.Help)));
        word.add(new ListData(R.drawable.icon_logout_normal, getString(R.string.logout)));

        WordAdapter wordAdapter = new WordAdapter(SideMenu.this, word);
        ListView listView = (ListView) findViewById(R.id.lv_data);
        listView.setAdapter(wordAdapter);

    }


}
