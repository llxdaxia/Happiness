package com.jude.happiness.module.launch;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.happiness.app.BaseActivity;
import com.jude.happiness.module.main.MainActivity;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
@RequiresPresenter(LaunchPresenter.class)
public class LaunchActivity extends BaseActivity<LaunchPresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(() -> startActivity(new Intent(LaunchActivity.this, MainActivity.class)), 800);
    }
}
