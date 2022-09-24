package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.y0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C7442y0<TListener> {

    /* renamed from: a */
    private TListener f29372a;

    /* renamed from: b */
    private boolean f29373b = false;

    /* renamed from: c */
    final /* synthetic */ C7377d f29374c;

    public C7442y0(C7377d dVar, TListener tlistener) {
        this.f29374c = dVar;
        this.f29372a = tlistener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30143a(TListener tlistener);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo30144b();

    /* renamed from: c */
    public final void mo30174c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f29372a;
            if (this.f29373b) {
                String obj = toString();
                StringBuilder sb = new StringBuilder(obj.length() + 47);
                sb.append("Callback proxy ");
                sb.append(obj);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                mo30143a(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f29373b = true;
        }
        mo30176e();
    }

    /* renamed from: d */
    public final void mo30175d() {
        synchronized (this) {
            this.f29372a = null;
        }
    }

    /* renamed from: e */
    public final void mo30176e() {
        mo30175d();
        synchronized (this.f29374c.zzt) {
            this.f29374c.zzt.remove(this);
        }
    }
}
