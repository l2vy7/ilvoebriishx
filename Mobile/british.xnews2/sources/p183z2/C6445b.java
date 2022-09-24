package p183z2;

import java.security.MessageDigest;
import p004a3.C0065j;
import p064d2.C5159f;

/* renamed from: z2.b */
/* compiled from: ObjectKey */
public final class C6445b implements C5159f {

    /* renamed from: b */
    private final Object f26489b;

    public C6445b(Object obj) {
        this.f26489b = C0065j.m247d(obj);
    }

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        messageDigest.update(this.f26489b.toString().getBytes(C5159f.f22594a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6445b) {
            return this.f26489b.equals(((C6445b) obj).f26489b);
        }
        return false;
    }

    public int hashCode() {
        return this.f26489b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f26489b + '}';
    }
}
