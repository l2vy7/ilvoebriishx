package p076f2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.C3319b;
import com.bumptech.glide.C3325f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p065d2.C5154a;
import p071e2.C5208d;
import p071e2.C5215g;

/* renamed from: f2.c */
/* compiled from: ThumbFetcher */
public class C5256c implements C5208d<InputStream> {

    /* renamed from: b */
    private final Uri f23263b;

    /* renamed from: c */
    private final C5260e f23264c;

    /* renamed from: d */
    private InputStream f23265d;

    /* renamed from: f2.c$a */
    /* compiled from: ThumbFetcher */
    static class C5257a implements C5259d {

        /* renamed from: b */
        private static final String[] f23266b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f23267a;

        C5257a(ContentResolver contentResolver) {
            this.f23267a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo21475a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f23267a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f23266b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: f2.c$b */
    /* compiled from: ThumbFetcher */
    static class C5258b implements C5259d {

        /* renamed from: b */
        private static final String[] f23268b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f23269a;

        C5258b(ContentResolver contentResolver) {
            this.f23269a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo21475a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f23269a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f23268b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    C5256c(Uri uri, C5260e eVar) {
        this.f23263b = uri;
        this.f23264c = eVar;
    }

    /* renamed from: c */
    private static C5256c m23761c(Context context, Uri uri, C5259d dVar) {
        return new C5256c(uri, new C5260e(C3319b.m11097c(context).mo11097j().mo11123g(), dVar, C3319b.m11097c(context).mo11092e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C5256c m23762f(Context context, Uri uri) {
        return m23761c(context, uri, new C5257a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C5256c m23763g(Context context, Uri uri) {
        return m23761c(context, uri, new C5258b(context.getContentResolver()));
    }

    /* renamed from: h */
    private InputStream m23764h() throws FileNotFoundException {
        InputStream d = this.f23264c.mo21477d(this.f23263b);
        int a = d != null ? this.f23264c.mo21476a(this.f23263b) : -1;
        return a != -1 ? new C5215g(d, a) : d;
    }

    /* renamed from: a */
    public Class<InputStream> mo21422a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo21427b() {
        InputStream inputStream = this.f23265d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    /* renamed from: d */
    public C5154a mo21430d() {
        return C5154a.LOCAL;
    }

    /* renamed from: e */
    public void mo21431e(C3325f fVar, C5208d.C5209a<? super InputStream> aVar) {
        try {
            InputStream h = m23764h();
            this.f23265d = h;
            aVar.mo21439f(h);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo21438c(e);
        }
    }
}
