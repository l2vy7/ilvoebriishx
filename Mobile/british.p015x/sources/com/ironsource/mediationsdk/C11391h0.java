package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.C11488e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.h0 */
abstract class C11391h0 {

    /* renamed from: a */
    private String f51194a = IronSourceConstants.EVENTS_ERROR_REASON;

    /* renamed from: b */
    private String f51195b = IronSourceConstants.EVENTS_STATUS;

    /* renamed from: c */
    private String f51196c = IronSourceConstants.EVENTS_PLACEMENT_NAME;

    /* renamed from: d */
    private String f51197d = IronSourceConstants.EVENTS_REWARD_NAME;

    /* renamed from: e */
    private String f51198e = IronSourceConstants.EVENTS_REWARD_AMOUNT;

    /* renamed from: f */
    private String f51199f = "providerPriority";

    /* renamed from: g */
    C11488e f51200g = null;

    /* renamed from: h */
    int f51201h;

    /* renamed from: i */
    final CopyOnWriteArrayList<C11347b> f51202i = new CopyOnWriteArrayList<>();

    /* renamed from: j */
    C11347b f51203j;

    /* renamed from: k */
    C11347b f51204k;

    /* renamed from: l */
    String f51205l;

    /* renamed from: m */
    String f51206m;

    /* renamed from: n */
    IronSourceLoggerManager f51207n = IronSourceLoggerManager.getLogger();

    /* renamed from: o */
    boolean f51208o = false;

    /* renamed from: p */
    Boolean f51209p;

    /* renamed from: q */
    boolean f51210q;

    /* renamed from: r */
    boolean f51211r = true;

    C11391h0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44291a(C11347b bVar) {
        this.f51202i.add(bVar);
        C11488e eVar = this.f51200g;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    if (bVar.f50941m != 99) {
                        eVar.f51559a.put(eVar.mo44550d(bVar), Integer.valueOf(bVar.f50941m));
                    }
                } catch (Exception e) {
                    eVar.f51561c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "addSmash", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized boolean mo44292b() {
        return this.f51211r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized void mo44282h() {
        this.f51211r = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo44293i(C11347b bVar) {
        try {
            String str = C11232E.m50103a().f50431u;
            if (!TextUtils.isEmpty(str) && bVar.f50930b != null) {
                IronSourceLoggerManager ironSourceLoggerManager = bVar.f50947s;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                ironSourceLoggerManager.log(ironSourceTag, bVar.mo44185j() + ":setMediationSegment(segment:" + str + ")", 1);
                bVar.f50930b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                String pluginFrameworkVersion = ConfigFile.getConfigFile().getPluginFrameworkVersion();
                AbstractAdapter abstractAdapter = bVar.f50930b;
                if (abstractAdapter != null) {
                    abstractAdapter.setPluginData(pluginType, pluginFrameworkVersion);
                }
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f51207n;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager2.log(ironSourceTag2, ":setCustomParams():" + e.toString(), 3);
        }
    }
}
