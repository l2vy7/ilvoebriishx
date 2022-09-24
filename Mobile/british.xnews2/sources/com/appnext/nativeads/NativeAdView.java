package com.appnext.nativeads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.appnext.base.Appnext;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C3198g;
import com.appnext.core.C3202i;
import com.appnext.core.SettingsManager;

public class NativeAdView extends FrameLayout {
    private C3284a adViewActions;
    /* access modifiers changed from: private */

    /* renamed from: fE */
    public NativeAd f12504fE;
    /* access modifiers changed from: private */

    /* renamed from: fG */
    public NativeAdData f12505fG;

    /* renamed from: fW */
    private PrivacyIcon f12506fW;

    /* renamed from: fX */
    private ViewTreeObserver.OnScrollChangedListener f12507fX;

    /* renamed from: com.appnext.nativeads.NativeAdView$a */
    interface C3284a {
        /* renamed from: d */
        void mo10961d(int i);
    }

    public NativeAdView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m11002e(int i) {
        if (getWindowVisibility() != 8 && getWindowVisibility() != 4 && this.f12504fE != null) {
            C3284a aVar = this.adViewActions;
            if (aVar != null) {
                aVar.mo10961d(i);
            }
            if (this.f12504fE.getMediaView() != null) {
                this.f12504fE.getMediaView().mo10896d(getVisiblePercent(this.f12504fE.getMediaView()));
            }
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
            C3117a.m10553a("NativeAdView$isViewPartiallyVisible", th);
            return false;
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f12506fW);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bd */
    public final void mo10993bd() {
        super.removeView(this.f12506fW);
        this.f12504fE = null;
        this.f12505fG = null;
        this.adViewActions = null;
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        PrivacyIcon privacyIcon = this.f12506fW;
        if (privacyIcon != view) {
            super.bringChildToFront(privacyIcon);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f12504fE != null && this.f12505fG != null && this.adViewActions != null) {
            m11002e(getVisiblePercent(this));
        }
    }

    /* access modifiers changed from: protected */
    public final int getVisiblePercent(View view) {
        if (!isViewPartiallyVisible(this) || view == null) {
            return 0;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        double width = (double) (rect.width() * rect.height());
        double width2 = (double) (view.getWidth() * view.getHeight());
        Double.isNaN(width);
        Double.isNaN(width2);
        return (int) ((width * 100.0d) / width2);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bringToFront();
        getViewTreeObserver().addOnScrollChangedListener(this.f12507fX);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            getViewTreeObserver().removeOnScrollChangedListener(this.f12507fX);
        } catch (Throwable th) {
            C3117a.m10553a("NativeAdView$onWindowVisibilityChanged", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12504fE != null && this.f12505fG != null && this.adViewActions != null) {
            m11002e(getVisiblePercent(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        try {
            NativeAd nativeAd = this.f12504fE;
            if (nativeAd != null && this.f12505fG != null) {
                nativeAd.onWindowVisibilityChanged(i);
            }
        } catch (Throwable th) {
            C3117a.m10553a("NativeAdView$onWindowVisibilityChanged", th);
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f12506fW);
    }

    public void removeView(View view) {
        if (view != this.f12506fW) {
            super.removeView(view);
        }
    }

    public void setVisibility(int i) {
        if (this.f12504fE != null && this.f12505fG != null) {
            super.setVisibility(i);
            m11002e(getVisiblePercent(this));
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12507fX = new ViewTreeObserver.OnScrollChangedListener() {
            public final void onScrollChanged() {
                NativeAdView nativeAdView = NativeAdView.this;
                nativeAdView.m11002e(nativeAdView.getVisiblePercent(nativeAdView));
            }
        };
        Appnext.init(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10991a(NativeAd nativeAd, NativeAdData nativeAdData, C3284a aVar) {
        int i;
        int i2;
        int i3;
        this.f12504fE = nativeAd;
        this.f12505fG = nativeAdData;
        this.adViewActions = aVar;
        if (nativeAd != null && nativeAdData != null) {
            int i4 = 0;
            try {
                setVisibility(0);
                PrivacyIcon privacyIcon = this.f12506fW;
                if (privacyIcon != null) {
                    super.removeView(privacyIcon);
                }
                if (this.f12504fE.getPrivacyPolicyVisibility() == 0) {
                    this.f12506fW = new PrivacyIcon(getContext());
                    int a = C3198g.m10773a(getContext(), 25.0f);
                    int privacyPolicyPosition = this.f12504fE.getPrivacyPolicyPosition();
                    if (privacyPolicyPosition == 0) {
                        i = a;
                        i3 = i;
                        a = 0;
                        i2 = 51;
                    } else if (privacyPolicyPosition == 1) {
                        i4 = a;
                        i3 = i4;
                        a = 0;
                        i = 0;
                        i2 = 53;
                    } else if (privacyPolicyPosition == 2) {
                        i = a;
                        i3 = 0;
                        i2 = 83;
                    } else if (privacyPolicyPosition != 3) {
                        i4 = a;
                        i = i4;
                        i3 = i;
                        i2 = 3;
                    } else {
                        i4 = a;
                        i = 0;
                        i3 = 0;
                        i2 = 85;
                    }
                    addView(this.f12506fW, new FrameLayout.LayoutParams(-2, -2, i2));
                    this.f12506fW.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            try {
                                if (NativeAdView.this.f12504fE != null) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C3198g.m10793e(NativeAdView.this.f12505fG)));
                                        intent.setFlags(268435456);
                                        NativeAdView.this.getContext().startActivity(intent);
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                C3117a.m10553a("NativeAdView$init", th);
                            }
                        }
                    });
                    if (C3202i.m10805a((AppnextAd) this.f12505fG, (SettingsManager) C3288a.m11006bc())) {
                        C3202i.m10804a(getContext(), (ImageView) this.f12506fW);
                    } else if (this.f12504fE.getPrivacyPolicyColor() == 0) {
                        this.f12506fW.setImageResource(C3285R.C3286drawable.apnxt_na_i_icon_light);
                    } else {
                        this.f12506fW.setImageResource(C3285R.C3286drawable.apnxt_na_i_icon_dark);
                    }
                    this.f12506fW.getLayoutParams().width = C3198g.m10773a(getContext(), 40.0f);
                    this.f12506fW.getLayoutParams().height = C3198g.m10773a(getContext(), 40.0f);
                    this.f12506fW.setPadding(i4, a, i, i3);
                }
            } catch (Throwable th) {
                C3117a.m10553a("NativeAdView$init", th);
            }
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12507fX = new ViewTreeObserver.OnScrollChangedListener() {
            public final void onScrollChanged() {
                NativeAdView nativeAdView = NativeAdView.this;
                nativeAdView.m11002e(nativeAdView.getVisiblePercent(nativeAdView));
            }
        };
        Appnext.init(context);
    }
}
