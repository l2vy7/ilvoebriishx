package com.ironsource.sdk.utils;

import com.startapp.C12425x3;

/* renamed from: com.ironsource.sdk.utils.c */
public final class C11757c {

    /* renamed from: d */
    private static final byte[] f52502d = {C12425x3.f55111d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    private C11758a f52503a = new C11758a(this, (byte) 0);

    /* renamed from: b */
    private C11758a f52504b = new C11758a(this, (byte) 0);

    /* renamed from: c */
    private int[] f52505c = new int[16];

    /* renamed from: com.ironsource.sdk.utils.c$a */
    class C11758a {

        /* renamed from: a */
        boolean f52506a;

        /* renamed from: b */
        int[] f52507b;

        /* renamed from: c */
        long f52508c;

        /* renamed from: d */
        byte[] f52509d;

        private C11758a() {
            this.f52506a = true;
            this.f52507b = new int[4];
            this.f52509d = new byte[64];
            mo45074a();
        }

        /* synthetic */ C11758a(C11757c cVar, byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo45074a() {
            int[] iArr = this.f52507b;
            iArr[0] = 1732584193;
            iArr[1] = -271733879;
            iArr[2] = -1732584194;
            iArr[3] = 271733878;
            this.f52508c = 0;
        }
    }

    C11757c() {
        this.f52503a.mo45074a();
        this.f52504b.f52506a = false;
    }

    /* renamed from: a */
    private static int m51970a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & i2) | (i4 & (i2 ^ -1))) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: a */
    public static String m51971a(String str) {
        C11757c cVar = new C11757c();
        byte[] bytes = str.getBytes();
        cVar.m51973c(cVar.f52503a, bytes, 0, bytes.length);
        return cVar.m51972b();
    }

