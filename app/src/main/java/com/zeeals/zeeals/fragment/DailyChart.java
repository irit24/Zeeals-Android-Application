package com.zeeals.zeeals.fragment;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.zeeals.zeeals.R;
import com.zeeals.zeeals.api.ApiClient;
import com.zeeals.zeeals.api.ApiInterface;
import com.zeeals.zeeals.api.GrafikOrderResponse;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import lecho.lib.hellocharts.gesture.ZoomType;
import lecho.lib.hellocharts.listener.LineChartOnValueSelectListener;
import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Column;
import lecho.lib.hellocharts.model.ColumnChartData;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.SubcolumnValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.util.ChartUtils;
import lecho.lib.hellocharts.view.ColumnChartView;
import lecho.lib.hellocharts.view.LineChartView;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;

import static android.R.attr.value;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  04/05/17.
 */
public class DailyChart extends Fragment {

    public final static String[] day = new String[]{"Mon", "Tue", "Wen", "Thu", "Fri", "Sat", "Sun",};
    public final static String[] days = new String[]{"1", "2", "3", "4", "5", "6", "7","8", "9", "10", "11", "12", "13", "14","15", "16", "17", "18", "19", "20", "21","22", "23", "24", "25", "26", "27", "28","29", "30", "31", };

    boolean haslabels;


    @BindView(R.id.chart)
    ColumnChartView chart;
    private ColumnChartData data;

//    private  data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_daily, null);
        ButterKnife.bind(this,rootView);


        loadjson();

        return rootView;
    }

    private void loadjson() {
        final HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder();

        client.addInterceptor(loggingInterceptor);
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);


        Call<GrafikOrderResponse> response = apiService.getGrafik();
        response.enqueue(new Callback<GrafikOrderResponse>() {
            @Override
            public void onResponse(Call<GrafikOrderResponse> call, retrofit2.Response<GrafikOrderResponse> response) {

                int numSubcolumns = 1;
                int numColumns = day.length;
//                int numColumns = response.body().getDaily().size();

                List<AxisValue> axisValues = new ArrayList<AxisValue>();
                List<Column> columns = new ArrayList<Column>();
                List<SubcolumnValue> values;
                for (int i = 0; i < numColumns; ++i) {

                    values = new ArrayList<SubcolumnValue>();
                    for (int j = 0; j < numSubcolumns; ++j) {
//                        values.add(new SubcolumnValue((float) response.body().getDaily().get(i).getJml() *1f , ChartUtils.pickColor()));
                        values.add(new SubcolumnValue((float) Math.random() * 50f + 5, ChartUtils.pickColor()));
                    }

                    axisValues.add(new AxisValue(i).setLabel(day[i]));

                    columns.add(new Column(values).setHasLabelsOnlyForSelected(true));
                }

                data = new ColumnChartData(columns);

                data.setAxisXBottom(new Axis(axisValues).setHasLines(true));
                data.setAxisYLeft(new Axis().setHasLines(true).setMaxLabelChars(numColumns));

                chart.setColumnChartData(data);

                // Set value touch listener that will trigger changes for chartTop.

                // Set selection mode to keep selected month column highlighted.
                chart.setValueSelectionEnabled(true);

                chart.setZoomType(ZoomType.HORIZONTAL);

                // chartBottom.setOnClickListener(new View.OnClickListener() {
                //
                // @Override
                // public void onClick(View v) {
                // SelectedValue sv = chartBottom.getSelectedValue();
                // if (!sv.isSet()) {
                // generateInitialLineData();
                // }
                //
                // }
                // });

            }


        @Override
            public void onFailure(Call<GrafikOrderResponse> call, Throwable t) {
                Log.e("Error", t.getMessage());
                Snackbar.make(getView(), "Please Try Again", Snackbar.LENGTH_LONG).show();

            }


        });

    }


    }
