package com.passerbywhu.dagger2study.injecactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.passerbywhu.dagger2study.R;

import javax.inject.Inject;

/**
 * Created by passe on 2017/5/17.
 */

public class InjectActivity extends AppCompatActivity{
    @Inject InjectBean bean;
    private TextView mTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inject_activity);
        mTextView = (TextView) findViewById(R.id.content);
        DaggerInjectActivityComponent.builder().injectActivityModule(new InjectActivityModule(new InjectBean("jack"))).build().inject(this);
        mTextView.setText(bean.name + "");
    }
}
