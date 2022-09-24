package p106l2;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p064d2.C5163h;
import p075f2.C5255b;
import p075f2.C5256c;
import p101k2.C5596n;
import p101k2.C5598o;
import p101k2.C5604r;
import p118n2.C5801c0;
import p183z2.C6445b;

/* renamed from: l2.d */
/* compiled from: MediaStoreVideoThumbLoader */
public class C5658d implements C5596n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f24226a;

    /* renamed from: l2.d$a */
    /* compiled from: MediaStoreVideoThumbLoader */
    public static class C5659a implements C5598o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f24227a;

        public C5659a(Context context) {
            this.f24227a = context;
        }

        /* renamed from: a */
        public C5596n<Uri, InputStream> mo22118a(C5604r rVar) {
            return new C5658d(this.f24227a);
        }
    }

    public C5658d(Context context) {
        this.f24226a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m24994e(C5163h hVar) {
        Long l = (Long) hVar.mo21340c(C5801c0.f24518d);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: c */
    public C5596n.C5597a<InputStream> mo22113a(Uri uri, int i, int i2, C5163h hVar) {
        if (!C5255b.m23759d(i, i2) || !m24994e(hVar)) {
            return null;
        }
        return new C5596n.C5597a<>(new C6445b(uri), C5256c.m23763g(this.f24226a, uri));
    }

    /* renamed from: d */
    public boolean mo22114b(Uri uri) {
        return C5255b.m23758c(uri);
    }
}
