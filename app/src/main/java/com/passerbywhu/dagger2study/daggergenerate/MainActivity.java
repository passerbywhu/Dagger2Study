package com.passerbywhu.dagger2study.daggergenerate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.passerbywhu.dagger2study.R;

public class MainActivity extends AppCompatActivity {
//    @Inject
    TestData mData;
    private TextView mContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContent = (TextView) findViewById(R.id.content);
        DaggerApplicationComponent.builder().testModule(new TestModule()).build().inject(this);
        mContent.setText(mData.owner);
    }
}
