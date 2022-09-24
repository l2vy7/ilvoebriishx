package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p185z4.C6469a;
import p231m5.C10801e;

/* renamed from: com.google.android.gms.common.internal.m1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7411m1 extends C7389g {
    /* access modifiers changed from: private */
    @GuardedBy("connectionStatus")

    /* renamed from: f */
    public final HashMap<C7398i1, C7401j1> f29339f = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f29340g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile Handler f29341h;

    /* renamed from: i */
    private final C7407l1 f29342i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C6469a f29343j;

    /* renamed from: k */
    private final long f29344k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f29345l;

    C7411m1(Context context, Looper looper) {
        C7407l1 l1Var = new C7407l1(this, (C7404k1) null);
        this.f29342i = l1Var;
        this.f29340g = context.getApplicationContext();
        this.f29341h = new C10801e(looper, l1Var);
        this.f29343j = C6469a.m28199b();
        this.f29344k = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.f29345l = DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo30095d(C7398i1 i1Var, ServiceConnection serviceConnection, String str) {
        C4604n.m20099l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f29339f) {
            C7401j1 j1Var = this.f29339f.get(i1Var);
            if (j1Var == null) {
                String obj = i1Var.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            } else if (j1Var.mo30126h(serviceConnection)) {
                j1Var.mo30124f(serviceConnection, str);
                if (j1Var.mo30127i()) {
                    this.f29341h.sendMessageDelayed(this.f29341h.obtainMessage(0, i1Var), this.f29344k);
                }
            } else {
                String obj2 = i1Var.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(obj2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo30097f(C7398i1 i1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j;
        C4604n.m20099l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f29339f) {
            C7401j1 j1Var = this.f29339f.get(i1Var);
            if (j1Var == null) {
                j1Var = new C7401j1(this, i1Var);
                j1Var.mo30122d(serviceConnection, serviceConnection, str);
                j1Var.mo30123e(str, executor);
                this.f29339f.put(i1Var, j1Var);
            } else {
                this.f29341h.removeMessages(0, i1Var);
                if (!j1Var.mo30126h(serviceConnection)) {
                    j1Var.mo30122d(serviceConnection, serviceConnection, str);
                    int a = j1Var.mo30119a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(j1Var.mo30120b(), j1Var.mo30121c());
                    } else if (a == 2) {
                        j1Var.mo30123e(str, executor);
                    }
                } else {
                    String obj = i1Var.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            }
            j = j1Var.mo30128j();
        }
        return j;
    }
}
