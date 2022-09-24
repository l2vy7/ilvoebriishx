package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import p006a5.C6487i;
import p062d0.C5135a;
import p224k4.C10635a;
import p224k4.C10636b;
import p224k4.C10637c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    /* renamed from: b */
    private static final int m30093b(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo30177a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = C10636b.f49188b;
        int i5 = C10636b.f49189c;
        int b = m30093b(i2, i4, i5, i5);
        int i6 = C10636b.f49190d;
        int i7 = C10636b.f49191e;
        int b2 = m30093b(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            b = b2;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        Drawable r = C5135a.m23418r(resources.getDrawable(b));
        C5135a.m23415o(r, resources.getColorStateList(C10635a.f49186c));
        C5135a.m23416p(r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r);
        int i8 = C10635a.f49184a;
        int i9 = C10635a.f49185b;
        setTextColor((ColorStateList) C4604n.m20098k(resources.getColorStateList(m30093b(i2, i8, i9, i9))));
        if (i == 0) {
            setText(resources.getString(C10637c.f49207p));
        } else if (i == 1) {
            setText(resources.getString(C10637c.f49208q));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Unknown button size: ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod((TransformationMethod) null);
        if (C6487i.m28267e(getContext())) {
            setGravity(19);
        }
    }
}
