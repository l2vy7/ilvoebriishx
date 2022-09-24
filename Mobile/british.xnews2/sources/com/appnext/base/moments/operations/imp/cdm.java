package com.appnext.base.moments.operations.imp;

import com.appnext.base.C3117a;
import com.appnext.base.moments.operations.C3142c;
import com.appnext.base.moments.p027a.C3127a;
import com.appnext.base.moments.p027a.p028a.C3129b;
import com.appnext.base.moments.p027a.p028a.C3130c;
import com.appnext.base.moments.p030b.C3135a;
import com.appnext.base.moments.p030b.C3138c;
import com.appnext.base.moments.services.p032b.C3147a;
import com.appnext.base.p026b.C3125a;
import com.appnext.core.C3198g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.HttpRetryException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class cdm extends C3142c {
    /* renamed from: m */
    private static List<C3130c> m10621m(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.getString(IronSourceConstants.EVENTS_STATUS).equals("on")) {
                    jSONObject.put("service_key", jSONObject.optString("key") + System.currentTimeMillis());
                    arrayList.add(C3135a.m10611b(jSONObject));
                }
            }
            C3127a.m10579Q().mo10557T().mo10573ag();
            C3127a.m10579Q().mo10557T().mo10575b(jSONArray);
            return arrayList;
        } catch (Throwable th) {
            th.getMessage();
            C3117a.m10553a("cdm$parseConfigAndStore", th);
            return new ArrayList();
        }
    }

    /* access modifiers changed from: protected */
    public List<C3129b> getData() {
        String str = "[ { \"status\": \"on\", \"sample\":\"1\", \"sample_type\":\"hour\", \"cycle\":\"1\", \"cycle_type\":\"interval\", \"key\":\"cdm\" } ]";
        try {
            if (C3138c.m10615d(C3125a.getContext())) {
                return null;
            }
            str = C3198g.m10776a(C3125a.getContext(), "https://cdn.appnext.com/tools/services/4.7.3/config.json", (HashMap<String, String>) null);
            try {
                List<C3130c> ai = C3127a.m10579Q().mo10557T().mo10574ai();
                if (ai != null) {
                    C3147a.m10633b(C3125a.getContext()).mo10590a(ai);
                }
                for (C3130c a : m10621m(str)) {
                    C3147a.m10633b(C3125a.getContext()).mo10589a(a, false);
                }
            } catch (Throwable th) {
                C3117a.m10553a("cdm$getData", th);
            }
            return null;
        } catch (HttpRetryException e) {
            int responseCode = e.responseCode();
            if (responseCode == 400 || responseCode == 401 || responseCode == 402 || responseCode == 403 || responseCode == 404 || responseCode == 405 || responseCode == 500 || responseCode == 501 || responseCode == 503) {
                C3117a.m10553a("cdm$getData", e);
            }
        } catch (Throwable th2) {
            C3117a.m10553a("cdm$getData", th2);
        }
    }
}
