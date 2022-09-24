package p090i0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: i0.f */
/* compiled from: LocaleListCompat */
public final class C5428f {

    /* renamed from: b */
    private static final C5428f f23776b = m24380a(new Locale[0]);

    /* renamed from: a */
    private C5430h f23777a;

    private C5428f(C5430h hVar) {
        this.f23777a = hVar;
    }

    /* renamed from: a */
    public static C5428f m24380a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m24382d(new LocaleList(localeArr));
        }
        return new C5428f(new C5429g(localeArr));
    }

    /* renamed from: b */
    static Locale m24381b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: d */
    public static C5428f m24382d(LocaleList localeList) {
        return new C5428f(new C5431i(localeList));
    }

    /* renamed from: c */
    public Locale mo21877c(int i) {
        return this.f23777a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5428f) && this.f23777a.equals(((C5428f) obj).f23777a);
    }

    public int hashCode() {
        return this.f23777a.hashCode();
    }

    public String toString() {
        return this.f23777a.toString();
    }
}
