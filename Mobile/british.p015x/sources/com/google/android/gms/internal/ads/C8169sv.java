package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.p196h5.OnH5AdsEventListener;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.sv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8169sv {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7991nu f39070a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7917lu f39071b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7592cz f39072c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final r50 f39073d;

    /* renamed from: e */
    private final ok0 f39074e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final vg0 f39075f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final s50 f39076g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public bi0 f39077h;

    public C8169sv(C7991nu nuVar, C7917lu luVar, C7592cz czVar, r50 r50, ok0 ok0, vg0 vg0, s50 s50) {
        this.f39070a = nuVar;
        this.f39071b = luVar;
        this.f39072c = czVar;
        this.f39073d = r50;
        this.f39074e = ok0;
        this.f39075f = vg0;
        this.f39076g = s50;
    }

    /* renamed from: s */
    static /* bridge */ /* synthetic */ void m37563s(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C8241uv.m38463b().mo35450i(context, C8241uv.m38464c().f43036b, "gmob-apps", bundle, true);
    }

    /* renamed from: c */
    public final C7993nw mo34793c(Context context, String str, tc0 tc0) {
        return (C7993nw) new C7881kv(this, context, str, tc0).mo35040d(context, false);
    }

    /* renamed from: d */
    public final C8136rw mo34794d(Context context, zzbfi zzbfi, String str, tc0 tc0) {
        return (C8136rw) new C7733gv(this, context, zzbfi, str, tc0).mo35040d(context, false);
    }

    /* renamed from: e */
    public final C8136rw mo34795e(Context context, zzbfi zzbfi, String str, tc0 tc0) {
        return (C8136rw) new C7808iv(this, context, zzbfi, str, tc0).mo35040d(context, false);
    }

    /* renamed from: g */
    public final u30 mo34796g(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (u30) new C8028ov(this, frameLayout, frameLayout2, context).mo35040d(context, false);
    }

    /* renamed from: h */
    public final a40 mo34797h(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return (a40) new C8100qv(this, view, hashMap, hashMap2).mo35040d(view.getContext(), false);
    }

    /* renamed from: k */
    public final d80 mo34798k(Context context, tc0 tc0, OnH5AdsEventListener onH5AdsEventListener) {
        return (d80) new C7623dv(this, context, tc0, onH5AdsEventListener).mo35040d(context, false);
    }

    /* renamed from: l */
    public final mg0 mo34799l(Context context, tc0 tc0) {
        return (mg0) new C7552bv(this, context, tc0).mo35040d(context, false);
    }

    /* renamed from: n */
    public final yg0 mo34800n(Activity activity) {
        C8346xu xuVar = new C8346xu(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            co0.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (yg0) xuVar.mo35040d(activity, z);
    }

    /* renamed from: p */
    public final bk0 mo34801p(Context context, String str, tc0 tc0) {
        return (bk0) new C8135rv(this, context, str, tc0).mo35040d(context, false);
    }

    /* renamed from: q */
    public final wm0 mo34802q(Context context, tc0 tc0) {
        return (wm0) new C8419zu(this, context, tc0).mo35040d(context, false);
    }
}
