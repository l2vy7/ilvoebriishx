package p333v8;

import java.util.Locale;

/* renamed from: v8.e */
/* compiled from: CookieOrigin */
public final class C12920e {

    /* renamed from: a */
    private final String f55617a;

    /* renamed from: b */
    private final int f55618b;

    /* renamed from: c */
    private final String f55619c;

    /* renamed from: d */
    private final boolean f55620d;

    public C12920e(String str, int i, String str2, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("Host of origin may not be null");
        } else if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Host of origin may not be blank");
        } else if (i < 0) {
            throw new IllegalArgumentException("Invalid port: " + i);
        } else if (str2 != null) {
            this.f55617a = str.toLowerCase(Locale.ENGLISH);
            this.f55618b = i;
            if (str2.trim().length() != 0) {
                this.f55619c = str2;
            } else {
                this.f55619c = "/";
            }
            this.f55620d = z;
        } else {
            throw new IllegalArgumentException("Path of origin may not be null.");
        }
    }

    /* renamed from: a */
    public String mo48092a() {
        return this.f55617a;
    }

    /* renamed from: b */
    public String mo48093b() {
        return this.f55619c;
    }

    /* renamed from: c */
    public int mo48094c() {
        return this.f55618b;
    }

    /* renamed from: d */
    public boolean mo48095d() {
        return this.f55620d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.f55620d) {
            sb.append("(secure)");
        }
        sb.append(this.f55617a);
        sb.append(':');
        sb.append(Integer.toString(this.f55618b));
        sb.append(this.f55619c);
        sb.append(']');
        return sb.toString();
    }
}
