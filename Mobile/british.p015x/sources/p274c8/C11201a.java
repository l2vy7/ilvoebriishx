package p274c8;

import p304e8.C12691c;

/* renamed from: c8.a */
/* compiled from: KotlinVersion.kt */
public final class C11201a implements Comparable<C11201a> {

    /* renamed from: f */
    public static final C11201a f50298f = C11203b.m49982a();

    /* renamed from: g */
    public static final C11202a f50299g = new C11202a((C12690b) null);

    /* renamed from: b */
    private final int f50300b;

    /* renamed from: c */
    private final int f50301c;

    /* renamed from: d */
    private final int f50302d;

    /* renamed from: e */
    private final int f50303e;

    /* renamed from: c8.a$a */
    /* compiled from: KotlinVersion.kt */
    public static final class C11202a {
        private C11202a() {
        }

        public /* synthetic */ C11202a(C12690b bVar) {
            this();
        }
    }

    public C11201a(int i, int i2, int i3) {
        this.f50301c = i;
        this.f50302d = i2;
        this.f50303e = i3;
        this.f50300b = m49980b(i, i2, i3);
    }

    /* renamed from: b */
    private final int m49980b(int i, int i2, int i3) {
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    /* renamed from: a */
    public int compareTo(C11201a aVar) {
        C12691c.m53984c(aVar, "other");
        return this.f50300b - aVar.f50300b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11201a)) {
            obj = null;
        }
        C11201a aVar = (C11201a) obj;
        if (aVar == null || this.f50300b != aVar.f50300b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f50300b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f50301c);
        sb.append('.');
        sb.append(this.f50302d);
        sb.append('.');
        sb.append(this.f50303e);
        return sb.toString();
    }
}
