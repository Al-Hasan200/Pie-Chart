package com.example.piechart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.FSize;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> record = new ArrayList<>();
        record.add(new PieEntry(50, "Mango"));
        record.add(new PieEntry(100, "Banana"));
        record.add(new PieEntry(150, "Orange"));
        record.add(new PieEntry(200, "Lemon"));

        PieDataSet pieDataSet = new PieDataSet(record, "");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(15f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Fruits");
        pieChart.setCenterTextSize(22f);
        pieChart.setCenterTextColor(Color.BLACK);
        pieChart.setEntryLabelTextSize(22f);
        pieChart.setDrawEntryLabels(false);
        pieChart.getLegend().setEnabled(true);
        pieChart.getLegend().setFormSize(22f);
        pieChart.getLegend().setTextSize(22f);
        pieChart.getLegend().setOrientation(Legend.LegendOrientation.VERTICAL);
        pieChart.getLegend().setVerticalAlignment(Legend.LegendVerticalAlignment.CENTER);
        pieChart.animate();
    }
}