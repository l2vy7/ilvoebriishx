package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p110m0.C5723u;
import p193c6.C6526f;
import p193c6.C6532l;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b */
    private TextView f48395b;

    /* renamed from: c */
    private Button f48396c;

    /* renamed from: d */
    private int f48397d;

    /* renamed from: e */
    private int f48398e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f26907b7);
        this.f48397d = obtainStyledAttributes.getDimensionPixelSize(C6532l.f26918c7, -1);
        this.f48398e = obtainStyledAttributes.getDimensionPixelSize(C6532l.f26995j7, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static void m47486a(View view, int i, int i2) {
        if (C5723u.m25296V(view)) {
            C5723u.m25268C0(view, C5723u.m25275G(view), i, C5723u.m25273F(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: b */
    private boolean m47487b(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f48395b.getPaddingTop() == i2 && this.f48395b.getPaddingBottom() == i3) {
            return z;
        }
        m47486a(this.f48395b, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f48396c;
    }

    public TextView getMessageView() {
        return this.f48395b;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f48395b = (TextView) findViewById(C6526f.snackbar_text);
        this.f48396c = (Button) findViewById(C6526f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m47487b(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m47487b(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f48397d
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f48397d
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p193c6.C6524d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p193c6.C6524d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f48395b
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f48398e
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f48396c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f48398e
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m47487b(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m47487b(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f48398e = i;
    }
}
