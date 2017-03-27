package com.zeeals.zeeals.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.zeeals.zeeals.R;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.view.LineChartView;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  24/03/17.
 */

public class Chart2 extends Fragment {
    LineChart chart;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.chart1_activity, null);


        chart = (LineChart) rootView.findViewById(R.id.chart);
//        LineData data = new LineData(getXAxisValues(), getDataSet());

        LineData data = new LineData();
        chart.setData(data);
        chart.setData(data);
        setXAxis(chart);
        chart.getAxisRight().setDrawLabels(false);
        //chart.setAutoScaleMinMaxEnabled(true);
        chart.setGridBackgroundColor(128);
        chart.setBorderColor(255);
        chart.setDrawGridBackground(false);
        //chart.setBackgroundColor(0);
        chart.getLegend().setEnabled(false);
        chart.setPinchZoom(true);
        chart.getDescription().setEnabled(false);
        chart.setTouchEnabled(true);
        chart.setDoubleTapToZoomEnabled(true);
        chart.animateXY(2000, 2000);
        chart.invalidate();


        return rootView;


    }
    private ArrayList<ILineDataSet> getDataSet() {
        ArrayList<ILineDataSet> dataSets = null;
//        ArrayList<Entry> valueSet1 = new ArrayList<>();
        List<Entry> valueSet1 = new ArrayList<Entry>();

        Entry v1e1 = new Entry(110.000f, 0);
        valueSet1.add(v1e1);
        Entry v1e2 = new Entry(40.000f, 4);
        valueSet1.add(v1e2);
        Entry v1e3 = new Entry(60.000f, 5);
        valueSet1.add(v1e3);
        Entry v1e4 = new Entry(30.000f, 6);
        valueSet1.add(v1e4);
        Entry v1e5 = new Entry(90.000f, 7);
        valueSet1.add(v1e5);
        Entry v1e6 = new Entry(100.000f, 8);
        valueSet1.add(v1e6);

        LineDataSet lineDataSet1 = new LineDataSet(valueSet1, "Brand 1");
        int[] colors  = new int[] {R.color.blue  ,R.color.primary, R.color.colorPrimary ,R.color.icons, R.color.gray, R.color.colorPrimaryDark };
        lineDataSet1.setCircleColors(colors, getContext());
        lineDataSet1.setCircleRadius(8f);
        lineDataSet1.setLineWidth(3f);
        lineDataSet1.setValueTextSize(20f);
        lineDataSet1.enableDashedLine(6f, 18f, 0);
        dataSets = new ArrayList<>();
        dataSets.add(lineDataSet1);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        xAxis.add("JUL");
        xAxis.add("AUG");
        xAxis.add("SEPT");
        xAxis.add("OCT");
        xAxis.add("NOV");
        xAxis.add("DEC");
        return xAxis;
    }

    private void setXAxis(LineChart chart){
        XAxis xAxis = chart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextSize(10f);
        xAxis.setTextColor(Color.BLUE);
        //xAxis.setDrawGridLines(true);
        xAxis.setDrawAxisLine(true);

    }

    
}