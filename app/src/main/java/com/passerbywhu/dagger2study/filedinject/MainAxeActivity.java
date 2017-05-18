package com.passerbywhu.dagger2study.filedinject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.passerbywhu.dagger2study.R;
import com.passerbywhu.dagger2study.filedinject.DaggerManComponent;
import com.passerbywhu.dagger2study.filedinject.Man;
import com.passerbywhu.dagger2study.filedinject.ManComponent;

/**
 * Created by passe on 2016/6/7.
 */
public class MainAxeActivity extends AppCompatActivity {
    private TextView mTextView;
    private Man man;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.content);
//        ManComponent component1 = DaggerManComponent.create();
        ManComponent component2 = DaggerManComponent.create();
//        Man man1 = component1.aManWithAxe();
        Man man2 = component2.aManWithAxe();
//        man = DaggerManComponent.create().aManWithAxe();
        man = component2.aManWithAxe();
        String chop = man.chop();
//        mTextView.setText(chop + " " + (component1 == component2) + " " + (man1 == man2) + " " + (man1.axe == man2.axe));
        mTextView.setText(chop + " " + (man == man2) + " " + (man.axe == man2.axe));
    }
}
