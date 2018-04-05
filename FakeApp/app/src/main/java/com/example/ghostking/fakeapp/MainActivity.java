package com.example.ghostking.fakeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button_bottom)
    Button buttonBottom;
    @BindView(R.id.coin_a)
    ImageView coinA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_bottom)
    public void onViewClicked() {

        coinA.setImageResource(R.drawable.coina);
    }
}
