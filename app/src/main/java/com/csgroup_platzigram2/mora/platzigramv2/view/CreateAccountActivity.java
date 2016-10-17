package com.csgroup_platzigram2.mora.platzigramv2.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.csgroup_platzigram2.mora.platzigramv2.R;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        showToolbar(getResources().getString(R.string.toolbar_title_create_account),true);
    }

    public void showToolbar(String title, Boolean upButton){
        Toolbar tollbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tollbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
