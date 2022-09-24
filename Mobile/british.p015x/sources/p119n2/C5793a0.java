package p119n2;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p004a3.C0065j;
import p087h2.C5387e;

/* renamed from: n2.a0 */
/* compiled from: TransformationUtils */
public final class C5793a0 {

    /* renamed from: a */
    private static final Paint f24506a = new Paint(6);

    /* renamed from: b */
    private static final Paint f24507b = new Paint(7);

    /* renamed from: c */
    private static final Paint f24508c;

    /* renamed from: d */
    private static final Set<String> f24509d;

    /* renamed from: e */
    private static final Lock f24510e;

    /* renamed from: n2.a0$a */
    /* compiled from: TransformationUtils */
    class C5794a implements C5795b {

        /* renamed from: a */
        final /* synthetic */ int f24511a;

        C5794a(int i) {
            this.f24511a = i;
        }

        /* renamed from: a */
        public void mo22686a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f24511a;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        }
    }

    /* renamed from: n2.a0$b */
    /* compiled from: TransformationUtils */
    private interface C5795b {
        /* renamed from: a */
        void mo22686a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: n2.a0$c */
    /* compiled from: TransformationUtils */
    private static final class C5796c implements Lock {
        C5796c() {
        }

        public void lock() {
        }

        public void lockInterruptibly() throws InterruptedException {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f24509d = hashSet;
        f24510e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new C5796c();
        Paint paint = new Paint(7);
        f24508c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m25642a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f24510e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f24506a);
            m25645d(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f24510e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m25643b(C5387e eVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap d = eVar.mo21828d(i, i2, m25651j(bitmap));
        m25657p(bitmap, d);
        m25642a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: c */
    public static Bitmap m25644c(C5387e eVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return m25646e(eVar, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: d */
    private static void m25645d(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    /* renamed from: e */
    public static Bitmap m25646e(C5387e eVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap d = eVar.mo21828d((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m25651j(bitmap));
        m25657p(bitmap, d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + d.getWidth() + "x" + d.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m25642a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: f */
    private static Bitmap m25647f(C5387e eVar, Bitmap bitmap) {
        Bitmap.Config g = m25648g(bitmap);
        if (g.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d = eVar.mo21828d(bitmap.getWidth(), bitmap.getHeight(), g);
        new Canvas(d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d;
    }

    /* renamed from: g */
    private static Bitmap.Config m25648g(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGBA_F16;
    }

    /* renamed from: h */
    public static Lock m25649h() {
        return f24510e;
    }

    /* renamed from: i */
    public static int m25650i(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: j */
    private static Bitmap.Config m25651j(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: k */
    static void m25652k(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: l */
    public static boolean m25653l(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: m */
    public static Bitmap m25654m(C5387e eVar, Bitmap bitmap, int i) {
        if (!m25653l(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m25652k(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d = eVar.mo21828d(Math.round(rectF.width()), Math.round(rectF.height()), m25651j(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d.setHasAlpha(bitmap.hasAlpha());
        m25642a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: n */
    public static Bitmap m25655n(C5387e eVar, Bitmap bitmap, int i) {
        C0065j.m244a(i > 0, "roundingRadius must be greater than 0.");
        return m25656o(eVar, bitmap, new C5794a(i));
    }

    /* renamed from: o */
    private static Bitmap m25656o(C5387e eVar, Bitmap bitmap, C5795b bVar) {
        Bitmap.Config g = m25648g(bitmap);
        Bitmap f = m25647f(eVar, bitmap);
        Bitmap d = eVar.mo21828d(f.getWidth(), f.getHeight(), g);
        d.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(f, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) d.getWidth(), (float) d.getHeight());
        Lock lock = f24510e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            bVar.mo22686a(canvas, paint, rectF);
            m25645d(canvas);
            lock.unlock();
            if (!f.equals(bitmap)) {
                eVar.mo21827c(f);
            }
            return d;
        } catch (Throwable th) {
            f24510e.unlock();
            throw th;
        }
    }

    /* renamed from: p */
    public static void m25657p(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
