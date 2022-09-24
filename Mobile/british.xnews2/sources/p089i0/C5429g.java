package p089i0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: i0.g */
/* compiled from: LocaleListCompatWrapper */
final class C5429g implements C5430h {

    /* renamed from: c */
    private static final Locale[] f23778c = new Locale[0];

    /* renamed from: d */
    private static final Locale f23779d = new Locale("en", "XA");

    /* renamed from: e */
    private static final Locale f23780e = new Locale("ar", "XB");

    /* renamed from: f */
    private static final Locale f23781f = C5428f.m24381b("en-Latn");

    /* renamed from: a */
    private final Locale[] f23782a;

    /* renamed from: b */
    private final String f23783b;

    C5429g(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f23782a = f23778c;
            this.f23783b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m24384b(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i++;
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f23782a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
        this.f23783b = sb.toString();
    }

    /* renamed from: b */
    static void m24384b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    /* renamed from: a */
    public Object mo21881a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5429g)) {
            return false;
        }
        Locale[] localeArr = ((C5429g) obj).f23782a;
        if (this.f23782a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f23782a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f23782a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f23782a;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f23782a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f23782a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
