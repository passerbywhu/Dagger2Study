package com.passerbywhu.dagger2study.componentdependency;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.passerbywhu.dagger2study.R;

/**
 * Created by passe on 2017/5/17.
 */

public class SubComponentActivity extends AppCompatActivity {
    TextView mTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.component_dependency_activity);
        mTextView = (TextView) findViewById(R.id.content);
        SubComponent.SComponentA componentA = DaggerSubComponent_SComponentA.create();
        SubComponent.SComponentB componentB = componentA.componentB();
        SomeClassB1 b1 = componentB.someClassB1();
        mTextView.setText(b1 + "");
    }
}
