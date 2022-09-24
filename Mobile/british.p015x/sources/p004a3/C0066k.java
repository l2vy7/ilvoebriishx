package p004a3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import p102k2.C5592l;

/* renamed from: a3.k */
/* compiled from: Util */
public final class C0066k {

    /* renamed from: a */
    private static final char[] f191a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f192b = new char[64];

    /* renamed from: a3.k$a */
    /* compiled from: Util */
    static /* synthetic */ class C0067a {

        /* renamed from: a */
        static final /* synthetic */ int[] f193a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f193a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f193a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f193a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f193a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f193a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p004a3.C0066k.C0067a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m249a() {
        if (!m265q()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m250b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof C5592l) {
            return ((C5592l) obj).mo22157a(obj2);
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public static boolean m251c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: d */
    private static String m252d(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f191a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static <T> Queue<T> m253e(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: f */
    public static int m254f(int i, int i2, Bitmap.Config config) {
        return i * i2 * m256h(config);
    }

    @TargetApi(19)
    /* renamed from: g */
    public static int m255g(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: h */
    private static int m256h(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C0067a.f193a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: i */
    public static <T> List<T> m257i(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static int m258j(float f) {
        return m259k(f, 17);
    }

    /* renamed from: k */
    public static int m259k(float f, int i) {
        return m261m(Float.floatToIntBits(f), i);
    }

    /* renamed from: l */
    public static int m260l(int i) {
        return m261m(i, 17);
    }

    /* renamed from: m */
    public static int m261m(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: n */
    public static int m262n(Object obj, int i) {
        return m261m(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: o */
    public static int m263o(boolean z, int i) {
        return m261m(z ? 1 : 0, i);
    }

    /* renamed from: p */
    public static boolean m264p() {
        return !m265q();
    }

    /* renamed from: q */
    public static boolean m265q() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: r */
    private static boolean m266r(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: s */
    public static boolean m267s(int i, int i2) {
        return m266r(i) && m266r(i2);
    }

    /* renamed from: t */
    public static String m268t(byte[] bArr) {
        String d;
        char[] cArr = f192b;
        synchronized (cArr) {
            d = m252d(bArr, cArr);
        }
        return d;
    }
}
