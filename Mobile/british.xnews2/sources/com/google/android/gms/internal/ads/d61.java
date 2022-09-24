package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d61 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    private final Context f30650b;

    /* renamed from: c */
    private View f30651c;

    private d61(Context context) {
        super(context);
        this.f30650b = context;
    }

    /* renamed from: a */
    public static d61 m31252a(Context context, View view, ir2 ir2) {
        Resources resources;
        DisplayMetrics displayMetrics;
        d61 d61 = new d61(context);
        if (!(ir2.f33496v.isEmpty() || (resources = d61.f30650b.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            jr2 jr2 = ir2.f33496v.get(0);
            float f = displayMetrics.density;
            d61.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) jr2.f34022a) * f), (int) (((float) jr2.f34023b) * f)));
        }
        d61.f30651c = view;
        d61.addView(view);
        zzt.zzx();
        cp0.m31077b(d61, d61);
        zzt.zzx();
        cp0.m31076a(d61, d61);
        JSONObject jSONObject = ir2.f33475f0;
        RelativeLayout relativeLayout = new RelativeLayout(d61.f30650b);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            d61.m31254c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            d61.m31254c(optJSONObject2, relativeLayout, 12);
        }
        d61.addView(relativeLayout);
        return d61;
    }

    /* renamed from: b */
    private final int m31253b(double d) {
        C8241uv.m38463b();
        return vn0.m38860s(this.f30650b, (int) d);
    }

    /* renamed from: c */
    private final void m31254c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.f30650b);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int b = m31253b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, b, 0, b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, m31253b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f30651c.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f30651c.setY((float) (-iArr[1]));
    }
}