    /* renamed from: b */
    private String m51972b() {
        C11758a aVar = this.f52504b;
        if (!aVar.f52506a) {
            C11758a aVar2 = this.f52503a;
            byte[] bArr = aVar2.f52509d;
            byte[] bArr2 = aVar.f52509d;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int[] iArr = aVar2.f52507b;
            int[] iArr2 = aVar.f52507b;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            aVar.f52506a = aVar2.f52506a;
            aVar.f52508c = aVar2.f52508c;
            C11758a aVar3 = this.f52504b;
            long j = aVar3.f52508c;
            int i = (int) ((j >>> 3) & 63);
            m51973c(aVar3, f52502d, 0, i < 56 ? 56 - i : 120 - i);
            m51973c(this.f52504b, new byte[]{(byte) ((int) (j & 255)), (byte) ((int) ((j >>> 8) & 255)), (byte) ((int) ((j >>> 16) & 255)), (byte) ((int) ((j >>> 24) & 255)), (byte) ((int) ((j >>> 32) & 255)), (byte) ((int) ((j >>> 40) & 255)), (byte) ((int) ((j >>> 48) & 255)), (byte) ((int) ((j >>> 56) & 255))}, 0, 8);
            this.f52504b.f52506a = true;
        }
        int[] iArr3 = this.f52504b.f52507b;
        byte[] bArr3 = new byte[16];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 16; i2 < i4; i4 = 16) {
            bArr3[i2] = (byte) (iArr3[i3] & 255);
            bArr3[i2 + 1] = (byte) ((iArr3[i3] >>> 8) & 255);
            bArr3[i2 + 2] = (byte) ((iArr3[i3] >>> 16) & 255);
            bArr3[i2 + 3] = (byte) ((iArr3[i3] >>> 24) & 255);
            i3++;
            i2 += 4;
        }
        StringBuffer stringBuffer = new StringBuffer(32);
        for (int i5 = 0; i5 < 16; i5++) {
            byte b = bArr3[i5] & 255;
            if (b < 16) {
                stringBuffer.append(SessionDescription.SUPPORTED_SDP_VERSION);
            }
            stringBuffer.append(Integer.toHexString(b));
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    private void m51973c(C11758a aVar, byte[] bArr, int i, int i2) {
        int i3 = 0;
        this.f52504b.f52506a = false;
        if (i2 + i > bArr.length) {
            i2 = bArr.length - i;
        }
        long j = aVar.f52508c;
        int i4 = ((int) (j >>> 3)) & 63;
        aVar.f52508c = j + ((long) (i2 << 3));
        int i5 = 64 - i4;
        if (i2 >= i5) {
            System.arraycopy(bArr, i, aVar.f52509d, i4, i5);
            m51974d(aVar, m51975e(aVar.f52509d, 64, 0));
            while (i5 + 63 < i2) {
                m51974d(aVar, m51975e(bArr, 64, i5));
                i5 += 64;
            }
            i3 = i5;
            i4 = 0;
        }
        if (i3 < i2) {
            for (int i6 = i3; i6 < i2; i6++) {
                aVar.f52509d[(i4 + i6) - i3] = bArr[i6 + i];
            }
        }
    }

    /* renamed from: d */
    private static void m51974d(C11758a aVar, int[] iArr) {
        C11758a aVar2 = aVar;
        int[] iArr2 = aVar2.f52507b;
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int a = m51970a(i, i2, i3, i4, iArr[0], 7, -680876936);
        int a2 = m51970a(i4, a, i2, i3, iArr[1], 12, -389564586);
        int a3 = m51970a(i3, a2, a, i2, iArr[2], 17, 606105819);
        int a4 = m51970a(i2, a3, a2, a, iArr[3], 22, -1044525330);
        int a5 = m51970a(a, a4, a3, a2, iArr[4], 7, -176418897);
        int a6 = m51970a(a2, a5, a4, a3, iArr[5], 12, 1200080426);
        int a7 = m51970a(a3, a6, a5, a4, iArr[6], 17, -1473231341);
        int a8 = m51970a(a4, a7, a6, a5, iArr[7], 22, -45705983);
        int a9 = m51970a(a5, a8, a7, a6, iArr[8], 7, 1770035416);
        int i5 = a9;
        int a10 = m51970a(a6, i5, a8, a7, iArr[9], 12, -1958414417);
        int a11 = m51970a(a7, a10, a9, a8, iArr[10], 17, -42063);
        int a12 = m51970a(a8, a11, a10, a9, iArr[11], 22, -1990404162);
        int a13 = m51970a(i5, a12, a11, a10, iArr[12], 7, 1804603682);
        int i6 = a13;
        int a14 = m51970a(a10, i6, a12, a11, iArr[13], 12, -40341101);
        int a15 = m51970a(a11, a14, a13, a12, iArr[14], 17, -1502002290);
        int a16 = m51970a(a12, a15, a14, a13, iArr[15], 22, 1236535329);
        int f = m51976f(i6, a16, a15, a14, iArr[1], 5, -165796510);
        int f2 = m51976f(a14, f, a16, a15, iArr[6], 9, -1069501632);
        int f3 = m51976f(a15, f2, f, a16, iArr[11], 14, 643717713);
        int f4 = m51976f(a16, f3, f2, f, iArr[0], 20, -373897302);
        int f5 = m51976f(f, f4, f3, f2, iArr[5], 5, -701558691);
        int f6 = m51976f(f2, f5, f4, f3, iArr[10], 9, 38016083);
        int f7 = m51976f(f3, f6, f5, f4, iArr[15], 14, -660478335);
        int f8 = m51976f(f4, f7, f6, f5, iArr[4], 20, -405537848);
        int f9 = m51976f(f5, f8, f7, f6, iArr[9], 5, 568446438);
        int i7 = f9;
        int f10 = m51976f(f6, i7, f8, f7, iArr[14], 9, -1019803690);
        int f11 = m51976f(f7, f10, f9, f8, iArr[3], 14, -187363961);
        int f12 = m51976f(f8, f11, f10, f9, iArr[8], 20, 1163531501);
        int f13 = m51976f(i7, f12, f11, f10, iArr[13], 5, -1444681467);
        int i8 = f13;
        int f14 = m51976f(f10, i8, f12, f11, iArr[2], 9, -51403784);
        int f15 = m51976f(f11, f14, f13, f12, iArr[7], 14, 1735328473);
        int f16 = m51976f(f12, f15, f14, f13, iArr[12], 20, -1926607734);
        int g = m51977g(i8, f16, f15, f14, iArr[5], 4, -378558);
        int g2 = m51977g(f14, g, f16, f15, iArr[8], 11, -2022574463);
        int g3 = m51977g(f15, g2, g, f16, iArr[11], 16, 1839030562);
        int g4 = m51977g(f16, g3, g2, g, iArr[14], 23, -35309556);
        int g5 = m51977g(g, g4, g3, g2, iArr[1], 4, -1530992060);
        int g6 = m51977g(g2, g5, g4, g3, iArr[4], 11, 1272893353);
        int g7 = m51977g(g3, g6, g5, g4, iArr[7], 16, -155497632);
        int g8 = m51977g(g4, g7, g6, g5, iArr[10], 23, -1094730640);
        int g9 = m51977g(g5, g8, g7, g6, iArr[13], 4, 681279174);
        int i9 = g9;
        int g10 = m51977g(g6, i9, g8, g7, iArr[0], 11, -358537222);
        int g11 = m51977g(g7, g10, g9, g8, iArr[3], 16, -722521979);
        int g12 = m51977g(g8, g11, g10, g9, iArr[6], 23, 76029189);
        int g13 = m51977g(i9, g12, g11, g10, iArr[9], 4, -640364487);
        int i10 = g13;
        int g14 = m51977g(g10, i10, g12, g11, iArr[12], 11, -421815835);
        int g15 = m51977g(g11, g14, g13, g12, iArr[15], 16, 530742520);
        int g16 = m51977g(g12, g15, g14, g13, iArr[2], 23, -995338651);
        int h = m51978h(i10, g16, g15, g14, iArr[0], 6, -198630844);
        int h2 = m51978h(g14, h, g16, g15, iArr[7], 10, 1126891415);
        int h3 = m51978h(g15, h2, h, g16, iArr[14], 15, -1416354905);
        int h4 = m51978h(g16, h3, h2, h, iArr[5], 21, -57434055);
        int h5 = m51978h(h, h4, h3, h2, iArr[12], 6, 1700485571);
        int h6 = m51978h(h2, h5, h4, h3, iArr[3], 10, -1894986606);
        int h7 = m51978h(h3, h6, h5, h4, iArr[10], 15, -1051523);
        int h8 = m51978h(h4, h7, h6, h5, iArr[1], 21, -2054922799);
        int h9 = m51978h(h5, h8, h7, h6, iArr[8], 6, 1873313359);
        int i11 = h9;
        int h10 = m51978h(h6, i11, h8, h7, iArr[15], 10, -30611744);
        int h11 = m51978h(h7, h10, h9, h8, iArr[6], 15, -1560198380);
        int h12 = m51978h(h8, h11, h10, h9, iArr[13], 21, 1309151649);
        int h13 = m51978h(i11, h12, h11, h10, iArr[4], 6, -145523070);
        int h14 = m51978h(h10, h13, h12, h11, iArr[11], 10, -1120210379);
        int h15 = m51978h(h11, h14, h13, h12, iArr[2], 15, 718787259);
        int h16 = m51978h(h12, h15, h14, h13, iArr[9], 21, -343485551);
        int[] iArr3 = aVar2.f52507b;
        iArr3[0] = iArr3[0] + h13;
        iArr3[1] = iArr3[1] + h16;
        iArr3[2] = iArr3[2] + h15;
        iArr3[3] = iArr3[3] + h14;
    }

    /* renamed from: e */
    private int[] m51975e(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 64; i4 += 4) {
            this.f52505c[i3] = (bArr[i4 + i2] & 255) | ((bArr[(i4 + 1) + i2] & 255) << 8) | ((bArr[(i4 + 2) + i2] & 255) << 16) | ((bArr[(i4 + 3) + i2] & 255) << 24);
            i3++;
        }
        return this.f52505c;
    }

    /* renamed from: f */
    private static int m51976f(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & (i4 ^ -1)) | (i2 & i4)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: g */
    private static int m51977g(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 ^ i2) ^ i4) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: h */
    private static int m51978h(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + (i3 ^ ((i4 ^ -1) | i2)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    public final String toString() {
        return m51972b();
    }
}
