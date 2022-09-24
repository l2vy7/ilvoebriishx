package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wo1 {

    /* renamed from: a */
    private final nb3 f40833a;

    /* renamed from: b */
    private final kp1 f40834b;

    /* renamed from: c */
    private final pp1 f40835c;

    public wo1(nb3 nb3, kp1 kp1, pp1 pp1) {
        this.f40833a = nb3;
        this.f40834b = kp1;
        this.f40835c = pp1;
    }

    /* renamed from: a */
    public final mb3<im1> mo35650a(ur2 ur2, ir2 ir2, JSONObject jSONObject) {
        mb3 n;
        ur2 ur22 = ur2;
        ir2 ir22 = ir2;
        JSONObject jSONObject2 = jSONObject;
        mb3 b = this.f40833a.mo33675b(new uo1(this, ur22, ir22, jSONObject2));
        mb3<List<c30>> f = this.f40834b.mo33134f(jSONObject2, "images");
        mb3<xt0> g = this.f40834b.mo33135g(jSONObject2, "images", ir22, ur22.f39937b.f39519b);
        mb3<c30> e = this.f40834b.mo33133e(jSONObject2, "secondary_image");
        mb3<c30> e2 = this.f40834b.mo33133e(jSONObject2, "app_icon");
        mb3<z20> d = this.f40834b.mo33132d(jSONObject2, "attribution");
        mb3<xt0> h = this.f40834b.mo33136h(jSONObject2, ir22, ur22.f39937b.f39519b);
        kp1 kp1 = this.f40834b;
        if (!jSONObject2.optBoolean("enable_omid")) {
            n = bb3.m30649i(null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                n = bb3.m30649i(null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    n = bb3.m30649i(null);
                } else {
                    n = bb3.m30654n(bb3.m30649i(null), new fp1(kp1, optString), po0.f37726e);
                }
            }
        }
        mb3 mb3 = n;
        mb3<List<op1>> a = this.f40835c.mo34164a(jSONObject2, "custom_assets");
        return bb3.m30642b(b, f, g, e, e2, d, h, mb3, a).mo30342a(new vo1(this, b, f, e2, e, d, jSONObject, h, g, mb3, a), this.f40833a);
    }
}
