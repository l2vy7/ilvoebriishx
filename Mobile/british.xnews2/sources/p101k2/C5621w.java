package p101k2;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p064d2.C5163h;
import p070e2.C5205a;
import p070e2.C5208d;
import p070e2.C5217i;
import p070e2.C5228o;
import p101k2.C5596n;
import p183z2.C6445b;

/* renamed from: k2.w */
/* compiled from: UriLoader */
public class C5621w<Data> implements C5596n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f24163b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a */
    private final C5624c<Data> f24164a;

    /* renamed from: k2.w$a */
    /* compiled from: UriLoader */
    public static final class C5622a implements C5598o<Uri, AssetFileDescriptor>, C5624c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f24165a;

        public C5622a(ContentResolver contentResolver) {
            this.f24165a = contentResolver;
        }

        /* renamed from: a */
        public C5596n<Uri, AssetFileDescriptor> mo22118a(C5604r rVar) {
            return new C5621w(this);
        }

        /* renamed from: b */
        public C5208d<AssetFileDescriptor> mo22185b(Uri uri) {
            return new C5205a(this.f24165a, uri);
        }
    }

    /* renamed from: k2.w$b */
    /* compiled from: UriLoader */
    public static class C5623b implements C5598o<Uri, ParcelFileDescriptor>, C5624c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f24166a;

        public C5623b(ContentResolver contentResolver) {
            this.f24166a = contentResolver;
        }

        /* renamed from: a */
        public C5596n<Uri, ParcelFileDescriptor> mo22118a(C5604r rVar) {
            return new C5621w(this);
        }

        /* renamed from: b */
        public C5208d<ParcelFileDescriptor> mo22185b(Uri uri) {
            return new C5217i(this.f24166a, uri);
        }
    }

    /* renamed from: k2.w$c */
    /* compiled from: UriLoader */
    public interface C5624c<Data> {
        /* renamed from: b */
        C5208d<Data> mo22185b(Uri uri);
    }

    /* renamed from: k2.w$d */
    /* compiled from: UriLoader */
    public static class C5625d implements C5598o<Uri, InputStream>, C5624c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f24167a;

        public C5625d(ContentResolver contentResolver) {
            this.f24167a = contentResolver;
        }

        /* renamed from: a */
        public C5596n<Uri, InputStream> mo22118a(C5604r rVar) {
            return new C5621w(this);
        }

        /* renamed from: b */
        public C5208d<InputStream> mo22185b(Uri uri) {
            return new C5228o(this.f24167a, uri);
        }
    }

    public C5621w(C5624c<Data> cVar) {
        this.f24164a = cVar;
    }

    /* renamed from: c */
    public C5596n.C5597a<Data> mo22113a(Uri uri, int i, int i2, C5163h hVar) {
        return new C5596n.C5597a<>(new C6445b(uri), this.f24164a.mo22185b(uri));
    }

    /* renamed from: d */
    public boolean mo22114b(Uri uri) {
        return f24163b.contains(uri.getScheme());
    }
}
