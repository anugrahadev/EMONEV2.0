package com.anugraha.project.emonev20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DinasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinas);

        LinearLayout linearLayout9 = (LinearLayout) findViewById(R.id.linearLayout9);
        linearLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinasActivity.this, CapaianDinasActivity.class);
                startActivity(intent);
            }
        });

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(DinasActivity.this, CapaianActivity.class);
                startActivity(back);
            }
        });
    }
}
