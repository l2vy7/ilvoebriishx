package com.google.android.gms.internal.location;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C7259j;
import java.util.HashMap;
import java.util.Map;
import p131p5.C10871d;
import p131p5.C10872e;
import p131p5.C10876j;
import p250s5.C10973d;
import p250s5.C10974e;

/* renamed from: com.google.android.gms.internal.location.b */
public final class C9050b {

    /* renamed from: a */
    private final C10876j<C10872e> f44833a;

    /* renamed from: b */
    private final Context f44834b;

    /* renamed from: c */
    private ContentProviderClient f44835c = null;

    /* renamed from: d */
    private boolean f44836d = false;

    /* renamed from: e */
    private final Map<C7259j.C7260a<C10974e>, C9055g> f44837e = new HashMap();

    /* renamed from: f */
    private final Map<C7259j.C7260a<Object>, C9054f> f44838f = new HashMap();

    /* renamed from: g */
    private final Map<C7259j.C7260a<C10973d>, C9051c> f44839g = new HashMap();

    public C9050b(Context context, C10876j<C10872e> jVar) {
        this.f44834b = context;
        this.f44833a = jVar;
    }

    /* renamed from: a */
    public final Location mo37273a() throws RemoteException {
        this.f44833a.mo43063a();
        return this.f44833a.mo43064b().zza(this.f44834b.getPackageName());
    }

    /* renamed from: b */
    public final void mo37274b() throws RemoteException {
        synchronized (this.f44837e) {
            for (C9055g next : this.f44837e.values()) {
                if (next != null) {
                    this.f44833a.mo43064b().mo43054W4(zzbf.m42571D0(next, (C10871d) null));
                }
            }
            this.f44837e.clear();
        }
        synchronized (this.f44839g) {
            for (C9051c next2 : this.f44839g.values()) {
                if (next2 != null) {
                    this.f44833a.mo43064b().mo43054W4(zzbf.m42570C0(next2, (C10871d) null));
                }
            }
            this.f44839g.clear();
        }
        synchronized (this.f44838f) {
            for (C9054f next3 : this.f44838f.values()) {
                if (next3 != null) {
                    this.f44833a.mo43064b().mo43055n3(new zzo(2, (zzm) null, next3.asBinder(), (IBinder) null));
                }
            }
            this.f44838f.clear();
        }
    }

    /* renamed from: c */
    public final void mo37275c(boolean z) throws RemoteException {
        this.f44833a.mo43063a();
        this.f44833a.mo43064b().zza(z);
        this.f44836d = z;
    }

    /* renamed from: d */
    public final void mo37276d() throws RemoteException {
        if (this.f44836d) {
            mo37275c(false);
        }
    }
}
