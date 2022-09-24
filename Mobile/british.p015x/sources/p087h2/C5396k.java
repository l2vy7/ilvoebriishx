package p087h2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: h2.k */
/* compiled from: LruBitmapPool */
public class C5396k implements C5387e {

    /* renamed from: k */
    private static final Bitmap.Config f23690k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final C5399l f23691a;

    /* renamed from: b */
    private final Set<Bitmap.Config> f23692b;

    /* renamed from: c */
    private final long f23693c;

    /* renamed from: d */
    private final C5397a f23694d;

    /* renamed from: e */
    private long f23695e;

    /* renamed from: f */
    private long f23696f;

    /* renamed from: g */
    private int f23697g;

    /* renamed from: h */
    private int f23698h;

    /* renamed from: i */
    private int f23699i;

    /* renamed from: j */
    private int f23700j;

    /* renamed from: h2.k$a */
    /* compiled from: LruBitmapPool */
    private interface C5397a {
        /* renamed from: a */
        void mo21848a(Bitmap bitmap);

        /* renamed from: b */
        void mo21849b(Bitmap bitmap);
    }

    /* renamed from: h2.k$b */
    /* compiled from: LruBitmapPool */
    private static final class C5398b implements C5397a {
        C5398b() {
        }

        /* renamed from: a */
        public void mo21848a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo21849b(Bitmap bitmap) {
        }
    }

    C5396k(long j, C5399l lVar, Set<Bitmap.Config> set) {
        this.f23693c = j;
        this.f23695e = j;
        this.f23691a = lVar;
        this.f23692b = set;
        this.f23694d = new C5398b();
    }

    @TargetApi(26)
    /* renamed from: f */
    private static void m24277f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    private static Bitmap m24278g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f23690k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: h */
    private void m24279h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m24280i();
        }
    }

    /* renamed from: i */
    private void m24280i() {
        Log.v("LruBitmapPool", "Hits=" + this.f23697g + ", misses=" + this.f23698h + ", puts=" + this.f23699i + ", evictions=" + this.f23700j + ", currentSize=" + this.f23696f + ", maxSize=" + this.f23695e + "\nStrategy=" + this.f23691a);
    }

    /* renamed from: j */
    private void m24281j() {
        m24287q(this.f23695e);
    }

    @TargetApi(26)
    /* renamed from: k */
    private static Set<Bitmap.Config> m24282k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            hashSet.add((Object) null);
        }
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    private static C5399l m24283l() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C5401n();
        }
        return new C5383c();
    }

    /* renamed from: m */
    private synchronized Bitmap m24284m(int i, int i2, Bitmap.Config config) {
        Bitmap d;
        m24277f(config);
        d = this.f23691a.mo21811d(i, i2, config != null ? config : f23690k);
        if (d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f23691a.mo21809b(i, i2, config));
            }
            this.f23698h++;
        } else {
            this.f23697g++;
            this.f23696f -= (long) this.f23691a.mo21812e(d);
            this.f23694d.mo21848a(d);
            m24286p(d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f23691a.mo21809b(i, i2, config));
        }
        m24279h();
        return d;
    }

    @TargetApi(19)
    /* renamed from: o */
    private static void m24285o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: p */
    private static void m24286p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m24285o(bitmap);
    }

    /* renamed from: q */
    private synchronized void m24287q(long j) {
        while (this.f23696f > j) {
            Bitmap a = this.f23691a.mo21808a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m24280i();
                }
                this.f23696f = 0;
                return;
            }
            this.f23694d.mo21848a(a);
            this.f23696f -= (long) this.f23691a.mo21812e(a);
            this.f23700j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f23691a.mo21813f(a));
            }
            m24279h();
            a.recycle();
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo21825a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            mo21826b();
        } else if (i >= 20 || i == 15) {
            m24287q(mo21847n() / 2);
        }
    }

    /* renamed from: b */
    public void mo21826b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m24287q(0);
    }

    /* renamed from: c */
    public synchronized void mo21827c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f23691a.mo21812e(bitmap)) <= this.f23695e) {
                        if (this.f23692b.contains(bitmap.getConfig())) {
                            int e = this.f23691a.mo21812e(bitmap);
                            this.f23691a.mo21810c(bitmap);
                            this.f23694d.mo21849b(bitmap);
                            this.f23699i++;
                            this.f23696f += (long) e;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f23691a.mo21813f(bitmap));
                            }
                            m24279h();
                            m24281j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f23691a.mo21813f(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f23692b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: d */
    public Bitmap mo21828d(int i, int i2, Bitmap.Config config) {
        Bitmap m = m24284m(i, i2, config);
        if (m == null) {
            return m24278g(i, i2, config);
        }
        m.eraseColor(0);
        return m;
    }

    /* renamed from: e */
    public Bitmap mo21829e(int i, int i2, Bitmap.Config config) {
        Bitmap m = m24284m(i, i2, config);
        return m == null ? m24278g(i, i2, config) : m;
    }

    /* renamed from: n */
    public long mo21847n() {
        return this.f23695e;
    }

    public C5396k(long j) {
        this(j, m24283l(), m24282k());
    }
}
