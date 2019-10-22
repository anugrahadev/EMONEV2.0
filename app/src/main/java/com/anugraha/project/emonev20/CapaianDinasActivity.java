package com.anugraha.project.emonev20;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CapaianDinasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capaian_dinas);

        ConstraintLayout layoutdinas1 = findViewById(R.id.layoutdinas1);
        layoutdinas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CapaianDinasActivity.this, ProgramActivity.class);
                startActivity(intent);
            }
        });

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(CapaianDinasActivity.this, DinasActivity.class);
                startActivity(back);
            }
        });
    }
}
