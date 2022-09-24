package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.zzt;
import java.util.Arrays;
import java.util.List;
import p149t.C6077a;
import p149t.C6090g;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pq1 extends k40 {

    /* renamed from: b */
    private final Context f37749b;

    /* renamed from: c */
    private final im1 f37750c;

    /* renamed from: d */
    private in1 f37751d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public dm1 f37752e;

    public pq1(Context context, im1 im1, in1 in1, dm1 dm1) {
        this.f37749b = context;
        this.f37750c = im1;
        this.f37751d = in1;
        this.f37752e = dm1;
    }

    /* renamed from: P */
    public final void mo32832P(String str) {
        dm1 dm1 = this.f37752e;
        if (dm1 != null) {
            dm1.mo31308R(str);
        }
    }

    /* renamed from: W */
    public final boolean mo32833W(C10487a aVar) {
        in1 in1;
        Object f3 = C10489b.m48194f3(aVar);
        if (!(f3 instanceof ViewGroup) || (in1 = this.f37751d) == null || !in1.mo32733f((ViewGroup) f3)) {
            return false;
        }
        this.f37750c.mo32666Z().mo18714C0(new oq1(this));
        return true;
    }

    /* renamed from: c */
    public final q30 mo32834c(String str) {
        return this.f37750c.mo32656P().get(str);
    }

    /* renamed from: f0 */
    public final String mo32835f0(String str) {
        return this.f37750c.mo32657Q().get(str);
    }

    /* renamed from: g0 */
    public final void mo32836g0(C10487a aVar) {
        dm1 dm1;
        Object f3 = C10489b.m48194f3(aVar);
        if ((f3 instanceof View) && this.f37750c.mo32671c0() != null && (dm1 = this.f37752e) != null) {
            dm1.mo31314j((View) f3);
        }
    }

    public final C7774hy zze() {
        return this.f37750c.mo32658R();
    }

    public final C10487a zzg() {
        return C10489b.m48195m6(this.f37749b);
    }

    public final String zzh() {
        return this.f37750c.mo32679g0();
    }

    public final List<String> zzj() {
        C6090g<String, c30> P = this.f37750c.mo32656P();
        C6090g<String, String> Q = this.f37750c.mo32657Q();
        String[] strArr = new String[(P.size() + Q.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < P.size()) {
            strArr[i3] = P.mo23390j(i2);
            i2++;
            i3++;
        }
        while (i < Q.size()) {
            strArr[i3] = Q.mo23390j(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    public final void zzk() {
        dm1 dm1 = this.f37752e;
        if (dm1 != null) {
            dm1.mo31310a();
        }
        this.f37752e = null;
        this.f37751d = null;
    }

    public final void zzl() {
        String a = this.f37750c.mo32667a();
        if ("Google".equals(a)) {
            co0.zzj("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(a)) {
            co0.zzj("Not starting OMID session. OM partner name has not been configured.");
        } else {
            dm1 dm1 = this.f37752e;
            if (dm1 != null) {
                dm1.mo31300J(a, false);
            }
        }
    }

    public final void zzn() {
        dm1 dm1 = this.f37752e;
        if (dm1 != null) {
            dm1.mo31313i();
        }
    }

    public final boolean zzp() {
        dm1 dm1 = this.f37752e;
        if ((dm1 == null || dm1.mo31326v()) && this.f37750c.mo32665Y() != null && this.f37750c.mo32666Z() == null) {
            return true;
        }
        return false;
    }

    public final boolean zzr() {
        C10487a c0 = this.f37750c.mo32671c0();
        if (c0 != null) {
            zzt.zzh().zzh(c0);
            if (this.f37750c.mo32665Y() == null) {
                return true;
            }
            this.f37750c.mo32665Y().mo18321Z("onSdkLoaded", new C6077a());
            return true;
        }
        co0.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
