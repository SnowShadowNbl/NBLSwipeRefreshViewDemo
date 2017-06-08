## NBLSwipeRefreshView
支持下拉刷新和上拉加载更多，支持自定义FooterView，支持ListView嵌套滚动。

-------------------
## 依赖
  ``` javaScript
   compile 'com.nbl.library:nblswiperefreshview:1.0.1'
  ```
## 效果图
![gif](a.gif)
## 使用方法
因为继承SwipeRefreshLayout，所以SwipeRefreshView也只能有一个子控件
``` xml
      <com.nbl.nblswiperefreshview.SwipeRefreshView
          android:id="@+id/swipe_container"
          android:layout_width="match_parent"
          android:layout_height="match_parent"
          >

          <ListView
              android:id="@+id/lv"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
          />

      </com.nbl.nblswiperefreshview.SwipeRefreshView>
 ```
常用方法
 ``` java
 isRefreshing();
 isLoading;
 setColorSchemeResources(int... colorResIds);
 setProgressBackgroundColorSchemeResource(int colorRes);
 setRefreshing(boolean refreshing);
 setLoading(boolean loading);
 ```
## 事件监听
实现SwipeRefreshView.OnRefreshListener, SwipeRefreshView.OnLoadListener接口
 ``` java
    @Override
    public void onRefresh() {

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                swipeContainer.setRefreshing(false);
            }
        }, 2000);

    }

    @Override
    public void onLoad() {

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                swipeContainer.setLoading(false);
            }
        }, 2000);

    }
 ```


## License

 ``` xml

 The MIT License (MIT)

 Copyright (c) 2017 Nbl

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.

 ```