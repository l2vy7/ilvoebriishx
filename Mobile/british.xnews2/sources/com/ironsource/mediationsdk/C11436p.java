package com.ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C11420f;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p275a.C11292d;
import com.ironsource.mediationsdk.sdk.C11442b;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.p */
public final class C11436p implements C11442b {

    /* renamed from: a */
    private C11437q f51451a;

    /* renamed from: b */
    C11437q f51452b;

    /* renamed from: c */
    IronSourceBannerLayout f51453c;

    /* renamed from: d */
    ConcurrentHashMap<String, C11437q> f51454d = new ConcurrentHashMap<>();

    public C11436p(List<NetworkSettings> list, C11420f fVar, String str, String str2) {
        for (NetworkSettings next : list) {
            if (next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a = C11369d.m50788a().mo44228a(next, next.getBannerSettings(), true, false);
                if (a != null) {
                    this.f51454d.put(next.getSubProviderId(), new C11437q(str, str2, next, this, (int) fVar.f51370b, a));
                }
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + next.getProviderTypeForReflection());
            }
        }
    }

    /* renamed from: b */
    static void m51104b(int i, C11437q qVar, Object[][] objArr) {
        Map<String, Object> c = qVar.mo44467c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.getMessage());
            }
        }
        C11292d.m50446e().mo43979b(new C11308a(i, new JSONObject(c)));
    }

    /* renamed from: c */
    static void m51105c(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        hashMap.put("spId", str);
        C11292d.m50446e().mo43979b(new C11308a(i, new JSONObject(hashMap)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo44455a(int i, C11437q qVar) {
        m51104b(i, qVar, (Object[][]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44456a(com.ironsource.mediationsdk.IronSourceBannerLayout r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "demand only banner manager : destroyBanner"
            r0.verbose(r1)     // Catch:{ all -> 0x0054 }
            if (r4 != 0) goto L_0x0011
            java.lang.String r4 = "destroyBanner banner cannot be null"
            r0.error(r4)     // Catch:{ all -> 0x0054 }
            monitor-exit(r3)
            return
        L_0x0011:
            boolean r1 = r4.isDestroyed()     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x001e
            java.lang.String r4 = "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API"
            r0.error(r4)     // Catch:{ all -> 0x0054 }
            monitor-exit(r3)
            return
        L_0x001e:
            r4.mo20637h()     // Catch:{ all -> 0x0054 }
            r4 = 0
            r3.f51453c = r4     // Catch:{ all -> 0x0054 }
            com.ironsource.mediationsdk.q r1 = r3.f51451a     // Catch:{ all -> 0x0054 }
            r2 = 3305(0xce9, float:4.631E-42)
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = "demand only banner manager : destroyBanner | mActiveSmash != null "
            r0.verbose(r1)     // Catch:{ all -> 0x0054 }
            com.ironsource.mediationsdk.q r0 = r3.f51451a     // Catch:{ all -> 0x0054 }
            m51104b(r2, r0, r4)     // Catch:{ all -> 0x0054 }
            com.ironsource.mediationsdk.q r0 = r3.f51451a     // Catch:{ all -> 0x0054 }
            r0.mo44464a()     // Catch:{ all -> 0x0054 }
            r3.f51451a = r4     // Catch:{ all -> 0x0054 }
            monitor-exit(r3)
            return
        L_0x003d:
            com.ironsource.mediationsdk.q r1 = r3.f51452b     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = "demand only banner manager : destroyBanner | mLoadingSmash != null "
            r0.verbose(r1)     // Catch:{ all -> 0x0054 }
            com.ironsource.mediationsdk.q r0 = r3.f51452b     // Catch:{ all -> 0x0054 }
            m51104b(r2, r0, r4)     // Catch:{ all -> 0x0054 }
            com.ironsource.mediationsdk.q r0 = r3.f51452b     // Catch:{ all -> 0x0054 }
            r0.mo44464a()     // Catch:{ all -> 0x0054 }
            r3.f51452b = r4     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r3)
            return
        L_0x0054:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11436p.mo44456a(com.ironsource.mediationsdk.IronSourceBannerLayout):void");
    }

    /* renamed from: a */
    public final void mo44457a(IronSourceError ironSourceError, C11437q qVar, boolean z, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + qVar.mo44466b());
        if (z) {
            m51104b(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, qVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            m51104b(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, qVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        IronSourceBannerLayout ironSourceBannerLayout = this.f51453c;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            this.f51453c.mo20630d(ironSourceError);
        }
    }

    /* renamed from: a */
    public final void mo44458a(C11437q qVar) {
        IronLog.INTERNAL.verbose(qVar.mo44466b());
        m51104b(IronSourceConstants.BN_INSTANCE_CLICK, qVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f51453c;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo20639j();
        }
    }

    /* renamed from: a */
    public final void mo44459a(C11437q qVar, View view, FrameLayout.LayoutParams layoutParams) {
        C11437q qVar2 = qVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + qVar.mo44466b());
        IronSourceBannerLayout ironSourceBannerLayout = this.f51453c;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            mo44455a(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, qVar2);
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayout2 = this.f51453c;
        if (ironSourceBannerLayout2 != null) {
            ironSourceBannerLayout2.mo20629c(view, layoutParams);
        }
        this.f51451a = qVar2;
        int b = C11499n.m51312a().mo44568b(3);
        m51104b(IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, qVar2, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b)}});
        m51104b(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, qVar2, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b)}});
        C11499n.m51312a().mo44566a(3);
        if (qVar.mo44582i()) {
            for (String a : qVar2.f51757i) {
                C11377f.m50856a();
                String a2 = C11377f.m50857a(a, qVar.mo44576d(), qVar.mo44578e(), qVar2.f51758j, "", "", "", "");
                C11377f.m50856a();
                C11377f.m50864i("onBannerAdLoaded", qVar.mo44576d(), a2);
            }
        }
        IronSourceBannerLayout ironSourceBannerLayout3 = this.f51453c;
        if (ironSourceBannerLayout3 != null) {
            ironSourceBannerLayout3.mo20631e(String.format("%s %s", new Object[]{qVar.mo44466b(), Integer.valueOf(qVar.hashCode())}));
        }
    }

    /* renamed from: b */
    public final void mo44460b(C11437q qVar) {
        IronLog.INTERNAL.verbose(qVar.mo44466b());
        m51104b(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, qVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f51453c;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo20641l();
        }
    }

    /* renamed from: c */
    public final void mo44461c(C11437q qVar) {
        IronLog.INTERNAL.verbose(qVar.mo44466b());
        m51104b(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, qVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f51453c;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo20640k();
        }
    }

    /* renamed from: d */
    public final void mo44462d(C11437q qVar) {
        IronLog.INTERNAL.verbose(qVar.mo44466b());
        m51104b(IronSourceConstants.BN_INSTANCE_LEFT_APPLICATION, qVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f51453c;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo20642m();
        }
    }

    /* renamed from: e */
    public final void mo44463e(C11437q qVar) {
        IronLog.INTERNAL.verbose(qVar.mo44466b());
        m51104b(IronSourceConstants.BN_INSTANCE_SHOW, qVar, (Object[][]) null);
        m51105c(IronSourceConstants.BN_CALLBACK_SHOW, "");
    }
}
