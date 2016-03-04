package com.xiaosai.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/3/4 0004.
 */
public class NewsAdapter extends ArrayAdapter<News> {

	private int resourceId;
	private ImageView img_id;
	private TextView tv_title;
	private TextView tv_content;
	public NewsAdapter(Context context, int textViewResourceId, List<News> objects) {
		super(context,  textViewResourceId, objects);
		resourceId = textViewResourceId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		News news = getItem(position);
		View view;
		ViewHolder viewHolder;
		if(convertView == null){
			view = LayoutInflater.from(getContext()).inflate(resourceId,null);
			viewHolder = new ViewHolder();
			viewHolder.img_id = (ImageView) view.findViewById(R.id.img_view);
			viewHolder.tv_title = (TextView) view.findViewById(R.id.tv_title);
			viewHolder.tv_content = (TextView) view.findViewById(R.id.tv_content);
			view.setTag(viewHolder);
		}else{
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}
		viewHolder.img_id.setImageResource(news.getImg_id());
		viewHolder.tv_title.setText(news.getTitle());
		viewHolder.tv_content.setText(news.getContent());
		return view;
	}
	//ViewHolder  ,用于对控件的实例进行缓存
	class ViewHolder{
		ImageView img_id;
		TextView tv_title;
		TextView tv_content;
	}
}
