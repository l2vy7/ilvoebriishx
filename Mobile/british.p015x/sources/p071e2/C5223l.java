package p071e2;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.C3325f;
import java.io.FileNotFoundException;
import java.io.IOException;
import p065d2.C5154a;
import p071e2.C5208d;

/* renamed from: e2.l */
/* compiled from: LocalUriFetcher */
public abstract class C5223l<T> implements C5208d<T> {

    /* renamed from: b */
    private final Uri f22741b;

    /* renamed from: c */
    private final ContentResolver f22742c;

    /* renamed from: d */
    private T f22743d;

    public C5223l(ContentResolver contentResolver, Uri uri) {
        this.f22742c = contentResolver;
        this.f22741b = uri;
    }

    /* renamed from: b */
    public void mo21427b() {
        T t = this.f22743d;
        if (t != null) {
            try {
                mo21423c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo21423c(T t) throws IOException;

    public void cancel() {
    }

    /* renamed from: d */
    public C5154a mo21430d() {
        return C5154a.LOCAL;
    }

    /* renamed from: e */
    public final void mo21431e(C3325f fVar, C5208d.C5209a<? super T> aVar) {
        try {
            T f = mo21424f(this.f22741b, this.f22742c);
            this.f22743d = f;
            aVar.mo21439f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo21438c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract T mo21424f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
