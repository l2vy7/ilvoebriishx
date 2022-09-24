package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w42 {

    /* renamed from: a */
    private final List<zzbfm> f40694a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private final Map<String, zzbfm> f40695b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private lr2 f40696c = null;

    /* renamed from: d */
    private ir2 f40697d = null;

    /* renamed from: a */
    public final fa1 mo35552a() {
        return new fa1(this.f40697d, "", this, this.f40696c);
    }

    /* renamed from: b */
    public final List<zzbfm> mo35553b() {
        return this.f40694a;
    }

    /* renamed from: c */
    public final void mo35554c(ir2 ir2) {
        String str = ir2.f33498x;
        if (!this.f40695b.containsKey(str)) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = ir2.f33497w.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, ir2.f33497w.getString(next));
                } catch (JSONException unused) {
                }
            }
            zzbfm zzbfm = new zzbfm(ir2.f33443F, 0, (zzbew) null, bundle);
            this.f40694a.add(zzbfm);
            this.f40695b.put(str, zzbfm);
        }
    }

    /* renamed from: d */
    public final void mo35555d(ir2 ir2, long j, zzbew zzbew) {
        String str = ir2.f33498x;
        if (this.f40695b.containsKey(str)) {
            if (this.f40697d == null) {
                this.f40697d = ir2;
            }
            zzbfm zzbfm = this.f40695b.get(str);
            zzbfm.f42980c = j;
            zzbfm.f42981d = zzbew;
        }
    }

    /* renamed from: e */
    public final void mo35556e(lr2 lr2) {
        this.f40696c = lr2;
    }
}
