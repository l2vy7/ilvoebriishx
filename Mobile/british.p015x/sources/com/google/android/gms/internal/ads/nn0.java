package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;
import p006a5.C6492o;
import p193c5.C6520c;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nn0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f20583a = new Object();

    /* renamed from: b */
    private final zzj f20584b;

    /* renamed from: c */
    private final rn0 f20585c;

    /* renamed from: d */
    private boolean f20586d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f20587e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public zzcjf f20588f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public u00 f20589g;

    /* renamed from: h */
    private Boolean f20590h;

    /* renamed from: i */
    private final AtomicInteger f20591i;

    /* renamed from: j */
    private final mn0 f20592j;

    /* renamed from: k */
    private final Object f20593k;

    /* renamed from: l */
    private mb3<ArrayList<String>> f20594l;

    public nn0() {
        zzj zzj = new zzj();
        this.f20584b = zzj;
        this.f20585c = new rn0(C8241uv.m38465d(), zzj);
        this.f20586d = false;
        this.f20589g = null;
        this.f20590h = null;
        this.f20591i = new AtomicInteger(0);
        this.f20592j = new mn0((ln0) null);
        this.f20593k = new Object();
    }

    /* renamed from: a */
    public final int mo18578a() {
        return this.f20591i.get();
    }

    /* renamed from: c */
    public final Context mo18579c() {
        return this.f20587e;
    }

    /* renamed from: d */
    public final Resources mo18580d() {
        if (this.f20588f.f43039e) {
            return this.f20587e.getResources();
        }
        try {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37173o7)).booleanValue()) {
                return ho0.m32902a(this.f20587e).getResources();
            }
            ho0.m32902a(this.f20587e).getResources();
            return null;
        } catch (go0 e) {
            co0.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: f */
    public final u00 mo18581f() {
        u00 u00;
        synchronized (this.f20583a) {
            u00 = this.f20589g;
        }
        return u00;
    }

    /* renamed from: g */
    public final rn0 mo18582g() {
        return this.f20585c;
    }

    /* renamed from: h */
    public final zzg mo18583h() {
        zzj zzj;
        synchronized (this.f20583a) {
            zzj = this.f20584b;
        }
        return zzj;
    }

    /* renamed from: j */
    public final mb3<ArrayList<String>> mo18584j() {
        if (C6492o.m28280c() && this.f20587e != null) {
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36985T1)).booleanValue()) {
                synchronized (this.f20593k) {
                    mb3<ArrayList<String>> mb3 = this.f20594l;
                    if (mb3 != null) {
                        return mb3;
                    }
                    mb3<ArrayList<String>> b = po0.f37722a.mo33675b(new jn0(this));
                    this.f20594l = b;
                    return b;
                }
            }
        }
        return bb3.m30649i(new ArrayList());
    }

    /* renamed from: k */
    public final Boolean mo18585k() {
        Boolean bool;
        synchronized (this.f20583a) {
            bool = this.f20590h;
        }
        return bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ ArrayList mo18586m() throws Exception {
        Context a = ij0.m33229a(this.f20587e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f = C6520c.m28321a(a).mo24355f(a.getApplicationInfo().packageName, 4096);
            if (f.requestedPermissions != null && f.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = f.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((f.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    /* renamed from: n */
    public final void mo18587n() {
        this.f20592j.mo33570a();
    }

    /* renamed from: o */
    public final void mo18588o() {
        this.f20591i.decrementAndGet();
    }

    /* renamed from: p */
    public final void mo18589p() {
        this.f20591i.incrementAndGet();
    }

    @TargetApi(23)
    /* renamed from: q */
    public final void mo18590q(Context context, zzcjf zzcjf) {
        u00 u00;
        synchronized (this.f20583a) {
            if (!this.f20586d) {
                this.f20587e = context.getApplicationContext();
                this.f20588f = zzcjf;
                zzt.zzb().mo18170c(this.f20585c);
                this.f20584b.zzp(this.f20587e);
                zh0.m21288d(this.f20587e, this.f20588f);
                zzt.zze();
                if (!z10.f42256c.mo34648e().booleanValue()) {
                    zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    u00 = null;
                } else {
                    u00 = new u00();
                }
                this.f20589g = u00;
                if (u00 != null) {
                    so0.m37458a(new kn0(this).zzb(), "AppState.registerCsiReporter");
                }
                this.f20586d = true;
                mo18584j();
            }
        }
        zzt.zzp().zzd(context, zzcjf.f43036b);
    }

    /* renamed from: r */
    public final void mo18591r(Throwable th, String str) {
        zh0.m21288d(this.f20587e, this.f20588f).mo19057a(th, str, m20.f35362g.mo34648e().floatValue());
    }

    /* renamed from: s */
    public final void mo18592s(Throwable th, String str) {
        zh0.m21288d(this.f20587e, this.f20588f).mo19058b(th, str);
    }

    /* renamed from: t */
    public final void mo18593t(Boolean bool) {
        synchronized (this.f20583a) {
            this.f20590h = bool;
        }
    }
}
