package p089i0;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: i0.i */
/* compiled from: LocaleListPlatformWrapper */
final class C5431i implements C5430h {

    /* renamed from: a */
    private final LocaleList f23784a;

    C5431i(LocaleList localeList) {
        this.f23784a = localeList;
    }

    /* renamed from: a */
    public Object mo21881a() {
        return this.f23784a;
    }

    public boolean equals(Object obj) {
        return this.f23784a.equals(((C5430h) obj).mo21881a());
    }

    public Locale get(int i) {
        return this.f23784a.get(i);
    }

    public int hashCode() {
        return this.f23784a.hashCode();
    }

    public String toString() {
        return this.f23784a.toString();
    }
}
