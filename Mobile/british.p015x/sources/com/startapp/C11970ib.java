package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Set;

/* renamed from: com.startapp.ib */
/* compiled from: Sta */
public class C11970ib {
    /* renamed from: a */
    public static int m52467a(Context context, int i) {
        return C11975j0.m52484a(context, 1, (float) i);
    }

    /* renamed from: b */
    public static int m52473b(Context context, int i) {
        return Math.round(((float) i) / context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    public static void m52472a(TextView textView, Set<String> set) {
        if (set.contains("UNDERLINE")) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
        int i = 0;
        if (set.contains("BOLD") && set.contains("ITALIC")) {
            i = 3;
        } else if (set.contains("BOLD")) {
            i = 1;
        } else if (set.contains("ITALIC")) {
            i = 2;
        }
        textView.setTypeface((Typeface) null, i);
    }

    /* renamed from: a */
    public static TextView m52470a(Context context, TextView textView, Typeface typeface, int i, float f, int i2, int i3) {
        TextView textView2 = new TextView(context);
        textView2.setTypeface(typeface, i);
        textView2.setTextSize(1, f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setTextColor(i2);
        textView2.setId(i3);
        return textView2;
    }

    /* renamed from: a */
    public static RelativeLayout.LayoutParams m52469a(Context context, int[] iArr, int[] iArr2) {
        int i;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        for (int addRule : iArr2) {
            layoutParams.addRule(addRule);
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == 0) {
                i = 0;
            } else {
                i = C11975j0.m52484a(context, 1, (float) iArr[i2]);
            }
            iArr[i2] = i;
        }
        layoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        return layoutParams;
    }

    /* renamed from: a */
    public static ImageView m52468a(Context context, ImageView imageView, Bitmap bitmap, int i) {
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setId(i);
        return imageView2;
    }

    /* renamed from: a */
    public static void m52471a(Context context, WindowManager windowManager, Point point) {
        if (Build.VERSION.SDK_INT >= 13) {
            windowManager.getDefaultDisplay().getSize(point);
        } else {
            point.x = windowManager.getDefaultDisplay().getWidth();
            point.y = windowManager.getDefaultDisplay().getHeight();
        }
        point.x = Math.round(((float) point.x) / context.getResources().getDisplayMetrics().density);
        point.y = Math.round(((float) point.y) / context.getResources().getDisplayMetrics().density);
    }
}
