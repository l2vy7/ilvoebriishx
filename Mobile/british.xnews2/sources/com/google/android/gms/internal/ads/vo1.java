package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class vo1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ wo1 f40488a;

    /* renamed from: b */
    public final /* synthetic */ mb3 f40489b;

    /* renamed from: c */
    public final /* synthetic */ mb3 f40490c;

    /* renamed from: d */
    public final /* synthetic */ mb3 f40491d;

    /* renamed from: e */
    public final /* synthetic */ mb3 f40492e;

    /* renamed from: f */
    public final /* synthetic */ mb3 f40493f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f40494g;

    /* renamed from: h */
    public final /* synthetic */ mb3 f40495h;

    /* renamed from: i */
    public final /* synthetic */ mb3 f40496i;

    /* renamed from: j */
    public final /* synthetic */ mb3 f40497j;

    /* renamed from: k */
    public final /* synthetic */ mb3 f40498k;

    public /* synthetic */ vo1(wo1 wo1, mb3 mb3, mb3 mb32, mb3 mb33, mb3 mb34, mb3 mb35, JSONObject jSONObject, mb3 mb36, mb3 mb37, mb3 mb38, mb3 mb39) {
        this.f40488a = wo1;
        this.f40489b = mb3;
        this.f40490c = mb32;
        this.f40491d = mb33;
        this.f40492e = mb34;
        this.f40493f = mb35;
        this.f40494g = jSONObject;
        this.f40495h = mb36;
        this.f40496i = mb37;
        this.f40497j = mb38;
        this.f40498k = mb39;
    }

    public final Object call() {
        mb3 mb3 = this.f40489b;
        mb3 mb32 = this.f40490c;
        mb3 mb33 = this.f40491d;
        mb3 mb34 = this.f40492e;
        mb3 mb35 = this.f40493f;
        JSONObject jSONObject = this.f40494g;
        mb3 mb36 = this.f40495h;
        mb3 mb37 = this.f40496i;
        mb3 mb38 = this.f40497j;
        mb3 mb39 = this.f40498k;
        im1 im1 = (im1) mb3.get();
        im1.mo32687n((List) mb32.get());
        im1.mo32684k((q30) mb33.get());
        im1.mo32688o((q30) mb34.get());
        im1.mo32680h((i30) mb35.get());
        im1.mo32690q(kp1.m34038j(jSONObject));
        im1.mo32683j(kp1.m34037i(jSONObject));
        xt0 xt0 = (xt0) mb36.get();
        if (xt0 != null) {
            im1.mo32698y(xt0);
            im1.mo32697x(xt0.mo18790t());
            im1.mo32696w(xt0.zzs());
        }
        xt0 xt02 = (xt0) mb37.get();
        if (xt02 != null) {
            im1.mo32686m(xt02);
            im1.mo32699z(xt02.mo18790t());
        }
        xt0 xt03 = (xt0) mb38.get();
        if (xt03 != null) {
            im1.mo32691r(xt03);
        }
        for (op1 op1 : (List) mb39.get()) {
            if (op1.f36569a != 1) {
                im1.mo32685l(op1.f36570b, op1.f36572d);
            } else {
                im1.mo32694u(op1.f36570b, op1.f36571c);
            }
        }
        return im1;
    }
}
