package me.tangke.slidemenusample.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import me.tangke.slidemenusample.R;

/**
 * Created by niantuo on 2018/2/28.
 * 添加默认的背景
 */

public class BgViewSlideMenuActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg_view_layout);
    }
}
