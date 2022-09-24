package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.C0564c;
import androidx.constraintlayout.widget.ConstraintLayout;
import p166w.C6240a;
import p166w.C6246e;
import p166w.C6249f;
import p166w.C6255j;

public class Barrier extends ConstraintHelper {

    /* renamed from: j */
    private int f2308j;

    /* renamed from: k */
    private int f2309k;

    /* renamed from: l */
    private C6240a f2310l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: w */
    private void m2996w(C6246e eVar, int i, boolean z) {
        this.f2309k = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.f2308j;
            if (i2 == 5) {
                this.f2309k = 0;
            } else if (i2 == 6) {
                this.f2309k = 1;
            }
        } else if (z) {
            int i3 = this.f2308j;
            if (i3 == 5) {
                this.f2309k = 1;
            } else if (i3 == 6) {
                this.f2309k = 0;
            }
        } else {
            int i4 = this.f2308j;
            if (i4 == 5) {
                this.f2309k = 0;
            } else if (i4 == 6) {
                this.f2309k = 1;
            }
        }
        if (eVar instanceof C6240a) {
            ((C6240a) eVar).mo23759Q0(this.f2309k);
        }
    }

    public int getMargin() {
        return this.f2310l.mo23756N0();
    }

    public int getType() {
        return this.f2308j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2484m(AttributeSet attributeSet) {
        super.mo2484m(attributeSet);
        this.f2310l = new C6240a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0572f.f2808a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2964q1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0572f.f2955p1) {
                    this.f2310l.mo23758P0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0572f.f2973r1) {
                    this.f2310l.mo23760R0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f2314e = this.f2310l;
        mo2824u();
    }

    /* renamed from: n */
    public void mo2485n(C0564c.C0565a aVar, C6255j jVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<C6246e> sparseArray) {
        super.mo2485n(aVar, jVar, layoutParams, sparseArray);
        if (jVar instanceof C6240a) {
            C6240a aVar2 = (C6240a) jVar;
            m2996w(aVar2, aVar.f2479d.f2512b0, ((C6249f) jVar.mo23795H()).mo23873c1());
            aVar2.mo23758P0(aVar.f2479d.f2528j0);
            aVar2.mo23760R0(aVar.f2479d.f2514c0);
        }
    }

    /* renamed from: o */
    public void mo2486o(C6246e eVar, boolean z) {
        m2996w(eVar, this.f2308j, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2310l.mo23758P0(z);
    }

    public void setDpMargin(int i) {
        C6240a aVar = this.f2310l;
        aVar.mo23760R0((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f2310l.mo23760R0(i);
    }

    public void setType(int i) {
        this.f2308j = i;
    }

    /* renamed from: v */
    public boolean mo2813v() {
        return this.f2310l.mo23754L0();
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
