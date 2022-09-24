package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: b */
    long f3177b = -1;

    /* renamed from: c */
    boolean f3178c = false;

    /* renamed from: d */
    boolean f3179d = false;

    /* renamed from: e */
    boolean f3180e = false;

    /* renamed from: f */
    private final Runnable f3181f = new C0617d(this);

    /* renamed from: g */
    private final Runnable f3182g = new C0618e(this);

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m3347c() {
        this.f3178c = false;
        this.f3177b = -1;
        setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m3348d() {
        this.f3179d = false;
        if (!this.f3180e) {
            this.f3177b = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    /* renamed from: e */
    private void m3349e() {
        removeCallbacks(this.f3181f);
        removeCallbacks(this.f3182g);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3349e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3349e();
    }
}
