package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p105l0.C5644d;

/* renamed from: com.google.android.material.datepicker.d */
/* compiled from: DateStrings */
class C10106d {
    /* renamed from: a */
    static C5644d<String, String> m46533a(Long l, Long l2) {
        return m46534b(l, l2, (SimpleDateFormat) null);
    }

    /* renamed from: b */
    static C5644d<String, String> m46534b(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return C5644d.m24957a(null, null);
        }
        if (l == null) {
            return C5644d.m24957a(null, m46536d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return C5644d.m24957a(m46536d(l.longValue(), simpleDateFormat), null);
        }
        Calendar o = C10138p.m46659o();
        Calendar q = C10138p.m46661q();
        q.setTimeInMillis(l.longValue());
        Calendar q2 = C10138p.m46661q();
        q2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return C5644d.m24957a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (q.get(1) != q2.get(1)) {
            return C5644d.m24957a(m46543k(l.longValue(), Locale.getDefault()), m46543k(l2.longValue(), Locale.getDefault()));
        } else {
            if (q.get(1) == o.get(1)) {
                return C5644d.m24957a(m46538f(l.longValue(), Locale.getDefault()), m46538f(l2.longValue(), Locale.getDefault()));
            }
            return C5644d.m24957a(m46538f(l.longValue(), Locale.getDefault()), m46543k(l2.longValue(), Locale.getDefault()));
        }
    }

    /* renamed from: c */
    static String m46535c(long j) {
        return m46536d(j, (SimpleDateFormat) null);
    }

    /* renamed from: d */
    static String m46536d(long j, SimpleDateFormat simpleDateFormat) {
        Calendar o = C10138p.m46659o();
        Calendar q = C10138p.m46661q();
        q.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (o.get(1) == q.get(1)) {
            return m46537e(j);
        }
        return m46542j(j);
    }

    /* renamed from: e */
    static String m46537e(long j) {
        return m46538f(j, Locale.getDefault());
    }

    /* renamed from: f */
    static String m46538f(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C10138p.m46647c(locale).format(new Date(j));
        }
        return C10138p.m46654j(locale).format(new Date(j));
    }

    /* renamed from: g */
    static String m46539g(long j) {
        return m46540h(j, Locale.getDefault());
    }

    /* renamed from: h */
    static String m46540h(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C10138p.m46648d(locale).format(new Date(j));
        }
        return C10138p.m46652h(locale).format(new Date(j));
    }

    /* renamed from: i */
    static String m46541i(Context context, long j) {
        return DateUtils.formatDateTime(context, j - ((long) TimeZone.getDefault().getOffset(j)), 36);
    }

    /* renamed from: j */
    static String m46542j(long j) {
        return m46543k(j, Locale.getDefault());
    }

    /* renamed from: k */
    static String m46543k(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C10138p.m46663s(locale).format(new Date(j));
        }
        return C10138p.m46653i(locale).format(new Date(j));
    }

    /* renamed from: l */
    static String m46544l(long j) {
        return m46545m(j, Locale.getDefault());
    }

    /* renamed from: m */
    static String m46545m(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C10138p.m46664t(locale).format(new Date(j));
        }
        return C10138p.m46652h(locale).format(new Date(j));
    }
}
