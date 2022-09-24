package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bie */
/* compiled from: IMASDK */
final class bie implements bfj {

    /* renamed from: a */
    final /* synthetic */ Class f16365a;

    /* renamed from: b */
    final /* synthetic */ Class f16366b;

    /* renamed from: c */
    final /* synthetic */ bfi f16367c;

    /* renamed from: d */
    private final /* synthetic */ int f16368d = 0;

    bie(Class cls, Class cls2, bfi bfi) {
        this.f16365a = cls;
        this.f16366b = cls2;
        this.f16367c = bfi;
    }

    bie(Class cls, Class cls2, bfi bfi, byte[] bArr) {
        this.f16366b = cls;
        this.f16365a = cls2;
        this.f16367c = bfi;
    }

    /* renamed from: a */
    public final bfi mo14244a(bet bet, biu biu) {
        if (this.f16368d != 0) {
            Class a = biu.mo15133a();
            if (a == this.f16366b || a == this.f16365a) {
                return this.f16367c;
            }
            return null;
        }
        Class a2 = biu.mo15133a();
        if (a2 == this.f16365a || a2 == this.f16366b) {
            return this.f16367c;
        }
        return null;
    }

    public final String toString() {
        if (this.f16368d != 0) {
            String name = this.f16365a.getName();
            String name2 = this.f16366b.getName();
            String valueOf = String.valueOf(this.f16367c);
            int length = name.length();
            StringBuilder sb = new StringBuilder(length + 24 + name2.length() + valueOf.length());
            sb.append("Factory[type=");
            sb.append(name);
            sb.append("+");
            sb.append(name2);
            sb.append(",adapter=");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        String name3 = this.f16365a.getName();
        String name4 = this.f16366b.getName();
        String valueOf2 = String.valueOf(this.f16367c);
        int length2 = name3.length();
        StringBuilder sb2 = new StringBuilder(length2 + 24 + name4.length() + valueOf2.length());
        sb2.append("Factory[type=");
        sb2.append(name3);
        sb2.append("+");
        sb2.append(name4);
        sb2.append(",adapter=");
        sb2.append(valueOf2);
        sb2.append("]");
        return sb2.toString();
    }
}
