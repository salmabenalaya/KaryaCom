package com.example.karyacom.Activities;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.karyacom.Models.Member;
import com.example.karyacom.R;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Formulaire extends AppCompatActivity {
    private Button btnsave;
    EditText txtname,txtphone,txtFamille,txtlocation;
    DatabaseReference RootRef;
    Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire);

        btnsave = (Button) findViewById(R.id.btnsave);
        txtname = (EditText) findViewById(R.id.txtname);
        txtphone = (EditText) findViewById(R.id.txtphone);
        txtlocation = (EditText) findViewById(R.id.txtlocation);
        txtFamille = (EditText) findViewById(R.id.txtFamille);
        member = new Member();
        RootRef = FirebaseDatabase.getInstance().getReference().child("Member");
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tel=Integer.parseInt(txtphone.getText().toString().trim());
                int Fam=Integer.parseInt(txtFamille.getText().toString().trim());
                member.setName(txtname.getText().toString().trim());
                member.setLocation(txtlocation.getText().toString().trim());
                member.setPhone(tel);
                member.setFamille(Fam);
                RootRef.push().child("member1").setValue(member);
                Toast.makeText(Formulaire.this,"insert seccefully",Toast.LENGTH_SHORT);

            }
        });
    }
}


