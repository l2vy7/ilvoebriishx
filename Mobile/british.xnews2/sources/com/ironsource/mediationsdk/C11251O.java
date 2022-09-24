package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C11415a;
import com.ironsource.mediationsdk.model.C11421g;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p275a.C11284b;
import com.ironsource.mediationsdk.p275a.C11292d;
import com.ironsource.mediationsdk.p284b.C11353c;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.server.C11478b;
import com.ironsource.mediationsdk.utils.C11490f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.O */
public final class C11251O extends C11261V implements C11353c.C11354a, BannerSmashListener {

    /* renamed from: h */
    private C11478b f50530h;

    /* renamed from: i */
    private C11353c f50531i;

    /* renamed from: j */
    private C11252a f50532j;

    /* renamed from: k */
    private C11250N f50533k;

    /* renamed from: l */
    private IronSourceBannerLayout f50534l;

    /* renamed from: m */
    String f50535m;

    /* renamed from: n */
    private JSONObject f50536n;

    /* renamed from: o */
    private int f50537o;

    /* renamed from: p */
    private String f50538p;

    /* renamed from: q */
    private C11421g f50539q;

    /* renamed from: r */
    private final Object f50540r;

    /* renamed from: s */
    private C11490f f50541s;

    /* renamed from: t */
    private boolean f50542t;

    /* renamed from: com.ironsource.mediationsdk.O$a */
    public enum C11252a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    C11251O(C11478b bVar, C11250N n, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new C11415a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f50540r = new Object();
        this.f50532j = C11252a.NONE;
        this.f50530h = bVar;
        this.f50531i = new C11353c(bVar.mo44530f());
        this.f50533k = n;
        this.f50603f = i;
        this.f50535m = str;
        this.f50537o = i2;
        this.f50538p = str2;
        this.f50536n = jSONObject;
        this.f50542t = z;
        this.f50598a.addBannerListener(this);
        if (mo43923h()) {
            m50269f();
        }
    }

    C11251O(C11478b bVar, C11250N n, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(bVar, n, networkSettings, abstractAdapter, i, "", (JSONObject) null, 0, "", z);
    }

