package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.d */
/* compiled from: PageTransformerAdapter */
final class C1409d extends ViewPager2.C1396i {

    /* renamed from: a */
    private final LinearLayoutManager f6246a;

    /* renamed from: b */
    private ViewPager2.C1401k f6247b;

    C1409d(LinearLayoutManager linearLayoutManager) {
        this.f6246a = linearLayoutManager;
    }

    /* renamed from: a */
    public void mo6761a(int i) {
    }

    /* renamed from: b */
    public void mo6782b(int i, float f, int i2) {
        if (this.f6247b != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.f6246a.mo5419J()) {
                View I = this.f6246a.mo5418I(i3);
                if (I != null) {
                    this.f6247b.mo6786a(I, ((float) (this.f6246a.mo5459h0(I) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f6246a.mo5419J())}));
                }
            }
        }
    }

    /* renamed from: c */
    public void mo6762c(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ViewPager2.C1401k mo6794d() {
        return this.f6247b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6795e(ViewPager2.C1401k kVar) {
        this.f6247b = kVar;
    }
}
