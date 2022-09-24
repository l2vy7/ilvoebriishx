package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uf0 extends vf0 implements e70<xt0> {

    /* renamed from: c */
    private final xt0 f39842c;

    /* renamed from: d */
    private final Context f39843d;

    /* renamed from: e */
    private final WindowManager f39844e;

    /* renamed from: f */
    private final C8387yz f39845f;

    /* renamed from: g */
    DisplayMetrics f39846g;

    /* renamed from: h */
    private float f39847h;

    /* renamed from: i */
    int f39848i = -1;

    /* renamed from: j */
    int f39849j = -1;

    /* renamed from: k */
    private int f39850k;

    /* renamed from: l */
    int f39851l = -1;

    /* renamed from: m */
    int f39852m = -1;

    /* renamed from: n */
    int f39853n = -1;

    /* renamed from: o */
    int f39854o = -1;

    public uf0(xt0 xt0, Context context, C8387yz yzVar) {
        super(xt0, "");
        this.f39842c = xt0;
        this.f39843d = context;
        this.f39845f = yzVar;
        this.f39844e = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo18854a(Object obj, Map map) {
        JSONObject jSONObject;
        xt0 xt0 = (xt0) obj;
        this.f39846g = new DisplayMetrics();
        Display defaultDisplay = this.f39844e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f39846g);
        this.f39847h = this.f39846g.density;
        this.f39850k = defaultDisplay.getRotation();
        C8241uv.m38463b();
        DisplayMetrics displayMetrics = this.f39846g;
        this.f39848i = vn0.m38858q(displayMetrics, displayMetrics.widthPixels);
        C8241uv.m38463b();
        DisplayMetrics displayMetrics2 = this.f39846g;
        this.f39849j = vn0.m38858q(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzk = this.f39842c.zzk();
        if (zzk == null || zzk.getWindow() == null) {
            this.f39851l = this.f39848i;
            this.f39852m = this.f39849j;
        } else {
            zzt.zzp();
            int[] zzU = com.google.android.gms.ads.internal.util.zzt.zzU(zzk);
            C8241uv.m38463b();
            this.f39851l = vn0.m38858q(this.f39846g, zzU[0]);
            C8241uv.m38463b();
            this.f39852m = vn0.m38858q(this.f39846g, zzU[1]);
        }
        if (this.f39842c.mo18765m().mo34013i()) {
            this.f39853n = this.f39848i;
            this.f39854o = this.f39849j;
        } else {
            this.f39842c.measure(0, 0);
        }
        mo35421e(this.f39848i, this.f39849j, this.f39851l, this.f39852m, this.f39847h, this.f39850k);
        tf0 tf0 = new tf0();
        C8387yz yzVar = this.f39845f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        tf0.mo34951e(yzVar.mo35981a(intent));
        C8387yz yzVar2 = this.f39845f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        tf0.mo34949c(yzVar2.mo35981a(intent2));
        tf0.mo34947a(this.f39845f.mo35982b());
        tf0.mo34950d(this.f39845f.mo35983c());
        tf0.mo34948b(true);
        boolean h = tf0.f39410a;
        boolean j = tf0.f39411b;
        boolean f = tf0.f39412c;
        boolean i = tf0.f39413d;
        boolean g = tf0.f39414e;
        xt0 xt02 = this.f39842c;
        try {
            jSONObject = new JSONObject().put("sms", h).put("tel", j).put("calendar", f).put("storePicture", i).put("inlineVideo", g);
        } catch (JSONException e) {
            co0.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        xt02.mo18322a("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f39842c.getLocationOnScreen(iArr);
        mo35187h(C8241uv.m38463b().mo35447b(this.f39843d, iArr[0]), C8241uv.m38463b().mo35447b(this.f39843d, iArr[1]));
        if (co0.zzm(2)) {
            co0.zzi("Dispatching Ready Event.");
        }
        mo35420d(this.f39842c.zzp().f43036b);
    }

    /* renamed from: h */
    public final void mo35187h(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.f39843d instanceof Activity) {
            zzt.zzp();
            i3 = com.google.android.gms.ads.internal.util.zzt.zzW((Activity) this.f39843d)[0];
        } else {
            i3 = 0;
        }
        if (this.f39842c.mo18765m() == null || !this.f39842c.mo18765m().mo34013i()) {
            int width = this.f39842c.getWidth();
            int height = this.f39842c.getHeight();
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36927M)).booleanValue()) {
                if (width == 0) {
                    width = this.f39842c.mo18765m() != null ? this.f39842c.mo18765m().f36607c : 0;
                }
                if (height == 0) {
                    if (this.f39842c.mo18765m() != null) {
                        i4 = this.f39842c.mo18765m().f36606b;
                    }
                    this.f39853n = C8241uv.m38463b().mo35447b(this.f39843d, width);
                    this.f39854o = C8241uv.m38463b().mo35447b(this.f39843d, i4);
                }
            }
            i4 = height;
            this.f39853n = C8241uv.m38463b().mo35447b(this.f39843d, width);
            this.f39854o = C8241uv.m38463b().mo35447b(this.f39843d, i4);
        }
        mo35418b(i, i2 - i3, this.f39853n, this.f39854o);
        this.f39842c.mo18793u0().mo18257L(i, i2);
    }
}
