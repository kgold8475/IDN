package com.example.myapplication;

import android.app.Activity;

import android.content.BroadcastReceiver;

import android.content.Context;

import android.content.Intent;

import android.content.IntentFilter;

import android.net.wifi.WifiInfo;

import android.net.wifi.WifiManager;

import android.os.Bundle;

import android.util.Log;

import android.widget.TextView;

import android.view.View;

import android.graphics.Color;







public class MainActivity extends Activity {



    private static final String LOG_TAG = "LOG";



    private TextView tvRssi;
    private TextView section;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


    }

    //button event

    public void Scan_Start(View v) {

        // wifi신호강도(세기)(RSSI(received signal strength indication)) 측정

        tvRssi = (TextView) findViewById(R.id.tvrssi);

        registerReceiver(rssiReceiver, new IntentFilter(WifiManager.RSSI_CHANGED_ACTION));
    }

    public void onSection_clicked(View v) {
        switch (v.getId()) {
            case R.id.section1 :
                section = (TextView) findViewById(R.id.section1);
                section.setBackgroundColor(Color.rgb(100,116,171));
                break ;
            case R.id.section2 :
                section = (TextView) findViewById(R.id.section2);
                section.setBackgroundColor(Color.rgb(100,116,171));
                break ;
            case R.id.section3 :
                section = (TextView) findViewById(R.id.section3);
                section.setBackgroundColor(Color.rgb(100,116,171));
                break ;
            case R.id.section4 :
                section = (TextView) findViewById(R.id.section4);
                section.setBackgroundColor(Color.rgb(100,116,171));
                break ;
            case R.id.section5 :
                section = (TextView) findViewById(R.id.section5);
                section.setBackgroundColor(Color.rgb(100,116,171));
                break ;
            case R.id.section6 :
                section = (TextView) findViewById(R.id.section6);
                section.setBackgroundColor(Color.rgb(100,116,171));
                break ;
            case R.id.section7 :
                section = (TextView) findViewById(R.id.section7);
                section.setBackgroundColor(Color.rgb(100,116,171));
                break ;
            case R.id.section8 :
                section = (TextView) findViewById(R.id.section8);
                section.setBackgroundColor(Color.rgb(100,116,171));
                break ;
        }


    }

    public void Insert_Start(View v) {
        section.setText(tvRssi.getText());
    }

    public void Reset_Start(View v) {
        section = (TextView) findViewById(R.id.section1);
        section.setBackgroundColor(Color.rgb(255, 255, 255));
        section.setText("Unchecked");
        section = (TextView) findViewById(R.id.section2);
        section.setBackgroundColor(Color.rgb(255, 255, 255));
        section.setText("Unchecked");
        section = (TextView) findViewById(R.id.section3);
        section.setBackgroundColor(Color.rgb(255, 255, 255));
        section.setText("Unchecked");
        section = (TextView) findViewById(R.id.section4);
        section.setBackgroundColor(Color.rgb(255, 255, 255));
        section.setText("Unchecked");
        section = (TextView) findViewById(R.id.section5);
        section.setBackgroundColor(Color.rgb(255, 255, 255));
        section.setText("Unchecked");
        section = (TextView) findViewById(R.id.section6);
        section.setBackgroundColor(Color.rgb(255, 255, 255));
        section.setText("Unchecked");
        section = (TextView) findViewById(R.id.section7);
        section.setBackgroundColor(Color.rgb(255, 255, 255));
        section.setText("Unchecked");
        section = (TextView) findViewById(R.id.section8);
        section.setBackgroundColor(Color.rgb(255, 255, 255));
        section.setText("Unchecked");
    }

    public void Test_Start(View v) {

    }



    // wifi RSSI Receiver

    private BroadcastReceiver rssiReceiver = new BroadcastReceiver() {

        @Override

        public void onReceive(Context context, Intent intent) {



            Log.e(LOG_TAG, "Time rssiReceiver");



            WifiManager wman = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);

            WifiInfo info = wman.getConnectionInfo();



            int _rssi = info.getRssi();



            tvRssi.setText(_rssi + "");



            Log.e(LOG_TAG, "_rssi ==> " + _rssi);



        }

    };

}


