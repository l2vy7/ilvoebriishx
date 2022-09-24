package com.google.android.gms.internal.ads;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z63<E> extends i63<E> {
    @CheckForNull

    /* renamed from: d */
    Object[] f21037d;

    /* renamed from: e */
    private int f21038e;

    z63(int i) {
        super(i);
        this.f21037d = new Object[a73.m20181r(i)];
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ j63 mo19050a(Object obj) {
        mo19051f(obj);
        return this;
    }

    /* renamed from: f */
    public final z63<E> mo19051f(E e) {
        int length;
        Objects.requireNonNull(e);
        if (this.f21037d == null || a73.m20181r(this.f33111b) > (length = this.f21037d.length)) {
            this.f21037d = null;
            super.mo32563c(e);
            return this;
        }
        int i = length - 1;
        int hashCode = e.hashCode();
        int a = h63.m20518a(hashCode);
        while (true) {
            int i2 = a & i;
            Object[] objArr = this.f21037d;
            Object obj = objArr[i2];
            if (obj != null) {
                if (obj.equals(e)) {
                    break;
                }
                a = i2 + 1;
            } else {
                objArr[i2] = e;
                this.f21038e += hashCode;
                super.mo32563c(e);
                break;
            }
        }
        return this;
    }

    /* renamed from: g */
    public final z63<E> mo19052g(Iterable<? extends E> iterable) {
        if (this.f21037d != null) {
            for (Object f : iterable) {
                mo19051f(f);
            }
        } else {
            super.mo32564d(iterable);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.gms.internal.ads.k83} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.a73} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.gms.internal.ads.k83} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.ads.k83} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.a73<E> mo19053h() {
        /*
            r8 = this;
            int r0 = r8.f33111b
            if (r0 == 0) goto L_0x005d
            r1 = 1
            if (r0 == r1) goto L_0x004f
            java.lang.Object[] r2 = r8.f21037d
            if (r2 == 0) goto L_0x003b
            int r0 = com.google.android.gms.internal.ads.a73.m20181r(r0)
            java.lang.Object[] r2 = r8.f21037d
            int r2 = r2.length
            if (r0 != r2) goto L_0x003b
            int r0 = r8.f33111b
            java.lang.Object[] r2 = r8.f33110a
            int r2 = r2.length
            boolean r0 = com.google.android.gms.internal.ads.a73.m20180E(r0, r2)
            if (r0 == 0) goto L_0x0028
            java.lang.Object[] r0 = r8.f33110a
            int r2 = r8.f33111b
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            goto L_0x002a
        L_0x0028:
            java.lang.Object[] r0 = r8.f33110a
        L_0x002a:
            r3 = r0
            com.google.android.gms.internal.ads.k83 r0 = new com.google.android.gms.internal.ads.k83
            int r4 = r8.f21038e
            java.lang.Object[] r5 = r8.f21037d
            int r2 = r5.length
            int r6 = r2 + -1
            int r7 = r8.f33111b
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0049
        L_0x003b:
            int r0 = r8.f33111b
            java.lang.Object[] r2 = r8.f33110a
            com.google.android.gms.internal.ads.a73 r0 = com.google.android.gms.internal.ads.a73.m20179D(r0, r2)
            int r2 = r0.size()
            r8.f33111b = r2
        L_0x0049:
            r8.f33112c = r1
            r1 = 0
            r8.f21037d = r1
            return r0
        L_0x004f:
            java.lang.Object[] r0 = r8.f33110a
            r1 = 0
            r0 = r0[r1]
            r0.getClass()
            com.google.android.gms.internal.ads.p83 r1 = new com.google.android.gms.internal.ads.p83
            r1.<init>(r0)
            return r1
        L_0x005d:
            com.google.android.gms.internal.ads.k83<java.lang.Object> r0 = com.google.android.gms.internal.ads.k83.f20475j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z63.mo19053h():com.google.android.gms.internal.ads.a73");
    }
}
