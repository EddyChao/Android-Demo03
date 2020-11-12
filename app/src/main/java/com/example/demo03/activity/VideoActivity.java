package com.example.demo03.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.fragment.app.FragmentActivity;

import com.example.tabhostdemo.R;

public class VideoActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        View btn1 = (Button) findViewById(R.id.button01);
        View btn2 = (Button) findViewById(R.id.button02);
        btn1.setOnClickListener(new choose("/1.mp4"));
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoActivity.this.finish();
            }
        });
    }

    class choose implements android.view.View.OnClickListener{

        private String  name;
        public choose(String name) {
            this.name = name;

        }

        @Override
        public void onClick(View v) {

            VideoView videoView = (VideoView) findViewById(R.id.videoView);

            //加载指定的视频文件
            String path = Environment.getExternalStorageDirectory().getPath()+ name;
            videoView.setVideoPath(path);

            //创建MediaController对象
//			MediaController mediaController = new MediaController(activity);

            //VideoView与MediaController建立关联
//			videoView.setMediaController(mediaController);

            //让VideoView获取焦点
            videoView.requestFocus();

            videoView.start();

        }
    }

}
