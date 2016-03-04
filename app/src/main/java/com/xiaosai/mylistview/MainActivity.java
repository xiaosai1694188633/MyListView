package com.xiaosai.mylistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/4 0004.
 */
public class MainActivity extends Activity {
	private ListView listView;
	private List<News> list = new ArrayList<News>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
		listView = (ListView) findViewById(R.id.list_item);
		NewsAdapter adapter = new NewsAdapter(MainActivity.this,R.layout.news_list_item,list);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				News n = list.get(position);
				Toast.makeText(MainActivity.this, n.getTitle(), Toast.LENGTH_SHORT).show();
			}
		});
	}

	private void init(){
		for(int i = 0;i<100;i++ ){
			News news = new News(R.mipmap.ic_launcher,"This is "+i+"Title","This is "+i+"Content");
			list.add(news);
		}
	}
}
