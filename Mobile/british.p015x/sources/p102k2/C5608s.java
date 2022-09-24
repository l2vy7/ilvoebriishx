package p102k2;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import p065d2.C5163h;
import p102k2.C5596n;

/* renamed from: k2.s */
/* compiled from: ResourceLoader */
public class C5608s<Data> implements C5596n<Integer, Data> {

    /* renamed from: a */
    private final C5596n<Uri, Data> f24152a;

    /* renamed from: b */
    private final Resources f24153b;

    /* renamed from: k2.s$a */
    /* compiled from: ResourceLoader */
    public static final class C5609a implements C5598o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f24154a;

        public C5609a(Resources resources) {
            this.f24154a = resources;
        }

        /* renamed from: a */
        public C5596n<Integer, AssetFileDescriptor> mo22118a(C5604r rVar) {
            return new C5608s(this.f24154a, rVar.mo22173d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: k2.s$b */
    /* compiled from: ResourceLoader */
    public static class C5610b implements C5598o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f24155a;

        public C5610b(Resources resources) {
            this.f24155a = resources;
        }

        /* renamed from: a */
        public C5596n<Integer, ParcelFileDescriptor> mo22118a(C5604r rVar) {
            return new C5608s(this.f24155a, rVar.mo22173d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: k2.s$c */
    /* compiled from: ResourceLoader */
    public static class C5611c implements C5598o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f24156a;

        public C5611c(Resources resources) {
            this.f24156a = resources;
        }

        /* renamed from: a */
        public C5596n<Integer, InputStream> mo22118a(C5604r rVar) {
            return new C5608s(this.f24156a, rVar.mo22173d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: k2.s$d */
    /* compiled from: ResourceLoader */
    public static class C5612d implements C5598o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f24157a;

        public C5612d(Resources resources) {
            this.f24157a = resources;
        }

        /* renamed from: a */
        public C5596n<Integer, Uri> mo22118a(C5604r rVar) {
            return new C5608s(this.f24157a, C5618v.m24904c());
        }
    }

    public C5608s(Resources resources, C5596n<Uri, Data> nVar) {
        this.f24153b = resources;
        this.f24152a = nVar;
    }

    /* renamed from: d */
    private Uri m24884d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f24153b.getResourcePackageName(num.intValue()) + '/' + this.f24153b.getResourceTypeName(num.intValue()) + '/' + this.f24153b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            return null;
        }
    }

    /* renamed from: c */
    public C5596n.C5597a<Data> mo22113a(Integer num, int i, int i2, C5163h hVar) {
        Uri d = m24884d(num);
        if (d == null) {
            return null;
        }
        return this.f24152a.mo22113a(d, i, i2, hVar);
    }

    /* renamed from: e */
    public boolean mo22114b(Integer num) {
        return true;
    }
}
