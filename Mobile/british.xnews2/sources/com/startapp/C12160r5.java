package com.startapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import com.startapp.sdk.json.RatingBar;

/* renamed from: com.startapp.r5 */
/* compiled from: Sta */
public class C12160r5 {

    /* renamed from: a */
    public RelativeLayout f54101a;

    /* renamed from: b */
    public ImageView f54102b;

    /* renamed from: c */
    public TextView f54103c;

    /* renamed from: d */
    public TextView f54104d;

    /* renamed from: e */
    public TextView f54105e;

    /* renamed from: f */
    public RatingBar f54106f;

    /* renamed from: g */
    public MetaDataStyle f54107g = null;

    /* renamed from: com.startapp.r5$a */
    /* compiled from: Sta */
    public class C12161a extends ShapeDrawable {
        public C12161a(C12160r5 r5Var, Shape shape) {
            super(shape);
        }

        public void onDraw(Shape shape, Canvas canvas, Paint paint) {
            paint.setColor(-11363070);
            paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
            super.onDraw(shape, canvas, paint);
        }
    }

    public C12160r5(Context context) {
        Context context2 = context;
        context2.setTheme(16973829);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        this.f54101a = new RelativeLayout(context2);
        this.f54101a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.m23014k().mo20903p(), AdsCommonMetaData.m23014k().mo20902o()}));
        this.f54101a.setLayoutParams(layoutParams);
        int a = C11970ib.m52467a(context2, 3);
        int a2 = C11970ib.m52467a(context2, 4);
        int a3 = C11970ib.m52467a(context2, 5);
        int a4 = C11970ib.m52467a(context2, 6);
        int a5 = C11970ib.m52467a(context2, 10);
        int a6 = C11970ib.m52467a(context2, 84);
        this.f54101a.setPadding(a5, a, a5, a);
        this.f54101a.setTag(this);
        ImageView imageView = new ImageView(context2);
        this.f54102b = imageView;
        imageView.setId(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a6, a6);
        layoutParams2.addRule(15);
        this.f54102b.setLayoutParams(layoutParams2);
        this.f54102b.setPadding(0, 0, a4, 0);
        TextView textView = new TextView(context2);
        this.f54103c = textView;
        textView.setId(2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(C12437y.m53771a(17), 1);
        layoutParams3.addRule(6, 1);
        this.f54103c.setLayoutParams(layoutParams3);
        this.f54103c.setPadding(0, 0, 0, a3);
        this.f54103c.setTextColor(AdsCommonMetaData.m23014k().mo20904q().intValue());
        this.f54103c.setTextSize((float) AdsCommonMetaData.m23014k().mo20906s().intValue());
        this.f54103c.setSingleLine(true);
        this.f54103c.setEllipsize(TextUtils.TruncateAt.END);
        C11970ib.m52472a(this.f54103c, AdsCommonMetaData.m23014k().mo20905r());
        TextView textView2 = new TextView(context2);
        this.f54104d = textView2;
        textView2.setId(3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(C12437y.m53771a(17), 1);
        layoutParams4.addRule(3, 2);
        layoutParams4.setMargins(0, 0, 0, a3);
        this.f54104d.setLayoutParams(layoutParams4);
        this.f54104d.setTextColor(AdsCommonMetaData.m23014k().mo20899l().intValue());
        this.f54104d.setTextSize((float) AdsCommonMetaData.m23014k().mo20901n().intValue());
        this.f54104d.setSingleLine(true);
        this.f54104d.setEllipsize(TextUtils.TruncateAt.END);
        C11970ib.m52472a(this.f54104d, AdsCommonMetaData.m23014k().mo20900m());
        this.f54106f = new RatingBar(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(C12437y.m53771a(17), 1);
        layoutParams5.addRule(8, 1);
        layoutParams5.setMargins(0, 0, 0, -a3);
        this.f54106f.setLayoutParams(layoutParams5);
        this.f54106f.setPadding(0, 0, 0, a2);
        this.f54106f.setId(5);
        this.f54105e = new TextView(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(C12437y.m53771a(21));
        layoutParams6.addRule(8, 1);
        this.f54105e.setLayoutParams(layoutParams6);
        mo45712a(false);
        this.f54105e.setTextColor(-1);
        this.f54105e.setTextSize(12.0f);
        this.f54105e.setTypeface((Typeface) null, 1);
        this.f54105e.setPadding(a5, a4, a5, a4);
        this.f54105e.setId(4);
        this.f54105e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f54105e.setBackgroundDrawable(new C12161a(this, new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, (RectF) null, (float[]) null)));
        this.f54101a.addView(this.f54102b);
        this.f54101a.addView(this.f54103c);
        this.f54101a.addView(this.f54104d);
        this.f54101a.addView(this.f54106f);
        this.f54101a.addView(this.f54105e);
    }

    /* renamed from: a */
    public void mo45712a(boolean z) {
        if (z) {
            this.f54105e.setText("Open");
        } else {
            this.f54105e.setText("Download");
        }
    }
}
