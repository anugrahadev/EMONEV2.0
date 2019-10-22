package com.anugraha.project.emonev20;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class HomeActivity extends AppCompatActivity {
    PieChartView pieChartView;
    LinearLayout linearkpi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        pieChartView = findViewById(R.id.chart);

        List pieData = new ArrayList<>();

        pieData.add(new SliceValue(80, Color.parseColor("#08FF00")).setLabel("80%"));
        pieData.add(new SliceValue(20, Color.parseColor("#FFBB00")).setLabel("20%"));

        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(14);
        pieChartView.setPieChartData(pieChartData);

        linearkpi = (LinearLayout) findViewById(R.id.linearkpi);
        linearkpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goTo = new Intent(HomeActivity.this, CapaianActivity.class);
                startActivity(goTo);
            }
        });


    }
}
