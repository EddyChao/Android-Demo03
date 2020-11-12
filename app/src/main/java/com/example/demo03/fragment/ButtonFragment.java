package com.example.demo03.fragment;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.demo03.activity.ImageActivity;
import com.example.demo03.activity.TitleActivity;
import com.example.demo03.activity.WebActivity;
import com.example.tabhostdemo.R;

public class ButtonFragment extends Fragment {

	Button btn1 = null;
	ImageView imageView = null;
	Activity activity = null;
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View inflate = inflater.inflate(R.layout.button, null);

		activity = super.getActivity();
		btn1 = (Button) inflate.findViewById(R.id.MyButton01);
		Button btn2 = (Button) inflate.findViewById(R.id.MyButton02);
		Button btn3 = (Button) inflate.findViewById(R.id.MyButton03);
		imageView = (ImageView) inflate.findViewById(R.id.photo) ;
		btn1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(activity, ImageActivity.class);//从当前activity跳转到另一个activity
				startActivity(intent);
			}
		});
		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(activity, WebActivity.class);//从当前activity跳转到另一个activity
				startActivity(intent);
			}
		});

		btn3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(activity, TitleActivity.class);//从当前activity跳转到另一个activity
				startActivity(intent);
			}
		});

		return inflate;
	}

	@Override
	public void setArguments(Bundle args) {
		// TODO Auto-generated method stub
		super.setArguments(args);
	}

}
