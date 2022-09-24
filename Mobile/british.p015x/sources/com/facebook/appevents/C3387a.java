package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.C3642m;
import com.facebook.internal.C3481f0;
import java.io.Serializable;

/* renamed from: com.facebook.appevents.a */
/* compiled from: AccessTokenAppIdPair */
class C3387a implements Serializable {

    /* renamed from: b */
    private final String f12813b;

    /* renamed from: c */
    private final String f12814c;

    /* renamed from: com.facebook.appevents.a$b */
    /* compiled from: AccessTokenAppIdPair */
    static class C3389b implements Serializable {

        /* renamed from: b */
        private final String f12815b;

        /* renamed from: c */
        private final String f12816c;

        private Object readResolve() {
            return new C3387a(this.f12815b, this.f12816c);
        }

        private C3389b(String str, String str2) {
            this.f12815b = str;
            this.f12816c = str2;
        }
    }

    public C3387a(AccessToken accessToken) {
        this(accessToken.mo11191r(), C3642m.m12280f());
    }

    private Object writeReplace() {
        return new C3389b(this.f12813b, this.f12814c);
    }

    /* renamed from: a */
    public String mo11807a() {
        return this.f12813b;
    }

    /* renamed from: b */
    public String mo11808b() {
        return this.f12814c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3387a)) {
            return false;
        }
        C3387a aVar = (C3387a) obj;
        if (!C3481f0.m11618b(aVar.f12813b, this.f12813b) || !C3481f0.m11618b(aVar.f12814c, this.f12814c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f12813b;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f12814c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public C3387a(String str, String str2) {
        this.f12813b = C3481f0.m11604O(str) ? null : str;
        this.f12814c = str2;
    }
}
