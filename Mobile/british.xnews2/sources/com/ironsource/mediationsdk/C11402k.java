package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11406l;
import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11421g;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p275a.C11292d;
import com.ironsource.mediationsdk.sdk.C11441a;
import com.ironsource.mediationsdk.utils.C11484c;
import com.ironsource.mediationsdk.utils.C11490f;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.k */
public final class C11402k implements C11441a {

    /* renamed from: a */
    private C11406l f51264a;

    /* renamed from: b */
    private IronSourceBannerLayout f51265b;

    /* renamed from: c */
    private C11421g f51266c;

    /* renamed from: d */
    private C11404b f51267d = C11404b.NOT_INITIATED;

    /* renamed from: e */
    private IronSourceLoggerManager f51268e = IronSourceLoggerManager.getLogger();

    /* renamed from: f */
    private String f51269f;

    /* renamed from: g */
    private String f51270g;

    /* renamed from: h */
    private final CopyOnWriteArrayList<C11406l> f51271h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    private long f51272i;

    /* renamed from: j */
    private Timer f51273j;

    /* renamed from: k */
    private AtomicBoolean f51274k = new AtomicBoolean();

    /* renamed from: l */
    private AtomicBoolean f51275l = new AtomicBoolean();

    /* renamed from: m */
    private C11490f f51276m;

    /* renamed from: n */
    private C11490f f51277n;

    /* renamed from: o */
    private int f51278o;

    /* renamed from: p */
    private int f51279p;

    /* renamed from: com.ironsource.mediationsdk.k$a */
    class C11403a extends TimerTask {
        C11403a() {
        }

        public final void run() {
            C11402k.m51016h(C11402k.this);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.k$b */
    enum C11404b {
        NOT_INITIATED,
        READY_TO_LOAD,
        FIRST_LOAD_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        RELOAD_IN_PROGRESS
    }

    public C11402k(List<NetworkSettings> list, String str, String str2, long j, int i, int i2) {
        this.f51269f = str;
        this.f51270g = str2;
        this.f51272i = (long) i;
        C11399j.m50992a().f51258c = i2;
        for (int i3 = 0; i3 < list.size(); i3++) {
            NetworkSettings networkSettings = list.get(i3);
            AbstractAdapter a = C11369d.m50788a().mo44228a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a == null || !C11372e.m50812a().mo44244a(a)) {
                m51017i(networkSettings.getProviderInstanceName() + " can't load adapter or wrong version");
            } else {
                this.f51271h.add(new C11406l(this, networkSettings, a, j, i3 + 1));
            }
        }
        this.f51266c = null;
        m51015g(C11404b.READY_TO_LOAD);
    }

    /* renamed from: a */
    private void m51009a(int i) {
        m51013e(i, (Object[][]) null);
    }

    /* renamed from: b */
    private void m51010b(int i, C11406l lVar) {
        m51011c(i, lVar, (Object[][]) null);
    }

    /* renamed from: c */
    private void m51011c(int i, C11406l lVar, Object[][] objArr) {
        m51012d(i, lVar, objArr, this.f51279p);
    }

    /* renamed from: d */
    private void m51012d(int i, C11406l lVar, Object[][] objArr, int i2) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(lVar);
        try {
            IronSourceBannerLayout ironSourceBannerLayout = this.f51265b;
            if (ironSourceBannerLayout != null) {
                m51018j(providerAdditionalData, ironSourceBannerLayout.getSize());
            }
            C11421g gVar = this.f51266c;
            if (gVar != null) {
                providerAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, gVar.getPlacementName());
            }
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.f51268e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
        C11292d.m50446e().mo43979b(new C11308a(i, providerAdditionalData));
    }

    /* renamed from: e */
    private void m51013e(int i, Object[][] objArr) {
        m51014f(i, objArr, this.f51279p);
    }

