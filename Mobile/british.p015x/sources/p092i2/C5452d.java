package p092i2;

import java.io.File;
import p092i2.C5445a;

/* renamed from: i2.d */
/* compiled from: DiskLruCacheFactory */
public class C5452d implements C5445a.C5446a {

    /* renamed from: a */
    private final long f23806a;

    /* renamed from: b */
    private final C5453a f23807b;

    /* renamed from: i2.d$a */
    /* compiled from: DiskLruCacheFactory */
    public interface C5453a {
        /* renamed from: a */
        File mo21916a();
    }

    public C5452d(C5453a aVar, long j) {
        this.f23806a = j;
        this.f23807b = aVar;
    }

    public C5445a build() {
        File a = this.f23807b.mo21916a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C5454e.m24440c(a, this.f23806a);
        }
        return null;
    }
}
