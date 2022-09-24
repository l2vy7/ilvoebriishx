package p107l2;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p065d2.C5163h;
import p076f2.C5255b;
import p076f2.C5256c;
import p102k2.C5596n;
import p102k2.C5598o;
import p102k2.C5604r;
import p184z2.C6445b;

/* renamed from: l2.c */
/* compiled from: MediaStoreImageThumbLoader */
public class C5656c implements C5596n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f24224a;

    /* renamed from: l2.c$a */
    /* compiled from: MediaStoreImageThumbLoader */
    public static class C5657a implements C5598o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f24225a;

        public C5657a(Context context) {
            this.f24225a = context;
        }

        /* renamed from: a */
        public C5596n<Uri, InputStream> mo22118a(C5604r rVar) {
            return new C5656c(this.f24225a);
        }
    }

    public C5656c(Context context) {
        this.f24224a = context.getApplicationContext();
    }

    /* renamed from: c */
    public C5596n.C5597a<InputStream> mo22113a(Uri uri, int i, int i2, C5163h hVar) {
        if (C5255b.m23759d(i, i2)) {
            return new C5596n.C5597a<>(new C6445b(uri), C5256c.m23762f(this.f24224a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo22114b(Uri uri) {
        return C5255b.m23756a(uri);
    }
}
