package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.e */
public final class C11372e {

    /* renamed from: c */
    private static final C11372e f51071c = new C11372e();

    /* renamed from: a */
    final ConcurrentHashMap<String, String> f51072a;

    /* renamed from: b */
    final ConcurrentHashMap<String, String> f51073b;

    private C11372e() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        this.f51072a = concurrentHashMap;
        concurrentHashMap.put("adcolony", "4.1.6");
        concurrentHashMap.put("vungle", "4.1.5");
        concurrentHashMap.put("applovin", "4.3.3");
        concurrentHashMap.put("admob", "4.3.2");
        ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.f51073b = concurrentHashMap2;
        concurrentHashMap2.put("adcolony", "4.1.6");
        concurrentHashMap2.put("admob", "4.3.2");
        concurrentHashMap2.put("applovin", "4.3.3");
        concurrentHashMap2.put("chartboost", "4.1.9");
        concurrentHashMap2.put("fyber", "4.1.0");
        concurrentHashMap2.put("hyprmx", "4.1.2");
        concurrentHashMap2.put("inmobi", "4.3.1");
        concurrentHashMap2.put("maio", "4.1.3");
        concurrentHashMap2.put("tapjoy", "4.0.0");
        concurrentHashMap2.put("unityads", "4.1.4");
        concurrentHashMap2.put("vungle", "4.1.5");
    }

    /* renamed from: a */
    public static C11372e m50812a() {
        return f51071c;
    }

    /* renamed from: c */
    private static boolean m50813c(String str, String str2) {
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i = 0; i < 3; i++) {
            int parseInt = Integer.parseInt(split[i]);
            int parseInt2 = Integer.parseInt(split2[i]);
            if (parseInt2 < parseInt) {
                return false;
            }
            if (parseInt2 > parseInt) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo44244a(AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return false;
        }
        String version = abstractAdapter.getVersion();
        boolean c = m50813c("4.3.0", version);
        if (!c) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + ", please update your adapter to the latest version", 3);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo44245b(AbstractAdapter abstractAdapter, Map<String, String> map, String str) {
        if (abstractAdapter == null) {
            return false;
        }
        String lowerCase = abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH);
        if (!map.containsKey(lowerCase)) {
            return true;
        }
        String version = abstractAdapter.getVersion();
        boolean c = m50813c(map.get(lowerCase), version);
        if (!c) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + " for " + str + " ad unit, please update your adapter to the latest version", 3);
        }
        return c;
    }
}
