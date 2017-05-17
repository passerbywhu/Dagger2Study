package com.passerbywhu.dagger2study.coffee;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.passerbywhu.dagger2study.R;

/**
 * Created by wuwenchao3 on 2015/6/18.
 */
public class CoffeeAppActivity extends Activity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffee_activity);
        CoffeeApp.Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
        mTextView = (TextView) findViewById(R.id.infoArea);
        mTextView.setText(coffee.maker().brew());
    }
}
