package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.environment.C4979h;
import com.ironsource.sdk.controller.C11618w;
import com.ironsource.sdk.p296i.C11718a;
import com.ironsource.sdk.p297j.C11730g;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* renamed from: com.ironsource.sdk.controller.i */
public final class C11585i extends FrameLayout implements C11730g {

    /* renamed from: b */
    Context f52034b;

    /* renamed from: c */
    C11618w f52035c;

    /* renamed from: com.ironsource.sdk.controller.i$a */
    class C11586a implements Runnable {
        C11586a() {
        }

        public final void run() {
            ViewGroup b = C11585i.m51501b(C11585i.this);
            if (b != null) {
                b.addView(C11585i.this);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.i$b */
    class C11587b implements Runnable {
        C11587b() {
        }

        public final void run() {
            ViewGroup b = C11585i.m51501b(C11585i.this);
            if (b != null) {
                b.removeView(C11585i.this);
            }
        }
    }

    public C11585i(Context context) {
        super(context);
        this.f52034b = context;
        setClickable(true);
    }

    /* renamed from: b */
    static /* synthetic */ ViewGroup m51501b(C11585i iVar) {
        Activity activity = (Activity) iVar.f52034b;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo44748a() {
        int identifier;
        try {
            Context context = this.f52034b;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID)) <= 0) {
                return 0;
            }
            return this.f52034b.getResources().getDimensionPixelSize(identifier);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo44749c() {
        Activity activity = (Activity) this.f52034b;
        try {
            if (Build.VERSION.SDK_INT > 9) {
                Rect rect = new Rect();
                activity.getWindow().getDecorView().getDrawingRect(rect);
                Rect rect2 = new Rect();
                activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                if (C4979h.m22820p(activity) == 1) {
                    int i = rect.bottom;
                    int i2 = rect2.bottom;
                    if (i - i2 > 0) {
                        return i - i2;
                    }
                    return 0;
                }
                int i3 = rect.right;
                int i4 = rect2.right;
                if (i3 - i4 > 0) {
                    return i3 - i4;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f52035c.mo44792j();
        this.f52035c.mo44785a(true, "main");
    }

    public final boolean onBackButtonPressed() {
        new C11718a();
        return C11718a.m51847a((Activity) this.f52034b);
    }

    public final void onCloseRequested() {
        ((Activity) this.f52034b).runOnUiThread(new C11587b());
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52035c.mo44791i();
        this.f52035c.mo44785a(false, "main");
        C11618w wVar = this.f52035c;
        if (wVar != null) {
            wVar.f52166y = C11618w.C11653g.Gone;
            wVar.f52129H = null;
            wVar.f52153l0 = null;
        }
        removeAllViews();
    }

    public final void onOrientationChanged(String str, int i) {
    }
}
