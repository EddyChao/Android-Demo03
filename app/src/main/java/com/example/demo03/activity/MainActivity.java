package com.example.demo03.activity;
import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTabHost;

import com.example.demo03.TabDb;
import com.example.tabhostdemo.R;


public class MainActivity extends FragmentActivity implements OnTabChangeListener{


	private FragmentTabHost tabHost;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tabHost=(FragmentTabHost)super.findViewById(android.R.id.tabhost);
		tabHost.setup(this,super.getSupportFragmentManager(),R.id.contentLayout);
		tabHost.getTabWidget().setDividerDrawable(null);
		tabHost.setOnTabChangedListener(this);
		initTab();
	}



	
	private void initTab(){
		String tabs[]= TabDb.getTabsTxt();
		for(int i=0;i<tabs.length;i++){
			TabSpec tabSpec=tabHost.newTabSpec(tabs[i]).setIndicator(getTabView(i));
			tabHost.addTab(tabSpec,TabDb.getFragments()[i],null);
			tabHost.setTag(i);
		}
	}
	
	private View getTabView(int idx){
		View view=LayoutInflater.from(this).inflate(R.layout.footer_tabs,null);
		((TextView)view.findViewById(R.id.tvTab)).setText(TabDb.getTabsTxt()[idx]);
		if(idx==0){
			
			((TextView)view.findViewById(R.id.tvTab)).setTextColor(Color.RED);
			((ImageView)view.findViewById(R.id.ivImg)).setImageResource(TabDb.getTabsImgLight()[idx]);
		}else{
			((ImageView)view.findViewById(R.id.ivImg)).setImageResource(TabDb.getTabsImg()[idx]);
		}
		return view;
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onTabChanged(String tabId) {
		// TODO Auto-generated method stub
		updateTab();

	}
	private void updateTab(){
		TabWidget tabw=tabHost.getTabWidget();
		for(int i=0;i<tabw.getChildCount();i++){
			View view=tabw.getChildAt(i);
			ImageView iv=(ImageView)view.findViewById(R.id.ivImg);
			if(i==tabHost.getCurrentTab()){
				((TextView)view.findViewById(R.id.tvTab)).setTextColor(Color.RED);
				iv.setImageResource(TabDb.getTabsImgLight()[i]);
			}else{
				((TextView)view.findViewById(R.id.tvTab)).setTextColor(getResources().getColor(R.color.foot_txt_gray));
				iv.setImageResource(TabDb.getTabsImg()[i]);
			}
			
		}
	}
}
