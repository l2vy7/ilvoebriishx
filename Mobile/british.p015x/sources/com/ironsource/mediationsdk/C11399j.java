package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.j */
public final class C11399j {

    /* renamed from: d */
    private static C11399j f51255d;

    /* renamed from: a */
    private long f51256a = 0;

    /* renamed from: b */
    private boolean f51257b = false;

    /* renamed from: c */
    int f51258c;

    /* renamed from: com.ironsource.mediationsdk.j$a */
    class C11400a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSourceBannerLayout f51259b;

        /* renamed from: c */
        private /* synthetic */ IronSourceError f51260c;

        C11400a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
            this.f51259b = ironSourceBannerLayout;
            this.f51260c = ironSourceError;
        }

        public final void run() {
            C11399j.this.mo44319b(this.f51259b, this.f51260c);
        }
    }

    private C11399j() {
    }

    /* renamed from: a */
    public static synchronized C11399j m50992a() {
        C11399j jVar;
        synchronized (C11399j.class) {
            if (f51255d == null) {
                f51255d = new C11399j();
            }
            jVar = f51255d;
        }
        return jVar;
    }

    /* renamed from: a */
    public final void mo44318a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        synchronized (this) {
            if (!this.f51257b) {
                long currentTimeMillis = System.currentTimeMillis() - this.f51256a;
                int i = this.f51258c;
                if (currentTimeMillis > ((long) (i * 1000))) {
                    mo44319b(ironSourceBannerLayout, ironSourceError);
                    return;
                }
                this.f51257b = true;
                new Handler(Looper.getMainLooper()).postDelayed(new C11400a(ironSourceBannerLayout, ironSourceError), ((long) (i * 1000)) - currentTimeMillis);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo44319b(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        if (ironSourceBannerLayout != null) {
            this.f51256a = System.currentTimeMillis();
            this.f51257b = false;
            ironSourceBannerLayout.mo20630d(ironSourceError);
        }
    }

    /* renamed from: b */
    public final boolean mo44320b() {
        boolean z;
        synchronized (this) {
            z = this.f51257b;
        }
        return z;
    }
}
