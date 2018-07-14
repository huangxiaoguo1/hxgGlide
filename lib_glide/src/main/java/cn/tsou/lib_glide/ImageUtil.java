package cn.tsou.lib_glide;

import android.databinding.BindingAdapter;
import android.net.Uri;
import android.widget.ImageView;
import java.io.File;

/**
 * Created by Administrator on 2018/6/4 0004.
 * <p>
 * 可直接在ImageView上进行使用
 * bind:loadCircleImage="@{loadMore.imaggUrl}"
 */

public class ImageUtil {
    @BindingAdapter({"loadImage"})
    public static void loadImage(ImageView view, String url) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(url)
                .myGlideConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadImageUri"})
    public static void loadImage(ImageView view, Uri uri) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(uri)
                .myGlideConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadImageFile"})
    public static void loadImage(ImageView view, File file) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(file)
                .myGlideConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    //********************************************************************************
    @BindingAdapter({"loadCircleImage"})
    public static void loadCircleImage(ImageView view, String url) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(url)
                .myGlideCircleConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadCircleImageUri"})
    public static void loadCircleImage(ImageView view, Uri uri) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(uri)
                .myGlideCircleConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadCircleImageFile"})
    public static void loadCircleImage(ImageView view, File file) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(file)
                .myGlideCircleConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }
}
