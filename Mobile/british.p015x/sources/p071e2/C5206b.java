package p071e2;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.C3325f;
import java.io.IOException;
import p065d2.C5154a;
import p071e2.C5208d;

/* renamed from: e2.b */
/* compiled from: AssetPathFetcher */
public abstract class C5206b<T> implements C5208d<T> {

    /* renamed from: b */
    private final String f22717b;

    /* renamed from: c */
    private final AssetManager f22718c;

    /* renamed from: d */
    private T f22719d;

    public C5206b(AssetManager assetManager, String str) {
        this.f22718c = assetManager;
        this.f22717b = str;
    }

    /* renamed from: b */
    public void mo21427b() {
        T t = this.f22719d;
        if (t != null) {
            try {
                mo21428c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo21428c(T t) throws IOException;

    public void cancel() {
    }

    /* renamed from: d */
    public C5154a mo21430d() {
        return C5154a.LOCAL;
    }

    /* renamed from: e */
    public void mo21431e(C3325f fVar, C5208d.C5209a<? super T> aVar) {
        try {
            T f = mo21432f(this.f22718c, this.f22717b);
            this.f22719d = f;
            aVar.mo21439f(f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo21438c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract T mo21432f(AssetManager assetManager, String str) throws IOException;
}
