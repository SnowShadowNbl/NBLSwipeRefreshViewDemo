package com.nbl.nblswiperefreshviewdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.nbl.nblswiperefreshview.SwipeRefreshView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 *author: Nbl(SnowShadow)
 *email: vsnowshadow@gmail.com
 *created
 */
public class MainActivity extends AppCompatActivity implements SwipeRefreshView.OnRefreshListener, SwipeRefreshView.OnLoadListener {

    @Bind(R.id.lv)
    ListView mListView;
    @Bind(R.id.swipe_container)
    SwipeRefreshView swipeContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();

    }

    /**
     * 初始化数据
     */
    private List<String> getData() {

        List<String> data = new ArrayList<>();

        for(int i = 0; i < 20; i++){

            data.add("NblSwipeRefreshView-" + i);

        }

        return data;

    }

    /**
     * 初始化控件
     */
    private void initView() {

        mListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, getData()));

        swipeContainer.setOnRefreshListener(this);
        swipeContainer.setOnLoadListener(this);

        //set颜色
        swipeContainer.setColorSchemeColors(Color.GRAY);

    }


    /**
     * 下拉刷新方法
     */
    @Override
    public void onRefresh() {

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Toast.makeText(MainActivity.this, "刷新成功", Toast.LENGTH_SHORT).show();
                swipeContainer.setRefreshing(false);
            }
        }, 2000);

    }

    /**
     * 上拉加载方法
     */
    @Override
    public void onLoad() {

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Toast.makeText(MainActivity.this, "加载成功", Toast.LENGTH_SHORT).show();
                swipeContainer.setLoading(false);
            }
        }, 2000);

    }

}
