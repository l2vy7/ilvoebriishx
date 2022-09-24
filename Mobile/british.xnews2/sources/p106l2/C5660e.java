package p106l2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.C3325f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p064d2.C5154a;
import p064d2.C5163h;
import p070e2.C5208d;
import p075f2.C5255b;
import p101k2.C5596n;
import p101k2.C5598o;
import p101k2.C5604r;
import p183z2.C6445b;

/* renamed from: l2.e */
/* compiled from: QMediaStoreUriLoader */
public final class C5660e<DataT> implements C5596n<Uri, DataT> {

    /* renamed from: a */
    private final Context f24228a;

    /* renamed from: b */
    private final C5596n<File, DataT> f24229b;

    /* renamed from: c */
    private final C5596n<Uri, DataT> f24230c;

    /* renamed from: d */
    private final Class<DataT> f24231d;

    /* renamed from: l2.e$a */
    /* compiled from: QMediaStoreUriLoader */
    private static abstract class C5661a<DataT> implements C5598o<Uri, DataT> {

        /* renamed from: a */
        private final Context f24232a;

        /* renamed from: b */
        private final Class<DataT> f24233b;

        C5661a(Context context, Class<DataT> cls) {
            this.f24232a = context;
            this.f24233b = cls;
        }

        /* renamed from: a */
        public final C5596n<Uri, DataT> mo22118a(C5604r rVar) {
            return new C5660e(this.f24232a, rVar.mo22173d(File.class, this.f24233b), rVar.mo22173d(Uri.class, this.f24233b), this.f24233b);
        }
    }

    /* renamed from: l2.e$b */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C5662b extends C5661a<ParcelFileDescriptor> {
        public C5662b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: l2.e$c */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C5663c extends C5661a<InputStream> {
        public C5663c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: l2.e$d */
    /* compiled from: QMediaStoreUriLoader */
    private static final class C5664d<DataT> implements C5208d<DataT> {

        /* renamed from: l */
        private static final String[] f24234l = {"_data"};

        /* renamed from: b */
        private final Context f24235b;

        /* renamed from: c */
        private final C5596n<File, DataT> f24236c;

        /* renamed from: d */
        private final C5596n<Uri, DataT> f24237d;

        /* renamed from: e */
        private final Uri f24238e;

        /* renamed from: f */
        private final int f24239f;

        /* renamed from: g */
        private final int f24240g;

        /* renamed from: h */
        private final C5163h f24241h;

        /* renamed from: i */
        private final Class<DataT> f24242i;

        /* renamed from: j */
        private volatile boolean f24243j;

        /* renamed from: k */
        private volatile C5208d<DataT> f24244k;

        C5664d(Context context, C5596n<File, DataT> nVar, C5596n<Uri, DataT> nVar2, Uri uri, int i, int i2, C5163h hVar, Class<DataT> cls) {
            this.f24235b = context.getApplicationContext();
            this.f24236c = nVar;
            this.f24237d = nVar2;
            this.f24238e = uri;
            this.f24239f = i;
            this.f24240g = i2;
            this.f24241h = hVar;
            this.f24242i = cls;
        }

        /* renamed from: c */
        private C5596n.C5597a<DataT> m25005c() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f24236c.mo22113a(m25008h(this.f24238e), this.f24239f, this.f24240g, this.f24241h);
            }
            return this.f24237d.mo22113a(m25007g() ? MediaStore.setRequireOriginal(this.f24238e) : this.f24238e, this.f24239f, this.f24240g, this.f24241h);
        }

        /* renamed from: f */
        private C5208d<DataT> m25006f() throws FileNotFoundException {
            C5596n.C5597a c = m25005c();
            if (c != null) {
                return c.f24129c;
            }
            return null;
        }

        /* renamed from: g */
        private boolean m25007g() {
            return this.f24235b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        private File m25008h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                cursor = this.f24235b.getContentResolver().query(uri, f24234l, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        /* renamed from: a */
        public Class<DataT> mo21422a() {
            return this.f24242i;
        }

        /* renamed from: b */
        public void mo21427b() {
            C5208d<DataT> dVar = this.f24244k;
            if (dVar != null) {
                dVar.mo21427b();
            }
        }

        public void cancel() {
            this.f24243j = true;
            C5208d<DataT> dVar = this.f24244k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        /* renamed from: d */
        public C5154a mo21430d() {
            return C5154a.LOCAL;
        }

        /* renamed from: e */
        public void mo21431e(C3325f fVar, C5208d.C5209a<? super DataT> aVar) {
            try {
                C5208d<DataT> f = m25006f();
                if (f == null) {
                    aVar.mo21438c(new IllegalArgumentException("Failed to build fetcher for: " + this.f24238e));
                    return;
                }
                this.f24244k = f;
                if (this.f24243j) {
                    cancel();
                } else {
                    f.mo21431e(fVar, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo21438c(e);
            }
        }
    }

    C5660e(Context context, C5596n<File, DataT> nVar, C5596n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f24228a = context.getApplicationContext();
        this.f24229b = nVar;
        this.f24230c = nVar2;
        this.f24231d = cls;
    }

    /* renamed from: c */
    public C5596n.C5597a<DataT> mo22113a(Uri uri, int i, int i2, C5163h hVar) {
        return new C5596n.C5597a<>(new C6445b(uri), new C5664d(this.f24228a, this.f24229b, this.f24230c, uri, i, i2, hVar, this.f24231d));
    }

    /* renamed from: d */
    public boolean mo22114b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C5255b.m23757b(uri);
    }
}
