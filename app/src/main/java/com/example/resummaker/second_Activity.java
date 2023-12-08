package com.example.resummaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class second_Activity extends AppCompatActivity {

    ImageView img1, img2, img3, img4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);

        String name = getIntent().getStringExtra("name");
        String birth = getIntent().getStringExtra("birth");
        String cnt = getIntent().getStringExtra("cnt");
        String mail = getIntent().getStringExtra("mail");
        String add = getIntent().getStringExtra("add");
        String degree = getIntent().getStringExtra("degree");
        String clg = getIntent().getStringExtra("clg");
        String passing = getIntent().getStringExtra("passing");
        String pr = getIntent().getStringExtra("pr");
        String skill1 = getIntent().getStringExtra("skill1");
        String skill2 = getIntent().getStringExtra("skill2");
        String skill3 = getIntent().getStringExtra("skill3");
        String hobby1 = getIntent().getStringExtra("hobby1");
        String hobby2 = getIntent().getStringExtra("hobby2");
        String hobby3 = getIntent().getStringExtra("hobby3");
        String obj = getIntent().getStringExtra("obj");

        img1.setOnClickListener(view -> {

            Intent intent = new Intent(second_Activity.this, therd_Activity.class);
            intent.putExtra("name", name);
            intent.putExtra("birth", birth);
            intent.putExtra("add", add);
            intent.putExtra("mail", mail);
            intent.putExtra("cnt", cnt);
            intent.putExtra("skill1", skill1);
            intent.putExtra("skill2", skill2);
            intent.putExtra("skill3", skill3);
            intent.putExtra("obj",obj);
            intent.putExtra("degree", degree);
            intent.putExtra("clg", clg);
            intent.putExtra("passy", passing);
            intent.putExtra("pr", pr);
            intent.putExtra("hobby1", hobby1);
            intent.putExtra("hobby2", hobby2);
            intent.putExtra("hobby3", hobby3);

            startActivity(intent);


        });

        img2.setOnClickListener(view -> {

            Intent intent = new Intent(second_Activity.this, fourt_Activity.class);
            intent.putExtra("name", name);
            intent.putExtra("birth", birth);
            intent.putExtra("add", add);
            intent.putExtra("mail", mail);
            intent.putExtra("cnt", cnt);
            intent.putExtra("skill1", skill1);
            intent.putExtra("skill2", skill2);
            intent.putExtra("skill3", skill3);
            intent.putExtra("obj",obj);
            intent.putExtra("degree", degree);
            intent.putExtra("clg", clg);
            intent.putExtra("passy", passing);
            intent.putExtra("pr", pr);
            intent.putExtra("hobby1", hobby1);
            intent.putExtra("hobby2", hobby2);
            intent.putExtra("hobby3", hobby3);

            startActivity(intent);

        });

        img3.setOnClickListener(view -> {

            Intent intent = new Intent(second_Activity.this, fifth_Activity.class);
            intent.putExtra("name", name);
            intent.putExtra("birth", birth);
            intent.putExtra("add", add);
            intent.putExtra("mail", mail);
            intent.putExtra("cnt", cnt);
            intent.putExtra("skill1", skill1);
            intent.putExtra("skill2", skill2);
            intent.putExtra("skill3", skill3);
            intent.putExtra("obj",obj);
            intent.putExtra("degree", degree);
            intent.putExtra("clg", clg);
            intent.putExtra("passy", passing);
            intent.putExtra("pr", pr);
            intent.putExtra("hobby1", hobby1);
            intent.putExtra("hobby2", hobby2);
            intent.putExtra("hobby3", hobby3);
            startActivity(intent);

        });

        img4.setOnClickListener(view -> {

            Intent intent = new Intent(second_Activity.this, sixth_Activity.class);
            intent.putExtra("name", name);
            intent.putExtra("birth", birth);
            intent.putExtra("add", add);
            intent.putExtra("mail", mail);
            intent.putExtra("cnt", cnt);
            intent.putExtra("skill1", skill1);
            intent.putExtra("skill2", skill2);
            intent.putExtra("skill3", skill3);
            intent.putExtra("obj",obj);
            intent.putExtra("degree", degree);
            intent.putExtra("clg", clg);
            intent.putExtra("passy", passing);
            intent.putExtra("pr", pr);
            intent.putExtra("hobby1", hobby1);
            intent.putExtra("hobby2", hobby2);
            intent.putExtra("hobby3", hobby3);
            startActivity(intent);

        });
    }

}



