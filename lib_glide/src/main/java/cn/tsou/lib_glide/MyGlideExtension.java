package cn.tsou.lib_glide;

import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideOption;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

@GlideExtension
public class MyGlideExtension {
    /**
     * 将这个类的构造函数声明成private，这是必须要求的写法
     */
    private MyGlideExtension() {
    }
    @SuppressWarnings("ResourceType")
    @GlideOption
    public static void myGlideConfiguration(RequestOptions options) {
        options.placeholder(R.drawable.app_loading_pic)
                .error(R.drawable.app_loading_pic)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC);
    }

    @SuppressWarnings("ResourceType")
    @GlideOption
    public static void myGlideCircleConfiguration(RequestOptions options) {
        options.placeholder(R.drawable.app_loading_pic_round)
                .error(R.drawable.app_loading_pic_round)
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .centerCrop()
                .circleCrop();
    }
}