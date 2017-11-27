package com.example.dell.jingdongproject.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dell.jingdongproject.R;
import com.example.dell.jingdongproject.ydyBanner.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class YDYActivity extends AppCompatActivity  {

    private Banner mBanner;
    private List<String> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511773293015&di=de54ce4cb6eb95fe354de0015e8685f7&imgtype=0&src=http%3A%2F%2Fwww.jq960.com%2Fuploads%2Fallimg%2F170422%2F1P2094Q0-0.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511773357256&di=08bb4616b223c9b39307c7e20a7a76db&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01409e58a16fdea801219c77e765eb.jpg%401280w_1l_2o_100sh.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511773416572&di=f93b1c6838355eb4e2aac0cca4bca4e8&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01075c58a16fdda8012060c8ba43b6.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511773449862&di=8a4e77775fb1fc82c13dc9fa0cb67f40&imgtype=0&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fexp%2Fw%3D480%2Fsign%3Ddaf42cf53f87e9504217f2642039531b%2F9a504fc2d56285358929f11795ef76c6a7ef633e.jpg");
        //设置轮播间隔时间
       /* mBanner.setDelayTime(3000);
        //设置是否为自动轮播，默认是“是”。
        mBanner.isAutoPlay(true);*/

        mBanner.setImages(list).isAutoPlay(true).setDelayTime(3000).setImageLoader(new GlideImageLoader()).setBannerAnimation(Transformer.DepthPage).start();
        tiaoZhuan();
    }
     //查找组件
    private void initView() {
        mBanner = (Banner) findViewById(R.id.banner);
    }
    //当跳转到登陆页面
    private void tiaoZhuan(){
       //定时器9秒后t
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                // 需要做的事:发送消息
                startActivity(new Intent(YDYActivity.this,LoginActivity.class));
            }
        };
        timer.schedule(task,9000);

    }

}
