package cn.roc.rocrecyclerview;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Roc on 2017/7/23 0023.
 */

public class ImgDataUtil {
    public static ArrayList<String> getImgDatas() {
        ArrayList<String> imgDatas = new ArrayList<>();
        imgDatas.add("http://img.ivsky.com/img/tupian/pre/201706/13/jiaoshi-003.jpg");
        imgDatas.add("http://img.ivsky.com/img/tupian/pre/201706/13/jiaoshi-008.jpg");
        imgDatas.add("http://img.ivsky.com/img/tupian/pre/201706/13/jiaoshi-009.jpg");
        imgDatas.add("http://img.ivsky.com/img/tupian/pre/201706/13/jiaoshi-014.jpg");
        imgDatas.add("http://img.ivsky.com/img/tupian/pre/201706/30/gancaoduo-008.jpg");
        imgDatas.add("http://img.ivsky.com/img/tupian/pre/201706/13/jiaoshi-002.jpg");
        imgDatas.add("http://img.ivsky.com/img/tupian/pre/201706/13/jiaoshi-004.jpg");
        imgDatas.add("http://img.ivsky.com/img/tupian/pre/201706/13/jiaoshi-005.jpg");
        imgDatas.add("http://img.ivsky.com/img/tupian/pre/201706/13/jiaoshi-006.jpg");
        imgDatas.add("http://img.ivsky.com/img/tupian/pre/201706/13/jiaoshi-007.jpg");
        return imgDatas;
    }

    public static void loadImage(Context context, String url, final ImageView imageView) {
        Glide.with(context).load(url).placeholder(R.color.gray).dontAnimate().dontTransform().into(imageView);
    }
}
