package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p006a5.C6492o;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o72 implements i72<dm1> {

    /* renamed from: a */
    private final uk1 f36315a;

    /* renamed from: b */
    private final nb3 f36316b;

    /* renamed from: c */
    private final wo1 f36317c;

    /* renamed from: d */
    private final ss2<ir1> f36318d;

    /* renamed from: e */
    private final pr1 f36319e;

    public o72(uk1 uk1, nb3 nb3, wo1 wo1, ss2<ir1> ss2, pr1 pr1) {
        this.f36315a = uk1;
        this.f36316b = nb3;
        this.f36317c = wo1;
        this.f36318d = ss2;
        this.f36319e = pr1;
    }

    /* renamed from: g */
    private final mb3<dm1> m35579g(ur2 ur2, ir2 ir2, JSONObject jSONObject) {
        mb3<ir1> a = this.f36318d.mo34783a();
        mb3<im1> a2 = this.f36317c.mo35650a(ur2, ir2, jSONObject);
        return bb3.m30644d(a, a2).mo30342a(new n72(this, a2, a, ur2, ir2, jSONObject), this.f36316b);
    }

    /* renamed from: a */
    public final boolean mo31509a(ur2 ur2, ir2 ir2) {
        nr2 nr2 = ir2.f33494t;
        return (nr2 == null || nr2.f36097c == null) ? false : true;
    }

    /* renamed from: b */
    public final mb3<List<mb3<dm1>>> mo31510b(ur2 ur2, ir2 ir2) {
        return bb3.m30654n(bb3.m30654n(this.f36318d.mo34783a(), new l72(this, ir2), this.f36316b), new m72(this, ur2, ir2), this.f36316b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ dm1 mo33844c(mb3 mb3, mb3 mb32, ur2 ur2, ir2 ir2, JSONObject jSONObject) throws Exception {
        im1 im1 = (im1) mb3.get();
        ir1 ir1 = (ir1) mb32.get();
        jm1 c = this.f36315a.mo35200c(new e71(ur2, ir2, (String) null), new um1(im1), new kl1(jSONObject, ir1));
        c.mo32809j().mo35019b();
        c.mo32810k().mo31652a(ir1);
        c.mo32808i().mo30773a(im1.mo32666Z());
        c.mo32811l().mo33994a(this.f36319e);
        return c.mo32807h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ mb3 mo33845d(ir1 ir1, JSONObject jSONObject) throws Exception {
        this.f36318d.mo34784b(bb3.m30649i(ir1));
        if (jSONObject.optBoolean("success")) {
            return bb3.m30649i(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new gb0("process json failed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ mb3 mo33846e(ir2 ir2, ir1 ir1) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37163n6)).booleanValue() && C6492o.m28290m()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", ir2.f33494t.f36097c);
        jSONObject2.put("sdk_params", jSONObject);
        return bb3.m30654n(ir1.mo32753d("google.afma.nativeAds.preProcessJson", jSONObject2), new k72(this, ir1), this.f36316b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ mb3 mo33847f(ur2 ur2, ir2 ir2, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return bb3.m30648h(new wy1(3));
        }
        if (ur2.f39936a.f38765a.f30094k <= 1) {
            return bb3.m30653m(m35579g(ur2, ir2, jSONArray.getJSONObject(0)), j72.f33795a, this.f36316b);
        }
        int length = jSONArray.length();
        this.f36318d.mo34785c(Math.min(length, ur2.f39936a.f38765a.f30094k));
        ArrayList arrayList = new ArrayList(ur2.f39936a.f38765a.f30094k);
        for (int i = 0; i < ur2.f39936a.f38765a.f30094k; i++) {
            if (i < length) {
                arrayList.add(m35579g(ur2, ir2, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(bb3.m30648h(new wy1(3)));
            }
        }
        return bb3.m30649i(arrayList);
    }
}
