package p092i2;

import android.content.Context;
import java.io.File;
import p092i2.C5452d;

/* renamed from: i2.f */
/* compiled from: InternalCacheDiskCacheFactory */
public final class C5455f extends C5452d {

    /* renamed from: i2.f$a */
    /* compiled from: InternalCacheDiskCacheFactory */
    class C5456a implements C5452d.C5453a {

        /* renamed from: a */
        final /* synthetic */ Context f23813a;

        /* renamed from: b */
        final /* synthetic */ String f23814b;

        C5456a(Context context, String str) {
            this.f23813a = context;
            this.f23814b = str;
        }

        /* renamed from: a */
        public File mo21916a() {
            File cacheDir = this.f23813a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f23814b != null ? new File(cacheDir, this.f23814b) : cacheDir;
        }
    }

    public C5455f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C5455f(Context context, String str, long j) {
        super(new C5456a(context, str), j);
    }
}
