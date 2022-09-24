package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11425k;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p276a.C11296h;
import com.ironsource.mediationsdk.sdk.C11447g;
import com.ironsource.mediationsdk.sdk.C11473k;
import com.ironsource.mediationsdk.utils.C11495k;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.d0 */
final class C11371d0 implements C11447g {

    /* renamed from: a */
    private final String f51062a = C11371d0.class.getName();

    /* renamed from: b */
    C11473k f51063b;

    /* renamed from: c */
    C11447g f51064c;

    /* renamed from: d */
    private IronSourceLoggerManager f51065d = IronSourceLoggerManager.getLogger();

    /* renamed from: e */
    private AtomicBoolean f51066e = new AtomicBoolean(true);

    /* renamed from: f */
    private AtomicBoolean f51067f = new AtomicBoolean(false);

    /* renamed from: g */
    private C11495k f51068g;

    /* renamed from: h */
    private NetworkSettings f51069h;

    /* renamed from: i */
    private String f51070i;

    C11371d0() {
    }

    /* renamed from: a */
    private synchronized void m50806a(IronSourceError ironSourceError) {
        AtomicBoolean atomicBoolean = this.f51067f;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        AtomicBoolean atomicBoolean2 = this.f51066e;
        if (atomicBoolean2 != null) {
            atomicBoolean2.set(true);
        }
        C11447g gVar = this.f51064c;
        if (gVar != null) {
            gVar.mo44236a(false, ironSourceError);
        }
    }

