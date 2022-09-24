package p244q4;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zza;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7236e;
import com.google.android.gms.internal.cast.C8564i0;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q4.i0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C10937i0 extends C10930f {

    /* renamed from: b */
    private final AtomicReference<C10939j0> f49829b;

    /* renamed from: c */
    private final Handler f49830c;

    public C10937i0(C10939j0 j0Var) {
        this.f49829b = new AtomicReference<>(j0Var);
        this.f49830c = new C8564i0(j0Var.getLooper());
    }

    /* renamed from: D5 */
    public final void mo42834D5(String str, long j, int i) {
        C10939j0 j0Var = this.f49829b.get();
        if (j0Var != null) {
            j0Var.m49236y(j, i);
        }
    }

    /* renamed from: E */
    public final void mo42835E(String str, String str2) {
        C10939j0 j0Var = this.f49829b.get();
        if (j0Var != null) {
            C10939j0.f49834y.mo43190a("Receive (type=text, ns=%s) %s", str, str2);
            this.f49830c.post(new C10935h0(this, j0Var, str, str2));
        }
    }

    /* renamed from: H1 */
    public final void mo42836H1(zzy zzy) {
        C10939j0 j0Var = this.f49829b.get();
        if (j0Var != null) {
            C10939j0.f49834y.mo43190a("onDeviceStatusChanged", new Object[0]);
            this.f49830c.post(new C10931f0(this, j0Var, zzy));
        }
    }

    /* renamed from: M */
    public final void mo42837M(int i) {
    }

    /* renamed from: U0 */
    public final void mo42838U0(String str, byte[] bArr) {
        if (this.f49829b.get() != null) {
            C10939j0.f49834y.mo43190a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }
    }

    /* renamed from: a2 */
    public final void mo42839a2(zza zza) {
        C10939j0 j0Var = this.f49829b.get();
        if (j0Var != null) {
            C10939j0.f49834y.mo43190a("onApplicationStatusChanged", new Object[0]);
            this.f49830c.post(new C10933g0(this, j0Var, zza));
        }
    }

    /* renamed from: b2 */
    public final C10939j0 mo43224b2() {
        C10939j0 andSet = this.f49829b.getAndSet((Object) null);
        if (andSet == null) {
            return null;
        }
        andSet.m49234w();
        return andSet;
    }

    /* renamed from: f1 */
    public final void mo42840f1(String str, double d, boolean z) {
        C10939j0.f49834y.mo43190a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    /* renamed from: k */
    public final void mo42841k(int i) {
        C10939j0 j0Var = this.f49829b.get();
        if (j0Var != null) {
            j0Var.m49237z(i);
        }
    }

    /* renamed from: o */
    public final void mo42842o(int i) {
        C10939j0 j0Var = this.f49829b.get();
        if (j0Var != null) {
            String unused = j0Var.f49853s = null;
            String unused2 = j0Var.f49854t = null;
            j0Var.m49237z(i);
            if (j0Var.f49838d != null) {
                this.f49830c.post(new C10929e0(this, j0Var, i));
            }
        }
    }

    /* renamed from: p */
    public final void mo42843p(int i) {
        C10939j0 j0Var = this.f49829b.get();
        if (j0Var != null) {
            j0Var.m49237z(i);
        }
    }

    /* renamed from: s */
    public final void mo42844s(int i) {
    }

    /* renamed from: v5 */
    public final void mo42845v5(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        C10939j0 j0Var = this.f49829b.get();
        if (j0Var != null) {
            ApplicationMetadata unused = j0Var.f49836b = applicationMetadata;
            String unused2 = j0Var.f49853s = applicationMetadata.mo29171C0();
            String unused3 = j0Var.f49854t = str2;
            String unused4 = j0Var.f49843i = str;
            synchronized (C10939j0.f49835z) {
                if (j0Var.f49857w != null) {
                    j0Var.f49857w.mo29842a(new C10927d0(new Status(0), applicationMetadata, str, str2, z));
                    C7236e unused5 = j0Var.f49857w = null;
                }
            }
        }
    }

    /* renamed from: x1 */
    public final void mo42846x1(String str, long j) {
        C10939j0 j0Var = this.f49829b.get();
        if (j0Var != null) {
            j0Var.m49236y(j, 0);
        }
    }

    public final void zzb(int i) {
        C10939j0 b2 = mo43224b2();
        if (b2 != null) {
            C10939j0.f49834y.mo43190a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                b2.triggerConnectionSuspended(2);
            }
        }
    }

    public final void zzf(int i) {
        C10939j0 j0Var = this.f49829b.get();
        if (j0Var != null) {
            j0Var.mo43226f(i);
        }
    }
}
