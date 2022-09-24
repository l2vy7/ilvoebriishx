package p075f2;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C3339a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p086h2.C5382b;

/* renamed from: f2.e */
/* compiled from: ThumbnailStreamOpener */
class C5260e {

    /* renamed from: f */
    private static final C5254a f23270f = new C5254a();

    /* renamed from: a */
    private final C5254a f23271a;

    /* renamed from: b */
    private final C5259d f23272b;

    /* renamed from: c */
    private final C5382b f23273c;

    /* renamed from: d */
    private final ContentResolver f23274d;

    /* renamed from: e */
    private final List<ImageHeaderParser> f23275e;

    C5260e(List<ImageHeaderParser> list, C5259d dVar, C5382b bVar, ContentResolver contentResolver) {
        this(list, f23270f, dVar, bVar, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m23772b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            f2.d r2 = r6.f23272b     // Catch:{ SecurityException -> 0x0024, all -> 0x0022 }
            android.database.Cursor r2 = r2.mo21475a(r7)     // Catch:{ SecurityException -> 0x0024, all -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001a }
            if (r3 == 0) goto L_0x001c
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch:{ SecurityException -> 0x001a }
            r2.close()
            return r7
        L_0x001a:
            r3 = move-exception
            goto L_0x0026
        L_0x001c:
            if (r2 == 0) goto L_0x0021
            r2.close()
        L_0x0021:
            return r1
        L_0x0022:
            r7 = move-exception
            goto L_0x0049
        L_0x0024:
            r3 = move-exception
            r2 = r1
        L_0x0026:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0041
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r4.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch:{ all -> 0x0047 }
            r4.append(r7)     // Catch:{ all -> 0x0047 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0047 }
            android.util.Log.d(r0, r7, r3)     // Catch:{ all -> 0x0047 }
        L_0x0041:
            if (r2 == 0) goto L_0x0046
            r2.close()
        L_0x0046:
            return r1
        L_0x0047:
            r7 = move-exception
            r1 = r2
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()
        L_0x004e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p075f2.C5260e.m23772b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    private boolean m23773c(File file) {
        return this.f23271a.mo21472a(file) && 0 < this.f23271a.mo21474c(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo21476a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f23274d.openInputStream(uri);
            int b = C3339a.m11187b(this.f23275e, openInputStream, this.f23273c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return b;
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    public InputStream mo21477d(Uri uri) throws FileNotFoundException {
        String b = m23772b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.f23271a.mo21473b(b);
        if (!m23773c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.f23274d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    C5260e(List<ImageHeaderParser> list, C5254a aVar, C5259d dVar, C5382b bVar, ContentResolver contentResolver) {
        this.f23271a = aVar;
        this.f23272b = dVar;
        this.f23273c = bVar;
        this.f23274d = contentResolver;
        this.f23275e = list;
    }
}
