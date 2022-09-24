package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Hide;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.anq */
/* compiled from: IMASDK */
public final class anq extends ans {

    /* renamed from: a */
    final C4023gp f15453a;

    /* renamed from: b */
    final C4021gn f15454b;

    /* renamed from: c */
    private final C4024gq f15455c;

    /* renamed from: d */
    private boolean f15456d = false;

    public anq(Context context) {
        C4023gp j = C4023gp.m17272j(context);
        this.f15453a = j;
        this.f15455c = new C4024gq(j);
        this.f15454b = C4021gn.m17253j(context);
    }

    /* renamed from: n */
    private final C3847api m14396n(C3847api api, C3847api api2, boolean z) {
        Uri uri;
        try {
            Uri uri2 = (Uri) apj.m14500d(api);
            Context context = (Context) apj.m14500d(api2);
            if (z) {
                uri = this.f15455c.mo15883e(uri2, context);
            } else {
                uri = this.f15455c.mo15885g(uri2, context);
            }
            return apj.m14499c(uri);
        } catch (C4025gr unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final String mo14127b() {
        return "ms";
    }

    /* renamed from: c */
    public final void mo14128c(String str, String str2) {
        this.f15455c.mo15879a(str, str2);
    }

    /* renamed from: d */
    public final boolean mo14129d(C3847api api) {
        return this.f15455c.mo15880b((Uri) apj.m14500d(api));
    }

    /* renamed from: e */
    public final boolean mo14130e(C3847api api) {
        return this.f15455c.mo15881c((Uri) apj.m14500d(api));
    }

    /* renamed from: f */
    public final void mo14131f(String str) {
        this.f15455c.mo15882d(str);
    }

    /* renamed from: g */
    public final C3847api mo14132g(C3847api api, C3847api api2) {
        return m14396n(api, api2, true);
    }

    /* renamed from: h */
    public final String mo14133h(C3847api api) {
        return mo14134i(api, (byte[]) null);
    }

    /* renamed from: i */
    public final String mo14134i(C3847api api, byte[] bArr) {
        Context context = (Context) apj.m14500d(api);
        String g = this.f15453a.mo15871g(context, bArr);
        C4021gn gnVar = this.f15454b;
        if (gnVar == null || !this.f15456d) {
            return g;
        }
        String k = this.f15454b.mo15874k(g, gnVar.mo15871g(context, bArr));
        this.f15456d = false;
        return k;
    }

    /* renamed from: j */
    public final String mo14135j(C3847api api, String str) {
        return this.f15453a.mo15867c((Context) apj.m14500d(api), str);
    }

    /* renamed from: k */
    public final void mo14136k(C3847api api) {
        this.f15455c.mo15884f((MotionEvent) apj.m14500d(api));
    }

    /* renamed from: l */
    public final C3847api mo14137l(C3847api api, C3847api api2) {
        return m14396n(api, api2, false);
    }

    /* renamed from: m */
    public final boolean mo14138m(String str, boolean z) {
        if (this.f15454b == null) {
            return false;
        }
        this.f15454b.mo15877n(new AdvertisingIdClient.Info(str, z));
        this.f15456d = true;
        return true;
    }
}
