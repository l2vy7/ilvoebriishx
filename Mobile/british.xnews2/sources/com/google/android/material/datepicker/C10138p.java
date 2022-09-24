package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import com.ironsource.sdk.p288c.C11539d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p193c6.C6530j;

/* renamed from: com.google.android.material.datepicker.p */
/* compiled from: UtcDates */
class C10138p {

    /* renamed from: a */
    static AtomicReference<C10137o> f47792a = new AtomicReference<>();

    /* renamed from: a */
    static long m46645a(long j) {
        Calendar q = m46661q();
        q.setTimeInMillis(j);
        return m46650f(q).getTimeInMillis();
    }

    /* renamed from: b */
    private static int m46646b(String str, String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0) {
                        break;
                    } else if (i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) == '\'');
            }
            i2 += i;
        }
        return i2;
    }

    @TargetApi(24)
    /* renamed from: c */
    static DateFormat m46647c(Locale locale) {
        return m46649e("MMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: d */
    static DateFormat m46648d(Locale locale) {
        return m46649e("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: e */
    private static DateFormat m46649e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m46660p());
        return instanceForSkeleton;
    }

    /* renamed from: f */
    static Calendar m46650f(Calendar calendar) {
        Calendar r = m46662r(calendar);
        Calendar q = m46661q();
        q.set(r.get(1), r.get(2), r.get(5));
        return q;
    }

    /* renamed from: g */
    private static java.text.DateFormat m46651g(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m46658n());
        return dateInstance;
    }

    /* renamed from: h */
    static java.text.DateFormat m46652h(Locale locale) {
        return m46651g(0, locale);
    }

    /* renamed from: i */
    static java.text.DateFormat m46653i(Locale locale) {
        return m46651g(2, locale);
    }

    /* renamed from: j */
    static java.text.DateFormat m46654j(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m46653i(locale);
        simpleDateFormat.applyPattern(m46665u(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    /* renamed from: k */
    static SimpleDateFormat m46655k() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m46658n());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: l */
    static String m46656l(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll(C11539d.f51879a, resources.getString(C6530j.mtrl_picker_text_input_day_abbr)).replaceAll("M", resources.getString(C6530j.mtrl_picker_text_input_month_abbr)).replaceAll("y", resources.getString(C6530j.mtrl_picker_text_input_year_abbr));
    }

    /* renamed from: m */
    static C10137o m46657m() {
        C10137o oVar = f47792a.get();
        return oVar == null ? C10137o.m46642c() : oVar;
    }

    /* renamed from: n */
    private static TimeZone m46658n() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: o */
    static Calendar m46659o() {
        Calendar a = m46657m().mo40541a();
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        a.setTimeZone(m46658n());
        return a;
    }

    @TargetApi(24)
    /* renamed from: p */
    private static android.icu.util.TimeZone m46660p() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: q */
    static Calendar m46661q() {
        return m46662r((Calendar) null);
    }

    /* renamed from: r */
    static Calendar m46662r(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m46658n());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    /* renamed from: s */
    static DateFormat m46663s(Locale locale) {
        return m46649e("yMMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: t */
    static DateFormat m46664t(Locale locale) {
        return m46649e("yMMMEd", locale);
    }

    /* renamed from: u */
    private static String m46665u(String str) {
        int b = m46646b(str, "yY", 1, 0);
        if (b >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int b2 = m46646b(str, str2, 1, b);
        if (b2 < str.length()) {
            str2 = str2 + ",";
        }
        return str.replace(str.substring(m46646b(str, str2, -1, b) + 1, b2), " ").trim();
    }
}
