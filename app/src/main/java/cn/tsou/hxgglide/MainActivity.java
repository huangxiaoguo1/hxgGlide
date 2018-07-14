package cn.tsou.hxgglide;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.tsou.hxgglide.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setContext("http://pic24.nipic.com/20120928/6062547_081656427000_2.jpg");
        binding.setFileName("http://pic24.nipic.com/20120928/6062547_081656427000_2.jpg");
    }
}
