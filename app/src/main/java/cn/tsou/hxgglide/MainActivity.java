package cn.tsou.hxgglide;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.tsou.hxgglide.databinding.ActivityMainBinding;
import cn.tsou.lib_glide.ImageUtil;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setContext("https://unsplash.it/200/200?random&10");
        binding.setFileName(R.mipmap.ic_launcher);
    }
}
