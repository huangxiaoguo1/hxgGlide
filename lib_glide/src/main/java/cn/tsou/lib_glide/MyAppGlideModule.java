package cn.tsou.lib_glide;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.engine.cache.ExternalPreferredCacheDiskCacheFactory;
import com.bumptech.glide.module.AppGlideModule;

/**
 * Created by Administrator on 2017/12/22 0022.
 * 在Glide3中需要在AndroidManifest.xml中配置
 * <p>
 * Glide4，只要有@GlideModule注解就好
 */
@GlideModule
public class MyAppGlideModule extends AppGlideModule {

    public static final int DISK_CACHE_SIZE = 500 * 1024 * 1024;
    public static final String DISK_CACHE_NAME = "xiaoguo";

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        super.applyOptions(context, builder);
        builder.setDiskCache(new ExternalPreferredCacheDiskCacheFactory(context, DISK_CACHE_NAME, DISK_CACHE_SIZE));
    }

    @Override
    public void registerComponents(Context context, Glide glide, Registry registry) {
        super.registerComponents(context, glide, registry);
    }
}