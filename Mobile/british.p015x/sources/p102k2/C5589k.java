package p102k2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.C3325f;
import java.io.File;
import java.io.FileNotFoundException;
import p065d2.C5154a;
import p065d2.C5163h;
import p071e2.C5208d;
import p076f2.C5255b;
import p102k2.C5596n;
import p184z2.C6445b;

/* renamed from: k2.k */
/* compiled from: MediaStoreFileLoader */
public final class C5589k implements C5596n<Uri, File> {

    /* renamed from: a */
    private final Context f24116a;

    /* renamed from: k2.k$a */
    /* compiled from: MediaStoreFileLoader */
    public static final class C5590a implements C5598o<Uri, File> {

        /* renamed from: a */
        private final Context f24117a;

        public C5590a(Context context) {
            this.f24117a = context;
        }

        /* renamed from: a */
        public C5596n<Uri, File> mo22118a(C5604r rVar) {
            return new C5589k(this.f24117a);
        }
    }

    /* renamed from: k2.k$b */
    /* compiled from: MediaStoreFileLoader */
    private static class C5591b implements C5208d<File> {

        /* renamed from: d */
        private static final String[] f24118d = {"_data"};

        /* renamed from: b */
        private final Context f24119b;

        /* renamed from: c */
        private final Uri f24120c;

        C5591b(Context context, Uri uri) {
            this.f24119b = context;
            this.f24120c = uri;
        }

        /* renamed from: a */
        public Class<File> mo21422a() {
            return File.class;
        }

        /* renamed from: b */
        public void mo21427b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C5154a mo21430d() {
            return C5154a.LOCAL;
        }

        /* renamed from: e */
        public void mo21431e(C3325f fVar, C5208d.C5209a<? super File> aVar) {
            Cursor query = this.f24119b.getContentResolver().query(this.f24120c, f24118d, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo21438c(new FileNotFoundException("Failed to find file path for: " + this.f24120c));
                return;
            }
            aVar.mo21439f(new File(str));
        }
    }

    public C5589k(Context context) {
        this.f24116a = context;
    }

    /* renamed from: c */
    public C5596n.C5597a<File> mo22113a(Uri uri, int i, int i2, C5163h hVar) {
        return new C5596n.C5597a<>(new C6445b(uri), new C5591b(this.f24116a, uri));
    }

    /* renamed from: d */
    public boolean mo22114b(Uri uri) {
        return C5255b.m23757b(uri);
    }
}
