package com.example.resummaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class therd_Activity extends AppCompatActivity {

    TextView txtname, txtbirth, txtadress, txteamil, txtcontact, txtskil1, txtskil2, txtskil3, txtobjective, txtdegree, txtcollage, txtpassing, txtpercentage, txthobby1, txthobby2, txthobby3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therd);
        txtname = findViewById(R.id.txtname);
        txtbirth = findViewById(R.id.txtbirth);
        txtadress = findViewById(R.id.txtadress);
        txteamil = findViewById(R.id.txtemail);
        txtcontact = findViewById(R.id.txtcontact);
        txtskil1 = findViewById(R.id.txtskil1);
        txtskil2 = findViewById(R.id.txtskil2);
        txtskil3 = findViewById(R.id.txtskil3);
        txtobjective = findViewById(R.id.txtobjective);
        txtdegree = findViewById(R.id.txtdegree);
        txtcollage = findViewById(R.id.txtcollage);
        txtpassing = findViewById(R.id.txtpassing);
        txtpercentage = findViewById(R.id.txtpercentage);
        txthobby1 = findViewById(R.id.txthobby1);
        txthobby2 = findViewById(R.id.txthobby2);
        txthobby3 = findViewById(R.id.txthobby3);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String birth = intent.getStringExtra("birth");
        String adress = intent.getStringExtra("adress");
        String mail = intent.getStringExtra("email");
        String cnt = intent.getStringExtra("contact");
        String skil1 = intent.getStringExtra("skil1");
        String skil2 = intent.getStringExtra("skil2");
        String skil3 = intent.getStringExtra("skil3");
        String objective = intent.getStringExtra("objective");
        String degree = intent.getStringExtra("degree");
        String clg = intent.getStringExtra("collage");
        String passing = intent.getStringExtra("passing");
        String percentage = intent.getStringExtra("percentage");
        String hobby1 = intent.getStringExtra("hobby1");
        String hobby2 = intent.getStringExtra("hobby2");
        String hobby3 = intent.getStringExtra("hobby3");

        txtname.setText(name);
        txtbirth.setText(birth);
        txtadress.setText(adress);
        txteamil.setText(mail);
        txtcontact.setText(cnt);
        txtskil1.setText(skil1);
        txtskil2.setText(skil2);
        txtskil3.setText(skil3);
        txtobjective.setText(objective);
        txtdegree.setText(degree);
        txtcollage.setText(clg);
        txtpassing.setText(passing);
        txtpercentage.setText(percentage);
        txthobby1.setText(hobby1);
        txthobby2.setText(hobby2);
        txthobby3.setText(hobby3);

    }
}
