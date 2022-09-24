package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gy1 {

    /* renamed from: a */
    private final tx1 f32520a;

    /* renamed from: b */
    private final ft1 f32521b;

    /* renamed from: c */
    private final Object f32522c = new Object();

    /* renamed from: d */
    private final List<fy1> f32523d;

    /* renamed from: e */
    private boolean f32524e;

    gy1(tx1 tx1, ft1 ft1) {
        this.f32520a = tx1;
        this.f32521b = ft1;
        this.f32523d = new ArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m32740d(List<zzbtn> list) {
        String zzcab;
        synchronized (this.f32522c) {
            if (!this.f32524e) {
                for (zzbtn next : list) {
                    List<fy1> list2 = this.f32523d;
                    String str = next.f43012b;
                    et1 a = this.f32521b.mo18337a(str);
                    if (a == null) {
                        zzcab = "";
                    } else {
                        zzcab zzcab2 = a.f20288b;
                        if (zzcab2 == null) {
                            zzcab = "";
                        } else {
                            zzcab = zzcab2.toString();
                        }
                    }
                    String str2 = zzcab;
                    boolean z = next.f43013c;
                    list2.add(new fy1(str, str2, z ? 1 : 0, next.f43015e, next.f43014d));
                }
                this.f32524e = true;
            }
        }
    }

    /* renamed from: a */
    public final JSONArray mo32305a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f32522c) {
            if (!this.f32524e) {
                if (this.f32520a.mo35067s()) {
                    m32740d(this.f32520a.mo35058f());
                } else {
                    mo32306c();
                    return jSONArray;
                }
            }
            for (fy1 a : this.f32523d) {
                jSONArray.put(a.mo31960a());
            }
            return jSONArray;
        }
    }

    /* renamed from: c */
    public final void mo32306c() {
        this.f32520a.mo35066r(new ey1(this));
    }
}
