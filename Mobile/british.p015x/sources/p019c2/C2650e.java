package p019c2;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p019c2.C2645a;

/* renamed from: c2.e */
/* compiled from: StandardGifDecoder */
public class C2650e implements C2645a {

    /* renamed from: u */
    private static final String f10433u = "e";

    /* renamed from: a */
    private int[] f10434a;

    /* renamed from: b */
    private final int[] f10435b;

    /* renamed from: c */
    private final C2645a.C2646a f10436c;

    /* renamed from: d */
    private ByteBuffer f10437d;

    /* renamed from: e */
    private byte[] f10438e;

    /* renamed from: f */
    private short[] f10439f;

    /* renamed from: g */
    private byte[] f10440g;

    /* renamed from: h */
    private byte[] f10441h;

    /* renamed from: i */
    private byte[] f10442i;

    /* renamed from: j */
    private int[] f10443j;

    /* renamed from: k */
    private int f10444k;

    /* renamed from: l */
    private C2648c f10445l;

    /* renamed from: m */
    private Bitmap f10446m;

    /* renamed from: n */
    private boolean f10447n;

    /* renamed from: o */
    private int f10448o;

    /* renamed from: p */
    private int f10449p;

    /* renamed from: q */
    private int f10450q;

    /* renamed from: r */
    private int f10451r;

    /* renamed from: s */
    private Boolean f10452s;

    /* renamed from: t */
    private Bitmap.Config f10453t;

    public C2650e(C2645a.C2646a aVar, C2648c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo9329q(cVar, byteBuffer, i);
    }

    /* renamed from: i */
    private int m9267i(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f10449p + i; i9++) {
            byte[] bArr = this.f10442i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f10434a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f10449p + i11; i12++) {
            byte[] bArr2 = this.f10442i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f10434a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: j */
    private void m9268j(C2647b bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C2647b bVar2 = bVar;
        int[] iArr = this.f10443j;
        int i6 = bVar2.f10408d;
        int i7 = this.f10449p;
        int i8 = i6 / i7;
        int i9 = bVar2.f10406b / i7;
        int i10 = bVar2.f10407c / i7;
        int i11 = bVar2.f10405a / i7;
        boolean z2 = this.f10444k == 0;
        int i12 = this.f10451r;
        int i13 = this.f10450q;
        byte[] bArr = this.f10442i;
        int[] iArr2 = this.f10434a;
        Boolean bool = this.f10452s;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i15 < i8) {
            Boolean bool2 = bool;
            if (bVar2.f10409e) {
                if (i16 >= i8) {
                    i = i8;
                    int i18 = i17 + 1;
                    if (i18 == 2) {
                        i17 = i18;
                        i16 = 4;
                    } else if (i18 == 3) {
                        i17 = i18;
                        i16 = 2;
                        i14 = 4;
                    } else if (i18 != 4) {
                        i17 = i18;
                    } else {
                        i17 = i18;
                        i16 = 1;
                        i14 = 2;
                    }
                } else {
                    i = i8;
                }
                i2 = i16 + i14;
            } else {
                i = i8;
                i2 = i16;
                i16 = i15;
            }
            int i19 = i16 + i9;
            boolean z3 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i15 * i7 * bVar2.f10407c;
                if (z3) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 >= i22) {
                            break;
                        }
                        int i30 = m9267i(i24, i28, bVar2.f10407c);
                        if (i30 != 0) {
                            iArr[i29] = i30;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i29++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i15++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i16 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i15++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i16 = i3;
        }
        Boolean bool3 = bool;
        if (this.f10452s == null) {
            if (bool3 == null) {
                z = false;
            } else {
                z = bool3.booleanValue();
            }
            this.f10452s = Boolean.valueOf(z);
        }
    }

