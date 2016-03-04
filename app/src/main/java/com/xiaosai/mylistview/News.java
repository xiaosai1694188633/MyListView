package com.xiaosai.mylistview;

/**
 * Created by Administrator on 2016/3/4 0004.
 * 创建一个实体类————News（新闻）
 */
public class News {
	private int img_id;
	private String title;
	private String content;
	//构造方法
	public News(int img_id,String title,String content){
		this.img_id = img_id;
		this.title = title;
		this.content = content;
	}

	public int getImg_id() {
		return img_id;
	}

	public String getContent() {
		return content;
	}

	public String getTitle() {
		return title;
	}
}
