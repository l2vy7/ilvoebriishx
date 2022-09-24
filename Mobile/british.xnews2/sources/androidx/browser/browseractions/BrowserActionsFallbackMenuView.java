package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p126p.C5873a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: b */
    private final int f1749b = getResources().getDimensionPixelOffset(C5873a.f24632b);

    /* renamed from: c */
    private final int f1750c = getResources().getDimensionPixelOffset(C5873a.f24631a);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1749b * 2), this.f1750c), 1073741824), i2);
    }
}
