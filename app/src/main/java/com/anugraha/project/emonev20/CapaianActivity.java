package com.anugraha.project.emonev20;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CapaianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capaian);

        ConstraintLayout layoutdinas1 = (ConstraintLayout) findViewById(R.id.layoutdinas1);
        layoutdinas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(CapaianActivity.this, DinasActivity.class);
                startActivity(intent1);
            }
        });

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(CapaianActivity.this, HomeActivity.class);
                startActivity(back);
            }
        });
    }
}
