package com.example.demo03.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import com.example.tabhostdemo.R;

public class ImageActivity extends FragmentActivity {

    Button btn = null;
    ImageView imageView = null;
    TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagebutton);

        btn = (Button)findViewById(R.id.imageButton); //该activity中的操作和上面activity一样，不再赘述
        imageView = (ImageView) findViewById(R.id.photo);
        textView = (TextView) findViewById(R.id.imgaetext);
        imageView.setImageResource(R.drawable.timg);
        textView.setText("猫咪");
        btn.setText("点击返回");
        btn.setOnClickListener(new lios());
    }

    class lios implements View.OnClickListener {

        public void onClick(View v){
            ImageActivity.this.finish();
        }
    }
}
