package com.startapp;

import com.startapp.C12353u0;
import java.nio.charset.Charset;

/* renamed from: com.startapp.q0 */
/* compiled from: Sta */
public class C12136q0 extends C12353u0 {

    /* renamed from: h */
    public static final byte[] f54038h = {13, 10};

    /* renamed from: i */
    public static final byte[] f54039i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: j */
    public static final byte[] f54040j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: k */
    public static final byte[] f54041k = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: e */
    public final byte[] f54042e;

    /* renamed from: f */
    public final byte[] f54043f;

    /* renamed from: g */
    public final int f54044g;

    public C12136q0(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr.length);
        if (!mo46644a(bArr)) {
            if (i > 0) {
                this.f54044g = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.f54043f = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.f54044g = 4;
                this.f54043f = null;
            }
            this.f54042e = z ? f54040j : f54039i;
            return;
        }
        String a = C11943ha.m52399a(bArr);
        throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + a + "]");
    }

    /* renamed from: b */
    public static String m52764b(byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            C12136q0 q0Var = new C12136q0(0, f54038h, false);
            long length = ((long) (((bArr.length + 3) - 1) / 3)) * ((long) 4);
            int i = q0Var.f54793c;
            if (i > 0) {
                long j = (long) i;
                length += (((length + j) - 1) / j) * ((long) q0Var.f54794d);
            }
            if (length > ((long) Integer.MAX_VALUE)) {
                throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + length + ") than the specified maximum size of " + Integer.MAX_VALUE);
            } else if (bArr.length != 0) {
                C12353u0.C12354a aVar = new C12353u0.C12354a();
                q0Var.mo45690a(bArr, 0, bArr.length, aVar);
                q0Var.mo45690a(bArr, 0, -1, aVar);
                int i2 = aVar.f54797c - aVar.f54798d;
                byte[] bArr2 = new byte[i2];
                if (aVar.f54796b != null) {
                    int min = Math.min(i2, i2);
                    System.arraycopy(aVar.f54796b, aVar.f54798d, bArr2, 0, min);
                    int i3 = aVar.f54798d + min;
                    aVar.f54798d = i3;
                    if (i3 >= aVar.f54797c) {
                        aVar.f54796b = null;
                    }
                }
                bArr = bArr2;
            }
        }
        Charset charset = C12382v1.f54871a;
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45690a(byte[] r10, int r11, int r12, com.startapp.C12353u0.C12354a r13) {
        /*
            r9 = this;
            boolean r0 = r13.f54799e
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r12 >= 0) goto L_0x00b9
            r13.f54799e = r1
            int r10 = r13.f54801g
            if (r10 != 0) goto L_0x0014
            int r10 = r9.f54793c
            if (r10 != 0) goto L_0x0014
            return
        L_0x0014:
            int r10 = r9.f54044g
            byte[] r10 = r9.mo46645a(r10, r13)
            int r11 = r13.f54797c
            int r12 = r13.f54801g
            if (r12 == 0) goto L_0x009b
            r2 = 61
            if (r12 == r1) goto L_0x006f
            r1 = 2
            if (r12 != r1) goto L_0x005a
            int r12 = r11 + 1
            r13.f54797c = r12
            byte[] r3 = r9.f54042e
            int r4 = r13.f54795a
            int r5 = r4 >> 10
            r5 = r5 & 63
            byte r5 = r3[r5]
            r10[r11] = r5
            int r5 = r12 + 1
            r13.f54797c = r5
            int r6 = r4 >> 4
            r6 = r6 & 63
            byte r6 = r3[r6]
            r10[r12] = r6
            int r12 = r5 + 1
            r13.f54797c = r12
            int r1 = r4 << 2
            r1 = r1 & 63
            byte r1 = r3[r1]
            r10[r5] = r1
            byte[] r1 = f54039i
            if (r3 != r1) goto L_0x009b
            int r1 = r12 + 1
            r13.f54797c = r1
            r10[r12] = r2
            goto L_0x009b
        L_0x005a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Impossible modulus "
            java.lang.StringBuilder r11 = com.startapp.C12458z0.m53804a(r11)
            int r12 = r13.f54801g
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x006f:
            int r12 = r11 + 1
            r13.f54797c = r12
            byte[] r1 = r9.f54042e
            int r3 = r13.f54795a
            int r4 = r3 >> 2
            r4 = r4 & 63
            byte r4 = r1[r4]
            r10[r11] = r4
            int r4 = r12 + 1
            r13.f54797c = r4
            int r3 = r3 << 4
            r3 = r3 & 63
            byte r3 = r1[r3]
            r10[r12] = r3
            byte[] r12 = f54039i
            if (r1 != r12) goto L_0x009b
            int r12 = r4 + 1
            r13.f54797c = r12
            r10[r4] = r2
            int r1 = r12 + 1
            r13.f54797c = r1
            r10[r12] = r2
        L_0x009b:
            int r12 = r13.f54800f
            int r1 = r13.f54797c
            int r11 = r1 - r11
            int r11 = r11 + r12
            r13.f54800f = r11
            int r12 = r9.f54793c
            if (r12 <= 0) goto L_0x012c
            if (r11 <= 0) goto L_0x012c
            byte[] r11 = r9.f54043f
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r0, r10, r1, r12)
            int r10 = r13.f54797c
            byte[] r11 = r9.f54043f
            int r11 = r11.length
            int r10 = r10 + r11
            r13.f54797c = r10
            goto L_0x012c
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            if (r2 >= r12) goto L_0x012c
            int r3 = r9.f54044g
            byte[] r3 = r9.mo46645a(r3, r13)
            int r4 = r13.f54801g
            int r4 = r4 + r1
            int r4 = r4 % 3
            r13.f54801g = r4
            int r5 = r11 + 1
            byte r11 = r10[r11]
            if (r11 >= 0) goto L_0x00d1
            int r11 = r11 + 256
        L_0x00d1:
            int r6 = r13.f54795a
            int r6 = r6 << 8
            int r6 = r6 + r11
            r13.f54795a = r6
            if (r4 != 0) goto L_0x0128
            int r11 = r13.f54797c
            int r4 = r11 + 1
            r13.f54797c = r4
            byte[] r7 = r9.f54042e
            int r8 = r6 >> 18
            r8 = r8 & 63
            byte r8 = r7[r8]
            r3[r11] = r8
            int r11 = r4 + 1
            r13.f54797c = r11
            int r8 = r6 >> 12
            r8 = r8 & 63
            byte r8 = r7[r8]
            r3[r4] = r8
            int r4 = r11 + 1
            r13.f54797c = r4
            int r8 = r6 >> 6
            r8 = r8 & 63
            byte r8 = r7[r8]
            r3[r11] = r8
            int r11 = r4 + 1
            r13.f54797c = r11
            r6 = r6 & 63
            byte r6 = r7[r6]
            r3[r4] = r6
            int r4 = r13.f54800f
            int r4 = r4 + 4
            r13.f54800f = r4
            int r6 = r9.f54793c
            if (r6 <= 0) goto L_0x0128
            if (r6 > r4) goto L_0x0128
            byte[] r4 = r9.f54043f
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r0, r3, r11, r6)
            int r11 = r13.f54797c
            byte[] r3 = r9.f54043f
            int r3 = r3.length
            int r11 = r11 + r3
            r13.f54797c = r11
            r13.f54800f = r0
        L_0x0128:
            int r2 = r2 + 1
            r11 = r5
            goto L_0x00ba
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12136q0.mo45690a(byte[], int, int, com.startapp.u0$a):void");
    }
}
