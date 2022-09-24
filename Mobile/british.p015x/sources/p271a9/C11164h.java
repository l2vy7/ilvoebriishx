package p271a9;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.startapp.C12425x3;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import p306f8.C12696a;
import p317k9.C12822c;

/* renamed from: a9.h */
/* compiled from: NTLMEngineImpl */
final class C11164h implements C11162f {

    /* renamed from: b */
    private static final SecureRandom f50183b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static byte[] f50184c;

    /* renamed from: a */
    private String f50185a = "ASCII";

    /* renamed from: a9.h$a */
    /* compiled from: NTLMEngineImpl */
    static class C11165a {

        /* renamed from: a */
        protected byte[] f50186a;

        /* renamed from: b */
        protected byte[] f50187b;

        /* renamed from: c */
        protected MessageDigest f50188c;

        C11165a(byte[] bArr) throws C11163g {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                this.f50188c = instance;
                this.f50186a = new byte[64];
                this.f50187b = new byte[64];
                int length = bArr.length;
                if (length > 64) {
                    instance.update(bArr);
                    bArr = this.f50188c.digest();
                    length = bArr.length;
                }
                int i = 0;
                while (i < length) {
                    this.f50186a[i] = (byte) (54 ^ bArr[i]);
                    this.f50187b[i] = (byte) (92 ^ bArr[i]);
                    i++;
                }
                while (i < 64) {
                    this.f50186a[i] = 54;
                    this.f50187b[i] = 92;
                    i++;
                }
                this.f50188c.reset();
                this.f50188c.update(this.f50186a);
            } catch (Exception e) {
                throw new C11163g("Error getting md5 message digest implementation: " + e.getMessage(), e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte[] mo43475a() {
            byte[] digest = this.f50188c.digest();
            this.f50188c.update(this.f50187b);
            return this.f50188c.digest(digest);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo43476b(byte[] bArr) {
            this.f50188c.update(bArr);
        }
    }

    /* renamed from: a9.h$b */
    /* compiled from: NTLMEngineImpl */
    static class C11166b {

        /* renamed from: a */
        protected int f50189a = 1732584193;

        /* renamed from: b */
        protected int f50190b = -271733879;

        /* renamed from: c */
        protected int f50191c = -1732584194;

        /* renamed from: d */
        protected int f50192d = 271733878;

        /* renamed from: e */
        protected long f50193e = 0;

        /* renamed from: f */
        protected byte[] f50194f = new byte[64];

        C11166b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte[] mo43477a() {
            int i = (int) (this.f50193e & 63);
            int i2 = i < 56 ? 56 - i : 120 - i;
            byte[] bArr = new byte[(i2 + 8)];
            bArr[0] = C12425x3.f55111d;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((int) ((this.f50193e * 8) >>> (i3 * 8)));
            }
            mo43482f(bArr);
            byte[] bArr2 = new byte[16];
            C11164h.m49801K(bArr2, this.f50189a, 0);
            C11164h.m49801K(bArr2, this.f50190b, 4);
            C11164h.m49801K(bArr2, this.f50191c, 8);
            C11164h.m49801K(bArr2, this.f50192d, 12);
            return bArr2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo43478b() {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                byte[] bArr = this.f50194f;
                int i2 = i * 4;
                iArr[i] = (bArr[i2] & 255) + ((bArr[i2 + 1] & 255) << 8) + ((bArr[i2 + 2] & 255) << 16) + ((bArr[i2 + 3] & 255) << 24);
            }
            int i3 = this.f50189a;
            int i4 = this.f50190b;
            int i5 = this.f50191c;
            int i6 = this.f50192d;
            mo43479c(iArr);
            mo43480d(iArr);
            mo43481e(iArr);
            this.f50189a += i3;
            this.f50190b += i4;
            this.f50191c += i5;
            this.f50192d += i6;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo43479c(int[] iArr) {
            int I = C11164h.m49799I(this.f50189a + C11164h.m49802c(this.f50190b, this.f50191c, this.f50192d) + iArr[0], 3);
            this.f50189a = I;
            int I2 = C11164h.m49799I(this.f50192d + C11164h.m49802c(I, this.f50190b, this.f50191c) + iArr[1], 7);
            this.f50192d = I2;
            int I3 = C11164h.m49799I(this.f50191c + C11164h.m49802c(I2, this.f50189a, this.f50190b) + iArr[2], 11);
            this.f50191c = I3;
            int I4 = C11164h.m49799I(this.f50190b + C11164h.m49802c(I3, this.f50192d, this.f50189a) + iArr[3], 19);
            this.f50190b = I4;
            int I5 = C11164h.m49799I(this.f50189a + C11164h.m49802c(I4, this.f50191c, this.f50192d) + iArr[4], 3);
            this.f50189a = I5;
            int I6 = C11164h.m49799I(this.f50192d + C11164h.m49802c(I5, this.f50190b, this.f50191c) + iArr[5], 7);
            this.f50192d = I6;
            int I7 = C11164h.m49799I(this.f50191c + C11164h.m49802c(I6, this.f50189a, this.f50190b) + iArr[6], 11);
            this.f50191c = I7;
            int I8 = C11164h.m49799I(this.f50190b + C11164h.m49802c(I7, this.f50192d, this.f50189a) + iArr[7], 19);
            this.f50190b = I8;
            int I9 = C11164h.m49799I(this.f50189a + C11164h.m49802c(I8, this.f50191c, this.f50192d) + iArr[8], 3);
            this.f50189a = I9;
            int I10 = C11164h.m49799I(this.f50192d + C11164h.m49802c(I9, this.f50190b, this.f50191c) + iArr[9], 7);
            this.f50192d = I10;
            int I11 = C11164h.m49799I(this.f50191c + C11164h.m49802c(I10, this.f50189a, this.f50190b) + iArr[10], 11);
            this.f50191c = I11;
            int I12 = C11164h.m49799I(this.f50190b + C11164h.m49802c(I11, this.f50192d, this.f50189a) + iArr[11], 19);
            this.f50190b = I12;
            int I13 = C11164h.m49799I(this.f50189a + C11164h.m49802c(I12, this.f50191c, this.f50192d) + iArr[12], 3);
            this.f50189a = I13;
            int I14 = C11164h.m49799I(this.f50192d + C11164h.m49802c(I13, this.f50190b, this.f50191c) + iArr[13], 7);
            this.f50192d = I14;
            int I15 = C11164h.m49799I(this.f50191c + C11164h.m49802c(I14, this.f50189a, this.f50190b) + iArr[14], 11);
            this.f50191c = I15;
            this.f50190b = C11164h.m49799I(this.f50190b + C11164h.m49802c(I15, this.f50192d, this.f50189a) + iArr[15], 19);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo43480d(int[] iArr) {
            int I = C11164h.m49799I(this.f50189a + C11164h.m49803d(this.f50190b, this.f50191c, this.f50192d) + iArr[0] + 1518500249, 3);
            this.f50189a = I;
            int I2 = C11164h.m49799I(this.f50192d + C11164h.m49803d(I, this.f50190b, this.f50191c) + iArr[4] + 1518500249, 5);
            this.f50192d = I2;
            int I3 = C11164h.m49799I(this.f50191c + C11164h.m49803d(I2, this.f50189a, this.f50190b) + iArr[8] + 1518500249, 9);
            this.f50191c = I3;
            int I4 = C11164h.m49799I(this.f50190b + C11164h.m49803d(I3, this.f50192d, this.f50189a) + iArr[12] + 1518500249, 13);
            this.f50190b = I4;
            int I5 = C11164h.m49799I(this.f50189a + C11164h.m49803d(I4, this.f50191c, this.f50192d) + iArr[1] + 1518500249, 3);
            this.f50189a = I5;
            int I6 = C11164h.m49799I(this.f50192d + C11164h.m49803d(I5, this.f50190b, this.f50191c) + iArr[5] + 1518500249, 5);
            this.f50192d = I6;
            int I7 = C11164h.m49799I(this.f50191c + C11164h.m49803d(I6, this.f50189a, this.f50190b) + iArr[9] + 1518500249, 9);
            this.f50191c = I7;
            int I8 = C11164h.m49799I(this.f50190b + C11164h.m49803d(I7, this.f50192d, this.f50189a) + iArr[13] + 1518500249, 13);
            this.f50190b = I8;
            int I9 = C11164h.m49799I(this.f50189a + C11164h.m49803d(I8, this.f50191c, this.f50192d) + iArr[2] + 1518500249, 3);
            this.f50189a = I9;
            int I10 = C11164h.m49799I(this.f50192d + C11164h.m49803d(I9, this.f50190b, this.f50191c) + iArr[6] + 1518500249, 5);
            this.f50192d = I10;
            int I11 = C11164h.m49799I(this.f50191c + C11164h.m49803d(I10, this.f50189a, this.f50190b) + iArr[10] + 1518500249, 9);
            this.f50191c = I11;
            int I12 = C11164h.m49799I(this.f50190b + C11164h.m49803d(I11, this.f50192d, this.f50189a) + iArr[14] + 1518500249, 13);
            this.f50190b = I12;
            int I13 = C11164h.m49799I(this.f50189a + C11164h.m49803d(I12, this.f50191c, this.f50192d) + iArr[3] + 1518500249, 3);
            this.f50189a = I13;
            int I14 = C11164h.m49799I(this.f50192d + C11164h.m49803d(I13, this.f50190b, this.f50191c) + iArr[7] + 1518500249, 5);
            this.f50192d = I14;
            int I15 = C11164h.m49799I(this.f50191c + C11164h.m49803d(I14, this.f50189a, this.f50190b) + iArr[11] + 1518500249, 9);
            this.f50191c = I15;
            this.f50190b = C11164h.m49799I(this.f50190b + C11164h.m49803d(I15, this.f50192d, this.f50189a) + iArr[15] + 1518500249, 13);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo43481e(int[] iArr) {
            int I = C11164h.m49799I(this.f50189a + C11164h.m49804e(this.f50190b, this.f50191c, this.f50192d) + iArr[0] + 1859775393, 3);
            this.f50189a = I;
            int I2 = C11164h.m49799I(this.f50192d + C11164h.m49804e(I, this.f50190b, this.f50191c) + iArr[8] + 1859775393, 9);
            this.f50192d = I2;
            int I3 = C11164h.m49799I(this.f50191c + C11164h.m49804e(I2, this.f50189a, this.f50190b) + iArr[4] + 1859775393, 11);
            this.f50191c = I3;
            int I4 = C11164h.m49799I(this.f50190b + C11164h.m49804e(I3, this.f50192d, this.f50189a) + iArr[12] + 1859775393, 15);
            this.f50190b = I4;
            int I5 = C11164h.m49799I(this.f50189a + C11164h.m49804e(I4, this.f50191c, this.f50192d) + iArr[2] + 1859775393, 3);
            this.f50189a = I5;
            int I6 = C11164h.m49799I(this.f50192d + C11164h.m49804e(I5, this.f50190b, this.f50191c) + iArr[10] + 1859775393, 9);
            this.f50192d = I6;
            int I7 = C11164h.m49799I(this.f50191c + C11164h.m49804e(I6, this.f50189a, this.f50190b) + iArr[6] + 1859775393, 11);
            this.f50191c = I7;
            int I8 = C11164h.m49799I(this.f50190b + C11164h.m49804e(I7, this.f50192d, this.f50189a) + iArr[14] + 1859775393, 15);
            this.f50190b = I8;
            int I9 = C11164h.m49799I(this.f50189a + C11164h.m49804e(I8, this.f50191c, this.f50192d) + iArr[1] + 1859775393, 3);
            this.f50189a = I9;
            int I10 = C11164h.m49799I(this.f50192d + C11164h.m49804e(I9, this.f50190b, this.f50191c) + iArr[9] + 1859775393, 9);
            this.f50192d = I10;
            int I11 = C11164h.m49799I(this.f50191c + C11164h.m49804e(I10, this.f50189a, this.f50190b) + iArr[5] + 1859775393, 11);
            this.f50191c = I11;
            int I12 = C11164h.m49799I(this.f50190b + C11164h.m49804e(I11, this.f50192d, this.f50189a) + iArr[13] + 1859775393, 15);
            this.f50190b = I12;
            int I13 = C11164h.m49799I(this.f50189a + C11164h.m49804e(I12, this.f50191c, this.f50192d) + iArr[3] + 1859775393, 3);
            this.f50189a = I13;
            int I14 = C11164h.m49799I(this.f50192d + C11164h.m49804e(I13, this.f50190b, this.f50191c) + iArr[11] + 1859775393, 9);
            this.f50192d = I14;
            int I15 = C11164h.m49799I(this.f50191c + C11164h.m49804e(I14, this.f50189a, this.f50190b) + iArr[7] + 1859775393, 11);
            this.f50191c = I15;
            this.f50190b = C11164h.m49799I(this.f50190b + C11164h.m49804e(I15, this.f50192d, this.f50189a) + iArr[15] + 1859775393, 15);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo43482f(byte[] bArr) {
            byte[] bArr2;
            int i = (int) (this.f50193e & 63);
            int i2 = 0;
            while (true) {
                int length = (bArr.length - i2) + i;
                bArr2 = this.f50194f;
                if (length < bArr2.length) {
                    break;
                }
                int length2 = bArr2.length - i;
                System.arraycopy(bArr, i2, bArr2, i, length2);
                this.f50193e += (long) length2;
                i2 += length2;
                mo43478b();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length3 = bArr.length - i2;
                System.arraycopy(bArr, i2, bArr2, i, length3);
                this.f50193e += (long) length3;
            }
        }
    }

    /* renamed from: a9.h$d */
    /* compiled from: NTLMEngineImpl */
    static class C11168d extends C11167c {

        /* renamed from: c */
        protected byte[] f50197c;

        /* renamed from: d */
        protected byte[] f50198d;

        C11168d(String str, String str2) throws C11163g {
            try {
                String i = C11164h.m49813n(str2);
                String j = C11164h.m49812m(str);
                this.f50197c = i.getBytes("UnicodeLittleUnmarked");
                this.f50198d = j.toUpperCase().getBytes("UnicodeLittleUnmarked");
            } catch (UnsupportedEncodingException e) {
                throw new C11163g("Unicode unsupported: " + e.getMessage(), e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo43488f() {
            mo43489g(this.f50197c.length + 32 + this.f50198d.length, 1);
            mo43485c(537395765);
            mo43486d(this.f50198d.length);
            mo43486d(this.f50198d.length);
            mo43485c(this.f50197c.length + 32);
            mo43486d(this.f50197c.length);
            mo43486d(this.f50197c.length);
            mo43485c(32);
            mo43484b(this.f50197c);
            mo43484b(this.f50198d);
            return super.mo43488f();
        }
    }

    /* renamed from: a9.h$e */
    /* compiled from: NTLMEngineImpl */
    static class C11169e extends C11167c {

        /* renamed from: c */
        protected byte[] f50199c;

        /* renamed from: d */
        protected String f50200d;

        /* renamed from: e */
        protected byte[] f50201e;

        /* renamed from: f */
        protected int f50202f;

        C11169e(String str) throws C11163g {
            super(str, 2);
            byte[] bArr = new byte[8];
            this.f50199c = bArr;
            mo43490h(bArr, 24);
            int j = mo43492j(20);
            this.f50202f = j;
            if ((j & 1) != 0) {
                this.f50200d = null;
                if (mo43487e() >= 20) {
                    byte[] i = mo43491i(12);
                    if (i.length != 0) {
                        try {
                            this.f50200d = new String(i, "UnicodeLittleUnmarked");
                        } catch (UnsupportedEncodingException e) {
                            throw new C11163g(e.getMessage(), e);
                        }
                    }
                }
                this.f50201e = null;
                if (mo43487e() >= 48) {
                    byte[] i2 = mo43491i(40);
                    if (i2.length != 0) {
                        this.f50201e = i2;
                        return;
                    }
                    return;
                }
                return;
            }
            throw new C11163g("NTLM type 2 message has flags that make no sense: " + Integer.toString(this.f50202f));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public byte[] mo43493k() {
            return this.f50199c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo43494l() {
            return this.f50202f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public String mo43495m() {
            return this.f50200d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public byte[] mo43496n() {
            return this.f50201e;
        }
    }

    /* renamed from: a9.h$f */
    /* compiled from: NTLMEngineImpl */
    static class C11170f extends C11167c {

        /* renamed from: c */
        protected int f50203c;

        /* renamed from: d */
        protected byte[] f50204d;

        /* renamed from: e */
        protected byte[] f50205e;

        /* renamed from: f */
        protected byte[] f50206f;

        /* renamed from: g */
        protected byte[] f50207g;

        /* renamed from: h */
        protected byte[] f50208h;

        C11170f(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws C11163g {
            this.f50203c = i;
            String i2 = C11164h.m49813n(str2);
            String j = C11164h.m49812m(str);
            if (bArr2 != null && str5 != null) {
                try {
                    byte[] k = C11164h.m49792B();
                    this.f50208h = C11164h.m49820u(str5, str3, str4, bArr, k, bArr2);
                    this.f50207g = C11164h.m49817r(str5, str3, str4, bArr, k);
                } catch (C11163g unused) {
                    this.f50208h = new byte[0];
                    this.f50207g = C11164h.m49816q(str4, bArr);
                }
            } else if ((i & 524288) != 0) {
                byte[] l = C11164h.m49791A();
                this.f50208h = C11164h.m49818s(str4, bArr, l);
                this.f50207g = l;
            } else {
                this.f50208h = C11164h.m49819t(str4, bArr);
                this.f50207g = C11164h.m49816q(str4, bArr);
            }
            try {
                this.f50204d = j.toUpperCase().getBytes("UnicodeLittleUnmarked");
                this.f50205e = i2.getBytes("UnicodeLittleUnmarked");
                this.f50206f = str3.getBytes("UnicodeLittleUnmarked");
            } catch (UnsupportedEncodingException e) {
                throw new C11163g("Unicode not supported: " + e.getMessage(), e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo43488f() {
            int length = this.f50208h.length;
            int length2 = this.f50207g.length;
            int length3 = this.f50204d.length;
            int length4 = this.f50205e.length;
            int length5 = this.f50206f.length;
            int i = length2 + 64;
            int i2 = i + length;
            int i3 = i2 + length3;
            int i4 = i3 + length5;
            int i5 = i4 + length4 + 0;
            mo43489g(i5, 3);
            mo43486d(length2);
            mo43486d(length2);
            mo43485c(64);
            mo43486d(length);
            mo43486d(length);
            mo43485c(i);
            mo43486d(length3);
            mo43486d(length3);
            mo43485c(i2);
            mo43486d(length5);
            mo43486d(length5);
            mo43485c(i3);
            mo43486d(length4);
            mo43486d(length4);
            mo43485c(i4);
            mo43485c(0);
            mo43485c(i5);
            int i6 = this.f50203c;
            mo43485c((i6 & 32768) | (524288 & i6) | 536871429 | (i6 & 16) | (i6 & 32) | (1073741824 & i6));
            mo43484b(this.f50207g);
            mo43484b(this.f50208h);
            mo43484b(this.f50204d);
            mo43484b(this.f50206f);
            mo43484b(this.f50205e);
            return super.mo43488f();
        }
    }

    static {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception unused) {
            secureRandom = null;
        }
        f50183b = secureRandom;
        byte[] d = C12822c.m54368d("NTLMSSP", "ASCII");
        byte[] bArr = new byte[(d.length + 1)];
        f50184c = bArr;
        System.arraycopy(d, 0, bArr, 0, d.length);
        f50184c[d.length] = 0;
    }

    C11164h() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static byte[] m49791A() throws C11163g {
        SecureRandom secureRandom = f50183b;
        if (secureRandom != null) {
            byte[] bArr = new byte[24];
            synchronized (secureRandom) {
                secureRandom.nextBytes(bArr);
            }
            Arrays.fill(bArr, 8, 24, (byte) 0);
            return bArr;
        }
        throw new C11163g("Random generator not available");
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static byte[] m49792B() throws C11163g {
        SecureRandom secureRandom = f50183b;
        if (secureRandom != null) {
            byte[] bArr = new byte[8];
            synchronized (secureRandom) {
                secureRandom.nextBytes(bArr);
            }
            return bArr;
        }
        throw new C11163g("Random generator not available");
    }

    /* renamed from: C */
    private static byte[] m49793C(String str) throws C11163g {
        try {
            byte[] bytes = str.getBytes("UnicodeLittleUnmarked");
            C11166b bVar = new C11166b();
            bVar.mo43482f(bytes);
            return bVar.mo43477a();
        } catch (UnsupportedEncodingException e) {
            throw new C11163g("Unicode not supported: " + e.getMessage(), e);
        }
    }

    /* renamed from: D */
    private static byte[] m49794D(String str, String str2, String str3) throws C11163g {
        try {
            C11165a aVar = new C11165a(m49793C(str3));
            aVar.mo43476b(str2.toUpperCase().getBytes("UnicodeLittleUnmarked"));
            aVar.mo43476b(str.getBytes("UnicodeLittleUnmarked"));
            return aVar.mo43475a();
        } catch (UnsupportedEncodingException e) {
            throw new C11163g("Unicode not supported! " + e.getMessage(), e);
        }
    }

    /* renamed from: E */
    private static void m49795E(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if ((((b >>> 1) ^ ((((((b >>> 7) ^ (b >>> 6)) ^ (b >>> 5)) ^ (b >>> 4)) ^ (b >>> 3)) ^ (b >>> 2))) & 1) == 0) {
                bArr[i] = (byte) (bArr[i] | 1);
            } else {
                bArr[i] = (byte) (bArr[i] & -2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static byte[] m49796F(byte[] bArr, int i) throws C11163g {
        int H = m49798H(bArr, i);
        int G = m49797G(bArr, i + 4);
        if (bArr.length >= G + H) {
            byte[] bArr2 = new byte[H];
            System.arraycopy(bArr, G, bArr2, 0, H);
            return bArr2;
        }
        throw new C11163g("NTLM authentication - buffer too small for data item");
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static int m49797G(byte[] bArr, int i) throws C11163g {
        if (bArr.length >= i + 4) {
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw new C11163g("NTLM authentication - buffer too small for DWORD");
    }

    /* renamed from: H */
    private static int m49798H(byte[] bArr, int i) throws C11163g {
        if (bArr.length >= i + 2) {
            return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        }
        throw new C11163g("NTLM authentication - buffer too small for WORD");
    }

    /* renamed from: I */
    static int m49799I(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: J */
    private static String m49800J(String str) {
        int indexOf = str.indexOf(".");
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: K */
    static void m49801K(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    /* renamed from: c */
    static int m49802c(int i, int i2, int i3) {
        return ((i ^ -1) & i3) | (i2 & i);
    }

    /* renamed from: d */
    static int m49803d(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    /* renamed from: e */
    static int m49804e(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static String m49812m(String str) {
        return m49800J(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static String m49813n(String str) {
        return m49800J(str);
    }

    /* renamed from: o */
    private static byte[] m49814o(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = {1, 1, 0, 0};
        byte[] bArr4 = {0, 0, 0, 0};
        byte[] bArr5 = {0, 0, 0, 0};
        long currentTimeMillis = (System.currentTimeMillis() + 11644473600000L) * ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;
        byte[] bArr6 = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr6[i] = (byte) ((int) currentTimeMillis);
            currentTimeMillis >>>= 8;
        }
        byte[] bArr7 = new byte[(bArr2.length + 28)];
        System.arraycopy(bArr3, 0, bArr7, 0, 4);
        System.arraycopy(bArr4, 0, bArr7, 4, 4);
        System.arraycopy(bArr6, 0, bArr7, 8, 8);
        System.arraycopy(bArr, 0, bArr7, 16, 8);
        System.arraycopy(bArr5, 0, bArr7, 24, 4);
        System.arraycopy(bArr2, 0, bArr7, 28, bArr2.length);
        return bArr7;
    }

    /* renamed from: p */
    private static Key m49815p(byte[] bArr, int i) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, i, bArr2, 0, 7);
        byte[] bArr3 = {bArr2[0], (byte) ((bArr2[0] << 7) | ((bArr2[1] & 255) >>> 1)), (byte) ((bArr2[1] << 6) | ((bArr2[2] & 255) >>> 2)), (byte) ((bArr2[2] << 5) | ((bArr2[3] & 255) >>> 3)), (byte) ((bArr2[3] << 4) | ((bArr2[4] & 255) >>> 4)), (byte) ((bArr2[4] << 3) | ((bArr2[5] & 255) >>> 5)), (byte) ((bArr2[5] << 2) | ((bArr2[6] & 255) >>> 6)), (byte) (bArr2[6] << 1)};
        m49795E(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    /* renamed from: q */
    static byte[] m49816q(String str, byte[] bArr) throws C11163g {
        return m49822y(m49821x(str), bArr);
    }

    /* renamed from: r */
    static byte[] m49817r(String str, String str2, String str3, byte[] bArr, byte[] bArr2) throws C11163g {
        return m49823z(m49794D(str, str2, str3), bArr, bArr2);
    }

    /* renamed from: s */
    static byte[] m49818s(String str, byte[] bArr, byte[] bArr2) throws C11163g {
        try {
            byte[] C = m49793C(str);
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            instance.update(bArr2);
            byte[] digest = instance.digest();
            byte[] bArr3 = new byte[8];
            System.arraycopy(digest, 0, bArr3, 0, 8);
            return m49822y(C, bArr3);
        } catch (Exception e) {
            if (e instanceof C11163g) {
                throw ((C11163g) e);
            }
            throw new C11163g(e.getMessage(), e);
        }
    }

    /* renamed from: t */
    static byte[] m49819t(String str, byte[] bArr) throws C11163g {
        return m49822y(m49793C(str), bArr);
    }

    /* renamed from: u */
    static byte[] m49820u(String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3) throws C11163g {
        return m49823z(m49794D(str, str2, str3), bArr, m49814o(bArr2, bArr3));
    }

    /* renamed from: x */
    private static byte[] m49821x(String str) throws C11163g {
        try {
            byte[] bytes = str.toUpperCase().getBytes(C6540C.ASCII_NAME);
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key p = m49815p(bArr, 0);
            Key p2 = m49815p(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes(C6540C.ASCII_NAME);
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, p);
            byte[] doFinal = instance.doFinal(bytes2);
            instance.init(1, p2);
            byte[] doFinal2 = instance.doFinal(bytes2);
            byte[] bArr2 = new byte[16];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            System.arraycopy(doFinal2, 0, bArr2, 8, 8);
            return bArr2;
        } catch (Exception e) {
            throw new C11163g(e.getMessage(), e);
        }
    }

    /* renamed from: y */
    private static byte[] m49822y(byte[] bArr, byte[] bArr2) throws C11163g {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key p = m49815p(bArr3, 0);
            Key p2 = m49815p(bArr3, 7);
            Key p3 = m49815p(bArr3, 14);
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, p);
            byte[] doFinal = instance.doFinal(bArr2);
            instance.init(1, p2);
            byte[] doFinal2 = instance.doFinal(bArr2);
            instance.init(1, p3);
            byte[] doFinal3 = instance.doFinal(bArr2);
            byte[] bArr4 = new byte[24];
            System.arraycopy(doFinal, 0, bArr4, 0, 8);
            System.arraycopy(doFinal2, 0, bArr4, 8, 8);
            System.arraycopy(doFinal3, 0, bArr4, 16, 8);
            return bArr4;
        } catch (Exception e) {
            throw new C11163g(e.getMessage(), e);
        }
    }

    /* renamed from: z */
    private static byte[] m49823z(byte[] bArr, byte[] bArr2, byte[] bArr3) throws C11163g {
        C11165a aVar = new C11165a(bArr);
        aVar.mo43476b(bArr2);
        aVar.mo43476b(bArr3);
        byte[] a = aVar.mo43475a();
        byte[] bArr4 = new byte[(a.length + bArr3.length)];
        System.arraycopy(a, 0, bArr4, 0, a.length);
        System.arraycopy(bArr3, 0, bArr4, a.length, bArr3.length);
        return bArr4;
    }

    /* renamed from: a */
    public String mo43471a(String str, String str2, String str3, String str4, String str5) throws C11163g {
        C11169e eVar = new C11169e(str5);
        return mo43474w(str, str2, str4, str3, eVar.mo43493k(), eVar.mo43494l(), eVar.mo43495m(), eVar.mo43496n());
    }

    /* renamed from: b */
    public String mo43472b(String str, String str2) throws C11163g {
        return mo43473v(str2, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public String mo43473v(String str, String str2) throws C11163g {
        return new C11168d(str2, str).mo43488f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public String mo43474w(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws C11163g {
        return new C11170f(str4, str3, str, str2, bArr, i, str5, bArr2).mo43488f();
    }

    /* renamed from: a9.h$c */
    /* compiled from: NTLMEngineImpl */
    static class C11167c {

        /* renamed from: a */
        private byte[] f50195a;

        /* renamed from: b */
        private int f50196b;

        C11167c() {
            this.f50195a = null;
            this.f50196b = 0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo43483a(byte b) {
            byte[] bArr = this.f50195a;
            int i = this.f50196b;
            bArr[i] = b;
            this.f50196b = i + 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo43484b(byte[] bArr) {
            for (byte b : bArr) {
                byte[] bArr2 = this.f50195a;
                int i = this.f50196b;
                bArr2[i] = b;
                this.f50196b = i + 1;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo43485c(int i) {
            mo43483a((byte) (i & 255));
            mo43483a((byte) ((i >> 8) & 255));
            mo43483a((byte) ((i >> 16) & 255));
            mo43483a((byte) ((i >> 24) & 255));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo43486d(int i) {
            mo43483a((byte) (i & 255));
            mo43483a((byte) ((i >> 8) & 255));
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo43487e() {
            return this.f50196b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo43488f() {
            byte[] bArr = this.f50195a;
            int length = bArr.length;
            int i = this.f50196b;
            if (length > i) {
                bArr = new byte[i];
                for (int i2 = 0; i2 < this.f50196b; i2++) {
                    bArr[i2] = this.f50195a[i2];
                }
            }
            return C12822c.m54366b(C12696a.m53997h(bArr));
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo43489g(int i, int i2) {
            this.f50195a = new byte[i];
            this.f50196b = 0;
            mo43484b(C11164h.f50184c);
            mo43485c(i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo43490h(byte[] bArr, int i) throws C11163g {
            byte[] bArr2 = this.f50195a;
            if (bArr2.length >= bArr.length + i) {
                System.arraycopy(bArr2, i, bArr, 0, bArr.length);
                return;
            }
            throw new C11163g("NTLM: Message too short");
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public byte[] mo43491i(int i) throws C11163g {
            return C11164h.m49796F(this.f50195a, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public int mo43492j(int i) throws C11163g {
            return C11164h.m49797G(this.f50195a, i);
        }

        C11167c(String str, int i) throws C11163g {
            this.f50195a = null;
            int i2 = 0;
            this.f50196b = 0;
            byte[] e = C12696a.m53996e(C12822c.m54368d(str, "ASCII"));
            this.f50195a = e;
            if (e.length >= C11164h.f50184c.length) {
                while (i2 < C11164h.f50184c.length) {
                    if (this.f50195a[i2] == C11164h.f50184c[i2]) {
                        i2++;
                    } else {
                        throw new C11163g("NTLM message expected - instead got unrecognized bytes");
                    }
                }
                int j = mo43492j(C11164h.f50184c.length);
                if (j == i) {
                    this.f50196b = this.f50195a.length;
                    return;
                }
                throw new C11163g("NTLM type " + Integer.toString(i) + " message expected - instead got type " + Integer.toString(j));
            }
            throw new C11163g("NTLM message decoding error - packet too short");
        }
    }
}
