package com.example.demo03.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.fragment.app.FragmentActivity;

import com.example.tabhostdemo.R;


public class WebVideoActivity extends FragmentActivity implements View.OnClickListener {

    private Button btn01, btn02;
    VideoView videoView = null;
    Uri uri = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webbutton);
        iniview();
    }

    private void iniview() {
        btn02 = (Button) findViewById(R.id.webbutton02);
        videoView = (VideoView) findViewById(R.id.videoView);
        uri = Uri.parse("https://v-cdn.zjol.com.cn/280443.mp4");
        videoView = (VideoView)this.findViewById(R.id.videoView );
        videoView.setVideoURI(uri);
        //开始播放视频
        videoView.start();

//        btn01.setOnClickListener(this);

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebVideoActivity.this.finish();
            }
        });
    }


    @Override
    public void onClick(View v) {
        uri = Uri.parse("https://v-cdn.zjol.com.cn/280443.mp4");
        videoView = (VideoView)this.findViewById(R.id.videoView );
        videoView.setVideoURI(uri);
        //开始播放视频
        videoView.start();


    }
}