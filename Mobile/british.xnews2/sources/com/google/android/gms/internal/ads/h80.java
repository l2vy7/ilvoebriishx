package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.p195h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.C4604n;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class h80 {

    /* renamed from: a */
    private final Context f32662a;

    /* renamed from: b */
    private final OnH5AdsEventListener f32663b;

    /* renamed from: c */
    private d80 f32664c;

    public h80(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        C4604n.m20102o(Build.VERSION.SDK_INT >= 21, "Android version must be Lollipop or higher");
        C4604n.m20098k(context);
        C4604n.m20098k(onH5AdsEventListener);
        this.f32662a = context;
        this.f32663b = onH5AdsEventListener;
        p00.m35913c(context);
    }

    /* renamed from: c */
    public static final boolean m32834c(String str) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36998U6)).booleanValue()) {
            return false;
        }
        C4604n.m20098k(str);
        if (str.length() > ((Integer) C8311wv.m39277c().mo18570b(p00.f37014W6)).intValue()) {
            co0.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final void m32835d() {
        if (this.f32664c == null) {
            this.f32664c = C8241uv.m38462a().mo34798k(this.f32662a, new qc0(), this.f32663b);
        }
    }

    /* renamed from: a */
    public final void mo32367a() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36998U6)).booleanValue()) {
            m32835d();
            d80 d80 = this.f32664c;
            if (d80 != null) {
                try {
                    d80.zze();
                } catch (RemoteException e) {
                    co0.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo32368b(String str) {
        if (!m32834c(str)) {
            return false;
        }
        m32835d();
        d80 d80 = this.f32664c;
        if (d80 == null) {
            return false;
        }
        try {
            d80.mo30636c(str);
            return true;
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }
}
