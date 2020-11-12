package com.example.demo03.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tabhostdemo.R;

public class ExtraFragment02 extends Fragment {


	Button btn1;
	Button btn2;
	Button btn3;

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View inflate = inflater.inflate(R.layout.extrabutton02, null);
		btn1 = inflate.findViewById(R.id.exButton01);
		btn2 = inflate.findViewById(R.id.exButton02);
		btn3 = inflate.findViewById(R.id.exButton03);
		return inflate;
	}

	@Override
	public void setArguments(Bundle args) {
		// TODO Auto-generated method stub
		super.setArguments(args);
	}

}
