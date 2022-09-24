package p256v4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* renamed from: v4.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C11056a {

    /* renamed from: v4.a$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static class C11057a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C11057a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p256v4.C11056a.C11057a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: A */
    public static Double m49469A(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        if (K == 0) {
            return null;
        }
        m49482N(parcel, i, K, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: B */
    public static float m49470B(Parcel parcel, int i) {
        m49483O(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: C */
    public static Float m49471C(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        if (K == 0) {
            return null;
        }
        m49482N(parcel, i, K, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: D */
    public static int m49472D(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: E */
    public static IBinder m49473E(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + K);
        return readStrongBinder;
    }

    /* renamed from: F */
    public static int m49474F(Parcel parcel, int i) {
        m49483O(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: G */
    public static Integer m49475G(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        if (K == 0) {
            return null;
        }
        m49482N(parcel, i, K, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: H */
    public static long m49476H(Parcel parcel, int i) {
        m49483O(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: I */
    public static Long m49477I(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        if (K == 0) {
            return null;
        }
        m49482N(parcel, i, K, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: J */
    public static short m49478J(Parcel parcel, int i) {
        m49483O(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: K */
    public static int m49479K(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: L */
    public static void m49480L(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m49479K(parcel, i));
    }

    /* renamed from: M */
    public static int m49481M(Parcel parcel) {
        String str;
        int D = m49472D(parcel);
        int K = m49479K(parcel, D);
        int dataPosition = parcel.dataPosition();
        if (m49506w(D) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(D));
            if (valueOf.length() != 0) {
                str = "Expected object header. Got 0x".concat(valueOf);
            } else {
                str = new String("Expected object header. Got 0x");
            }
            throw new C11057a(str, parcel);
        }
        int i = K + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C11057a(sb.toString(), parcel);
    }

    /* renamed from: N */
    private static void m49482N(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C11057a(sb.toString(), parcel);
        }
    }

    /* renamed from: O */
    private static void m49483O(Parcel parcel, int i, int i2) {
        int K = m49479K(parcel, i);
        if (K != i2) {
            String hexString = Integer.toHexString(K);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(K);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C11057a(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    public static BigDecimal m49484a(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + K);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: b */
    public static BigDecimal[] m49485b(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + K);
        return bigDecimalArr;
    }

    /* renamed from: c */
    public static BigInteger m49486c(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + K);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m49487d(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + K);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m49488e(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + K);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m49489f(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + K);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m49490g(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + K);
        return createByteArray;
    }

    /* renamed from: h */
    public static byte[][] m49491h(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + K);
        return bArr;
    }

    /* renamed from: i */
    public static double[] m49492i(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + K);
        return createDoubleArray;
    }

    /* renamed from: j */
    public static float[] m49493j(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + K);
        return createFloatArray;
    }

    /* renamed from: k */
    public static int[] m49494k(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + K);
        return createIntArray;
    }

    /* renamed from: l */
    public static ArrayList<Integer> m49495l(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + K);
        return arrayList;
    }

    /* renamed from: m */
    public static long[] m49496m(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + K);
        return createLongArray;
    }

    /* renamed from: n */
    public static Parcel m49497n(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, K);
        parcel.setDataPosition(dataPosition + K);
        return obtain;
    }

    /* renamed from: o */
    public static Parcel[] m49498o(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + K);
        return parcelArr;
    }

    /* renamed from: p */
    public static <T extends Parcelable> T m49499p(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + K);
        return t;
    }

    /* renamed from: q */
    public static String m49500q(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + K);
        return readString;
    }

    /* renamed from: r */
    public static String[] m49501r(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + K);
        return createStringArray;
    }

    /* renamed from: s */
    public static ArrayList<String> m49502s(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + K);
        return createStringArrayList;
    }

    /* renamed from: t */
    public static <T> T[] m49503t(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + K);
        return createTypedArray;
    }

    /* renamed from: u */
    public static <T> ArrayList<T> m49504u(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int K = m49479K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + K);
        return createTypedArrayList;
    }

    /* renamed from: v */
    public static void m49505v(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C11057a(sb.toString(), parcel);
        }
    }

    /* renamed from: w */
    public static int m49506w(int i) {
        return (char) i;
    }

    /* renamed from: x */
    public static boolean m49507x(Parcel parcel, int i) {
        m49483O(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: y */
    public static Boolean m49508y(Parcel parcel, int i) {
        int K = m49479K(parcel, i);
        if (K == 0) {
            return null;
        }
        m49482N(parcel, i, K, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: z */
    public static double m49509z(Parcel parcel, int i) {
        m49483O(parcel, i, 8);
        return parcel.readDouble();
    }
}
