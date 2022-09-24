package com.ironsource.mediationsdk.server;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.environment.C4952a;
import com.ironsource.environment.C4961c;
import com.ironsource.environment.C4979h;
import com.ironsource.environment.C4983j;
import com.ironsource.environment.p059d.C4969b;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p285c.C11361b;
import com.ironsource.mediationsdk.utils.C11491g;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p303e8.C12691c;

public class ServerURL {

    /* renamed from: a */
    private static String f51513a = "https://init.supersonicads.com/sdk/v";

    /* renamed from: b */
    private static String f51514b = "?request=";

    /* renamed from: a */
    private static String m51194a(Vector<Pair<String, String>> vector) {
        Iterator<Pair<String, String>> it = vector.iterator();
        String str = "";
        while (it.hasNext()) {
            Pair next = it.next();
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((String) next.first) + "=" + URLEncoder.encode((String) next.second, C6540C.UTF8_NAME);
        }
        return str;
    }

    /* renamed from: b */
    private static String m51195b(String str) {
        return f51513a + str + f51514b;
    }

    public static String getCPVProvidersURL(Context context, String str, String str2, String str3, String str4, boolean z, Vector<Pair<String, String>> vector) {
        Vector vector2 = new Vector();
        vector2.add(new Pair("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID));
        vector2.add(new Pair("applicationKey", str));
        vector2.add(new Pair("applicationUserId", str2));
        vector2.add(new Pair("sdkVersion", IronSourceUtils.getSDKVersion()));
        if (z) {
            vector2.add(new Pair("rvManual", z ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION));
        }
        if (IronSourceUtils.getSerr() == 0) {
            vector2.add(new Pair("serr", String.valueOf(IronSourceUtils.getSerr())));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            vector2.add(new Pair("pluginType", ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            vector2.add(new Pair("pluginVersion", ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            vector2.add(new Pair("plugin_fw_v", ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            vector2.add(new Pair("advId", str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            vector2.add(new Pair("mt", str4));
        }
        String c = C4961c.m22745c(context, context.getPackageName());
        if (!TextUtils.isEmpty(c)) {
            vector2.add(new Pair("appVer", c));
        }
        int i = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        vector2.add(new Pair("osVer", sb.toString()));
        vector2.add(new Pair("devMake", Build.MANUFACTURER));
        vector2.add(new Pair("devModel", Build.MODEL));
        boolean firstSession = IronSourceUtils.getFirstSession(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(firstSession ? 1 : 0);
        vector2.add(new Pair("fs", sb2.toString()));
        ConcurrentHashMap<String, List<String>> d = C11361b.m50766a().mo44212d();
        if (d.containsKey("is_child_directed")) {
            vector2.add(new Pair("coppa", d.get("is_child_directed").get(0)));
        }
        String connectionType = IronSourceUtils.getConnectionType(context);
        if (!TextUtils.isEmpty(connectionType)) {
            vector2.add(new Pair("connType", connectionType));
        }
        if (vector != null) {
            vector2.addAll(vector);
        }
        String r = C4979h.m22824r();
        if (r.length() != 0) {
            vector2.add(new Pair("browserUserAgent", r));
        }
        String str5 = null;
        try {
            str5 = C4979h.m22790b(context) + "-" + C4979h.m22792c(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!(str5 == null || str5.length() == 0)) {
            vector2.add(new Pair("deviceLang", str5));
        }
        vector2.add(new Pair("bundleId", context.getPackageName()));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C4952a.C49531.m22727c(context));
        vector2.add(new Pair("mcc", sb3.toString()));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C4952a.C49531.m22730d(context));
        vector2.add(new Pair("mnc", sb4.toString()));
        String k = C4979h.m22811k(context);
        if (!TextUtils.isEmpty(k)) {
            vector2.add(new Pair("icc", k));
        }
        String j = C4979h.m22808j(context);
        if (!TextUtils.isEmpty(j)) {
            vector2.add(new Pair("mCar", j));
        }
        String c2 = C4979h.m22791c();
        if (!TextUtils.isEmpty(c2)) {
            vector2.add(new Pair("tz", c2));
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C4979h.m22788b());
        vector2.add(new Pair("tzOff", sb5.toString()));
        String z2 = C4979h.m22834z(context);
        if (!TextUtils.isEmpty(z2)) {
            vector2.add(new Pair("auid", z2));
        }
        JSONObject a = C4983j.m22836a(new C4969b().f22028a);
        C12691c.m53983b(a, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        vector2.addAll(IronSourceUtils.parseJsonToPairVector(a));
        String a2 = m51194a(vector2);
        IronLog.INTERNAL.info("parameters for url: " + a2);
        return m51195b(IronSourceUtils.getSDKVersion()) + URLEncoder.encode(IronSourceAES.encode(C11491g.m51272a().mo44552b(), a2), C6540C.UTF8_NAME);
    }

    public static String getRequestURL(String str, boolean z, int i) {
        Vector vector = new Vector();
        vector.add(new Pair(AdSDKNotificationListener.IMPRESSION_EVENT, Boolean.toString(z)));
        vector.add(new Pair("placementId", Integer.toString(i)));
        String a = m51194a(vector);
        return str + "&" + a;
    }
}
