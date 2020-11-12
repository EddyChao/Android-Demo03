package com.example.demo03.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.demo03.activity.LoginActivity;
import com.example.tabhostdemo.R;

public class LoginFragment extends Fragment {


    EditText account = null;
    EditText code = null;
    Button ibtn = null;
    Button btn = null;
    TextView information = null;
    TextView mcont = null;
    Context cont = null;

    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View inflate = inflater.inflate(R.layout.login, null);
        account = (EditText) inflate.findViewById(R.id.editText1);
        code = (EditText) inflate.findViewById(R.id.editText2);
        btn = (Button) inflate.findViewById(R.id.button1);
        ibtn = (Button) inflate.findViewById(R.id.button2);
        information = (TextView) inflate.findViewById(R.id.textView1);
		cont = super.getActivity();
		mcont = new TextView(cont);

        btn.setOnClickListener(new wang(super.getActivity()));


        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                information.setText("您好，请输入用户名和密码");
                account.setVisibility(0);
                code.setVisibility(0);
                account.setHint("username");
                code.setHint("password");
                account.setText("");
                code.setText("");
            }
        });
        return inflate;
    }

    @Override
    public void setArguments(Bundle args) {
        // TODO Auto-generated method stub
        super.setArguments(args);
    }


    class wang implements android.view.View.OnClickListener {  //构造一个内部类，并用Intent对象进行跳转


        private Activity activity;

        public wang(Activity activity) {
            this.activity = activity;
        }

        public void onClick(View v) {
            Intent intent = new Intent();
            String username = account.getText().toString();
            String pwd = code.getText().toString();
            if (!(username.isEmpty() && pwd.isEmpty())) {
//            if (!username.equals("aaa") && pwd.equals("111")) {
                account.setVisibility(View.GONE);
                code.setVisibility(View.GONE);
                intent.setClass(activity, LoginActivity.class);//从当前activity跳转到另一个activity
                activity.startActivity(intent);
            } else {
                account.setVisibility(View.GONE);
                code.setVisibility(View.GONE);
                information.setText("用户名密码错误");
            }
        }

    }

}