    /* renamed from: a */
    private void m50268a(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo43931p());
        if (m50274v(C11252a.READY_TO_LOAD, C11252a.LOADING)) {
            this.f50541s = new C11490f();
            mo43872a(this.f50542t ? IronSourceConstants.BN_INSTANCE_RELOAD : IronSourceConstants.BN_INSTANCE_LOAD, (Object[][]) null);
            if (this.f50598a != null) {
                try {
                    if (mo43923h()) {
                        this.f50598a.loadBannerForBidding(this.f50534l, this.f50601d, this, str);
                    } else {
                        this.f50598a.loadBanner(this.f50534l, this.f50601d, this);
                    }
                } catch (Exception e) {
                    IronLog.INTERNAL.error(e.getMessage());
                    e.printStackTrace();
                }
            }
        } else {
            ironLog.error("wrong state - state = " + this.f50532j);
        }
    }

    /* renamed from: f */
    private void m50269f() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m50277y() + "isBidder = " + mo43923h());
        m50270r(C11252a.INIT_IN_PROGRESS);
        m50275w();
        try {
            if (this.f50598a == null) {
                return;
            }
            if (mo43923h()) {
                this.f50598a.initBannerForBidding(this.f50530h.mo44525a(), this.f50530h.mo44526b(), this.f50601d, this);
            } else {
                this.f50598a.initBanners(this.f50530h.mo44525a(), this.f50530h.mo44526b(), this.f50601d, this);
            }
        } catch (Throwable th) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("exception = " + th.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, th.getLocalizedMessage()));
        }
    }

    /* renamed from: r */
    private void m50270r(C11252a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m50277y() + "state = " + aVar.name());
        synchronized (this.f50540r) {
            this.f50532j = aVar;
        }
    }

    /* renamed from: s */
    private void m50271s(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 606) {
            mo43872a(this.f50542t ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f50541s))}});
        } else {
            mo43872a(this.f50542t ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f50541s))}});
        }
        C11250N n = this.f50533k;
        if (n != null) {
            n.mo43854a(ironSourceError, this);
        }
    }

    /* renamed from: t */
    private static void m50272t(Map<String, Object> map, ISBannerSize iSBannerSize) {
        int i;
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
                i = 1;
            } else if (c == 1) {
                i = 2;
            } else if (c == 2) {
                i = 3;
            } else if (c == 3) {
                i = 5;
            } else if (c == 4) {
                map.put("bannerAdSize", 6);
                map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                return;
            } else {
                return;
            }
            map.put("bannerAdSize", i);
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    /* renamed from: u */
    private static boolean m50273u(int i) {
        return i == 3005 || i == 3002 || i == 3012 || i == 3015 || i == 3008 || i == 3305 || i == 3300 || i == 3306 || i == 3307 || i == 3302 || i == 3303 || i == 3304 || i == 3009;
    }

    /* renamed from: v */
    private boolean m50274v(C11252a aVar, C11252a aVar2) {
        boolean z;
        synchronized (this.f50540r) {
            if (this.f50532j == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(m50277y() + "set state from '" + this.f50532j + "' to '" + aVar2 + "'");
                z = true;
                this.f50532j = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: w */
    private void m50275w() {
        if (this.f50598a != null) {
            try {
                String str = C11232E.m50103a().f50431u;
                if (!TextUtils.isEmpty(str)) {
                    this.f50598a.setMediationSegment(str);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.f50598a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("exception - " + e.toString());
            }
        }
    }

    /* renamed from: x */
    private boolean m50276x() {
        boolean z;
        synchronized (this.f50540r) {
            z = this.f50532j == C11252a.LOADED;
        }
        return z;
    }

    /* renamed from: y */
    private String m50277y() {
        return String.format("%s - ", new Object[]{mo43931p()});
    }

    /* renamed from: z */
    private boolean m50278z() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f50534l;
        return ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: a */
    public final void mo43871a() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo43931p());
        m50270r(C11252a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f50598a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f50599b.f51346a.getBannerSettings());
        } catch (Exception e) {
            e.printStackTrace();
            IronLog.INTERNAL.error(e.getMessage());
        }
        mo43872a(IronSourceConstants.BN_INSTANCE_DESTROY, (Object[][]) null);
    }

    /* renamed from: a */
    public final void mo43872a(int i, Object[][] objArr) {
        Map<String, Object> n = mo43929n();
        if (m50278z()) {
            n.put(IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed");
        } else {
            m50272t(n, this.f50534l.getSize());
        }
        if (!TextUtils.isEmpty(this.f50535m)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f50535m);
        }
        JSONObject jSONObject = this.f50536n;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f50536n);
        }
        C11421g gVar = this.f50539q;
        if (gVar != null) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, gVar.getPlacementName());
        }
        if (m50273u(i)) {
            C11292d.m50446e();
            C11284b.m50398a(n, this.f50537o, this.f50538p);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f50603f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(mo43926k() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        C11292d.m50446e().mo43979b(new C11308a(i, new JSONObject(n)));
    }

    /* renamed from: a */
    public final void mo43873a(IronSourceBannerLayout ironSourceBannerLayout, C11421g gVar, String str) {
        C11250N n;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo43931p());
        this.f50539q = gVar;
        if (!C11412m.m51072c(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            n = this.f50533k;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, str2);
        } else if (this.f50598a == null) {
            ironLog.verbose("mAdapter is null");
            n = this.f50533k;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        } else {
            this.f50534l = ironSourceBannerLayout;
            this.f50531i.mo44195a(this);
            try {
                if (mo43923h()) {
                    m50268a(str);
                    return;
                } else {
                    m50269f();
                    return;
                }
            } catch (Throwable th) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("exception = " + th.getLocalizedMessage());
                th.printStackTrace();
                return;
            }
        }
        n.mo43854a(ironSourceError, this);
    }

    /* renamed from: b */
    public final void mo43874b() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo43931p());
        C11252a aVar = C11252a.INIT_IN_PROGRESS;
        C11252a aVar2 = C11252a.LOAD_FAILED;
        if (m50274v(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else if (m50274v(C11252a.LOADING, aVar2)) {
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
        } else {
            ironLog.error("unexpected state - " + this.f50532j);
            return;
        }
        m50271s(ironSourceError);
    }

    /* renamed from: c */
    public final Map<String, Object> mo43875c() {
        AbstractAdapter abstractAdapter;
        try {
            if (!mo43923h() || (abstractAdapter = this.f50598a) == null) {
                return null;
            }
            return abstractAdapter.getBannerBiddingData(this.f50601d);
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public final void mo43876d() {
        this.f50531i.mo44190c();
        super.mo43876d();
    }

    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(mo43931p());
        mo43872a(IronSourceConstants.BN_INSTANCE_CLICK, (Object[][]) null);
        C11250N n = this.f50533k;
        if (n != null) {
            n.mo43852a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(mo43931p());
        mo43872a(IronSourceConstants.BN_INSTANCE_LEAVE_APP, (Object[][]) null);
        C11250N n = this.f50533k;
        if (n != null) {
            n.mo43859d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m50277y() + "error = " + ironSourceError);
        this.f50531i.mo44196d();
        if (m50274v(C11252a.LOADING, C11252a.LOAD_FAILED)) {
            m50271s(ironSourceError);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(mo43931p());
        this.f50531i.mo44196d();
        if (m50274v(C11252a.LOADING, C11252a.LOADED)) {
            mo43872a(this.f50542t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f50541s))}});
            C11250N n = this.f50533k;
            if (n != null) {
                n.mo43853a(this, view, layoutParams);
                return;
            }
            return;
        }
        mo43872a(this.f50542t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, (Object[][]) null);
    }

    public final void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(mo43931p());
        mo43872a(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, (Object[][]) null);
        C11250N n = this.f50533k;
        if (n != null) {
            n.mo43856b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(mo43931p());
        mo43872a(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, (Object[][]) null);
        C11250N n = this.f50533k;
        if (n != null) {
            n.mo43857c(this);
        }
    }

    public final void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo43931p());
        if (m50276x()) {
            mo43872a(IronSourceConstants.BN_INSTANCE_SHOW, (Object[][]) null);
            C11250N n = this.f50533k;
            if (n != null) {
                n.mo43861e(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f50532j);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        mo43872a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f50532j}, new Object[]{IronSourceConstants.EVENTS_EXT1, mo43926k()}});
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m50277y() + "error = " + ironSourceError);
        this.f50531i.mo44196d();
        if (m50274v(C11252a.INIT_IN_PROGRESS, C11252a.NONE)) {
            C11250N n = this.f50533k;
            if (n != null) {
                n.mo43854a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f50532j);
    }

    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(mo43931p());
        if (m50274v(C11252a.INIT_IN_PROGRESS, C11252a.READY_TO_LOAD) && !mo43923h()) {
            if (!C11412m.m51072c(this.f50534l)) {
                this.f50533k.mo43854a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f50534l == null ? "banner is null" : "banner is destroyed"), this);
            } else {
                m50268a((String) null);
            }
        }
    }
}
