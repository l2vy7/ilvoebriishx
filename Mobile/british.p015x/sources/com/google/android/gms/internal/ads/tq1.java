package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tq1 implements e70<Object> {

    /* renamed from: a */
    private final v40 f39490a;

    /* renamed from: b */
    private final ir1 f39491b;

    /* renamed from: c */
    private final ou3<pq1> f39492c;

    public tq1(tm1 tm1, im1 im1, ir1 ir1, ou3<pq1> ou3) {
        this.f39490a = tm1.mo34981c(im1.mo32679g0());
        this.f39491b = ir1;
        this.f39492c = ou3;
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f39490a.mo30918L4(this.f39492c.zzb(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            co0.zzk(sb.toString(), e);
        }
    }

    /* renamed from: b */
    public final void mo35019b() {
        if (this.f39490a != null) {
            this.f39491b.mo32758i("/nativeAdCustomClick", this);
        }
    }
}