    /* renamed from: b */
    private AbstractAdapter m50807b(String str) {
        try {
            C11232E a = C11232E.m50103a();
            AbstractAdapter y = a.mo43780y(str);
            if (y == null) {
                Class<?> cls = Class.forName("com.ironsource.adapters." + str.toLowerCase(Locale.ENGLISH) + "." + str + "Adapter");
                y = (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, new Class[]{String.class}).invoke(cls, new Object[]{str});
                if (y == null) {
                    return null;
                }
            }
            a.mo43778n(y);
            return y;
        } catch (Throwable th) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f51065d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str + " initialization failed - please verify that required dependencies are in you build path.", 2);
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f51065d;
            ironSourceLoggerManager2.logException(ironSourceTag, this.f51062a + ":startOfferwallAdapter", th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo44234a(String str) {
        C11473k kVar;
        String str2 = "OWManager:showOfferwall(" + str + ")";
        try {
            if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
                this.f51064c.onOfferwallShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            this.f51070i = str;
            C11425k a = this.f51068g.f51666c.f51379c.mo44435a(str);
            if (a == null) {
                IronSourceLoggerManager ironSourceLoggerManager = this.f51065d;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a = this.f51068g.f51666c.f51379c.mo44434a();
                if (a == null) {
                    this.f51065d.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f51065d.log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 1);
            AtomicBoolean atomicBoolean = this.f51067f;
            if (atomicBoolean != null && atomicBoolean.get() && (kVar = this.f51063b) != null) {
                kVar.showOfferwall(String.valueOf(a.f51396a), this.f51069h.getRewardedVideoSettings());
            }
        } catch (Exception e) {
            this.f51065d.logException(IronSourceLogger.IronSourceTag.INTERNAL, str2, e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054 A[Catch:{ Exception -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061 A[SYNTHETIC, Splitter:B:18:0x0061] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44235a(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.f51065d     // Catch:{ all -> 0x00f4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00f4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            r2.<init>()     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = r7.f51062a     // Catch:{ all -> 0x00f4 }
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = ":initOfferwall(appKey: "
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            r2.append(r8)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = ", userId: "
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            r2.append(r9)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00f4 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00f4 }
            com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.C11232E.m50103a()     // Catch:{ all -> 0x00f4 }
            com.ironsource.mediationsdk.utils.k r0 = r0.f50430t     // Catch:{ all -> 0x00f4 }
            r7.f51068g = r0     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x004e
            com.ironsource.mediationsdk.model.h r1 = r0.f51666c     // Catch:{ all -> 0x00f4 }
            if (r1 == 0) goto L_0x004e
            com.ironsource.mediationsdk.model.j r1 = r1.f51379c     // Catch:{ all -> 0x00f4 }
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = r1.mo44436b()     // Catch:{ all -> 0x00f4 }
            if (r1 != 0) goto L_0x0045
            goto L_0x004e
        L_0x0045:
            com.ironsource.mediationsdk.model.h r0 = r0.f51666c     // Catch:{ all -> 0x00f4 }
            com.ironsource.mediationsdk.model.j r0 = r0.f51379c     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = r0.mo44436b()     // Catch:{ all -> 0x00f4 }
            goto L_0x0050
        L_0x004e:
            java.lang.String r0 = "SupersonicAds"
        L_0x0050:
            com.ironsource.mediationsdk.utils.k r1 = r7.f51068g     // Catch:{ all -> 0x00f4 }
            if (r1 != 0) goto L_0x0061
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00f4 }
            r7.m50806a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return
        L_0x0061:
            com.ironsource.mediationsdk.model.o r1 = r1.f51663b     // Catch:{ all -> 0x00f4 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r1.mo44442a((java.lang.String) r0)     // Catch:{ all -> 0x00f4 }
            r7.f51069h = r1     // Catch:{ all -> 0x00f4 }
            if (r1 != 0) goto L_0x0078
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00f4 }
            r7.m50806a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return
        L_0x0078:
            com.ironsource.mediationsdk.AbstractAdapter r0 = r7.m50807b(r0)     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x008b
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00f4 }
            r7.m50806a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return
        L_0x008b:
            com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.C11232E.m50103a()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r1 = r1.f50431u     // Catch:{ Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x0096
            r0.setMediationSegment(r1)     // Catch:{ Exception -> 0x00c0 }
        L_0x0096:
            com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.C11232E.m50103a()     // Catch:{ Exception -> 0x00c0 }
            java.lang.Boolean r1 = r1.f50388P     // Catch:{ Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x00db
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.f51065d     // Catch:{ Exception -> 0x00c0 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ Exception -> 0x00c0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r6 = "Offerwall | setConsent(consent:"
            r5.<init>(r6)     // Catch:{ Exception -> 0x00c0 }
            r5.append(r1)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00c0 }
            r2.log(r4, r5, r3)     // Catch:{ Exception -> 0x00c0 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x00c0 }
            r0.setConsent(r1)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00db
        L_0x00c0:
            r1 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.f51065d     // Catch:{ all -> 0x00f4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00f4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            java.lang.String r5 = ":setCustomParams():"
            r4.<init>(r5)     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f4 }
            r4.append(r1)     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00f4 }
            r4 = 3
            r2.log(r3, r1, r4)     // Catch:{ all -> 0x00f4 }
        L_0x00db:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r7.f51065d     // Catch:{ all -> 0x00f4 }
            r0.setLogListener(r1)     // Catch:{ all -> 0x00f4 }
            com.ironsource.mediationsdk.sdk.k r0 = (com.ironsource.mediationsdk.sdk.C11473k) r0     // Catch:{ all -> 0x00f4 }
            r7.f51063b = r0     // Catch:{ all -> 0x00f4 }
            r0.setInternalOfferwallListener(r7)     // Catch:{ all -> 0x00f4 }
            com.ironsource.mediationsdk.sdk.k r0 = r7.f51063b     // Catch:{ all -> 0x00f4 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r7.f51069h     // Catch:{ all -> 0x00f4 }
            org.json.JSONObject r1 = r1.getRewardedVideoSettings()     // Catch:{ all -> 0x00f4 }
            r0.initOfferwall(r8, r9, r1)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return
        L_0x00f4:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11371d0.mo44235a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo44236a(boolean z, IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51065d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallAvailable(isAvailable: " + z + ")", 1);
        if (z) {
            this.f51067f.set(true);
            C11447g gVar = this.f51064c;
            if (gVar != null) {
                gVar.onOfferwallAvailable(true);
                return;
            }
            return;
        }
        m50806a(ironSourceError);
    }

    /* renamed from: a */
    public final synchronized boolean mo44237a() {
        boolean z;
        z = false;
        AtomicBoolean atomicBoolean = this.f51067f;
        if (atomicBoolean != null) {
            z = atomicBoolean.get();
        }
        return z;
    }

    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51065d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        C11447g gVar = this.f51064c;
        if (gVar != null) {
            gVar.onGetOfferwallCreditsFailed(ironSourceError);
        }
    }

    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        this.f51065d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        C11447g gVar = this.f51064c;
        if (gVar != null) {
            return gVar.onOfferwallAdCredited(i, i2, z);
        }
        return false;
    }

    public final void onOfferwallAvailable(boolean z) {
        mo44236a(z, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        this.f51065d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        C11447g gVar = this.f51064c;
        if (gVar != null) {
            gVar.onOfferwallClosed();
        }
    }

    public final void onOfferwallOpened() {
        this.f51065d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        int b = C11499n.m51312a().mo44568b(0);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (!TextUtils.isEmpty(this.f51070i)) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f51070i);
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C11296h.m50466e().mo43979b(new C11308a(IronSourceConstants.OFFERWALL_OPENED, mediationAdditionalData));
        C11499n.m51312a().mo44566a(0);
        C11447g gVar = this.f51064c;
        if (gVar != null) {
            gVar.onOfferwallOpened();
        }
    }

    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51065d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        C11447g gVar = this.f51064c;
        if (gVar != null) {
            gVar.onOfferwallShowFailed(ironSourceError);
        }
    }
}
