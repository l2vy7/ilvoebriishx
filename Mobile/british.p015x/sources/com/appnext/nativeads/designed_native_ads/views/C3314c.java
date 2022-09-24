package com.appnext.nativeads.designed_native_ads.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.appnext.base.C3117a;

/* renamed from: com.appnext.nativeads.designed_native_ads.views.c */
public class C3314c extends FrameLayout {

    /* renamed from: fX */
    private ViewTreeObserver.OnScrollChangedListener f12594fX;
    /* access modifiers changed from: private */

    /* renamed from: ha */
    public C3316a f12595ha;

    /* renamed from: com.appnext.nativeads.designed_native_ads.views.c$a */
    public interface C3316a {
        /* renamed from: f */
        void mo11076f(int i);
    }

    public C3314c(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public int getVisiblePercent() {
        try {
            if (!isViewPartiallyVisible(this)) {
                return 0;
            }
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            double width = (double) (rect.width() * rect.height());
            double width2 = (double) (getWidth() * getHeight());
            Double.isNaN(width);
            Double.isNaN(width2);
            return (int) ((width * 100.0d) / width2);
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdViewContainerImpl$getVisiblePercent", th);
            return 0;
        }
    }

    private boolean isViewPartiallyVisible(View view) {
        try {
            if (getParent() == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
                return false;
            }
            Rect rect = new Rect();
            ((ViewGroup) getParent()).getHitRect(rect);
            return view.getGlobalVisibleRect(rect);
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdViewContainerImpl$isViewPartiallyVisible", th);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C3316a aVar = this.f12595ha;
        if (aVar != null) {
            aVar.mo11076f(getVisiblePercent());
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bringToFront();
        getViewTreeObserver().addOnScrollChangedListener(this.f12594fX);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            getViewTreeObserver().removeOnScrollChangedListener(this.f12594fX);
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdViewContainerImpl$onDetachedFromWindow", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C3316a aVar = this.f12595ha;
        if (aVar != null) {
            aVar.mo11076f(getVisiblePercent());
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            try {
                C3316a aVar = this.f12595ha;
                if (aVar != null) {
                    aVar.mo11076f(getVisiblePercent());
                }
            } catch (Throwable th) {
                C3117a.m10553a("DesignedNativeAdViewContainerImpl$onVisibilityChanged", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            try {
                C3316a aVar = this.f12595ha;
                if (aVar != null) {
                    aVar.mo11076f(getVisiblePercent());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void register(C3316a aVar) {
        this.f12595ha = aVar;
        if (aVar != null) {
            this.f12595ha.mo11076f(getVisiblePercent());
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            try {
                C3316a aVar = this.f12595ha;
                if (aVar != null) {
                    aVar.mo11076f(getVisiblePercent());
                }
            } catch (Throwable th) {
                C3117a.m10553a("DesignedNativeAdViewContainerImpl$setVisibility", th);
            }
        }
    }

    public C3314c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3314c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12594fX = new ViewTreeObserver.OnScrollChangedListener() {
            public final void onScrollChanged() {
                if (C3314c.this.f12595ha != null) {
                    C3314c.this.f12595ha.mo11076f(C3314c.this.getVisiblePercent());
                }
            }
        };
    }

    public C3314c(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12594fX = new ViewTreeObserver.OnScrollChangedListener() {
            public final void onScrollChanged() {
                if (C3314c.this.f12595ha != null) {
                    C3314c.this.f12595ha.mo11076f(C3314c.this.getVisiblePercent());
                }
            }
        };
    }
}
