package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ec0<I, O> implements ha3<I, O> {

    /* renamed from: a */
    private final jb0<O> f31306a;

    /* renamed from: b */
    private final lb0<I> f31307b;

    /* renamed from: c */
    private final String f31308c = "google.afma.activeView.handleUpdate";

    /* renamed from: d */
    private final mb3<eb0> f31309d;

    ec0(mb3<eb0> mb3, String str, lb0<I> lb0, jb0<O> jb0) {
        this.f31309d = mb3;
        this.f31307b = lb0;
        this.f31306a = jb0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ mb3 mo31519a(Object obj, eb0 eb0) throws Exception {
        uo0 uo0 = new uo0();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        d70.f30668o.mo18856c(uuid, new dc0(this, uo0));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TtmlNode.ATTR_ID, uuid);
        jSONObject.put("args", (JSONObject) obj);
        eb0.mo18317E0(this.f31308c, jSONObject);
        return uo0;
    }

    public final mb3<O> zza(I i) throws Exception {
        return zzb(i);
    }

    public final mb3<O> zzb(I i) {
        return bb3.m30654n(this.f31309d, new cc0(this, i), po0.f37727f);
    }
}
