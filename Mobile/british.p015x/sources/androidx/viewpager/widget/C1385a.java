package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
/* compiled from: PagerAdapter */
public abstract class C1385a {

    /* renamed from: a */
    private final DataSetObservable f6193a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f6194b;

    @Deprecated
    /* renamed from: a */
    public void mo6700a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: b */
    public void mo6701b(ViewGroup viewGroup, int i, Object obj) {
        mo6700a(viewGroup, i, obj);
    }

    @Deprecated
    /* renamed from: c */
    public void mo6702c(View view) {
    }

    /* renamed from: d */
    public void mo6703d(ViewGroup viewGroup) {
        mo6702c(viewGroup);
    }

    /* renamed from: e */
    public abstract int mo6704e();

    /* renamed from: f */
    public int mo6705f(Object obj) {
        return -1;
    }

    /* renamed from: g */
    public CharSequence mo6706g(int i) {
        return null;
    }

    /* renamed from: h */
    public float mo6707h(int i) {
        return 1.0f;
    }

    @Deprecated
    /* renamed from: i */
    public Object mo6708i(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: j */
    public Object mo6709j(ViewGroup viewGroup, int i) {
        return mo6708i(viewGroup, i);
    }

    /* renamed from: k */
    public abstract boolean mo6710k(View view, Object obj);

    /* renamed from: l */
    public void mo6711l(DataSetObserver dataSetObserver) {
        this.f6193a.registerObserver(dataSetObserver);
    }

    /* renamed from: m */
    public void mo6712m(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: n */
    public Parcelable mo6713n() {
        return null;
    }

    @Deprecated
    /* renamed from: o */
    public void mo6714o(View view, int i, Object obj) {
    }

    /* renamed from: p */
    public void mo6715p(ViewGroup viewGroup, int i, Object obj) {
        mo6714o(viewGroup, i, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo6716q(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f6194b = dataSetObserver;
        }
    }

    @Deprecated
    /* renamed from: r */
    public void mo6717r(View view) {
    }

    /* renamed from: s */
    public void mo6718s(ViewGroup viewGroup) {
        mo6717r(viewGroup);
    }

    /* renamed from: t */
    public void mo6719t(DataSetObserver dataSetObserver) {
        this.f6193a.unregisterObserver(dataSetObserver);
    }
}
