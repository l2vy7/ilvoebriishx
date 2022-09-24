package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.o */
/* compiled from: TimeSource */
class C10137o {

    /* renamed from: c */
    private static final C10137o f47789c = new C10137o((Long) null, (TimeZone) null);

    /* renamed from: a */
    private final Long f47790a;

    /* renamed from: b */
    private final TimeZone f47791b;

    private C10137o(Long l, TimeZone timeZone) {
        this.f47790a = l;
        this.f47791b = timeZone;
    }

    /* renamed from: c */
    static C10137o m46642c() {
        return f47789c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar mo40541a() {
        return mo40542b(this.f47791b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Calendar mo40542b(TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f47790a;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        return instance;
    }
}
