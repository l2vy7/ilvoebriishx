package p159u3;

import android.content.Context;
import java.util.Objects;
import p021c4.C2657a;

/* renamed from: u3.c */
/* compiled from: AutoValue_CreationContext */
final class C6194c extends C6201h {

    /* renamed from: a */
    private final Context f25547a;

    /* renamed from: b */
    private final C2657a f25548b;

    /* renamed from: c */
    private final C2657a f25549c;

    /* renamed from: d */
    private final String f25550d;

    C6194c(Context context, C2657a aVar, C2657a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f25547a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f25548b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f25549c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f25550d = str;
    }

    /* renamed from: b */
    public Context mo23624b() {
        return this.f25547a;
    }

    /* renamed from: c */
    public String mo23625c() {
        return this.f25550d;
    }

    /* renamed from: d */
    public C2657a mo23626d() {
        return this.f25549c;
    }

    /* renamed from: e */
    public C2657a mo23627e() {
        return this.f25548b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6201h)) {
            return false;
        }
        C6201h hVar = (C6201h) obj;
        if (!this.f25547a.equals(hVar.mo23624b()) || !this.f25548b.equals(hVar.mo23627e()) || !this.f25549c.equals(hVar.mo23626d()) || !this.f25550d.equals(hVar.mo23625c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f25547a.hashCode() ^ 1000003) * 1000003) ^ this.f25548b.hashCode()) * 1000003) ^ this.f25549c.hashCode()) * 1000003) ^ this.f25550d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f25547a + ", wallClock=" + this.f25548b + ", monotonicClock=" + this.f25549c + ", backendName=" + this.f25550d + "}";
    }
}
