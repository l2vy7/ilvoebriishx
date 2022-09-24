package p118n2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p004a3.C0061f;
import p004a3.C0065j;
import p004a3.C0066k;
import p064d2.C5155b;
import p064d2.C5160g;
import p064d2.C5163h;
import p064d2.C5164i;
import p070e2.C5224m;
import p081g2.C5323v;
import p086h2.C5382b;
import p086h2.C5387e;
import p118n2.C5823l;
import p118n2.C5840s;

/* renamed from: n2.m */
/* compiled from: Downsampler */
public final class C5831m {

    /* renamed from: f */
    public static final C5160g<C5155b> f24552f = C5160g.m23475f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C5155b.f22587d);

    /* renamed from: g */
    public static final C5160g<C5164i> f24553g = C5160g.m23475f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", C5164i.SRGB);
    @Deprecated

    /* renamed from: h */
    public static final C5160g<C5823l> f24554h = C5823l.f24547h;

    /* renamed from: i */
    public static final C5160g<Boolean> f24555i;

    /* renamed from: j */
    public static final C5160g<Boolean> f24556j;

    /* renamed from: k */
    private static final Set<String> f24557k = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: l */
    private static final C5833b f24558l = new C5832a();

    /* renamed from: m */
    private static final Set<ImageHeaderParser.ImageType> f24559m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: n */
    private static final Queue<BitmapFactory.Options> f24560n = C0066k.m253e(0);

    /* renamed from: a */
    private final C5387e f24561a;

    /* renamed from: b */
    private final DisplayMetrics f24562b;

    /* renamed from: c */
    private final C5382b f24563c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f24564d;

    /* renamed from: e */
    private final C5839r f24565e = C5839r.m25796a();

    /* renamed from: n2.m$a */
    /* compiled from: Downsampler */
    class C5832a implements C5833b {
        C5832a() {
        }

        /* renamed from: a */
        public void mo22730a(C5387e eVar, Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo22731b() {
        }
    }

    /* renamed from: n2.m$b */
    /* compiled from: Downsampler */
    public interface C5833b {
        /* renamed from: a */
        void mo22730a(C5387e eVar, Bitmap bitmap) throws IOException;

        /* renamed from: b */
        void mo22731b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f24555i = C5160g.m23475f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f24556j = C5160g.m23475f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public C5831m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C5387e eVar, C5382b bVar) {
        this.f24564d = list;
        this.f24562b = (DisplayMetrics) C0065j.m247d(displayMetrics);
        this.f24561a = (C5387e) C0065j.m247d(eVar);
        this.f24563c = (C5382b) C0065j.m247d(bVar);
    }

    /* renamed from: a */
    private static int m25754a(double d) {
        int l = m25762l(d);
        double d2 = (double) l;
        Double.isNaN(d2);
        int x = m25771x(d2 * d);
        double d3 = (double) (((float) x) / ((float) l));
        Double.isNaN(d3);
        double d4 = (double) x;
        Double.isNaN(d4);
        return m25771x((d / d3) * d4);
    }

    /* renamed from: b */
    private void m25755b(C5840s sVar, C5155b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (!this.f24565e.mo22734e(i, i2, options, z, z2)) {
            if (bVar == C5155b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = sVar.mo22738d().hasAlpha();
            } catch (IOException e) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e);
                }
            }
            Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* renamed from: c */
    private static void m25756c(ImageHeaderParser.ImageType imageType, C5840s sVar, C5833b bVar, C5387e eVar, C5823l lVar, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        double d;
        ImageHeaderParser.ImageType imageType2 = imageType;
        C5823l lVar2 = lVar;
        int i12 = i2;
        int i13 = i3;
        int i14 = i4;
        int i15 = i5;
        BitmapFactory.Options options2 = options;
        if (i12 <= 0 || i13 <= 0) {
            String str = "Downsampler";
            String str2 = "x";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to determine dimensions for: " + imageType2 + " with target [" + i14 + str2 + i15 + "]");
                return;
            }
            return;
        }
        if (m25765r(i)) {
            i6 = i12;
            i7 = i13;
        } else {
            i7 = i12;
            i6 = i13;
        }
        float b = lVar2.mo22723b(i7, i6, i14, i15);
        if (b > 0.0f) {
            C5823l.C5830g a = lVar2.mo22722a(i7, i6, i14, i15);
            if (a != null) {
                float f = (float) i7;
                float f2 = (float) i6;
                int x = i7 / m25771x((double) (b * f));
                int x2 = i6 / m25771x((double) (b * f2));
                C5823l.C5830g gVar = C5823l.C5830g.MEMORY;
                if (a == gVar) {
                    i8 = Math.max(x, x2);
                } else {
                    i8 = Math.min(x, x2);
                }
                int i16 = Build.VERSION.SDK_INT;
                String str3 = "x";
                String str4 = "Downsampler";
                if (i16 > 23 || !f24557k.contains(options2.outMimeType)) {
                    int max = Math.max(1, Integer.highestOneBit(i8));
                    if (a == gVar && ((float) max) < 1.0f / b) {
                        max <<= 1;
                    }
                    i9 = max;
                } else {
                    i9 = 1;
                }
                options2.inSampleSize = i9;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i9, 8);
                    i10 = (int) Math.ceil((double) (f / min));
                    i11 = (int) Math.ceil((double) (f2 / min));
                    int i17 = i9 / 8;
                    if (i17 > 0) {
                        i10 /= i17;
                        i11 /= i17;
                    }
                } else {
                    if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f3 = (float) i9;
                        i10 = (int) Math.floor((double) (f / f3));
                        d = Math.floor((double) (f2 / f3));
                    } else if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                        if (i16 >= 24) {
                            float f4 = (float) i9;
                            i10 = Math.round(f / f4);
                            i11 = Math.round(f2 / f4);
                        } else {
                            float f5 = (float) i9;
                            i10 = (int) Math.floor((double) (f / f5));
                            d = Math.floor((double) (f2 / f5));
                        }
                    } else if (i7 % i9 == 0 && i6 % i9 == 0) {
                        i10 = i7 / i9;
                        i11 = i6 / i9;
                    } else {
                        int[] m = m25763m(sVar, options2, bVar, eVar);
                        i10 = m[0];
                        i11 = m[1];
                    }
                    i11 = (int) d;
                }
                double b2 = (double) lVar2.mo22723b(i10, i11, i14, i15);
                if (i16 >= 19) {
                    options2.inTargetDensity = m25754a(b2);
                    options2.inDensity = m25762l(b2);
                }
                if (m25766s(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                String str5 = str4;
                if (Log.isLoggable(str5, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculate scaling, source: [");
                    sb.append(i2);
                    String str6 = str3;
                    sb.append(str6);
                    sb.append(i3);
                    sb.append("], degreesToRotate: ");
                    sb.append(i);
                    sb.append(", target: [");
                    sb.append(i14);
                    sb.append(str6);
                    sb.append(i15);
                    sb.append("], power of two scaled: [");
                    sb.append(i10);
                    sb.append(str6);
                    sb.append(i11);
                    sb.append("], exact scale factor: ");
                    sb.append(b);
                    sb.append(", power of 2 sample size: ");
                    sb.append(i9);
                    sb.append(", adjusted scale factor: ");
                    sb.append(b2);
                    sb.append(", target density: ");
                    sb.append(options2.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options2.inDensity);
                    Log.v(str5, sb.toString());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i18 = i12;
        String str7 = "x";
        throw new IllegalArgumentException("Cannot scale with factor: " + b + " from: " + lVar2 + ", source: [" + i18 + str7 + i13 + "], target: [" + i14 + str7 + i15 + "]");
    }

    /* renamed from: g */
    private C5323v<Bitmap> m25757g(C5840s sVar, int i, int i2, C5163h hVar, C5833b bVar) throws IOException {
        C5163h hVar2 = hVar;
        byte[] bArr = (byte[]) this.f24563c.mo21806d(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
        BitmapFactory.Options k = m25761k();
        k.inTempStorage = bArr;
        C5155b bVar2 = (C5155b) hVar2.mo21340c(f24552f);
        C5164i iVar = (C5164i) hVar2.mo21340c(f24553g);
        C5823l lVar = (C5823l) hVar2.mo21340c(C5823l.f24547h);
        boolean booleanValue = ((Boolean) hVar2.mo21340c(f24555i)).booleanValue();
        C5160g gVar = f24556j;
        try {
            return C5811e.m25696e(m25758h(sVar, k, lVar, bVar2, iVar, hVar2.mo21340c(gVar) != null && ((Boolean) hVar2.mo21340c(gVar)).booleanValue(), i, i2, booleanValue, bVar), this.f24561a);
        } finally {
            m25769v(k);
            this.f24563c.put(bArr);
        }
    }

    /* renamed from: h */
    private Bitmap m25758h(C5840s sVar, BitmapFactory.Options options, C5823l lVar, C5155b bVar, C5164i iVar, boolean z, int i, int i2, boolean z2, C5833b bVar2) throws IOException {
        int i3;
        int i4;
        C5831m mVar;
        int i5;
        ColorSpace colorSpace;
        int i6;
        int i7;
        BitmapFactory.Options options2 = options;
        C5833b bVar3 = bVar2;
        long b = C0061f.m231b();
        int[] m = m25763m(sVar, options2, bVar3, this.f24561a);
        boolean z3 = false;
        int i8 = m[0];
        int i9 = m[1];
        String str = options2.outMimeType;
        boolean z4 = (i8 == -1 || i9 == -1) ? false : z;
        int a = sVar.mo22735a();
        int i10 = C5793a0.m25650i(a);
        boolean l = C5793a0.m25653l(a);
        int i11 = i;
        if (i11 == Integer.MIN_VALUE) {
            i4 = i2;
            i3 = m25765r(i10) ? i9 : i8;
        } else {
            i4 = i2;
            i3 = i11;
        }
        int i12 = i4 == Integer.MIN_VALUE ? m25765r(i10) ? i8 : i9 : i4;
        ImageHeaderParser.ImageType d = sVar.mo22738d();
        C5387e eVar = this.f24561a;
        ImageHeaderParser.ImageType imageType = d;
        m25756c(d, sVar, bVar2, eVar, lVar, i10, i8, i9, i3, i12, options);
        int i13 = a;
        String str2 = str;
        int i14 = i9;
        int i15 = i8;
        C5833b bVar4 = bVar3;
        BitmapFactory.Options options3 = options2;
        m25755b(sVar, bVar, z4, l, options, i3, i12);
        int i16 = Build.VERSION.SDK_INT;
        boolean z5 = i16 >= 19;
        if (options3.inSampleSize == 1 || z5) {
            mVar = this;
            if (mVar.m25773z(imageType)) {
                if (i15 < 0 || i14 < 0 || !z2 || !z5) {
                    float f = m25766s(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                    int i17 = options3.inSampleSize;
                    float f2 = (float) i17;
                    float f3 = f;
                    i7 = Math.round(((float) ((int) Math.ceil((double) (((float) i15) / f2)))) * f3);
                    i6 = Math.round(((float) ((int) Math.ceil((double) (((float) i14) / f2)))) * f3);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + i7 + "x" + i6 + "] for source [" + i15 + "x" + i14 + "], sampleSize: " + i17 + ", targetDensity: " + options3.inTargetDensity + ", density: " + options3.inDensity + ", density multiplier: " + f3);
                    }
                } else {
                    i7 = i3;
                    i6 = i12;
                }
                if (i7 > 0 && i6 > 0) {
                    m25772y(options3, mVar.f24561a, i7, i6);
                }
            }
        } else {
            mVar = this;
        }
        if (i16 >= 28) {
            if (iVar == C5164i.DISPLAY_P3 && (colorSpace = options3.outColorSpace) != null && colorSpace.isWideGamut()) {
                z3 = true;
            }
            options3.inPreferredColorSpace = ColorSpace.get(z3 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i16 >= 26) {
            options3.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap i18 = m25759i(sVar, options3, bVar4, mVar.f24561a);
        bVar4.mo22730a(mVar.f24561a, i18);
        if (Log.isLoggable("Downsampler", 2)) {
            i5 = i13;
            m25767t(i15, i14, str2, options, i18, i, i2, b);
        } else {
            i5 = i13;
        }
        Bitmap bitmap = null;
        if (i18 != null) {
            i18.setDensity(mVar.f24562b.densityDpi);
            bitmap = C5793a0.m25654m(mVar.f24561a, i18, i5);
            if (!i18.equals(bitmap)) {
                mVar.f24561a.mo21827c(i18);
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004e */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m25759i(p118n2.C5840s r5, android.graphics.BitmapFactory.Options r6, p118n2.C5831m.C5833b r7, p086h2.C5387e r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.mo22731b()
            r5.mo22737c()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = p118n2.C5793a0.m25649h()
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo22736b(r6)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.util.concurrent.locks.Lock r6 = p118n2.C5793a0.m25649h()
            r6.unlock()
            return r5
        L_0x0025:
            r5 = move-exception
            goto L_0x0050
        L_0x0027:
            r4 = move-exception
            java.io.IOException r1 = m25768u(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x0025 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0025 }
        L_0x0038:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x004f
            r8.mo21827c(r0)     // Catch:{ IOException -> 0x004e }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x004e }
            android.graphics.Bitmap r5 = m25759i(r5, r6, r7, r8)     // Catch:{ IOException -> 0x004e }
            java.util.concurrent.locks.Lock r6 = p118n2.C5793a0.m25649h()
            r6.unlock()
            return r5
        L_0x004e:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x004f:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0050:
            java.util.concurrent.locks.Lock r6 = p118n2.C5793a0.m25649h()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p118n2.C5831m.m25759i(n2.s, android.graphics.BitmapFactory$Options, n2.m$b, h2.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    /* renamed from: j */
    private static String m25760j(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    /* renamed from: k */
    private static synchronized BitmapFactory.Options m25761k() {
        BitmapFactory.Options poll;
        synchronized (C5831m.class) {
            Queue<BitmapFactory.Options> queue = f24560n;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m25770w(poll);
            }
        }
        return poll;
    }

    /* renamed from: l */
    private static int m25762l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: m */
    private static int[] m25763m(C5840s sVar, BitmapFactory.Options options, C5833b bVar, C5387e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        m25759i(sVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    private static String m25764n(BitmapFactory.Options options) {
        return m25760j(options.inBitmap);
    }

    /* renamed from: r */
    private static boolean m25765r(int i) {
        return i == 90 || i == 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m25766s(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p118n2.C5831m.m25766s(android.graphics.BitmapFactory$Options):boolean");
    }

    /* renamed from: t */
    private static void m25767t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("Downsampler", "Decoded " + m25760j(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m25764n(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C0061f.m230a(j));
    }

    /* renamed from: u */
    private static IOException m25768u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m25764n(options), illegalArgumentException);
    }

    /* renamed from: v */
    private static void m25769v(BitmapFactory.Options options) {
        m25770w(options);
        Queue<BitmapFactory.Options> queue = f24560n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    private static void m25770w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    private static int m25771x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: y */
    private static void m25772y(BitmapFactory.Options options, C5387e eVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo21829e(i, i2, config);
    }

    /* renamed from: z */
    private boolean m25773z(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f24559m.contains(imageType);
    }

    /* renamed from: d */
    public C5323v<Bitmap> mo22724d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C5163h hVar) throws IOException {
        return m25757g(new C5840s.C5842b(parcelFileDescriptor, this.f24564d, this.f24563c), i, i2, hVar, f24558l);
    }

    /* renamed from: e */
    public C5323v<Bitmap> mo22725e(InputStream inputStream, int i, int i2, C5163h hVar) throws IOException {
        return mo22726f(inputStream, i, i2, hVar, f24558l);
    }

    /* renamed from: f */
    public C5323v<Bitmap> mo22726f(InputStream inputStream, int i, int i2, C5163h hVar, C5833b bVar) throws IOException {
        return m25757g(new C5840s.C5841a(inputStream, this.f24564d, this.f24563c), i, i2, hVar, bVar);
    }

    /* renamed from: o */
    public boolean mo22727o(ParcelFileDescriptor parcelFileDescriptor) {
        return C5224m.m23696c();
    }

    /* renamed from: p */
    public boolean mo22728p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean mo22729q(ByteBuffer byteBuffer) {
        return true;
    }
}
