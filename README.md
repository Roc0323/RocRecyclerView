# RocRecyclerView
对RecyclerView控件的简单优化，可以随意添加（取消）一个或多个头部和尾部</br>

### 演示</br>
 ![image](https://github.com/Roc0323/RocRecyclerView/blob/master/screenshot/luping.gif?raw=true)

### 注意</br>

    allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
    dependencies {
        compile 'com.github.Roc0323:RocRecyclerView:1.0.1'
    }

### 简单用法</br>
    <cn.roc.rocrecyclerviewlib.PullToLoad.PullToLoadRecyclerView
            android:id="@+id/recyclerview_add"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="#eee"/>


    PullToLoadRecyclerView.addHeaderView(HeaderView);//add header
    PullToLoadRecyclerView.removeHeaderView(HeaderView);//remove header

    PullToLoadRecyclerView.addFooterView(FooterView);//add footer
    PullToLoadRecyclerView.removeFooterView(FooterView);//remove footer

