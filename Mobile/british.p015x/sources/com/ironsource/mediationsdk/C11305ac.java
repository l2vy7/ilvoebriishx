package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.C4987a;
import com.ironsource.lifecycle.C4997g;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.p276a.C11295g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.ac */
public final class C11305ac {

    /* renamed from: a */
    C4987a f50752a;

    /* renamed from: com.ironsource.mediationsdk.ac$a */
    final class C11306a extends C4997g {
        public C11306a() {
        }

        public final void run() {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, this.f22088b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C11295g.f50727v.mo43979b(new C11308a(44, mediationAdditionalData));
        }
    }
}
