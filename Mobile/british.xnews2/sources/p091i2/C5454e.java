package p091i2;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p012b2.C1545a;
import p064d2.C5159f;
import p091i2.C5445a;

/* renamed from: i2.e */
/* compiled from: DiskLruCacheWrapper */
public class C5454e implements C5445a {

    /* renamed from: a */
    private final C5464j f23808a;

    /* renamed from: b */
    private final File f23809b;

    /* renamed from: c */
    private final long f23810c;

    /* renamed from: d */
    private final C5449c f23811d = new C5449c();

    /* renamed from: e */
    private C1545a f23812e;

    @Deprecated
    protected C5454e(File file, long j) {
        this.f23809b = file;
        this.f23810c = j;
        this.f23808a = new C5464j();
    }

    /* renamed from: c */
    public static C5445a m24440c(File file, long j) {
        return new C5454e(file, j);
    }

    /* renamed from: d */
    private synchronized C1545a m24441d() throws IOException {
        if (this.f23812e == null) {
            this.f23812e = C1545a.m7943w(this.f23809b, 1, 1, this.f23810c);
        }
        return this.f23812e;
    }

    /* renamed from: a */
    public File mo21909a(C5159f fVar) {
        String b = this.f23808a.mo21930b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b + " for for Key: " + fVar);
        }
        try {
            C1545a.C1550e u = m24441d().mo7090u(b);
            if (u != null) {
                return u.mo7101a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: b */
    public void mo21910b(C5159f fVar, C5445a.C5447b bVar) {
        C1545a.C1548c r;
        String b = this.f23808a.mo21930b(fVar);
        this.f23811d.mo21912a(b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b + " for for Key: " + fVar);
            }
            try {
                C1545a d = m24441d();
                if (d.mo7090u(b) == null) {
                    r = d.mo7089r(b);
                    if (r != null) {
                        if (bVar.mo21498a(r.mo7097f(0))) {
                            r.mo7096e();
                        }
                        r.mo7095b();
                        this.f23811d.mo21913b(b);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b);
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                r.mo7095b();
                throw th;
            }
        } finally {
            this.f23811d.mo21913b(b);
        }
    }
}
