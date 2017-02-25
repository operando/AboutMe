package com.os.operando.aboutme;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.os.operando.aboutme.databinding.ActivityAboutMeBinding;
import com.tapadoo.alerter.Alerter;

public class AboutMeActivity extends AppCompatActivity {

    private ActivityAboutMeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about_me);

        binding.push.setOnClickListener(v -> {
            Alerter.create(this)
                    .setTitle(R.string.AboutMeActivity_push)
                    .setText(R.string.AboutMeActivity_push)
                    .show();
        });
    }
}