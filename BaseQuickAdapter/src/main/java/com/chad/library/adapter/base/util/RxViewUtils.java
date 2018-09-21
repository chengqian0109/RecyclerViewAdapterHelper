package com.chad.library.adapter.base.util;

import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jakewharton.rxbinding2.view.RxView;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * Rx订阅工具类
 *
 * @author chengqian
 * @date 2018/6/10
 */
public class RxViewUtils {
    /**
     * 防止view重复点击，1.5秒内仅响应第一次点击操作
     *
     * @param view 被点击的View对象
     * @return 观察对象
     */
    public static Observable click(View view) {
        return RxView.clicks(view).subscribeOn(AndroidSchedulers.mainThread())
                .throttleFirst(BaseQuickAdapter.getDurationMilliSeconds(), TimeUnit.MILLISECONDS);
    }

    /**
     * 点击回调
     */
    public interface OnClickListener {
        /**
         * 点击事件回调
         *
         * @param view 点击的View对象
         */
        void onClick(View view);
    }
}
