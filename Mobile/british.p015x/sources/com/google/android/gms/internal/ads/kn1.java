package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class kn1 implements e70 {

    /* renamed from: a */
    public final /* synthetic */ ln1 f34377a;

    /* renamed from: b */
    public final /* synthetic */ m50 f34378b;

    public /* synthetic */ kn1(ln1 ln1, m50 m50) {
        this.f34377a = ln1;
        this.f34378b = m50;
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map map) {
        ln1 ln1 = this.f34377a;
        m50 m50 = this.f34378b;
        try {
            ln1.f35144g = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            co0.zzg("Failed to call parse unconfirmedClickTimestamp.");
        }
        ln1.f35143f = (String) map.get(TtmlNode.ATTR_ID);
        String str = (String) map.get("asset_id");
        if (m50 == null) {
            co0.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            m50.mo30621c(str);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
