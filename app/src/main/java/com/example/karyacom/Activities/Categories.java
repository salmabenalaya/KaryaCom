package com.example.karyacom.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.karyacom.R;

public class Categories extends AppCompatActivity {
Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
       logout = findViewById(R.id.logoutBTN);
       logout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
               SharedPreferences.Editor editor=preferences.edit();
               editor.putString("chkBoxRememberMe","false");
               editor.apply();
               finish();

           }
       });
    }
}
