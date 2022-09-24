package british.xnews2;

import com.google.android.exoplayer2.C6540C;
import java.io.UnsupportedEncodingException;

/* renamed from: british.xnews2.d */
/* compiled from: Base58 */
public class C1761d {

    /* renamed from: a */
    public static final char[] f7633a = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray();

    /* renamed from: b */
    private static final int[] f7634b = new int[128];

    /* renamed from: british.xnews2.d$a */
    /* compiled from: Base58 */
    private static class C1762a extends Exception {
        public C1762a(String str) {
            super(str);
        }
    }

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = f7634b;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = -1;
            i2++;
        }
        while (true) {
            char[] cArr = f7633a;
            if (i < cArr.length) {
                f7634b[cArr[i]] = i;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static byte[] m8282a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    /* renamed from: b */
    public static byte[] m8283b(String str) throws C1762a {
        int i = 0;
        if (str.length() == 0) {
            return new byte[0];
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            int i3 = (charAt < 0 || charAt >= 128) ? -1 : f7634b[charAt];
            if (i3 >= 0) {
                bArr[i2] = (byte) i3;
                i2++;
            } else {
                throw new C1762a("Illegal character " + charAt + " at " + i2);
            }
        }
        while (i < length && bArr[i] == 0) {
            i++;
        }
        int length2 = str.length();
        byte[] bArr2 = new byte[length2];
        int i4 = length2;
        int i5 = i;
        while (i5 < length) {
            byte c = m8284c(bArr, i5);
            if (bArr[i5] == 0) {
                i5++;
            }
            i4--;
            bArr2[i4] = c;
        }
        while (i4 < length2 && bArr2[i4] == 0) {
            i4++;
        }
        return m8282a(bArr2, i4 - i, length2);
    }

    /* renamed from: c */
    private static byte m8284c(byte[] bArr, int i) {
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = (i2 * 58) + (bArr[i] & 255);
            bArr[i] = (byte) (i3 / 256);
            i2 = i3 % 256;
            i++;
        }
        return (byte) i2;
    }

    /* renamed from: d */
    private static byte m8285d(byte[] bArr, int i) {
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = (i2 * 256) + (bArr[i] & 255);
            bArr[i] = (byte) (i3 / 58);
            i2 = i3 % 58;
            i++;
        }
        return (byte) i2;
    }

    /* renamed from: e */
    public static String m8286e(byte[] bArr) {
        if (bArr.length == 0) {
            return "";
        }
        byte[] a = m8282a(bArr, 0, bArr.length);
        int i = 0;
        while (i < a.length && a[i] == 0) {
            i++;
        }
        int length = a.length * 2;
        byte[] bArr2 = new byte[length];
        int i2 = i;
        int i3 = length;
        while (i2 < a.length) {
            byte d = m8285d(a, i2);
            if (a[i2] == 0) {
                i2++;
            }
            i3--;
            bArr2[i3] = (byte) f7633a[d];
        }
        while (i3 < length && bArr2[i3] == f7633a[0]) {
            i3++;
        }
        while (true) {
            i--;
            if (i >= 0) {
                i3--;
                bArr2[i3] = (byte) f7633a[0];
            } else {
                try {
                    return new String(m8282a(bArr2, i3, length), C6540C.ASCII_NAME);
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
