package p101k2;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p064d2.C5163h;
import p070e2.C5208d;
import p070e2.C5216h;
import p070e2.C5227n;
import p101k2.C5596n;
import p183z2.C6445b;

/* renamed from: k2.a */
/* compiled from: AssetUriLoader */
public class C5554a<Data> implements C5596n<Uri, Data> {

    /* renamed from: c */
    private static final int f24077c = 22;

    /* renamed from: a */
    private final AssetManager f24078a;

    /* renamed from: b */
    private final C5555a<Data> f24079b;

    /* renamed from: k2.a$a */
    /* compiled from: AssetUriLoader */
    public interface C5555a<Data> {
        /* renamed from: b */
        C5208d<Data> mo22117b(AssetManager assetManager, String str);
    }

    /* renamed from: k2.a$b */
    /* compiled from: AssetUriLoader */
    public static class C5556b implements C5598o<Uri, ParcelFileDescriptor>, C5555a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f24080a;

        public C5556b(AssetManager assetManager) {
            this.f24080a = assetManager;
        }

        /* renamed from: a */
        public C5596n<Uri, ParcelFileDescriptor> mo22118a(C5604r rVar) {
            return new C5554a(this.f24080a, this);
        }

        /* renamed from: b */
        public C5208d<ParcelFileDescriptor> mo22117b(AssetManager assetManager, String str) {
            return new C5216h(assetManager, str);
        }
    }

    /* renamed from: k2.a$c */
    /* compiled from: AssetUriLoader */
    public static class C5557c implements C5598o<Uri, InputStream>, C5555a<InputStream> {

        /* renamed from: a */
        private final AssetManager f24081a;

        public C5557c(AssetManager assetManager) {
            this.f24081a = assetManager;
        }

        /* renamed from: a */
        public C5596n<Uri, InputStream> mo22118a(C5604r rVar) {
            return new C5554a(this.f24081a, this);
        }

        /* renamed from: b */
        public C5208d<InputStream> mo22117b(AssetManager assetManager, String str) {
            return new C5227n(assetManager, str);
        }
    }

    public C5554a(AssetManager assetManager, C5555a<Data> aVar) {
        this.f24078a = assetManager;
        this.f24079b = aVar;
    }

    /* renamed from: c */
    public C5596n.C5597a<Data> mo22113a(Uri uri, int i, int i2, C5163h hVar) {
        return new C5596n.C5597a<>(new C6445b(uri), this.f24079b.mo22117b(this.f24078a, uri.toString().substring(f24077c)));
    }

    /* renamed from: d */
    public boolean mo22114b(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
