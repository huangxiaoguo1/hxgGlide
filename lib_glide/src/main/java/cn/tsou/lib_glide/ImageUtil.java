package cn.tsou.lib_glide;

import android.databinding.BindingAdapter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.io.File;
import java.net.URL;

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

    @BindingAdapter({"loadImageBitmap"})
    public static void loadImage(ImageView view, Bitmap bitmap) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(bitmap)
                .myGlideConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadImageDrawable"})
    public static void loadImage(ImageView view, Drawable drawable) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(drawable)
                .myGlideConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadImageInteger"})
    public static void loadImage(ImageView view, Integer resId) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(resId)
                .myGlideConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadImageURL"})
    public static void loadImage(ImageView view, URL url) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(url)
                .myGlideConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadImageByte"})
    public static void loadImage(ImageView view, byte[] bytes) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(bytes)
                .myGlideConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadImageObject"})
    public static void loadImage(ImageView view, Object o) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(o)
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

    @BindingAdapter({"loadCircleImageBitmap"})
    public static void loadCircleImage(ImageView view, Bitmap bitmap) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(bitmap)
                .myGlideCircleConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadCircleImageDrawable"})
    public static void loadCircleImage(ImageView view, Drawable drawable) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(drawable)
                .myGlideCircleConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadCircleImageInteger"})
    public static void loadCircleImage(ImageView view, Integer resId) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(resId)
                .myGlideCircleConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadCircleImageURL"})
    public static void loadCircleImage(ImageView view, URL url) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(url)
                .myGlideCircleConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadCircleImageByte"})
    public static void loadCircleImage(ImageView view, byte[] bytes) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(bytes)
                .myGlideCircleConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadCircleImageObject"})
    public static void loadCircleImage(ImageView view, Object o) {
        GlideApp.with(view.getContext().getApplicationContext())
                .load(o)
                .myGlideCircleConfiguration()
                .thumbnail(0.2f)
                .into(view);
    }

    @BindingAdapter({"loadCircleAngleImage"})
    public static void loadCircleAngleImage(ImageView view, Object o) {
        RoundedCorners roundedCorners = new RoundedCorners(10);
        RequestOptions options = RequestOptions.bitmapTransform(roundedCorners);
        options.placeholder(R.drawable.app_loading_pic)
                .error(R.drawable.app_loading_pic)
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC);
        GlideApp.with(view.getContext().getApplicationContext())
                .load(o)
                .apply(options)
                .thumbnail(0.2f)
                .into(view);
    }
}
