package p182z0;

import android.text.TextUtils;
import p105l0.C5643c;

/* renamed from: z0.e */
/* compiled from: MediaSessionManagerImplBase */
class C6428e implements C6426c {

    /* renamed from: a */
    private String f26460a;

    /* renamed from: b */
    private int f26461b;

    /* renamed from: c */
    private int f26462c;

    C6428e(String str, int i, int i2) {
        this.f26460a = str;
        this.f26461b = i;
        this.f26462c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6428e)) {
            return false;
        }
        C6428e eVar = (C6428e) obj;
        if (this.f26461b < 0 || eVar.f26461b < 0) {
            if (!TextUtils.equals(this.f26460a, eVar.f26460a) || this.f26462c != eVar.f26462c) {
                return false;
            }
            return true;
        } else if (TextUtils.equals(this.f26460a, eVar.f26460a) && this.f26461b == eVar.f26461b && this.f26462c == eVar.f26462c) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return C5643c.m24955b(this.f26460a, Integer.valueOf(this.f26462c));
    }
}
