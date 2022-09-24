package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pp1 {

    /* renamed from: a */
    private final Executor f37731a;

    /* renamed from: b */
    private final kp1 f37732b;

    public pp1(Executor executor, kp1 kp1) {
        this.f37731a = executor;
        this.f37732b = kp1;
    }

    /* renamed from: a */
    public final mb3<List<op1>> mo34164a(JSONObject jSONObject, String str) {
        mb3<O> mb3;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return bb3.m30649i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                mb3 = bb3.m30649i(null);
            } else {
                String optString = optJSONObject.optString(MediationMetaData.KEY_NAME);
                if (optString == null) {
                    mb3 = bb3.m30649i(null);
                } else {
                    String optString2 = optJSONObject.optString(SessionDescription.ATTR_TYPE);
                    if ("string".equals(optString2)) {
                        mb3 = bb3.m30649i(new op1(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        mb3 = bb3.m30653m(this.f37732b.mo33133e(optJSONObject, "image_value"), new mp1(optString), this.f37731a);
                    } else {
                        mb3 = bb3.m30649i(null);
                    }
                }
            }
            arrayList.add(mb3);
        }
        return bb3.m30653m(bb3.m30645e(arrayList), np1.f36069a, this.f37731a);
    }
}
