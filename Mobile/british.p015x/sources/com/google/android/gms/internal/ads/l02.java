package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7377d;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class l02 implements C7377d.C7378a, C7377d.C7379b {

    /* renamed from: b */
    protected final uo0<InputStream> f34767b = new uo0<>();

    /* renamed from: c */
    protected final Object f34768c = new Object();

    /* renamed from: d */
    protected boolean f34769d = false;

    /* renamed from: e */
    protected boolean f34770e = false;

    /* renamed from: f */
    protected zzcdq f34771f;

    /* renamed from: g */
    protected ii0 f34772g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33219a() {
        synchronized (this.f34768c) {
            this.f34770e = true;
            if (this.f34772g.isConnected() || this.f34772g.isConnecting()) {
                this.f34772g.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        co0.zze("Disconnected from remote ad request service.");
        this.f34767b.zze(new b12(1));
    }

    public final void onConnectionSuspended(int i) {
        co0.zze("Cannot connect to remote service, fallback to local instance.");
    }
}
