package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.m5 */
/* compiled from: Sta */
public class C12046m5 extends ArrayAdapter<C12142q5> {

    /* renamed from: a */
    public String f53273a;

    /* renamed from: b */
    public String f53274b;

    public C12046m5(Context context, List list, String str, String str2) {
        super(context, 0, list);
        this.f53273a = str;
        this.f53274b = str2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C12160r5 r5Var;
        long j;
        if (view == null) {
            r5Var = new C12160r5(getContext());
            view2 = r5Var.f54101a;
        } else {
            view2 = view;
            r5Var = (C12160r5) view.getTag();
        }
        C12142q5 q5Var = (C12142q5) getItem(i);
        MetaDataStyle a = AdsCommonMetaData.f22242h.mo20886a(q5Var.f54068q);
        boolean z = true;
        if (r5Var.f54107g != a) {
            r5Var.f54107g = a;
            r5Var.f54101a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a.mo46341e().intValue(), a.mo46340d().intValue()}));
            r5Var.f54103c.setTextSize((float) a.mo46345h().intValue());
            r5Var.f54103c.setTextColor(a.mo46343f().intValue());
            C11970ib.m52472a(r5Var.f54103c, a.mo46344g());
            r5Var.f54104d.setTextSize((float) a.mo46339c().intValue());
            r5Var.f54104d.setTextColor(a.mo46337a().intValue());
            C11970ib.m52472a(r5Var.f54104d, a.mo46338b());
        }
        r5Var.f54103c.setText(q5Var.f54058g);
        r5Var.f54104d.setText(q5Var.f54059h);
        C12178s5 a2 = C12342t5.f54758b.mo46637a(this.f53274b);
        Bitmap a3 = a2.f54140a.mo45194a(i, q5Var.f54052a, q5Var.f54060i);
        if (a3 == null) {
            r5Var.f54102b.setImageResource(17301651);
            r5Var.f54102b.setTag("tag_error");
        } else {
            r5Var.f54102b.setImageBitmap(a3);
            r5Var.f54102b.setTag("tag_ok");
        }
        r5Var.f54106f.setRating(q5Var.f54061j);
        if (q5Var.f54065n == null) {
            z = false;
        }
        r5Var.mo45712a(z);
        C12178s5 a4 = C12342t5.f54758b.mo46637a(this.f53274b);
        Context context = getContext();
        String[] strArr = q5Var.f54054c;
        TrackingParams trackingParams = new TrackingParams(this.f53273a);
        Long l = q5Var.f54066o;
        if (l != null) {
            j = TimeUnit.SECONDS.toMillis(l.longValue());
        } else {
            j = TimeUnit.SECONDS.toMillis(MetaData.f22407k.mo21203o());
        }
        long j2 = j;
        C11818c4 c4Var = a4.f54140a;
        String a5 = c4Var.mo45195a(strArr, a4.f54142c);
        if (!c4Var.f52654a.containsKey(a5)) {
            C11868d9 d9Var = new C11868d9(context, strArr, trackingParams, j2);
            c4Var.f52654a.put(a5, d9Var);
            d9Var.mo45304b();
        }
        return view2;
    }
}
