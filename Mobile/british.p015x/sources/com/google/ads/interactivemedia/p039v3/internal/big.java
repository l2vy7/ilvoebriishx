package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.big */
/* compiled from: IMASDK */
final class big implements bfj {

    /* renamed from: a */
    final /* synthetic */ Class f16371a;

    /* renamed from: b */
    final /* synthetic */ bfi f16372b;

    /* renamed from: c */
    private final /* synthetic */ int f16373c = 0;

    big(Class cls, bfi bfi) {
        this.f16371a = cls;
        this.f16372b = bfi;
    }

    big(Class cls, bfi bfi, byte[] bArr) {
        this.f16371a = cls;
        this.f16372b = bfi;
    }

    /* renamed from: a */
    public final bfi mo14244a(bet bet, biu biu) {
        if (this.f16373c == 0) {
            Class a = biu.mo15133a();
            if (!this.f16371a.isAssignableFrom(a)) {
                return null;
            }
            return new bif(this, a);
        } else if (biu.mo15133a() == this.f16371a) {
            return this.f16372b;
        } else {
            return null;
        }
    }

    public final String toString() {
        if (this.f16373c != 0) {
            String name = this.f16371a.getName();
            String valueOf = String.valueOf(this.f16372b);
            StringBuilder sb = new StringBuilder(name.length() + 23 + valueOf.length());
            sb.append("Factory[type=");
            sb.append(name);
            sb.append(",adapter=");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        String name2 = this.f16371a.getName();
        String valueOf2 = String.valueOf(this.f16372b);
        StringBuilder sb2 = new StringBuilder(name2.length() + 32 + valueOf2.length());
        sb2.append("Factory[typeHierarchy=");
        sb2.append(name2);
        sb2.append(",adapter=");
        sb2.append(valueOf2);
        sb2.append("]");
        return sb2.toString();
    }
}
