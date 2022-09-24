package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C6484f;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uu0 extends C7736gy {

    /* renamed from: b */
    private final mq0 f39973b;

    /* renamed from: c */
    private final Object f39974c = new Object();

    /* renamed from: d */
    private final boolean f39975d;

    /* renamed from: e */
    private final boolean f39976e;
    @GuardedBy("lock")

    /* renamed from: f */
    private int f39977f;
    @GuardedBy("lock")

    /* renamed from: g */
    private C7921ly f39978g;
    @GuardedBy("lock")

    /* renamed from: h */
    private boolean f39979h;
    @GuardedBy("lock")

    /* renamed from: i */
    private boolean f39980i = true;
    @GuardedBy("lock")

    /* renamed from: j */
    private float f39981j;
    @GuardedBy("lock")

    /* renamed from: k */
    private float f39982k;
    @GuardedBy("lock")

    /* renamed from: l */
    private float f39983l;
    @GuardedBy("lock")

    /* renamed from: m */
    private boolean f39984m;
    @GuardedBy("lock")

    /* renamed from: n */
    private boolean f39985n;
    @GuardedBy("lock")

    /* renamed from: o */
    private z40 f39986o;

    public uu0(mq0 mq0, float f, boolean z, boolean z2) {
        this.f39973b = mq0;
        this.f39981j = f;
        this.f39975d = z;
        this.f39976e = z2;
    }

    /* renamed from: u6 */
    private final void m38449u6(int i, int i2, boolean z, boolean z2) {
        po0.f37726e.execute(new su0(this, i, i2, z, z2));
    }

    /* renamed from: v6 */
    private final void m38450v6(String str, Map<String, String> map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        po0.f37726e.execute(new tu0(this, hashMap));
    }

    /* renamed from: F */
    public final void mo18394F(boolean z) {
        m38450v6(true != z ? "unmute" : "mute", (Map<String, String>) null);
    }

    /* renamed from: i3 */
    public final void mo18395i3(C7921ly lyVar) {
        synchronized (this.f39974c) {
            this.f39978g = lyVar;
        }
    }

    /* renamed from: n */
    public final void mo35272n() {
        boolean z;
        int i;
        synchronized (this.f39974c) {
            z = this.f39980i;
            i = this.f39977f;
            this.f39977f = 3;
        }
        m38449u6(i, 3, z, z);
    }

    /* renamed from: o6 */
    public final void mo35273o6(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.f39974c) {
            z2 = true;
            if (f2 == this.f39981j) {
                if (f3 == this.f39983l) {
                    z2 = false;
                }
            }
            this.f39981j = f2;
            this.f39982k = f;
            z3 = this.f39980i;
            this.f39980i = z;
            i2 = this.f39977f;
            this.f39977f = i;
            float f4 = this.f39983l;
            this.f39983l = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.f39973b.mo18790t().invalidate();
            }
        }
        if (z2) {
            try {
                z40 z40 = this.f39986o;
                if (z40 != null) {
                    z40.zze();
                }
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
        m38449u6(i2, i, z3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p6 */
    public final /* synthetic */ void mo35274p6(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        int i3;
        boolean z4;
        C7921ly lyVar;
        C7921ly lyVar2;
        C7921ly lyVar3;
        synchronized (this.f39974c) {
            boolean z5 = this.f39979h;
            boolean z6 = false;
            if (z5 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i3 = 1;
                z3 = true;
            }
            if (i == i2 || i3 != 1) {
                z4 = false;
            } else {
                i3 = 1;
                z4 = true;
            }
            boolean z7 = i != i2 && i3 == 2;
            boolean z8 = i != i2 && i3 == 3;
            if (z5 || z3) {
                z6 = true;
            }
            this.f39979h = z6;
            if (z3) {
                try {
                    C7921ly lyVar4 = this.f39978g;
                    if (lyVar4 != null) {
                        lyVar4.zzi();
                    }
                } catch (RemoteException e) {
                    co0.zzl("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (lyVar3 = this.f39978g) != null) {
                lyVar3.zzh();
            }
            if (z7 && (lyVar2 = this.f39978g) != null) {
                lyVar2.zzg();
            }
            if (z8) {
                C7921ly lyVar5 = this.f39978g;
                if (lyVar5 != null) {
                    lyVar5.zze();
                }
                this.f39973b.mo18743d();
            }
            if (!(z == z2 || (lyVar = this.f39978g) == null)) {
                lyVar.mo32996d5(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q6 */
    public final /* synthetic */ void mo35275q6(Map map) {
        this.f39973b.mo18321Z("pubVideoCmd", map);
    }

    /* renamed from: r6 */
    public final void mo35276r6(zzbkq zzbkq) {
        boolean z = zzbkq.f42990b;
        boolean z2 = zzbkq.f42991c;
        boolean z3 = zzbkq.f42992d;
        synchronized (this.f39974c) {
            this.f39984m = z2;
            this.f39985n = z3;
        }
        m38450v6("initialState", C6484f.m28254d("muteStart", true != z ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "customControlsRequested", true != z2 ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "clickToExpandRequested", true != z3 ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
    }

    /* renamed from: s6 */
    public final void mo35277s6(float f) {
        synchronized (this.f39974c) {
            this.f39982k = f;
        }
    }

    /* renamed from: t6 */
    public final void mo35278t6(z40 z40) {
        synchronized (this.f39974c) {
            this.f39986o = z40;
        }
    }

    public final float zze() {
        float f;
        synchronized (this.f39974c) {
            f = this.f39983l;
        }
        return f;
    }

    public final float zzf() {
        float f;
        synchronized (this.f39974c) {
            f = this.f39982k;
        }
        return f;
    }

    public final float zzg() {
        float f;
        synchronized (this.f39974c) {
            f = this.f39981j;
        }
        return f;
    }

    public final int zzh() {
        int i;
        synchronized (this.f39974c) {
            i = this.f39977f;
        }
        return i;
    }

    public final C7921ly zzi() throws RemoteException {
        C7921ly lyVar;
        synchronized (this.f39974c) {
            lyVar = this.f39978g;
        }
        return lyVar;
    }

    public final void zzk() {
        m38450v6("pause", (Map<String, String>) null);
    }

    public final void zzl() {
        m38450v6("play", (Map<String, String>) null);
    }

    public final void zzn() {
        m38450v6("stop", (Map<String, String>) null);
    }

    public final boolean zzo() {
        boolean z;
        boolean zzp = zzp();
        synchronized (this.f39974c) {
            z = false;
            if (!zzp) {
                try {
                    if (this.f39985n && this.f39976e) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    public final boolean zzp() {
        boolean z;
        synchronized (this.f39974c) {
            z = false;
            if (this.f39975d && this.f39984m) {
                z = true;
            }
        }
        return z;
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.f39974c) {
            z = this.f39980i;
        }
        return z;
    }
}
