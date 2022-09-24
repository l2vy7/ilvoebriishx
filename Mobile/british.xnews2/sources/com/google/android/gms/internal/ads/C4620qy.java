package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.zza;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p198d5.C10487a;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.qy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4620qy {

    /* renamed from: a */
    private final qc0 f20666a;

    /* renamed from: b */
    private final C8134ru f20667b;

    /* renamed from: c */
    private final AtomicBoolean f20668c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final VideoController f20669d;

    /* renamed from: e */
    final C8278vv f20670e;

    /* renamed from: f */
    private C7659eu f20671f;

    /* renamed from: g */
    private AdListener f20672g;

    /* renamed from: h */
    private AdSize[] f20673h;

    /* renamed from: i */
    private AppEventListener f20674i;

    /* renamed from: j */
    private C8136rw f20675j;

    /* renamed from: k */
    private VideoOptions f20676k;

    /* renamed from: l */
    private String f20677l;
    @NotOnlyInitialized

    /* renamed from: m */
    private final ViewGroup f20678m;

    /* renamed from: n */
    private int f20679n;

    /* renamed from: o */
    private boolean f20680o;

    /* renamed from: p */
    private OnPaidEventListener f20681p;

    public C4620qy(ViewGroup viewGroup) {
        this(viewGroup, (AttributeSet) null, false, C8134ru.f38776a, (C8136rw) null, 0);
    }

    /* renamed from: b */
    private static zzbfi m20867b(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize equals : adSizeArr) {
            if (equals.equals(AdSize.INVALID)) {
                return zzbfi.m40645G0();
            }
        }
        zzbfi zzbfi = new zzbfi(context, adSizeArr);
        zzbfi.f42973k = m20868c(i);
        return zzbfi;
    }

    /* renamed from: c */
    private static boolean m20868c(int i) {
        return i == 1;
    }

    /* renamed from: A */
    public final void mo18668A(VideoOptions videoOptions) {
        zzbkq zzbkq;
        this.f20676k = videoOptions;
        try {
            C8136rw rwVar = this.f20675j;
            if (rwVar != null) {
                if (videoOptions == null) {
                    zzbkq = null;
                } else {
                    zzbkq = new zzbkq(videoOptions);
                }
                rwVar.zzU(zzbkq);
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: B */
    public final boolean mo18669B(C8136rw rwVar) {
        try {
            C10487a zzn = rwVar.zzn();
            if (zzn == null || ((View) C10489b.m48194f3(zzn)).getParent() != null) {
                return false;
            }
            this.f20678m.addView((View) C10489b.m48194f3(zzn));
            this.f20675j = rwVar;
            return true;
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    /* renamed from: C */
    public final boolean mo18670C() {
        try {
            C8136rw rwVar = this.f20675j;
            if (rwVar != null) {
                return rwVar.zzY();
            }
            return false;
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    /* renamed from: a */
    public final AdSize[] mo18671a() {
        return this.f20673h;
    }

    /* renamed from: d */
    public final AdListener mo18672d() {
        return this.f20672g;
    }

    /* renamed from: e */
    public final AdSize mo18673e() {
        zzbfi zzg;
        try {
            C8136rw rwVar = this.f20675j;
            if (!(rwVar == null || (zzg = rwVar.zzg()) == null)) {
                return zza.zzc(zzg.f42968f, zzg.f42965c, zzg.f42964b);
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.f20673h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    /* renamed from: f */
    public final OnPaidEventListener mo18674f() {
        return this.f20681p;
    }

    /* renamed from: g */
    public final ResponseInfo mo18675g() {
        C7663ey eyVar = null;
        try {
            C8136rw rwVar = this.f20675j;
            if (rwVar != null) {
                eyVar = rwVar.zzk();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(eyVar);
    }

    /* renamed from: i */
    public final VideoController mo18676i() {
        return this.f20669d;
    }

    /* renamed from: j */
    public final VideoOptions mo18677j() {
        return this.f20676k;
    }

    /* renamed from: k */
    public final AppEventListener mo18678k() {
        return this.f20674i;
    }

    /* renamed from: l */
    public final C7774hy mo18679l() {
        C8136rw rwVar = this.f20675j;
        if (rwVar != null) {
            try {
                return rwVar.zzl();
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    /* renamed from: m */
    public final String mo18680m() {
        C8136rw rwVar;
        if (this.f20677l == null && (rwVar = this.f20675j) != null) {
            try {
                this.f20677l = rwVar.zzr();
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.f20677l;
    }

    /* renamed from: n */
    public final void mo18681n() {
        try {
            C8136rw rwVar = this.f20675j;
            if (rwVar != null) {
                rwVar.zzx();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: o */
    public final void mo18682o(C4618oy oyVar) {
        C8136rw rwVar;
        try {
            if (this.f20675j == null) {
                if (this.f20673h == null || this.f20677l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f20678m.getContext();
                zzbfi b = m20867b(context, this.f20673h, this.f20679n);
                if ("search_v2".equals(b.f42964b)) {
                    rwVar = (C8136rw) new C7771hv(C8241uv.m38462a(), context, b, this.f20677l).mo35040d(context, false);
                } else {
                    rwVar = (C8136rw) new C7660ev(C8241uv.m38462a(), context, b, this.f20677l, this.f20666a).mo35040d(context, false);
                }
                this.f20675j = rwVar;
                rwVar.zzD(new C7807iu(this.f20670e));
                C7659eu euVar = this.f20671f;
                if (euVar != null) {
                    this.f20675j.zzC(new C7696fu(euVar));
                }
                AppEventListener appEventListener = this.f20674i;
                if (appEventListener != null) {
                    this.f20675j.zzG(new C8270vn(appEventListener));
                }
                VideoOptions videoOptions = this.f20676k;
                if (videoOptions != null) {
                    this.f20675j.zzU(new zzbkq(videoOptions));
                }
                this.f20675j.zzP(new C8139rz(this.f20681p));
                this.f20675j.zzN(this.f20680o);
                C8136rw rwVar2 = this.f20675j;
                if (rwVar2 != null) {
                    try {
                        C10487a zzn = rwVar2.zzn();
                        if (zzn != null) {
                            this.f20678m.addView((View) C10489b.m48194f3(zzn));
                        }
                    } catch (RemoteException e) {
                        co0.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
            C8136rw rwVar3 = this.f20675j;
            Objects.requireNonNull(rwVar3);
            if (rwVar3.zzaa(this.f20667b.mo34626a(this.f20678m.getContext(), oyVar))) {
                this.f20666a.mo34310o6(oyVar.mo18637r());
            }
        } catch (RemoteException e2) {
            co0.zzl("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: p */
    public final void mo18683p() {
        try {
            C8136rw rwVar = this.f20675j;
            if (rwVar != null) {
                rwVar.zzz();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: q */
    public final void mo18684q() {
        if (!this.f20668c.getAndSet(true)) {
            try {
                C8136rw rwVar = this.f20675j;
                if (rwVar != null) {
                    rwVar.zzA();
                }
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: r */
    public final void mo18685r() {
        try {
            C8136rw rwVar = this.f20675j;
            if (rwVar != null) {
                rwVar.zzB();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: s */
    public final void mo18686s(C7659eu euVar) {
        try {
            this.f20671f = euVar;
            C8136rw rwVar = this.f20675j;
            if (rwVar != null) {
                rwVar.zzC(euVar != null ? new C7696fu(euVar) : null);
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: t */
    public final void mo18687t(AdListener adListener) {
        this.f20672g = adListener;
        this.f20670e.mo35500a(adListener);
    }

    /* renamed from: u */
    public final void mo18688u(AdSize... adSizeArr) {
        if (this.f20673h == null) {
            mo18689v(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: v */
    public final void mo18689v(AdSize... adSizeArr) {
        this.f20673h = adSizeArr;
        try {
            C8136rw rwVar = this.f20675j;
            if (rwVar != null) {
                rwVar.zzF(m20867b(this.f20678m.getContext(), this.f20673h, this.f20679n));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
        this.f20678m.requestLayout();
    }

    /* renamed from: w */
    public final void mo18690w(String str) {
        if (this.f20677l == null) {
            this.f20677l = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: x */
    public final void mo18691x(AppEventListener appEventListener) {
        try {
            this.f20674i = appEventListener;
            C8136rw rwVar = this.f20675j;
            if (rwVar != null) {
                rwVar.zzG(appEventListener != null ? new C8270vn(appEventListener) : null);
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: y */
    public final void mo18692y(boolean z) {
        this.f20680o = z;
        try {
            C8136rw rwVar = this.f20675j;
            if (rwVar != null) {
                rwVar.zzN(z);
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: z */
    public final void mo18693z(OnPaidEventListener onPaidEventListener) {
        try {
            this.f20681p = onPaidEventListener;
            C8136rw rwVar = this.f20675j;
            if (rwVar != null) {
                rwVar.zzP(new C8139rz(onPaidEventListener));
            }
        } catch (RemoteException e) {
            co0.zzl("#008 Must be called on the main UI thread.", e);
        }
    }

    public C4620qy(ViewGroup viewGroup, int i) {
        this(viewGroup, (AttributeSet) null, false, C8134ru.f38776a, (C8136rw) null, i);
    }

    public C4620qy(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, C8134ru.f38776a, (C8136rw) null, 0);
    }

    public C4620qy(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, C8134ru.f38776a, (C8136rw) null, i);
    }

    C4620qy(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C8134ru ruVar, C8136rw rwVar, int i) {
        zzbfi zzbfi;
        this.f20666a = new qc0();
        this.f20669d = new VideoController();
        this.f20670e = new C8067py(this);
        this.f20678m = viewGroup;
        this.f20667b = ruVar;
        this.f20675j = null;
        this.f20668c = new AtomicBoolean(false);
        this.f20679n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzbfq zzbfq = new zzbfq(context, attributeSet);
                this.f20673h = zzbfq.mo36247b(z);
                this.f20677l = zzbfq.mo36246a();
                if (viewGroup.isInEditMode()) {
                    vn0 b = C8241uv.m38463b();
                    AdSize adSize = this.f20673h[0];
                    int i2 = this.f20679n;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzbfi = zzbfi.m40645G0();
                    } else {
                        zzbfi zzbfi2 = new zzbfi(context, adSize);
                        zzbfi2.f42973k = m20868c(i2);
                        zzbfi = zzbfi2;
                    }
                    b.mo35449h(viewGroup, zzbfi, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                C8241uv.m38463b().mo35448g(viewGroup, new zzbfi(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}