    /* renamed from: f */
    private void m51014f(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            IronSourceBannerLayout ironSourceBannerLayout = this.f51265b;
            if (ironSourceBannerLayout != null) {
                m51018j(mediationAdditionalData, ironSourceBannerLayout.getSize());
            }
            C11421g gVar = this.f51266c;
            if (gVar != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, gVar.getPlacementName());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.f51268e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendMediationEvent " + Log.getStackTraceString(e), 3);
        }
        C11292d.m50446e().mo43979b(new C11308a(i, mediationAdditionalData));
    }

    /* renamed from: g */
    private void m51015g(C11404b bVar) {
        this.f51267d = bVar;
        m51017i("state=" + bVar.name());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m51016h(com.ironsource.mediationsdk.C11402k r9) {
        /*
            com.ironsource.mediationsdk.k$b r0 = r9.f51267d
            com.ironsource.mediationsdk.k$b r1 = com.ironsource.mediationsdk.C11402k.C11404b.RELOAD_IN_PROGRESS
            if (r0 == r1) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onReloadTimer wrong state="
            r0.<init>(r1)
            com.ironsource.mediationsdk.k$b r1 = r9.f51267d
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.m51017i(r0)
            return
        L_0x001e:
            r0 = 0
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r2 = "checking with IronsourceLifecycleManager if app in foreground"
            r1.verbose(r2)
            com.ironsource.lifecycle.d r2 = com.ironsource.lifecycle.C4991d.m22849a()
            boolean r2 = r2.mo20611b()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x00d7
            com.ironsource.mediationsdk.IronSourceBannerLayout r2 = r9.f51265b
            java.lang.String r5 = "banner is null"
            if (r2 != 0) goto L_0x003d
            r1.verbose(r5)
        L_0x003b:
            r2 = 0
            goto L_0x0070
        L_0x003d:
            boolean r2 = r2.isShown()
            if (r2 != 0) goto L_0x0049
            java.lang.String r2 = "banner or one of its parents are INVISIBLE or GONE"
        L_0x0045:
            r1.verbose(r2)
            goto L_0x003b
        L_0x0049:
            com.ironsource.mediationsdk.IronSourceBannerLayout r2 = r9.f51265b
            boolean r2 = r2.hasWindowFocus()
            if (r2 != 0) goto L_0x0054
            java.lang.String r2 = "banner has no window focus"
            goto L_0x0045
        L_0x0054:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r6 = r9.f51265b
            boolean r2 = r6.getGlobalVisibleRect(r2)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "visible = "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r1.verbose(r6)
        L_0x0070:
            if (r2 == 0) goto L_0x00d4
            com.ironsource.mediationsdk.utils.n r2 = com.ironsource.mediationsdk.utils.C11499n.m51312a()
            r6 = 3
            int r2 = r2.mo44568b((int) r6)
            r9.f51279p = r2
            r2 = 3011(0xbc3, float:4.22E-42)
            r9.m51009a((int) r2)
            r2 = 3012(0xbc4, float:4.221E-42)
            com.ironsource.mediationsdk.l r6 = r9.f51264a
            r9.m51010b(r2, r6)
            com.ironsource.mediationsdk.utils.f r2 = new com.ironsource.mediationsdk.utils.f
            r2.<init>()
            r9.f51276m = r2
            com.ironsource.mediationsdk.utils.f r2 = new com.ironsource.mediationsdk.utils.f
            r2.<init>()
            r9.f51277n = r2
            com.ironsource.mediationsdk.l r2 = r9.f51264a
            java.lang.String r6 = "reloadBanner()"
            r2.mo44356e(r6)
            com.ironsource.mediationsdk.IronSourceBannerLayout r6 = r2.f51298i
            if (r6 == 0) goto L_0x00bf
            boolean r6 = r6.isDestroyed()
            if (r6 == 0) goto L_0x00a9
            goto L_0x00bf
        L_0x00a9:
            r2.mo44357h()
            com.ironsource.mediationsdk.l$a r5 = com.ironsource.mediationsdk.C11406l.C11407a.LOADED
            r2.mo44355b(r5)
            com.ironsource.mediationsdk.AbstractAdapter r5 = r2.f51290a
            com.ironsource.mediationsdk.IronSourceBannerLayout r6 = r2.f51298i
            com.ironsource.mediationsdk.model.NetworkSettings r7 = r2.f51291b
            org.json.JSONObject r7 = r7.getBannerSettings()
            r5.reloadBanner(r6, r7, r2)
            goto L_0x00d2
        L_0x00bf:
            com.ironsource.mediationsdk.IronSourceBannerLayout r6 = r2.f51298i
            if (r6 != 0) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            java.lang.String r5 = "banner is destroyed"
        L_0x00c6:
            com.ironsource.mediationsdk.sdk.a r6 = r2.f51296g
            com.ironsource.mediationsdk.logger.IronSourceError r7 = new com.ironsource.mediationsdk.logger.IronSourceError
            r8 = 610(0x262, float:8.55E-43)
            r7.<init>(r8, r5)
            r6.mo44336a((com.ironsource.mediationsdk.logger.IronSourceError) r7, (com.ironsource.mediationsdk.C11406l) r2, (boolean) r4)
        L_0x00d2:
            r2 = 0
            goto L_0x00da
        L_0x00d4:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x00d9
        L_0x00d7:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x00d9:
            r2 = 1
        L_0x00da:
            if (r2 == 0) goto L_0x00fa
            r1.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r3][]
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = "errorCode"
            r2[r4] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r3] = r5
            r1[r4] = r2
            r9.m51013e(r0, r1)
            r9.m51024p()
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11402k.m51016h(com.ironsource.mediationsdk.k):void");
    }

    /* renamed from: i */
    private void m51017i(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51268e;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "BannerManager " + str, 0);
    }

    /* renamed from: j */
    private void m51018j(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals(AdPreferences.TYPE_BANNER)) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c == 4) {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f51268e;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
    }

    /* renamed from: k */
    private boolean m51019k() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f51265b;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: l */
    private void m51020l() {
        Iterator<C11406l> it = this.f51271h.iterator();
        while (it.hasNext()) {
            it.next().f51297h = true;
        }
    }

    /* renamed from: m */
    private void m51021m(C11406l lVar, View view, FrameLayout.LayoutParams layoutParams) {
        this.f51264a = lVar;
        this.f51265b.mo20629c(view, layoutParams);
    }

    /* renamed from: n */
    private void m51022n(C11406l lVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("bindView = " + z + " smash - " + lVar.mo44353a());
        m51011c(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f51277n))}});
        m51013e(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f51276m))}});
        this.f51278o = C11499n.m51312a().mo44568b(3);
        C11499n.m51312a().mo44566a(3);
        if (z) {
            m51021m(lVar, view, layoutParams);
        }
        m51024p();
    }

    /* renamed from: o */
    private boolean m51023o() {
        Iterator<C11406l> it = this.f51271h.iterator();
        while (it.hasNext()) {
            C11406l next = it.next();
            if (next.f51297h && this.f51264a != next) {
                m51011c(this.f51267d == C11404b.FIRST_LOAD_IN_PROGRESS ? IronSourceConstants.BN_INSTANCE_LOAD : IronSourceConstants.BN_INSTANCE_RELOAD, next, (Object[][]) null);
                this.f51277n = new C11490f();
                next.mo44354a(this.f51265b.mo20628b(), this.f51269f, this.f51270g);
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    private void m51024p() {
        try {
            m51025q();
            if (this.f51272i > 0) {
                Timer timer = new Timer();
                this.f51273j = timer;
                timer.schedule(new C11403a(), this.f51272i * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: q */
    private void m51025q() {
        Timer timer = this.f51273j;
        if (timer != null) {
            timer.cancel();
            this.f51273j = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo44331a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout == null) {
            this.f51268e.log(IronSourceLogger.IronSourceTag.API, "destroyBanner banner cannot be null", 3);
        } else if (ironSourceBannerLayout.isDestroyed()) {
            this.f51268e.log(IronSourceLogger.IronSourceTag.API, "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API", 3);
        } else {
            m51014f(IronSourceConstants.BN_DESTROY, (Object[][]) null, this.f51278o);
            m51025q();
            C11406l lVar = this.f51264a;
            if (lVar != null) {
                m51011c(IronSourceConstants.BN_INSTANCE_DESTROY, lVar, (Object[][]) null);
                C11406l lVar2 = this.f51264a;
                lVar2.mo44356e("destroyBanner()");
                AbstractAdapter abstractAdapter = lVar2.f51290a;
                if (abstractAdapter == null) {
                    lVar2.mo44356e("destroyBanner() mAdapter == null");
                } else {
                    abstractAdapter.destroyBanner(lVar2.f51291b.getBannerSettings());
                    lVar2.mo44355b(C11406l.C11407a.DESTROYED);
                }
                this.f51264a = null;
            }
            ironSourceBannerLayout.mo20637h();
            this.f51265b = null;
            this.f51266c = null;
            m51015g(C11404b.READY_TO_LOAD);
        }
    }

    /* renamed from: a */
    public final synchronized void mo44332a(IronSourceBannerLayout ironSourceBannerLayout, C11421g gVar) {
        if (ironSourceBannerLayout != null) {
            try {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    if (gVar != null) {
                        if (!TextUtils.isEmpty(gVar.getPlacementName())) {
                            C11404b bVar = this.f51267d;
                            C11404b bVar2 = C11404b.READY_TO_LOAD;
                            if (bVar == bVar2) {
                                if (!C11399j.m50992a().mo44320b()) {
                                    this.f51279p = C11499n.m51312a().mo44568b(3);
                                    m51015g(C11404b.FIRST_LOAD_IN_PROGRESS);
                                    this.f51265b = ironSourceBannerLayout;
                                    this.f51266c = gVar;
                                    m51013e(3001, (Object[][]) null);
                                    if (C11484c.m51241b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), gVar.getPlacementName())) {
                                        C11399j a = C11399j.m50992a();
                                        a.mo44318a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + gVar.getPlacementName() + " is capped"));
                                        m51013e(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
                                        m51015g(bVar2);
                                        return;
                                    }
                                    this.f51276m = new C11490f();
                                    Iterator<C11406l> it = this.f51271h.iterator();
                                    while (it.hasNext()) {
                                        it.next().f51297h = true;
                                    }
                                    this.f51277n = new C11490f();
                                    C11406l lVar = this.f51271h.get(0);
                                    m51011c(IronSourceConstants.BN_INSTANCE_LOAD, lVar, (Object[][]) null);
                                    lVar.mo44354a(ironSourceBannerLayout.mo20628b(), this.f51269f, this.f51270g);
                                    return;
                                }
                            }
                            this.f51268e.log(IronSourceLogger.IronSourceTag.API, "A banner is already loaded", 3);
                            return;
                        }
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = gVar == null ? "placement is null" : "placement name is empty";
                    this.f51268e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr), 3);
                    return;
                }
            } catch (Exception e) {
                C11399j a2 = C11399j.m50992a();
                a2.mo44318a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, "loadBanner() failed " + e.getMessage()));
                m51013e(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_EXCEPTION)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
                m51015g(C11404b.READY_TO_LOAD);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        this.f51268e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr2), 3);
    }

    /* renamed from: a */
    public final void mo44333a(C11406l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo44353a());
        if (m51019k()) {
            this.f51265b.mo20639j();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m51014f(IronSourceConstants.BN_CALLBACK_CLICK, objArr, this.f51278o);
        m51012d(IronSourceConstants.BN_INSTANCE_CLICK, lVar, objArr, this.f51278o);
    }

    /* renamed from: a */
    public final void mo44334a(C11406l lVar, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo44353a());
        C11404b bVar = this.f51267d;
        if (bVar == C11404b.FIRST_LOAD_IN_PROGRESS) {
            m51011c(IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f51277n))}});
            m51021m(lVar, view, layoutParams);
            C11421g gVar = this.f51266c;
            String placementName = gVar != null ? gVar.getPlacementName() : "";
            C11484c.m51250f(ContextProvider.getInstance().getCurrentActiveActivity(), placementName);
            if (C11484c.m51241b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), placementName)) {
                m51013e(IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            m51013e(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f51276m))}});
            this.f51265b.mo20631e(lVar.mo44353a());
            this.f51278o = C11499n.m51312a().mo44568b(3);
            C11499n.m51312a().mo44566a(3);
            m51015g(C11404b.RELOAD_IN_PROGRESS);
            m51024p();
        } else if (bVar == C11404b.LOAD_IN_PROGRESS) {
            m51015g(C11404b.RELOAD_IN_PROGRESS);
            m51022n(lVar, view, layoutParams, true);
        } else {
            m51011c(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, lVar, (Object[][]) null);
        }
    }

    /* renamed from: a */
    public final void mo44335a(C11406l lVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo44353a());
        if (this.f51267d != C11404b.RELOAD_IN_PROGRESS) {
            m51017i("onBannerAdReloaded " + lVar.mo44353a() + " wrong state=" + this.f51267d.name());
            m51011c(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, lVar, (Object[][]) null);
            return;
        }
        IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
        m51022n(lVar, view, layoutParams, z);
    }

    /* renamed from: a */
    public final void mo44336a(IronSourceError ironSourceError, C11406l lVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + lVar.mo44353a());
        C11404b bVar = this.f51267d;
        C11404b bVar2 = C11404b.FIRST_LOAD_IN_PROGRESS;
        if (bVar == bVar2 || bVar == C11404b.LOAD_IN_PROGRESS) {
            if (z) {
                m51011c(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f51277n))}});
            } else {
                m51011c(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f51277n))}});
            }
            if (!m51023o()) {
                if (this.f51267d == bVar2) {
                    C11399j.m50992a().mo44318a(this.f51265b, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, "No ads to show"));
                    m51013e(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f51276m))}});
                    m51015g(C11404b.READY_TO_LOAD);
                    return;
                }
                m51013e(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f51276m))}});
                m51015g(C11404b.RELOAD_IN_PROGRESS);
                m51024p();
                return;
            }
            return;
        }
        m51017i("onBannerAdLoadFailed " + lVar.mo44353a() + " wrong state=" + this.f51267d.name());
    }

    /* renamed from: b */
    public final void mo44337b(C11406l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo44353a());
        if (m51019k()) {
            this.f51265b.mo20641l();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m51014f(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, this.f51278o);
        m51012d(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, lVar, objArr, this.f51278o);
    }

    /* renamed from: b */
    public final void mo44338b(IronSourceError ironSourceError, C11406l lVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + lVar.mo44353a());
        if (this.f51267d != C11404b.RELOAD_IN_PROGRESS) {
            m51017i("onBannerAdReloadFailed " + lVar.mo44353a() + " wrong state=" + this.f51267d.name());
            return;
        }
        if (z) {
            m51011c(IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f51277n))}});
        } else {
            m51011c(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f51277n))}});
        }
        if (this.f51271h.size() == 1) {
            m51013e(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f51276m))}});
            m51024p();
            return;
        }
        m51015g(C11404b.LOAD_IN_PROGRESS);
        m51020l();
        m51023o();
    }

    /* renamed from: c */
    public final void mo44339c(C11406l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo44353a());
        if (m51019k()) {
            this.f51265b.mo20640k();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m51014f(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, this.f51278o);
        m51012d(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, lVar, objArr, this.f51278o);
    }

    /* renamed from: d */
    public final void mo44340d(C11406l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo44353a());
        if (m51019k()) {
            this.f51265b.mo20642m();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m51014f(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, this.f51278o);
        m51012d(IronSourceConstants.BN_INSTANCE_LEAVE_APP, lVar, objArr, this.f51278o);
    }

    /* renamed from: e */
    public final void mo44341e(C11406l lVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo44353a());
        m51013e(IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
        m51011c(IronSourceConstants.BN_INSTANCE_SHOW, lVar, (Object[][]) null);
    }
}
