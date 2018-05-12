package com.example.phoenix.pressuresensing.feature;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main3Activity extends AppCompatActivity {

    private VideoView videov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        videov = (VideoView) findViewById(R.id.videoView2);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) videov.getLayoutParams();
        params.width = metrics.widthPixels;
        params.height = metrics.heightPixels;
        params.leftMargin = 0;
        videov.setLayoutParams(params);
        String videopath = "android.resource://"+getPackageName()+"/"+R.raw.video2;
        Uri uri = Uri.parse(videopath);
        MediaController mc = new MediaController(this);
        videov.setVideoURI(uri);
        videov.setMediaController(mc);
        videov.start();
    }
}
