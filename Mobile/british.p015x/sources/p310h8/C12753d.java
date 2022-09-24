package p310h8;

import java.util.Locale;
import p317k9.C12825f;

/* renamed from: h8.d */
/* compiled from: AuthScope */
public class C12753d {

    /* renamed from: e */
    public static final String f55412e = null;

    /* renamed from: f */
    public static final String f55413f = null;

    /* renamed from: g */
    public static final String f55414g = null;

    /* renamed from: h */
    public static final C12753d f55415h = new C12753d((String) null, -1, (String) null, (String) null);

    /* renamed from: a */
    private final String f55416a;

    /* renamed from: b */
    private final String f55417b;

    /* renamed from: c */
    private final String f55418c;

    /* renamed from: d */
    private final int f55419d;

    public C12753d(String str, int i, String str2, String str3) {
        this.f55418c = str == null ? f55412e : str.toLowerCase(Locale.ENGLISH);
        this.f55419d = i < 0 ? -1 : i;
        this.f55417b = str2 == null ? f55413f : str2;
        this.f55416a = str3 == null ? f55414g : str3.toUpperCase(Locale.ENGLISH);
    }

    /* renamed from: a */
    public int mo47824a(C12753d dVar) {
        int i;
        if (C12825f.m54377a(this.f55416a, dVar.f55416a)) {
            i = 1;
        } else {
            String str = this.f55416a;
            String str2 = f55414g;
            if (str != str2 && dVar.f55416a != str2) {
                return -1;
            }
            i = 0;
        }
        if (C12825f.m54377a(this.f55417b, dVar.f55417b)) {
            i += 2;
        } else {
            String str3 = this.f55417b;
            String str4 = f55413f;
            if (!(str3 == str4 || dVar.f55417b == str4)) {
                return -1;
            }
        }
        int i2 = this.f55419d;
        int i3 = dVar.f55419d;
        if (i2 == i3) {
            i += 4;
        } else if (!(i2 == -1 || i3 == -1)) {
            return -1;
        }
        if (C12825f.m54377a(this.f55418c, dVar.f55418c)) {
            return i + 8;
        }
        String str5 = this.f55418c;
        String str6 = f55412e;
        if (str5 == str6 || dVar.f55418c == str6) {
            return i;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12753d)) {
            return super.equals(obj);
        }
        C12753d dVar = (C12753d) obj;
        if (!C12825f.m54377a(this.f55418c, dVar.f55418c) || this.f55419d != dVar.f55419d || !C12825f.m54377a(this.f55417b, dVar.f55417b) || !C12825f.m54377a(this.f55416a, dVar.f55416a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C12825f.m54380d(C12825f.m54380d(C12825f.m54379c(C12825f.m54380d(17, this.f55418c), this.f55419d), this.f55417b), this.f55416a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f55416a;
        if (str != null) {
            sb.append(str.toUpperCase(Locale.ENGLISH));
            sb.append(' ');
        }
        if (this.f55417b != null) {
            sb.append('\'');
            sb.append(this.f55417b);
            sb.append('\'');
        } else {
            sb.append("<any realm>");
        }
        if (this.f55418c != null) {
            sb.append('@');
            sb.append(this.f55418c);
            if (this.f55419d >= 0) {
                sb.append(':');
                sb.append(this.f55419d);
            }
        }
        return sb.toString();
    }
}
