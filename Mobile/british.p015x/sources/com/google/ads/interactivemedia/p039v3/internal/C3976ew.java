package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ads.interactivemedia.p039v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.p039v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ew */
/* compiled from: IMASDK */
final class C3976ew {

    /* renamed from: a */
    protected final ContentProgressProvider f17016a;

    /* renamed from: b */
    private final Handler f17017b;

    /* renamed from: c */
    private final List<C3975ev> f17018c;

    C3976ew(ContentProgressProvider contentProgressProvider) {
        this();
        this.f17016a = contentProgressProvider;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void mo15756e() {
        VideoProgressUpdate f = mo15757f();
        for (C3975ev a : this.f17018c) {
            a.mo15680a(f);
        }
        this.f17017b.postDelayed(new C3974eu(this), 200);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15752a(C3975ev evVar) {
        this.f17018c.add(evVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15753b(C3975ev evVar) {
        this.f17018c.remove(evVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo15754c() {
        mo15755d();
        mo15756e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo15755d() {
        this.f17017b.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: f */
    public VideoProgressUpdate mo15757f() {
        VideoProgressUpdate contentProgress = this.f17016a.getContentProgress();
        if (contentProgress != null) {
            return contentProgress;
        }
        Log.w("IMASDK", "ContentProgressProvider.getContentProgress() is null. Use VideoProgressUpdate.VIDEO_TIME_NOT_READY instead.");
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }

    C3976ew() {
        this.f17018c = new ArrayList(1);
        this.f17017b = new Handler(Looper.getMainLooper());
    }
}
