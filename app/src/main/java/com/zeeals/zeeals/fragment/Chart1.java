package com.zeeals.zeeals.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.zeeals.zeeals.R;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  20/03/17.
 */

public class Chart1 extends Fragment {
    private LineChart mChart;

    private int numberOfLines = 1;
    private int maxNumberOfLines = 4;
    private int numberOfPoints = 12;

    float[][] randomNumbersTab = new float[maxNumberOfLines][numberOfPoints];

    private boolean hasAxes = true;
    private boolean hasAxesNames = true;
    private boolean hasLines = true;
    private boolean hasPoints = true;
    private boolean isFilled = false;
    private boolean hasLabels = false;
    private boolean isCubic = false;
    private boolean hasLabelForSelected = false;
    private boolean pointsHaveDifferentColor;
    private boolean hasGradientToTransparent = false;

    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.chart_activity, null);


        mChart = (LineChart) rootView.findViewById(R.id.chart);
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(0f, 30f));
        entries.add(new Entry(1, 80f));
        entries.add(new Entry(2, 60f));
        entries.add(new Entry(3, 50f));
        entries.add(new Entry(4f, 30f));
        entries.add(new Entry(5f, 50f));






        List<String> labels = new ArrayList<>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        LineDataSet dataset = new LineDataSet(entries,"ww");
        dataset.setValueFormatter(new PercentFormatter());

//        LineData lineData = new LineData(dataset);

        LineData data = new LineData(dataset);

        mChart.setData(data);

        dataset.setColors(R.color.colorPrimary); //
        dataset.setDrawCircles(true);
        dataset.setDrawFilled(true);

        mChart.animateY(400);
        mChart.getXAxis().setEnabled(false);
        mChart.getAxisLeft().setEnabled(true);
        mChart.getAxisRight().setEnabled(false);
        mChart.getAxisLeft().setDrawGridLines(false);
        mChart.getXAxis().setDrawGridLines(false);




        mChart.getDescription().setEnabled(false);

        // enable touch gestures
        mChart.setTouchEnabled(false);

        // enable scaling and dragging
        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(true);


        return rootView;
    }
    }
