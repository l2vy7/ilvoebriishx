package com.ironsource.mediationsdk.impressionData;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11231D;
import com.ironsource.mediationsdk.C11232E;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C11422h;
import com.ironsource.mediationsdk.server.C11477a;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.utils.C11493i;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.p292f.C11696a;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.List;
import org.json.JSONObject;
import p303e8.C12691c;

/* renamed from: com.ironsource.mediationsdk.impressionData.a */
public final class C11396a implements C11493i {

    /* renamed from: a */
    private boolean f51252a = true;

    /* renamed from: b */
    private String f51253b = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData";

    /* renamed from: com.ironsource.mediationsdk.impressionData.a$a */
    public static final class C11397a implements C11477a {
        C11397a() {
        }

        /* renamed from: a */
        public final void mo44316a(boolean z) {
            if (!z) {
                IronLog.API.error("failed to send impression data");
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m50980a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceOS", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        ContextProvider instance = ContextProvider.getInstance();
        C12691c.m53983b(instance, "ContextProvider.getInstance()");
        Context applicationContext = instance.getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.getDeviceType(applicationContext));
            C11231D ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
            if (ironSourceAdvId != null) {
                jSONObject.put("advId", ironSourceAdvId.f50370a);
                jSONObject.put("advIdType", ironSourceAdvId.f50371b);
            }
        }
        C11232E a = C11232E.m50103a();
        C12691c.m53983b(a, "IronSourceObject.getInstance()");
        String k = a.mo43775k();
        if (k != null) {
            jSONObject.put("applicationKey", k);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo43754a(String str) {
    }

    /* renamed from: a */
    public final void mo44315a(String str, JSONObject jSONObject) {
        C12691c.m53984c(str, "dataSource");
        C12691c.m53984c(jSONObject, "impressionData");
        if (!this.f51252a) {
            IronLog.INTERNAL.info("disabled from server");
            return;
        }
        try {
            JSONObject a = m50980a();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("externalMediationSource", str);
            jSONObject2.putOpt("externalMediationData", jSONObject);
            jSONObject2.putOpt("clientParams", a);
            IronLog ironLog = IronLog.API;
            ironLog.info("impressionData: " + jSONObject2);
            HttpFunctions.sendPostRequest(this.f51253b, jSONObject2.toString(), new C11397a());
        } catch (Exception e) {
            IronLog ironLog2 = IronLog.API;
            ironLog2.error("exception " + e.getMessage() + " sending impression data");
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo43756a(List<IronSource.AD_UNIT> list, boolean z, C11422h hVar) {
        if (hVar != null) {
            C11696a a = hVar.mo44432a();
            C12691c.m53983b(a, "applicationConfigurations");
            this.f51252a = a.mo44989f().f51529a;
            C11696a a2 = hVar.mo44432a();
            C12691c.m53983b(a2, "applicationConfigurations");
            this.f51253b = a2.mo44989f().f51530b;
        }
    }

    /* renamed from: f */
    public final void mo43765f() {
    }
}
