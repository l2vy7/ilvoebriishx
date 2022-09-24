package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.b */
/* compiled from: CompositeOnPageChangeCallback */
final class C1407b extends ViewPager2.C1396i {

    /* renamed from: a */
    private final List<ViewPager2.C1396i> f6242a;

    C1407b(int i) {
        this.f6242a = new ArrayList(i);
    }

    /* renamed from: e */
    private void m7477e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    /* renamed from: a */
    public void mo6761a(int i) {
        try {
            for (ViewPager2.C1396i a : this.f6242a) {
                a.mo6761a(i);
            }
        } catch (ConcurrentModificationException e) {
            m7477e(e);
        }
    }

    /* renamed from: b */
    public void mo6782b(int i, float f, int i2) {
        try {
            for (ViewPager2.C1396i b : this.f6242a) {
                b.mo6782b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m7477e(e);
        }
    }

    /* renamed from: c */
    public void mo6762c(int i) {
        try {
            for (ViewPager2.C1396i c : this.f6242a) {
                c.mo6762c(i);
            }
        } catch (ConcurrentModificationException e) {
            m7477e(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6792d(ViewPager2.C1396i iVar) {
        this.f6242a.add(iVar);
    }
}
