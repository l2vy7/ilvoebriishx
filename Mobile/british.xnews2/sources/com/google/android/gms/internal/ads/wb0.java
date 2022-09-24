package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wb0<I, O> implements hb0<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final jb0<O> f20956a;

    /* renamed from: b */
    private final lb0<I> f20957b;

    /* renamed from: c */
    private final db0 f20958c;

    /* renamed from: d */
    private final String f20959d;

    wb0(db0 db0, String str, lb0<I> lb0, jb0<O> jb0) {
        this.f20958c = db0;
        this.f20959d = str;
        this.f20957b = lb0;
        this.f20956a = jb0;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m21100b(wb0 wb0, xa0 xa0, eb0 eb0, Object obj, uo0 uo0) {
        try {
            zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            d70.f30668o.mo18856c(uuid, new vb0(wb0, xa0, uo0));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TtmlNode.ATTR_ID, uuid);
            jSONObject.put("args", wb0.f20957b.zzb(obj));
            eb0.mo18317E0(wb0.f20959d, jSONObject);
        } catch (Exception e) {
            uo0.zze(e);
            co0.zzh("Unable to invokeJavascript", e);
            xa0.mo35743g();
        } catch (Throwable th) {
            xa0.mo35743g();
            throw th;
        }
    }

    public final mb3<O> zza(I i) throws Exception {
        return zzb(i);
    }

    public final mb3<O> zzb(I i) {
        uo0 uo0 = new uo0();
        xa0 b = this.f20958c.mo18234b((C7497ab) null);
        b.mo30763e(new tb0(this, b, i, uo0), new ub0(this, uo0, b));
        return uo0;
    }
}
