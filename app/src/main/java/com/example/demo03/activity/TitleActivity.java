package com.example.demo03.activity;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.fragment.app.FragmentActivity;

import com.example.demo03.bean.News;
import com.example.demo03.bean.NewsAdapter;
import com.example.demo03.bean.NewsToItem;
import com.example.tabhostdemo.R;

import java.util.ArrayList;

public class TitleActivity extends Activity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.titlebutton);
        ListView listView = (ListView) findViewById(R.id.mylist);
        button = (Button) findViewById(R.id.button02);
        ArrayList<News> newses = new ArrayList<>();
        newses.add(new News(0, News.TEXT, "title1", "This is News 1", 0));
        newses.add(new News(1, News.TEXT, "title2", "This is News 2.", 0));
        newses.add(new News(2, News.IMAGE, "title3", "", android.R.drawable.ic_menu_camera));
        newses.add(new News(3, News.IMAGE, "title4", "", android.R.drawable.ic_menu_call));
        newses.add(new News(4, News.TEXT, "title5", "This is News 5.", 0));
        newses.add(new News(5, News.IMAGE, "title6", "", android.R.drawable.ic_menu_gallery));
        newses.add(new News(6, News.TEXT, "title7", "This is News 6.", 0));
        newses.add(new News(7, News.TEXT, "title8", "This is News 7.", 0));
        newses.add(new News(8, News.IMAGE, "title9", "", android.R.drawable.ic_menu_compass));
        NewsAdapter adapter = new NewsAdapter(this);
        adapter.addAll(NewsToItem.newsToItems(newses));
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TitleActivity.this.finish();
            }
        });
    }

}
