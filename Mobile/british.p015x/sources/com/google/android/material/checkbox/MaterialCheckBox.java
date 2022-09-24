package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.C0616c;
import p194c6.C6522b;
import p194c6.C6531k;
import p208f6.C10538a;

public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: g */
    private static final int f47508g = C6531k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: h */
    private static final int[][] f47509h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    private ColorStateList f47510e;

    /* renamed from: f */
    private boolean f47511f;

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.f26600g);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f47510e == null) {
            int[][] iArr = f47509h;
            int[] iArr2 = new int[iArr.length];
            int d = C10538a.m48270d(this, C6522b.f26601l);
            int d2 = C10538a.m48270d(this, C6522b.colorSurface);
            int d3 = C10538a.m48270d(this, C6522b.colorOnSurface);
            iArr2[0] = C10538a.m48273g(d2, d, 1.0f);
            iArr2[1] = C10538a.m48273g(d2, d3, 0.54f);
            iArr2[2] = C10538a.m48273g(d2, d3, 0.38f);
            iArr2[3] = C10538a.m48273g(d2, d3, 0.38f);
            this.f47510e = new ColorStateList(iArr, iArr2);
        }
        return this.f47510e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f47511f && C0616c.m3435b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f47511f = z;
        if (z) {
            C0616c.m3436c(this, getMaterialThemeColorsTintList());
        } else {
            C0616c.m3436c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f47508g
            android.content.Context r8 = p246q6.C10962a.m49296c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p194c6.C6532l.f26636C4
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            int r10 = p194c6.C6532l.f26647D4
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p233m6.C10805c.m48753a(r8, r9, r10)
            androidx.core.widget.C0616c.m3436c(r7, r8)
        L_0x0028:
            int r8 = p194c6.C6532l.f26658E4
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f47511f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
