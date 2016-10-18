package com.csgroup_platzigram2.mora.platzigramv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.csgroup_platzigram2.mora.platzigramv2.view.ContainerActivity;
import com.csgroup_platzigram2.mora.platzigramv2.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goHome(View view){
        Log.e("Mensaje","Aquí valio madres");
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
}
