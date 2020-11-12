package com.example.demo03.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;

import com.example.tabhostdemo.R;

public class LoginActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginbutton);

        Button myButton = (Button)findViewById(R.id.LoginButton); //该activity中的操作和上面activity一样，不再赘述
        myButton.setText("点击返回");
        myButton.setOnClickListener(new lios());
    }

    class lios implements OnClickListener{

        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(LoginActivity.this, MainActivity.class);//从当前activity跳转到另一个activity
            LoginActivity.this.startActivity(intent);

        }
    }
}