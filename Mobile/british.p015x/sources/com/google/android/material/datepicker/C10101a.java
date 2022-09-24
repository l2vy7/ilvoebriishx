package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import p105l0.C5648h;
import p111m0.C5723u;
import p194c6.C6532l;
import p233m6.C10805c;
import p243p6.C10889h;
import p243p6.C10897m;

/* renamed from: com.google.android.material.datepicker.a */
/* compiled from: CalendarItemStyle */
final class C10101a {

    /* renamed from: a */
    private final Rect f47681a;

    /* renamed from: b */
    private final ColorStateList f47682b;

    /* renamed from: c */
    private final ColorStateList f47683c;

    /* renamed from: d */
    private final ColorStateList f47684d;

    /* renamed from: e */
    private final int f47685e;

    /* renamed from: f */
    private final C10897m f47686f;

    private C10101a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C10897m mVar, Rect rect) {
        C5648h.m24963b(rect.left);
        C5648h.m24963b(rect.top);
        C5648h.m24963b(rect.right);
        C5648h.m24963b(rect.bottom);
        this.f47681a = rect;
        this.f47682b = colorStateList2;
        this.f47683c = colorStateList;
        this.f47684d = colorStateList3;
        this.f47685e = i;
        this.f47686f = mVar;
    }

    /* renamed from: a */
    static C10101a m46522a(Context context, int i) {
        C5648h.m24962a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C6532l.f26970h4);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C6532l.f26981i4, 0), obtainStyledAttributes.getDimensionPixelOffset(C6532l.f27003k4, 0), obtainStyledAttributes.getDimensionPixelOffset(C6532l.f26992j4, 0), obtainStyledAttributes.getDimensionPixelOffset(C6532l.f27014l4, 0));
        ColorStateList a = C10805c.m48753a(context, obtainStyledAttributes, C6532l.f27025m4);
        ColorStateList a2 = C10805c.m48753a(context, obtainStyledAttributes, C6532l.f27080r4);
        ColorStateList a3 = C10805c.m48753a(context, obtainStyledAttributes, C6532l.f27058p4);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C6532l.f27069q4, 0);
        C10897m m = C10897m.m48993b(context, obtainStyledAttributes.getResourceId(C6532l.f27036n4, 0), obtainStyledAttributes.getResourceId(C6532l.f27047o4, 0)).mo43154m();
        obtainStyledAttributes.recycle();
        return new C10101a(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo40485b() {
        return this.f47681a.bottom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo40486c() {
        return this.f47681a.top;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo40487d(TextView textView) {
        C10889h hVar = new C10889h();
        C10889h hVar2 = new C10889h();
        hVar.setShapeAppearanceModel(this.f47686f);
        hVar2.setShapeAppearanceModel(this.f47686f);
        hVar.mo43091a0(this.f47683c);
        hVar.mo43106k0((float) this.f47685e, this.f47684d);
        textView.setTextColor(this.f47682b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f47682b.withAlpha(30), hVar, hVar2) : hVar;
        Rect rect = this.f47681a;
        C5723u.m25336r0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
