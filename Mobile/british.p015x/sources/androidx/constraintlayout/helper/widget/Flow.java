package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C0564c;
import androidx.constraintlayout.widget.C0572f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import p166w.C6246e;
import p166w.C6250g;
import p166w.C6255j;
import p166w.C6257l;

public class Flow extends VirtualLayout {

    /* renamed from: l */
    private C6250g f1820l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2484m(AttributeSet attributeSet) {
        super.mo2484m(attributeSet);
        this.f1820l = new C6250g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0572f.f2808a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2818b1) {
                    this.f1820l.mo23896T1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0572f.f2828c1) {
                    this.f1820l.mo23934Z0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0572f.f2928m1) {
                    this.f1820l.mo23939e1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0572f.f2937n1) {
                    this.f1820l.mo23936b1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0572f.f2838d1) {
                    this.f1820l.mo23937c1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0572f.f2848e1) {
                    this.f1820l.mo23940f1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0572f.f2858f1) {
                    this.f1820l.mo23938d1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0572f.f2868g1) {
                    this.f1820l.mo23935a1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0572f.f2673L1) {
                    this.f1820l.mo23901Y1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0572f.f2583B1) {
                    this.f1820l.mo23889N1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0572f.f2664K1) {
                    this.f1820l.mo23900X1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0572f.f3009v1) {
                    this.f1820l.mo23883H1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0572f.f2601D1) {
                    this.f1820l.mo23891P1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0572f.f3027x1) {
                    this.f1820l.mo23885J1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0572f.f2619F1) {
                    this.f1820l.mo23893R1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0572f.f3045z1) {
                    this.f1820l.mo23887L1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0572f.f3000u1) {
                    this.f1820l.mo23882G1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0572f.f2592C1) {
                    this.f1820l.mo23890O1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0572f.f3018w1) {
                    this.f1820l.mo23884I1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0572f.f2610E1) {
                    this.f1820l.mo23892Q1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0572f.f2646I1) {
                    this.f1820l.mo23898V1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0572f.f3036y1) {
                    this.f1820l.mo23886K1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0572f.f2637H1) {
                    this.f1820l.mo23897U1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0572f.f2574A1) {
                    this.f1820l.mo23888M1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0572f.f2655J1) {
                    this.f1820l.mo23899W1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0572f.f2628G1) {
                    this.f1820l.mo23894S1(obtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f2314e = this.f1820l;
        mo2824u();
    }

    /* renamed from: n */
    public void mo2485n(C0564c.C0565a aVar, C6255j jVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<C6246e> sparseArray) {
        super.mo2485n(aVar, jVar, layoutParams, sparseArray);
        if (jVar instanceof C6250g) {
            C6250g gVar = (C6250g) jVar;
            int i = layoutParams.f2360S;
            if (i != -1) {
                gVar.mo23896T1(i);
            }
        }
    }

    /* renamed from: o */
    public void mo2486o(C6246e eVar, boolean z) {
        this.f1820l.mo23921L0(z);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo2508v(this.f1820l, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1820l.mo23882G1(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1820l.mo23883H1(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1820l.mo23884I1(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1820l.mo23885J1(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1820l.mo23886K1(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1820l.mo23887L1(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1820l.mo23888M1(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1820l.mo23889N1(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1820l.mo23894S1(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1820l.mo23896T1(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f1820l.mo23934Z0(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1820l.mo23935a1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1820l.mo23937c1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1820l.mo23938d1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1820l.mo23940f1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1820l.mo23897U1(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1820l.mo23898V1(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1820l.mo23899W1(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1820l.mo23900X1(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1820l.mo23901Y1(i);
        requestLayout();
    }

    /* renamed from: v */
    public void mo2508v(C6257l lVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (lVar != null) {
            lVar.mo23895T0(mode, size, mode2, size2);
            setMeasuredDimension(lVar.mo23924O0(), lVar.mo23923N0());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
