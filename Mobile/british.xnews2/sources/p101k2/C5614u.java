package p101k2;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p064d2.C5163h;
import p101k2.C5596n;

/* renamed from: k2.u */
/* compiled from: StringLoader */
public class C5614u<Data> implements C5596n<String, Data> {

    /* renamed from: a */
    private final C5596n<Uri, Data> f24159a;

    /* renamed from: k2.u$a */
    /* compiled from: StringLoader */
    public static final class C5615a implements C5598o<String, AssetFileDescriptor> {
        /* renamed from: a */
        public C5596n<String, AssetFileDescriptor> mo22118a(C5604r rVar) {
            return new C5614u(rVar.mo22173d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: k2.u$b */
    /* compiled from: StringLoader */
    public static class C5616b implements C5598o<String, ParcelFileDescriptor> {
        /* renamed from: a */
        public C5596n<String, ParcelFileDescriptor> mo22118a(C5604r rVar) {
            return new C5614u(rVar.mo22173d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: k2.u$c */
    /* compiled from: StringLoader */
    public static class C5617c implements C5598o<String, InputStream> {
        /* renamed from: a */
        public C5596n<String, InputStream> mo22118a(C5604r rVar) {
            return new C5614u(rVar.mo22173d(Uri.class, InputStream.class));
        }
    }

    public C5614u(C5596n<Uri, Data> nVar) {
        this.f24159a = nVar;
    }

    /* renamed from: e */
    private static Uri m24895e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m24896f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? m24896f(str) : parse;
    }

    /* renamed from: f */
    private static Uri m24896f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public C5596n.C5597a<Data> mo22113a(String str, int i, int i2, C5163h hVar) {
        Uri e = m24895e(str);
        if (e == null || !this.f24159a.mo22114b(e)) {
            return null;
        }
        return this.f24159a.mo22113a(e, i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo22114b(String str) {
        return true;
    }
}
