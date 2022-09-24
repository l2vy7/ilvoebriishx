package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest;

/* renamed from: com.facebook.a0 */
/* compiled from: RequestProgress */
class C3369a0 {

    /* renamed from: a */
    private final GraphRequest f12802a;

    /* renamed from: b */
    private final Handler f12803b;

    /* renamed from: c */
    private final long f12804c = C3642m.m12292r();

    /* renamed from: d */
    private long f12805d;

    /* renamed from: e */
    private long f12806e;

    /* renamed from: f */
    private long f12807f;

    /* renamed from: com.facebook.a0$a */
    /* compiled from: RequestProgress */
    class C3370a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ GraphRequest.C3363i f12808b;

        /* renamed from: c */
        final /* synthetic */ long f12809c;

        /* renamed from: d */
        final /* synthetic */ long f12810d;

        C3370a(GraphRequest.C3363i iVar, long j, long j2) {
            this.f12808b = iVar;
            this.f12809c = j;
            this.f12810d = j2;
        }

        public void run() {
            this.f12808b.mo11272a(this.f12809c, this.f12810d);
        }
    }

    C3369a0(Handler handler, GraphRequest graphRequest) {
        this.f12802a = graphRequest;
        this.f12803b = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11299a(long j) {
        long j2 = this.f12805d + j;
        this.f12805d = j2;
        if (j2 >= this.f12806e + this.f12804c || j2 >= this.f12807f) {
            mo11301c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11300b(long j) {
        this.f12807f += j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11301c() {
        if (this.f12805d > this.f12806e) {
            GraphRequest.C3360f s = this.f12802a.mo11253s();
            long j = this.f12807f;
            if (j > 0 && (s instanceof GraphRequest.C3363i)) {
                long j2 = this.f12805d;
                GraphRequest.C3363i iVar = (GraphRequest.C3363i) s;
                Handler handler = this.f12803b;
                if (handler == null) {
                    iVar.mo11272a(j2, j);
                } else {
                    handler.post(new C3370a(iVar, j2, j));
                }
                this.f12806e = this.f12805d;
            }
        }
    }
}
