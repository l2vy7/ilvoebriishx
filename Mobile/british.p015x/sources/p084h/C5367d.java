package p084h;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p084h.C5362b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: h.d */
/* compiled from: StateListDrawable */
class C5367d extends C5362b {

    /* renamed from: n */
    private C5368a f23636n;

    /* renamed from: o */
    private boolean f23637o;

    /* renamed from: h.d$a */
    /* compiled from: StateListDrawable */
    static class C5368a extends C5362b.C5365c {

        /* renamed from: J */
        int[][] f23638J;

        C5368a(C5368a aVar, C5367d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f23638J = aVar.f23638J;
            } else {
                this.f23638J = new int[mo21731f()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public int mo21780A(int[] iArr) {
            int[][] iArr2 = this.f23638J;
            int h = mo21734h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C5367d(this, (Resources) null);
        }

        /* renamed from: o */
        public void mo21741o(int i, int i2) {
            super.mo21741o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f23638J, 0, iArr, 0, i);
            this.f23638J = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo21707r() {
            int[][] iArr = this.f23638J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f23638J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f23638J = iArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public int mo21781z(int[] iArr, Drawable drawable) {
            int a = mo21726a(drawable);
            this.f23638J[a] = iArr;
            return a;
        }

        public Drawable newDrawable(Resources resources) {
            return new C5367d(this, resources);
        }
    }

    C5367d(C5368a aVar, Resources resources) {
        mo21676h(new C5368a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo21676h(C5362b.C5365c cVar) {
        super.mo21676h(cVar);
        if (cVar instanceof C5368a) {
            this.f23636n = (C5368a) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C5368a mo21662b() {
        return new C5368a(this.f23636n, this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo21779k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f23637o && super.mutate() == this) {
            this.f23636n.mo21707r();
            this.f23637o = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f23636n.mo21780A(iArr);
        if (A < 0) {
            A = this.f23636n.mo21780A(StateSet.WILD_CARD);
        }
        return mo21715g(A) || onStateChange;
    }

    C5367d(C5368a aVar) {
        if (aVar != null) {
            mo21676h(aVar);
        }
    }
}
