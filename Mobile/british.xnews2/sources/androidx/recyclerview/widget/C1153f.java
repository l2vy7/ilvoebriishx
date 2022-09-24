package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
/* compiled from: LayoutState */
class C1153f {

    /* renamed from: a */
    boolean f5365a = true;

    /* renamed from: b */
    int f5366b;

    /* renamed from: c */
    int f5367c;

    /* renamed from: d */
    int f5368d;

    /* renamed from: e */
    int f5369e;

    /* renamed from: f */
    int f5370f = 0;

    /* renamed from: g */
    int f5371g = 0;

    /* renamed from: h */
    boolean f5372h;

    /* renamed from: i */
    boolean f5373i;

    C1153f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo5757a(RecyclerView.C1121z zVar) {
        int i = this.f5367c;
        return i >= 0 && i < zVar.mo5578b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo5758b(RecyclerView.C1115v vVar) {
        View o = vVar.mo5543o(this.f5367c);
        this.f5367c += this.f5368d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f5366b + ", mCurrentPosition=" + this.f5367c + ", mItemDirection=" + this.f5368d + ", mLayoutDirection=" + this.f5369e + ", mStartLine=" + this.f5370f + ", mEndLine=" + this.f5371g + '}';
    }
}