    /* renamed from: k */
    private void m9269k(C2647b bVar) {
        C2647b bVar2 = bVar;
        int[] iArr = this.f10443j;
        int i = bVar2.f10408d;
        int i2 = bVar2.f10406b;
        int i3 = bVar2.f10407c;
        int i4 = bVar2.f10405a;
        boolean z = this.f10444k == 0;
        int i5 = this.f10451r;
        byte[] bArr = this.f10442i;
        int[] iArr2 = this.f10434a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f10407c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                C2647b bVar3 = bVar;
                i = i13;
            }
            int i15 = i;
            i6++;
            bVar2 = bVar;
        }
        Boolean bool = this.f10452s;
        this.f10452s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f10452s == null && z && b != -1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9270l(p019c2.C2647b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f10437d
            int r3 = r1.f10414j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            c2.c r1 = r0.f10445l
            int r2 = r1.f10421f
            int r1 = r1.f10422g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f10407c
            int r1 = r1.f10408d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f10442i
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            c2.a$a r1 = r0.f10436c
            byte[] r1 = r1.mo9319e(r2)
            r0.f10442i = r1
        L_0x002b:
            byte[] r1 = r0.f10442i
            short[] r3 = r0.f10439f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f10439f = r3
        L_0x0037:
            short[] r3 = r0.f10439f
            byte[] r5 = r0.f10440g
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f10440g = r5
        L_0x0041:
            byte[] r5 = r0.f10440g
            byte[] r6 = r0.f10441h
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f10441h = r6
        L_0x004d:
            byte[] r6 = r0.f10441h
            int r7 = r28.m9273p()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f10438e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = -1
            r25 = 0
            r26 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x014c
            if (r16 != 0) goto L_0x0094
            int r16 = r28.m9272o()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.f10448o = r3
            goto L_0x014c
        L_0x0092:
            r17 = 0
        L_0x0094:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ae:
            if (r4 < r15) goto L_0x0136
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c2
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ae
        L_0x00c2:
            if (r11 != r10) goto L_0x00d9
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0083
        L_0x00d9:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ed
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ae
        L_0x00ed:
            if (r11 < r8) goto L_0x00f6
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f7
        L_0x00f6:
            r7 = r11
        L_0x00f7:
            if (r7 < r9) goto L_0x0102
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f7
        L_0x0102:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0109:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0116
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0109
        L_0x0116:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012d
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012d
            if (r8 >= r6) goto L_0x012d
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012d:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ae
        L_0x0136:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0083
        L_0x014c:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p019c2.C2650e.m9270l(c2.b):void");
    }

    /* renamed from: n */
    private Bitmap m9271n() {
        Boolean bool = this.f10452s;
        Bitmap a = this.f10436c.mo9315a(this.f10451r, this.f10450q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f10453t);
        a.setHasAlpha(true);
        return a;
    }

    /* renamed from: o */
    private int m9272o() {
        int p = m9273p();
        if (p <= 0) {
            return p;
        }
        ByteBuffer byteBuffer = this.f10437d;
        byteBuffer.get(this.f10438e, 0, Math.min(p, byteBuffer.remaining()));
        return p;
    }

    /* renamed from: p */
    private int m9273p() {
        return this.f10437d.get() & 255;
    }

    /* renamed from: r */
    private Bitmap m9274r(C2647b bVar, C2647b bVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f10443j;
        int i3 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f10446m;
            if (bitmap2 != null) {
                this.f10436c.mo9317c(bitmap2);
            }
            this.f10446m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f10411g == 3 && this.f10446m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i2 = bVar2.f10411g) > 0) {
            if (i2 == 2) {
                if (!bVar.f10410f) {
                    C2648c cVar = this.f10445l;
                    int i4 = cVar.f10427l;
                    if (bVar.f10415k == null || cVar.f10425j != bVar.f10412h) {
                        i3 = i4;
                    }
                }
                int i5 = bVar2.f10408d;
                int i6 = this.f10449p;
                int i7 = i5 / i6;
                int i8 = bVar2.f10406b / i6;
                int i9 = bVar2.f10407c / i6;
                int i10 = bVar2.f10405a / i6;
                int i11 = this.f10451r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f10451r;
                }
            } else if (i2 == 3 && (bitmap = this.f10446m) != null) {
                int i16 = this.f10451r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f10450q);
            }
        }
        m9270l(bVar);
        if (bVar.f10409e || this.f10449p != 1) {
            m9268j(bVar);
        } else {
            m9269k(bVar);
        }
        if (this.f10447n && ((i = bVar.f10411g) == 0 || i == 1)) {
            if (this.f10446m == null) {
                this.f10446m = m9271n();
            }
            Bitmap bitmap3 = this.f10446m;
            int i17 = this.f10451r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f10450q);
        }
        Bitmap n = m9271n();
        int i18 = this.f10451r;
        n.setPixels(iArr, 0, i18, 0, 0, i18, this.f10450q);
        return n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo9305a() {
        /*
            r8 = this;
            monitor-enter(r8)
            c2.c r0 = r8.f10445l     // Catch:{ all -> 0x00e4 }
            int r0 = r0.f10418c     // Catch:{ all -> 0x00e4 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f10444k     // Catch:{ all -> 0x00e4 }
            if (r0 >= 0) goto L_0x0039
        L_0x000d:
            java.lang.String r0 = f10433u     // Catch:{ all -> 0x00e4 }
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r3 == 0) goto L_0x0037
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r3.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            c2.c r4 = r8.f10445l     // Catch:{ all -> 0x00e4 }
            int r4 = r4.f10418c     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f10444k     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00e4 }
        L_0x0037:
            r8.f10448o = r2     // Catch:{ all -> 0x00e4 }
        L_0x0039:
            int r0 = r8.f10448o     // Catch:{ all -> 0x00e4 }
            r3 = 0
            if (r0 == r2) goto L_0x00c4
            r4 = 2
            if (r0 != r4) goto L_0x0043
            goto L_0x00c4
        L_0x0043:
            r0 = 0
            r8.f10448o = r0     // Catch:{ all -> 0x00e4 }
            byte[] r5 = r8.f10438e     // Catch:{ all -> 0x00e4 }
            if (r5 != 0) goto L_0x0054
            c2.a$a r5 = r8.f10436c     // Catch:{ all -> 0x00e4 }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.mo9319e(r6)     // Catch:{ all -> 0x00e4 }
            r8.f10438e = r5     // Catch:{ all -> 0x00e4 }
        L_0x0054:
            c2.c r5 = r8.f10445l     // Catch:{ all -> 0x00e4 }
            java.util.List<c2.b> r5 = r5.f10420e     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f10444k     // Catch:{ all -> 0x00e4 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00e4 }
            c2.b r5 = (p019c2.C2647b) r5     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f10444k     // Catch:{ all -> 0x00e4 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0070
            c2.c r7 = r8.f10445l     // Catch:{ all -> 0x00e4 }
            java.util.List<c2.b> r7 = r7.f10420e     // Catch:{ all -> 0x00e4 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00e4 }
            c2.b r6 = (p019c2.C2647b) r6     // Catch:{ all -> 0x00e4 }
            goto L_0x0071
        L_0x0070:
            r6 = r3
        L_0x0071:
            int[] r7 = r5.f10415k     // Catch:{ all -> 0x00e4 }
            if (r7 == 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            c2.c r7 = r8.f10445l     // Catch:{ all -> 0x00e4 }
            int[] r7 = r7.f10416a     // Catch:{ all -> 0x00e4 }
        L_0x007a:
            r8.f10434a = r7     // Catch:{ all -> 0x00e4 }
            if (r7 != 0) goto L_0x00a0
            java.lang.String r0 = f10433u     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f10444k     // Catch:{ all -> 0x00e4 }
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x009c:
            r8.f10448o = r2     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r3
        L_0x00a0:
            boolean r1 = r5.f10410f     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00be
            int[] r1 = r8.f10435b     // Catch:{ all -> 0x00e4 }
            int r2 = r7.length     // Catch:{ all -> 0x00e4 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00e4 }
            int[] r1 = r8.f10435b     // Catch:{ all -> 0x00e4 }
            r8.f10434a = r1     // Catch:{ all -> 0x00e4 }
            int r2 = r5.f10412h     // Catch:{ all -> 0x00e4 }
            r1[r2] = r0     // Catch:{ all -> 0x00e4 }
            int r0 = r5.f10411g     // Catch:{ all -> 0x00e4 }
            if (r0 != r4) goto L_0x00be
            int r0 = r8.f10444k     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00be
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00e4 }
            r8.f10452s = r0     // Catch:{ all -> 0x00e4 }
        L_0x00be:
            android.graphics.Bitmap r0 = r8.m9274r(r5, r6)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r0
        L_0x00c4:
            java.lang.String r0 = f10433u     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            int r2 = r8.f10448o     // Catch:{ all -> 0x00e4 }
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x00e2:
            monitor-exit(r8)
            return r3
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p019c2.C2650e.mo9305a():android.graphics.Bitmap");
    }

    /* renamed from: b */
    public void mo9306b() {
        this.f10444k = (this.f10444k + 1) % this.f10445l.f10418c;
    }

    /* renamed from: c */
    public int mo9307c() {
        return this.f10445l.f10418c;
    }

    public void clear() {
        this.f10445l = null;
        byte[] bArr = this.f10442i;
        if (bArr != null) {
            this.f10436c.mo9318d(bArr);
        }
        int[] iArr = this.f10443j;
        if (iArr != null) {
            this.f10436c.mo9320f(iArr);
        }
        Bitmap bitmap = this.f10446m;
        if (bitmap != null) {
            this.f10436c.mo9317c(bitmap);
        }
        this.f10446m = null;
        this.f10437d = null;
        this.f10452s = null;
        byte[] bArr2 = this.f10438e;
        if (bArr2 != null) {
            this.f10436c.mo9318d(bArr2);
        }
    }

    /* renamed from: d */
    public int mo9309d() {
        int i;
        if (this.f10445l.f10418c <= 0 || (i = this.f10444k) < 0) {
            return 0;
        }
        return mo9328m(i);
    }

    /* renamed from: e */
    public void mo9310e(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f10453t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: f */
    public void mo9311f() {
        this.f10444k = -1;
    }

    /* renamed from: g */
    public int mo9312g() {
        return this.f10444k;
    }

    public ByteBuffer getData() {
        return this.f10437d;
    }

    /* renamed from: h */
    public int mo9314h() {
        return this.f10437d.limit() + this.f10442i.length + (this.f10443j.length * 4);
    }

    /* renamed from: m */
    public int mo9328m(int i) {
        if (i >= 0) {
            C2648c cVar = this.f10445l;
            if (i < cVar.f10418c) {
                return cVar.f10420e.get(i).f10413i;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public synchronized void mo9329q(C2648c cVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f10448o = 0;
            this.f10445l = cVar;
            this.f10444k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f10437d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f10437d.order(ByteOrder.LITTLE_ENDIAN);
            this.f10447n = false;
            Iterator<C2647b> it = cVar.f10420e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f10411g == 3) {
                        this.f10447n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f10449p = highestOneBit;
            int i2 = cVar.f10421f;
            this.f10451r = i2 / highestOneBit;
            int i3 = cVar.f10422g;
            this.f10450q = i3 / highestOneBit;
            this.f10442i = this.f10436c.mo9319e(i2 * i3);
            this.f10443j = this.f10436c.mo9316b(this.f10451r * this.f10450q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    public C2650e(C2645a.C2646a aVar) {
        this.f10435b = new int[256];
        this.f10453t = Bitmap.Config.ARGB_8888;
        this.f10436c = aVar;
        this.f10445l = new C2648c();
    }
}
