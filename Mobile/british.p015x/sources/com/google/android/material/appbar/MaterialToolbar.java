package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.C10221n;
import p063d0.C5135a;
import p111m0.C5723u;
import p194c6.C6522b;
import p194c6.C6531k;
import p243p6.C10889h;
import p243p6.C10893i;

public class MaterialToolbar extends Toolbar {

    /* renamed from: T */
    private static final int f47214T = C6531k.Widget_MaterialComponents_Toolbar;

    /* renamed from: Q */
    private Integer f47215Q;

    /* renamed from: R */
    private boolean f47216R;

    /* renamed from: S */
    private boolean f47217S;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.f26598W);
    }

    /* renamed from: P */
    private Pair<Integer, Integer> m45742P(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: Q */
    private void m45743Q(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C10889h hVar = new C10889h();
            hVar.mo43091a0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            hVar.mo43084P(context);
            hVar.mo43090Z(C5723u.m25345w(this));
            C5723u.m25336r0(this, hVar);
        }
    }

    /* renamed from: R */
    private void m45744R(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* renamed from: S */
    private void m45745S() {
        if (this.f47216R || this.f47217S) {
            TextView c = C10221n.m47120c(this);
            TextView a = C10221n.m47118a(this);
            if (c != null || a != null) {
                Pair<Integer, Integer> P = m45742P(c, a);
                if (this.f47216R && c != null) {
                    m45744R(c, P);
                }
                if (this.f47217S && a != null) {
                    m45744R(a, P);
                }
            }
        }
    }

    /* renamed from: T */
    private Drawable m45746T(Drawable drawable) {
        if (drawable == null || this.f47215Q == null) {
            return drawable;
        }
        Drawable r = C5135a.m23418r(drawable);
        C5135a.m23414n(r, this.f47215Q.intValue());
        return r;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10893i.m48986e(this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m45745S();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C10893i.m48985d(this, f);
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m45746T(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f47215Q = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f47217S != z) {
            this.f47217S = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f47216R != z) {
            this.f47216R = z;
            requestLayout();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f47214T
            android.content.Context r8 = p246q6.C10962a.m49296c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p194c6.C6532l.f26833U4
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            int r10 = p194c6.C6532l.f26843V4
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0029
            r0 = -1
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = p194c6.C6532l.f26863X4
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f47216R = r10
            int r10 = p194c6.C6532l.f26853W4
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f47217S = r10
            r9.recycle()
            r7.m45743Q(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
