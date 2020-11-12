package com.example.demo03.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.demo03.activity.VideoActivity;
import com.example.demo03.activity.WebVideoActivity;
import com.example.tabhostdemo.R;

public class VideoFragment extends Fragment {

	View inflate = null;
	Activity activity;

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		inflate = inflater.inflate(R.layout.videobutton, null);
		activity = super.getActivity();
//		View btn1 = (Button) inflate.findViewById(R.id.videoButton01);
		View btn2 = (Button) inflate.findViewById(R.id.videoButton02);;
//		btn1.setOnClickListener(new choose(super.getActivity()));
		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(activity, WebVideoActivity.class);
				activity.startActivity(intent);
			}
		});


		return inflate;
	}

	@Override
	public void setArguments(Bundle args) {
		// TODO Auto-generated method stub
		super.setArguments(args);
	}


	class choose implements android.view.View.OnClickListener{

		private Activity activity;
		public choose(Activity activity) {
			this.activity = activity;
		}

		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(activity, VideoActivity.class);
			activity.startActivity(intent);
		}
	}

}
