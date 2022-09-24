package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fa0 implements x90, v90 {

    /* renamed from: b */
    private final xt0 f20329b;

    public fa0(Context context, zzcjf zzcjf, C7497ab abVar, zza zza) throws ju0 {
        zzt.zzz();
        xt0 a = ku0.m20660a(context, ov0.m35840a(), "", false, false, (C7497ab) null, (p10) null, zzcjf, (e10) null, (zzl) null, (zza) null, C7728gq.m32636a(), (ir2) null, (lr2) null);
        this.f20329b = a;
        ((View) a).setWillNotDraw(true);
    }

    /* renamed from: L */
    private static final void m20452L(Runnable runnable) {
        C8241uv.m38463b();
        if (vn0.m38857p()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzt.zza.post(runnable);
        }
    }

    /* renamed from: B0 */
    public final void mo18315B0(String str, e70<? super eb0> e70) {
        this.f20329b.mo18749f0(str, new z90(e70));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final /* synthetic */ void mo18316E(String str) {
        this.f20329b.loadData(str, "text/html", C6540C.UTF8_NAME);
    }

    /* renamed from: E0 */
    public final /* synthetic */ void mo18317E0(String str, JSONObject jSONObject) {
        u90.m38245d(this, str, jSONObject);
    }

    /* renamed from: G */
    public final void mo18318G(ha0 ha0) {
        this.f20329b.mo18793u0().mo18248D0(new y90(ha0, (byte[]) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo18319J(String str) {
        this.f20329b.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo18320K(String str) {
        this.f20329b.loadData(str, "text/html", C6540C.UTF8_NAME);
    }

    /* renamed from: Z */
    public final /* synthetic */ void mo18321Z(String str, Map map) {
        u90.m38242a(this, str, map);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo18322a(String str, JSONObject jSONObject) {
        u90.m38243b(this, str, jSONObject);
    }

    /* renamed from: c */
    public final void mo18323c(String str) {
        m20452L(new ba0(this, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo18324f(String str) {
        this.f20329b.zza(str);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo18325g(String str, String str2) {
        u90.m38244c(this, str, str2);
    }

    /* renamed from: w */
    public final void mo18326w(String str) {
        m20452L(new da0(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: x */
    public final void mo18327x(String str) {
        m20452L(new ca0(this, str));
    }

    /* renamed from: z */
    public final void mo18328z(String str, e70<? super eb0> e70) {
        this.f20329b.mo18726O(str, new ea0(this, e70));
    }

    public final void zza(String str) {
        m20452L(new aa0(this, str));
    }

    public final void zzc() {
        this.f20329b.destroy();
    }

    public final boolean zzi() {
        return this.f20329b.mo18783q0();
    }

    public final fb0 zzj() {
        return new fb0(this);
    }
}
