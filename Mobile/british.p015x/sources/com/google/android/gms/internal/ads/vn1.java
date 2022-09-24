package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class vn1 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b */
    public final /* synthetic */ View f40480b;

    /* renamed from: c */
    public final /* synthetic */ xt0 f40481c;

    /* renamed from: d */
    public final /* synthetic */ String f40482d;

    /* renamed from: e */
    public final /* synthetic */ WindowManager.LayoutParams f40483e;

    /* renamed from: f */
    public final /* synthetic */ int f40484f;

    /* renamed from: g */
    public final /* synthetic */ WindowManager f40485g;

    public /* synthetic */ vn1(View view, xt0 xt0, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.f40480b = view;
        this.f40481c = xt0;
        this.f40482d = str;
        this.f40483e = layoutParams;
        this.f40484f = i;
        this.f40485g = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.f40480b;
        xt0 xt0 = this.f40481c;
        String str = this.f40482d;
        WindowManager.LayoutParams layoutParams = this.f40483e;
        int i = this.f40484f;
        WindowManager windowManager = this.f40485g;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && xt0.mo18790t().getWindowToken() != null) {
            if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str) || "2".equals(str)) {
                layoutParams.y = rect.bottom - i;
            } else {
                layoutParams.y = rect.top - i;
            }
            windowManager.updateViewLayout(xt0.mo18790t(), layoutParams);
        }
    }
}
