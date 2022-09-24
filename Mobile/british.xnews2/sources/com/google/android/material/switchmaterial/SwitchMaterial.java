package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.C10227s;
import p193c6.C6522b;
import p193c6.C6524d;
import p193c6.C6531k;
import p207f6.C10538a;
import p218i6.C10604a;

public class SwitchMaterial extends SwitchCompat {

    /* renamed from: U */
    private static final int f48418U = C6531k.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: V */
    private static final int[][] f48419V = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: Q */
    private final C10604a f48420Q;

    /* renamed from: R */
    private ColorStateList f48421R;

    /* renamed from: S */
    private ColorStateList f48422S;

    /* renamed from: T */
    private boolean f48423T;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.f26596R);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f48421R == null) {
            int d = C10538a.m48270d(this, C6522b.colorSurface);
            int d2 = C10538a.m48270d(this, C6522b.f26601l);
            float dimension = getResources().getDimension(C6524d.mtrl_switch_thumb_elevation);
            if (this.f48420Q.mo42717e()) {
                dimension += C10227s.m47139g(this);
            }
            int c = this.f48420Q.mo42715c(d, dimension);
            int[][] iArr = f48419V;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C10538a.m48273g(d, d2, 1.0f);
            iArr2[1] = c;
            iArr2[2] = C10538a.m48273g(d, d2, 0.38f);
            iArr2[3] = c;
            this.f48421R = new ColorStateList(iArr, iArr2);
        }
        return this.f48421R;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f48422S == null) {
            int[][] iArr = f48419V;
            int[] iArr2 = new int[iArr.length];
            int d = C10538a.m48270d(this, C6522b.colorSurface);
            int d2 = C10538a.m48270d(this, C6522b.f26601l);
            int d3 = C10538a.m48270d(this, C6522b.colorOnSurface);
            iArr2[0] = C10538a.m48273g(d, d2, 0.54f);
            iArr2[1] = C10538a.m48273g(d, d3, 0.32f);
            iArr2[2] = C10538a.m48273g(d, d2, 0.12f);
            iArr2[3] = C10538a.m48273g(d, d3, 0.12f);
            this.f48422S = new ColorStateList(iArr, iArr2);
        }
        return this.f48422S;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f48423T && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f48423T && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f48423T = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList((ColorStateList) null);
        setTrackTintList((ColorStateList) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f48418U
            android.content.Context r7 = p245q6.C10962a.m49296c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            i6.a r7 = new i6.a
            r7.<init>(r0)
            r6.f48420Q = r7
            int[] r2 = p193c6.C6532l.f27072q7
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            int r9 = p193c6.C6532l.f27083r7
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f48423T = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
