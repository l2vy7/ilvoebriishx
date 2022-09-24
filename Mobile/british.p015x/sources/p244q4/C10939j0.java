package p244q4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.zza;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.cast.zzam;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7236e;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7387f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p109l4.C10657a;

/* renamed from: q4.j0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10939j0 extends C7387f<C10928e> {

    /* renamed from: A */
    private static final Object f49833A = new Object();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final C10922b f49834y = new C10922b("CastClientImpl");
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final Object f49835z = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ApplicationMetadata f49836b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final CastDevice f49837c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10657a.C10662d f49838d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Map<String, C10657a.C10663e> f49839e = new HashMap();

    /* renamed from: f */
    private final long f49840f;

    /* renamed from: g */
    private final Bundle f49841g;

    /* renamed from: h */
    private C10937i0 f49842h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f49843i;

    /* renamed from: j */
    private boolean f49844j;

    /* renamed from: k */
    private boolean f49845k;

    /* renamed from: l */
    private boolean f49846l;

    /* renamed from: m */
    private boolean f49847m;

    /* renamed from: n */
    private double f49848n;

    /* renamed from: o */
    private zzam f49849o;

    /* renamed from: p */
    private int f49850p;

    /* renamed from: q */
    private int f49851q;

    /* renamed from: r */
    private final AtomicLong f49852r = new AtomicLong(0);
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f49853s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f49854t;

    /* renamed from: u */
    private Bundle f49855u;

    /* renamed from: v */
    private final Map<Long, C7236e<Status>> f49856v = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C7236e<C10657a.C10658a> f49857w;

    /* renamed from: x */
    private C7236e<Status> f49858x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10939j0(Context context, Looper looper, C4601e eVar, CastDevice castDevice, long j, C10657a.C10662d dVar, Bundle bundle, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        super(context, looper, 10, eVar, bVar, cVar);
        this.f49837c = castDevice;
        this.f49838d = dVar;
        this.f49840f = j;
        this.f49841g = bundle;
        m49234w();
        mo43225e();
    }

    /* renamed from: r */
    static /* synthetic */ void m49229r(C10939j0 j0Var, zzy zzy) {
        boolean z;
        boolean z2;
        boolean z3;
        ApplicationMetadata F0 = zzy.mo29627F0();
        if (!C10920a.m49143f(F0, j0Var.f49836b)) {
            j0Var.f49836b = F0;
            j0Var.f49838d.mo42804c(F0);
        }
        double C0 = zzy.mo29624C0();
        if (Double.isNaN(C0) || Math.abs(C0 - j0Var.f49848n) <= 1.0E-7d) {
            z = false;
        } else {
            j0Var.f49848n = C0;
            z = true;
        }
        boolean D0 = zzy.mo29625D0();
        if (D0 != j0Var.f49844j) {
            j0Var.f49844j = D0;
            z = true;
        }
        Double.isNaN(zzy.mo29629H0());
        C10922b bVar = f49834y;
        bVar.mo43190a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(j0Var.f49846l));
        C10657a.C10662d dVar = j0Var.f49838d;
        if (dVar != null && (z || j0Var.f49846l)) {
            dVar.mo36584f();
        }
        int zzc = zzy.zzc();
        if (zzc != j0Var.f49850p) {
            j0Var.f49850p = zzc;
            z2 = true;
        } else {
            z2 = false;
        }
        bVar.mo43190a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(j0Var.f49846l));
        C10657a.C10662d dVar2 = j0Var.f49838d;
        if (dVar2 != null && (z2 || j0Var.f49846l)) {
            dVar2.mo42802a(j0Var.f49850p);
        }
        int E0 = zzy.mo29626E0();
        if (E0 != j0Var.f49851q) {
            j0Var.f49851q = E0;
            z3 = true;
        } else {
            z3 = false;
        }
        bVar.mo43190a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(j0Var.f49846l));
        C10657a.C10662d dVar3 = j0Var.f49838d;
        if (dVar3 != null && (z3 || j0Var.f49846l)) {
            dVar3.mo42806e(j0Var.f49851q);
        }
        if (!C10920a.m49143f(j0Var.f49849o, zzy.mo29628G0())) {
            j0Var.f49849o = zzy.mo29628G0();
        }
        j0Var.f49846l = false;
    }

    /* renamed from: s */
    static /* synthetic */ void m49230s(C10939j0 j0Var, zza zza) {
        boolean z;
        String C0 = zza.mo29620C0();
        if (!C10920a.m49143f(C0, j0Var.f49843i)) {
            j0Var.f49843i = C0;
            z = true;
        } else {
            z = false;
        }
        f49834y.mo43190a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(j0Var.f49845k));
        C10657a.C10662d dVar = j0Var.f49838d;
        if (dVar != null && (z || j0Var.f49845k)) {
            dVar.mo42805d();
        }
        j0Var.f49845k = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m49234w() {
        this.f49847m = false;
        this.f49850p = -1;
        this.f49851q = -1;
        this.f49836b = null;
        this.f49843i = null;
        this.f49848n = 0.0d;
        mo43225e();
        this.f49844j = false;
        this.f49849o = null;
    }

    /* renamed from: x */
    private final void m49235x() {
        f49834y.mo43190a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f49839e) {
            this.f49839e.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m49236y(long j, int i) {
        C7236e remove;
        synchronized (this.f49856v) {
            remove = this.f49856v.remove(Long.valueOf(j));
        }
        if (remove != null) {
            remove.mo29842a(new Status(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m49237z(int i) {
        synchronized (f49833A) {
            C7236e<Status> eVar = this.f49858x;
            if (eVar != null) {
                eVar.mo29842a(new Status(i));
                this.f49858x = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof C10928e) {
            return (C10928e) queryLocalInterface;
        }
        return new C10928e(iBinder);
    }

    public final void disconnect() {
        C10922b bVar = f49834y;
        bVar.mo43190a("disconnect(); ServiceListener=%s, isConnected=%b", this.f49842h, Boolean.valueOf(isConnected()));
        C10937i0 i0Var = this.f49842h;
        this.f49842h = null;
        if (i0Var == null || i0Var.mo43224b2() == null) {
            bVar.mo43190a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        m49235x();
        try {
            ((C10928e) getService()).zze();
        } catch (RemoteException | IllegalStateException e) {
            f49834y.mo43191b(e, "Error while disconnecting the controller interface", new Object[0]);
        } finally {
            super.disconnect();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final double mo43225e() {
        C4604n.m20099l(this.f49837c, "device should not be null");
        if (this.f49837c.mo29186J0(2048)) {
            return 0.02d;
        }
        if (!this.f49837c.mo29186J0(4) || this.f49837c.mo29186J0(1) || "Chromecast Audio".equals(this.f49837c.mo29184H0())) {
            return 0.05d;
        }
        return 0.02d;
    }

    /* renamed from: f */
    public final void mo43226f(int i) {
        synchronized (f49835z) {
            C7236e<C10657a.C10658a> eVar = this.f49857w;
            if (eVar != null) {
                eVar.mo29842a(new C10927d0(new Status(i), (ApplicationMetadata) null, (String) null, (String) null, false));
                this.f49857w = null;
            }
        }
    }

    public final Bundle getConnectionHint() {
        Bundle bundle = this.f49855u;
        if (bundle == null) {
            return super.getConnectionHint();
        }
        this.f49855u = null;
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        f49834y.mo43190a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f49853s, this.f49854t);
        this.f49837c.mo29187K0(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f49840f);
        Bundle bundle2 = this.f49841g;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.f49842h = new C10937i0(this);
        bundle.putParcelable("listener", new BinderWrapper(this.f49842h));
        String str = this.f49853s;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f49854t;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        m49235x();
    }

    /* access modifiers changed from: protected */
    public final void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        f49834y.mo43190a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.f49847m = true;
            this.f49845k = true;
            this.f49846l = true;
        } else {
            this.f49847m = false;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.f49855u = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.onPostInitHandler(i, iBinder, bundle, i2);
    }
}
