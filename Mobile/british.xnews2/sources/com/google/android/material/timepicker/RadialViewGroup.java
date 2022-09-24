package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0564c;
import androidx.constraintlayout.widget.ConstraintLayout;
import p110m0.C5723u;
import p193c6.C6526f;
import p193c6.C6528h;
import p193c6.C6532l;
import p242p6.C10889h;
import p242p6.C10895k;

class RadialViewGroup extends ConstraintLayout {

    /* renamed from: A */
    private C10889h f48744A;

    /* renamed from: y */
    private final Runnable f48745y;

    /* renamed from: z */
    private int f48746z;

    /* renamed from: com.google.android.material.timepicker.RadialViewGroup$a */
    class C10364a implements Runnable {
        C10364a() {
        }

        public void run() {
            RadialViewGroup.this.mo41788D();
        }
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: C */
    private static boolean m47862C(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: E */
    private void m47863E() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f48745y);
            handler.post(this.f48745y);
        }
    }

    /* renamed from: z */
    private Drawable m47864z() {
        C10889h hVar = new C10889h();
        this.f48744A = hVar;
        hVar.mo43089Y(new C10895k(0.5f));
        this.f48744A.mo43091a0(ColorStateList.valueOf(-1));
        return this.f48744A;
    }

    /* renamed from: A */
    public int mo41787A() {
        return this.f48746z;
    }

    /* renamed from: B */
    public void mo41769B(int i) {
        this.f48746z = i;
        mo41788D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo41788D() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m47862C(getChildAt(i2))) {
                i++;
            }
        }
        C0564c cVar = new C0564c();
        cVar.mo2910j(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = C6526f.circle_center;
            if (id != i4 && !m47862C(childAt)) {
                cVar.mo2912l(childAt.getId(), i4, this.f48746z, f);
                f += 360.0f / ((float) (childCount - i));
            }
        }
        cVar.mo2904d(this);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(C5723u.m25321k());
        }
        m47863E();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo41788D();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m47863E();
    }

    public void setBackgroundColor(int i) {
        this.f48744A.mo43091a0(ColorStateList.valueOf(i));
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C6528h.material_radial_view_group, this);
        C5723u.m25336r0(this, m47864z());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f26864X5, i, 0);
        this.f48746z = obtainStyledAttributes.getDimensionPixelSize(C6532l.f26874Y5, 0);
        this.f48745y = new C10364a();
        obtainStyledAttributes.recycle();
    }
}
