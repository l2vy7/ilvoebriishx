package p235n4;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: n4.b */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10814b {

    /* renamed from: a */
    private final Context f49559a;

    /* renamed from: b */
    private final ImageHints f49560b;

    /* renamed from: c */
    private Uri f49561c;

    /* renamed from: d */
    private C10818f f49562d;

    /* renamed from: e */
    private C10816d f49563e;

    /* renamed from: f */
    private Bitmap f49564f;

    /* renamed from: g */
    private boolean f49565g;

    /* renamed from: h */
    private C10813a f49566h;

    public C10814b(Context context) {
        this(context, new ImageHints(-1, 0, 0));
    }

    /* renamed from: e */
    private final void m48782e() {
        C10818f fVar = this.f49562d;
        if (fVar != null) {
            fVar.cancel(true);
            this.f49562d = null;
        }
        this.f49561c = null;
        this.f49564f = null;
        this.f49565g = false;
    }

    /* renamed from: a */
    public final void mo42980a(C10813a aVar) {
        this.f49566h = aVar;
    }

    /* renamed from: b */
    public final boolean mo42981b(Uri uri) {
        Uri uri2 = uri;
        if (uri2 == null) {
            m48782e();
            return true;
        } else if (!uri2.equals(this.f49561c)) {
            m48782e();
            this.f49561c = uri2;
            if (this.f49560b.mo29469E0() == 0 || this.f49560b.mo29467C0() == 0) {
                this.f49562d = new C10818f(this.f49559a, 0, 0, false, 2097152, 5, 333, 10000, this, (byte[]) null);
            } else {
                this.f49562d = new C10818f(this.f49559a, this.f49560b.mo29469E0(), this.f49560b.mo29467C0(), false, 2097152, 5, 333, 10000, this, (byte[]) null);
            }
            ((C10818f) C4604n.m20098k(this.f49562d)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{(Uri) C4604n.m20098k(this.f49561c)});
            return false;
        } else if (this.f49565g) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo42982c() {
        m48782e();
        this.f49566h = null;
    }

    /* renamed from: d */
    public final void mo42983d(Bitmap bitmap) {
        this.f49564f = bitmap;
        this.f49565g = true;
        C10813a aVar = this.f49566h;
        if (aVar != null) {
            aVar.mo29584a(bitmap);
        }
        this.f49562d = null;
    }

    public C10814b(Context context, ImageHints imageHints) {
        this.f49559a = context;
        this.f49560b = imageHints;
        this.f49563e = new C10816d();
        m48782e();
    }
}
