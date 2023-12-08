package com.example.resummaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends second_Activity  {

    EditText txtname, txtbirth, txtadress, txteamil, txtcontact, txtskil1, txtskil2, txtskil3, txtobjective, txtdegree,txtcollage, txtpassing, txtpercentage, txthobby1, txthobby2, txthobby3;

    Button txtbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        txtbtn = findViewById(R.id.txtbtn);

        txtbtn.setOnClickListener(view -> {
            String name = txtname.getText().toString();
            String birth = txtbirth.getText().toString();
            String cnt = txtcontact.getText().toString();
            String mail = txteamil.getText().toString();
            String add = txtadress.getText().toString();
            String degree = txtdegree.getText().toString();
            String clg = txtcollage.getText().toString();
            String passing = txtpassing.getText().toString();
            String percentage = txtpercentage.getText().toString();
            String skil1 = txtskil1.getText().toString();
            String skil2 = txtskil2.getText().toString();
            String skil3 = txtskil3.getText().toString();
            String hobby1 = txthobby1.getText().toString();
            String hobby2 = txthobby2.getText().toString();
            String hobby3 = txthobby3.getText().toString();

            Intent intent = new Intent(MainActivity.this, second_Activity .class);

            intent.putExtra("name", name);
            intent.putExtra("birth", birth);
            intent.putExtra("cnt", cnt);
            intent.putExtra("mail", mail);
            intent.putExtra("add", add);
            intent.putExtra("degree", degree);
            intent.putExtra("clg", clg);
            intent.putExtra("passy", passing);
            intent.putExtra("pr", percentage );
            intent.putExtra("skil1", skil1);
            intent.putExtra("skil2", skil2);
            intent.putExtra("skil3", skil3);
            intent.putExtra("hobby1", hobby1);
            intent.putExtra("hobby2", hobby2);
            intent.putExtra("hobby3", hobby3);

            
            startActivity(intent);

        });

        }
}