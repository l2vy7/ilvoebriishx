package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p193c6.C6522b;
import p193c6.C6532l;
import p232m6.C10804b;
import p232m6.C10805c;

/* renamed from: com.google.android.material.datepicker.b */
/* compiled from: CalendarStyle */
final class C10102b {

    /* renamed from: a */
    final C10101a f47687a;

    /* renamed from: b */
    final C10101a f47688b;

    /* renamed from: c */
    final C10101a f47689c;

    /* renamed from: d */
    final C10101a f47690d;

    /* renamed from: e */
    final C10101a f47691e;

    /* renamed from: f */
    final C10101a f47692f;

    /* renamed from: g */
    final C10101a f47693g;

    /* renamed from: h */
    final Paint f47694h;

    C10102b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C10804b.m48751c(context, C6522b.materialCalendarStyle, C10108f.class.getCanonicalName()), C6532l.f26872Y3);
        this.f47687a = C10101a.m46522a(context, obtainStyledAttributes.getResourceId(C6532l.f26904b4, 0));
        this.f47693g = C10101a.m46522a(context, obtainStyledAttributes.getResourceId(C6532l.f26882Z3, 0));
        this.f47688b = C10101a.m46522a(context, obtainStyledAttributes.getResourceId(C6532l.f26893a4, 0));
        this.f47689c = C10101a.m46522a(context, obtainStyledAttributes.getResourceId(C6532l.f26915c4, 0));
        ColorStateList a = C10805c.m48753a(context, obtainStyledAttributes, C6532l.f26926d4);
        this.f47690d = C10101a.m46522a(context, obtainStyledAttributes.getResourceId(C6532l.f26948f4, 0));
        this.f47691e = C10101a.m46522a(context, obtainStyledAttributes.getResourceId(C6532l.f26937e4, 0));
        this.f47692f = C10101a.m46522a(context, obtainStyledAttributes.getResourceId(C6532l.f26959g4, 0));
        Paint paint = new Paint();
        this.f47694h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
