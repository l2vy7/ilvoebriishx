package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ln1 implements View.OnClickListener {

    /* renamed from: b */
    private final ir1 f35139b;

    /* renamed from: c */
    private final C6483e f35140c;

    /* renamed from: d */
    private m50 f35141d;

    /* renamed from: e */
    private e70<Object> f35142e;

    /* renamed from: f */
    String f35143f;

    /* renamed from: g */
    Long f35144g;

    /* renamed from: h */
    WeakReference<View> f35145h;

    public ln1(ir1 ir1, C6483e eVar) {
        this.f35139b = ir1;
        this.f35140c = eVar;
    }

    /* renamed from: d */
    private final void m34508d() {
        View view;
        this.f35143f = null;
        this.f35144g = null;
        WeakReference<View> weakReference = this.f35145h;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.f35145h = null;
        }
    }

    /* renamed from: a */
    public final m50 mo33359a() {
        return this.f35141d;
    }

    /* renamed from: b */
    public final void mo33360b() {
        if (this.f35141d != null && this.f35144g != null) {
            m34508d();
            try {
                this.f35141d.zze();
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo33361c(m50 m50) {
        this.f35141d = m50;
        e70<Object> e70 = this.f35142e;
        if (e70 != null) {
            this.f35139b.mo32760k("/unconfirmedClick", e70);
        }
        kn1 kn1 = new kn1(this, m50);
        this.f35142e = kn1;
        this.f35139b.mo32758i("/unconfirmedClick", kn1);
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f35145h;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f35143f == null || this.f35144g == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put(TtmlNode.ATTR_ID, this.f35143f);
                hashMap.put("time_interval", String.valueOf(this.f35140c.currentTimeMillis() - this.f35144g.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f35139b.mo32756g("sendMessageToNativeJs", hashMap);
            }
            m34508d();
        }
    }
}
