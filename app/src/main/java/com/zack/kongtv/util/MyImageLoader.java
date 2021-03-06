package com.zack.kongtv.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zack.kongtv.Const;
import com.zack.kongtv.R;

import jp.wasabeef.glide.transformations.BlurTransformation;

public class MyImageLoader {
    public static void showImage(Context context,String url, ImageView imageView){
        Glide.with(context).load(url).asBitmap().placeholder(R.drawable.placeholder).into(imageView);
    }

    public static void showFlurImg(Context context,String url,ImageView imageView){
        Glide.with(context).load(url).placeholder(R.drawable.placeholder).bitmapTransform(new BlurTransformation(context, 20)).into(imageView);
    }
}
