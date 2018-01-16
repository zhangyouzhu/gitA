package com.youzhu.as.imagedemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/*
 *  @项目名：  ImageDemo 
 *  @包名：    com.youzhu.as.imagedemo.adapter
 *  @文件名:   CategoryAdapter
 *  @创建者:   zhangyouzhu
 *  @创建时间:  2018/1/12 20:09
 *  @描述：    TODO
 */
public class CategoryAdapter extends BaseAdapter{
    private static final String TAG = "CategoryAdapter";
    List<String> mList;
    Context mContext ;

    public CategoryAdapter(List<String> list, Context context) {
        mList = list;
        mContext = context;
    }

    public int getCount() {
    return  mList.size();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
    if(view == null){
        view = View.inflate(mContext,android.R.layout.simple_list_item_1 ,null);
    }
        TextView textview = (TextView) view;
        textview.setText(mList.get(i));



    return  textview;
    }






    @Override
    public Object getItem(int i) {
    return  null;
    }

    @Override
    public long getItemId(int i) {
    return 0;
    }


}
