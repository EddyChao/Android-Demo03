package com.example.demo03;


import com.example.demo03.fragment.ButtonFragment;
import com.example.demo03.fragment.ExtraFragment02;
import com.example.demo03.fragment.LoginFragment;
import com.example.demo03.fragment.ExtraFragment01;
import com.example.demo03.fragment.VideoFragment;
import com.example.tabhostdemo.R;

public class TabDb {
	public static String[] getTabsTxt(){
		String[] tabs={"登录","Web","视频","扩展1","扩展2"};
		return tabs;
	}
	public static int[] getTabsImg(){
		int[] ids={R.drawable.foot_news_normal,R.drawable.foot_read_normal,R.drawable.foot_vdio_normal,R.drawable.foot_fond_normal,R.drawable.foot_out_normal};
		return ids;
	}
	public static int[] getTabsImgLight(){
		int[] ids={R.drawable.foot_news_light,R.drawable.foot_read_light,R.drawable.foot_vdio_light,R.drawable.foot_found_light,R.drawable.foot_out_light};
		return ids;
	}
	public static Class[] getFragments(){
		Class[] clz={LoginFragment.class, ButtonFragment.class, VideoFragment.class, ExtraFragment02.class, ExtraFragment01.class};
		return clz;
	}
}
