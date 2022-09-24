package com.startapp;

import java.util.Arrays;

/* renamed from: com.startapp.u0 */
/* compiled from: Sta */
public abstract class C12353u0 {

    /* renamed from: a */
    public final int f54791a;

    /* renamed from: b */
    public final int f54792b;

    /* renamed from: c */
    public final int f54793c;

    /* renamed from: d */
    public final int f54794d;

    /* renamed from: com.startapp.u0$a */
    /* compiled from: Sta */
    public static class C12354a {

        /* renamed from: a */
        public int f54795a;

        /* renamed from: b */
        public byte[] f54796b;

        /* renamed from: c */
        public int f54797c;

        /* renamed from: d */
        public int f54798d;

        /* renamed from: e */
        public boolean f54799e;

        /* renamed from: f */
        public int f54800f;

        /* renamed from: g */
        public int f54801g;

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{C12354a.class.getSimpleName(), Arrays.toString(this.f54796b), Integer.valueOf(this.f54800f), Boolean.valueOf(this.f54799e), Integer.valueOf(this.f54795a), 0L, Integer.valueOf(this.f54801g), Integer.valueOf(this.f54797c), Integer.valueOf(this.f54798d)});
        }
    }

    public C12353u0(int i, int i2, int i3, int i4) {
        this.f54791a = i;
        this.f54792b = i2;
        this.f54793c = i3 > 0 && i4 > 0 ? (i3 / i2) * i2 : 0;
        this.f54794d = i4;
    }

    /* renamed from: a */
    public byte[] mo46645a(int i, C12354a aVar) {
        byte[] bArr = aVar.f54796b;
        if (bArr != null && bArr.length >= aVar.f54797c + i) {
            return bArr;
        }
        if (bArr == null) {
            aVar.f54796b = new byte[8192];
            aVar.f54797c = 0;
            aVar.f54798d = 0;
        } else {
            byte[] bArr2 = new byte[(bArr.length * 2)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.f54796b = bArr2;
        }
        return aVar.f54796b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:1:0x0003->B:12:0x001e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0021 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo46644a(byte[] r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 0
            r2 = 0
        L_0x0003:
            if (r2 >= r0) goto L_0x0022
            byte r3 = r8[r2]
            r4 = 61
            r5 = 1
            if (r4 == r3) goto L_0x0021
            if (r3 < 0) goto L_0x001a
            byte[] r4 = com.startapp.C12136q0.f54041k
            int r6 = r4.length
            if (r3 >= r6) goto L_0x001a
            byte r3 = r4[r3]
            r4 = -1
            if (r3 == r4) goto L_0x001a
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            if (r3 == 0) goto L_0x001e
            goto L_0x0021
        L_0x001e:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0021:
            return r5
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12353u0.mo46644a(byte[]):boolean");
    }
}
