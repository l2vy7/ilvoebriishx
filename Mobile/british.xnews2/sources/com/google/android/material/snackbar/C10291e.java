package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.e */
/* compiled from: SnackbarManager */
class C10291e {

    /* renamed from: e */
    private static C10291e f48408e;

    /* renamed from: a */
    private final Object f48409a = new Object();

    /* renamed from: b */
    private final Handler f48410b = new Handler(Looper.getMainLooper(), new C10292a());

    /* renamed from: c */
    private C10294c f48411c;

    /* renamed from: d */
    private C10294c f48412d;

    /* renamed from: com.google.android.material.snackbar.e$a */
    /* compiled from: SnackbarManager */
    class C10292a implements Handler.Callback {
        C10292a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C10291e.this.mo41391c((C10294c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.e$b */
    /* compiled from: SnackbarManager */
    interface C10293b {
        /* renamed from: a */
        void mo41395a(int i);
    }

    /* renamed from: com.google.android.material.snackbar.e$c */
    /* compiled from: SnackbarManager */
    private static class C10294c {

        /* renamed from: a */
        final WeakReference<C10293b> f48414a;

        /* renamed from: b */
        int f48415b;

        /* renamed from: c */
        boolean f48416c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo41396a(C10293b bVar) {
            return bVar != null && this.f48414a.get() == bVar;
        }
    }

    private C10291e() {
    }

    /* renamed from: a */
    private boolean m47492a(C10294c cVar, int i) {
        C10293b bVar = (C10293b) cVar.f48414a.get();
        if (bVar == null) {
            return false;
        }
        this.f48410b.removeCallbacksAndMessages(cVar);
        bVar.mo41395a(i);
        return true;
    }

    /* renamed from: b */
    static C10291e m47493b() {
        if (f48408e == null) {
            f48408e = new C10291e();
        }
        return f48408e;
    }

    /* renamed from: d */
    private boolean m47494d(C10293b bVar) {
        C10294c cVar = this.f48411c;
        return cVar != null && cVar.mo41396a(bVar);
    }

    /* renamed from: g */
    private void m47495g(C10294c cVar) {
        int i = cVar.f48415b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? IronSourceConstants.RV_INSTANCE_NOT_FOUND : 2750;
            }
            this.f48410b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f48410b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41391c(C10294c cVar) {
        synchronized (this.f48409a) {
            if (this.f48411c == cVar || this.f48412d == cVar) {
                m47492a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public void mo41392e(C10293b bVar) {
        synchronized (this.f48409a) {
            if (m47494d(bVar)) {
                C10294c cVar = this.f48411c;
                if (!cVar.f48416c) {
                    cVar.f48416c = true;
                    this.f48410b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo41393f(C10293b bVar) {
        synchronized (this.f48409a) {
            if (m47494d(bVar)) {
                C10294c cVar = this.f48411c;
                if (cVar.f48416c) {
                    cVar.f48416c = false;
                    m47495g(cVar);
                }
            }
        }
    }
}
