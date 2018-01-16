package com.youzhu.as.imagedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.youzhu.as.imagedemo.adapter.CategoryAdapter;

import java.util.HashMap;
import java.util.Map;

public class MainActivity
        extends AppCompatActivity
        implements AdapterView.OnItemClickListener
{

    private ListView mListview;
    private CategoryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initListener();
    }

    private void initListener() {
//        mListview.setOnItemClickListener(this);

    }


    private void initData() {
        System.out.println("进入initdata==============================");
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://apis.baidu.com/tngou/gallery/classify";
       // String url = "http://www.baidu.com";
        final StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("请求成功======================================="+response.length());
                Log.d("request","请求成功======================================="+response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
               // error.printStackTrace();
                Log.d("request","请求失败==========================================");
                System.out.println("请求失败==========================================");
            }
        }){
            @Override
            public Map<String, String> getHeaders()
                    throws AuthFailureError
            {
                Map<String, String> map = new HashMap<>();
                map.put("apikey","ba177aec7ee6b1142708af6f6b68e023");
                return map;
            }
        };
        queue.add(request);
        System.out.println("执行完毕========================================================================");

       // mAdapter = new CategoryAdapter(null, this);
//        mListview.setAdapter(mAdapter);
    }


    private void initView() {
        ListView mListview = (ListView) findViewById(R.id.listview);
       // Picasso.with().load().into();

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}