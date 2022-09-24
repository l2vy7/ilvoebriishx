package com.startapp.sdk.adsbase.model;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.C11760a;
import com.startapp.C11924g8;
import com.startapp.C12146q9;
import com.startapp.C12403w0;
import com.startapp.C12437y;
import com.startapp.C5001b2;
import com.startapp.C5003d;
import com.startapp.C5014n9;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class GetAdRequest extends C12403w0 {

    /* renamed from: A0 */
    public Set<String> f54593A0 = null;

    /* renamed from: B0 */
    public Set<String> f54594B0 = null;

    /* renamed from: C0 */
    public Set<String> f54595C0 = null;

    /* renamed from: D0 */
    public Set<String> f54596D0 = null;

    /* renamed from: E0 */
    public Pair<String, String> f54597E0;

    /* renamed from: F0 */
    public boolean f54598F0 = true;

    /* renamed from: G0 */
    public long f54599G0 = (System.currentTimeMillis() - C5014n9.f22141d.mo20679b());

    /* renamed from: H0 */
    public int f54600H0;

    /* renamed from: I0 */
    public String f54601I0;

    /* renamed from: J0 */
    public String f54602J0;

    /* renamed from: K0 */
    public String f54603K0;

    /* renamed from: L0 */
    public boolean f54604L0;

    /* renamed from: M0 */
    public Boolean f54605M0;

    /* renamed from: N0 */
    public Boolean f54606N0;

    /* renamed from: O0 */
    public String f54607O0;

    /* renamed from: P0 */
    public String f54608P0 = null;

    /* renamed from: Q0 */
    public String f54609Q0 = null;

    /* renamed from: R0 */
    public C5041Ad.AdType f54610R0 = null;

    /* renamed from: h0 */
    public AdPreferences.Placement f54611h0;

    /* renamed from: i0 */
    public boolean f54612i0;

    /* renamed from: j0 */
    public Integer f54613j0;

    /* renamed from: k0 */
    public Long f54614k0;

    /* renamed from: l0 */
    public Boolean f54615l0;

    /* renamed from: m0 */
    public SDKAdPreferences.Gender f54616m0;

    /* renamed from: n0 */
    public String f54617n0;

    /* renamed from: o0 */
    public String f54618o0;

    /* renamed from: p0 */
    public int f54619p0 = 1;

    /* renamed from: q0 */
    public boolean f54620q0 = true;

    /* renamed from: r0 */
    public Boolean f54621r0;

    /* renamed from: s0 */
    public boolean f54622s0 = AdsCommonMetaData.m23014k().mo20883M();

    /* renamed from: t0 */
    public Double f54623t0;

    /* renamed from: u0 */
    public String f54624u0;

    /* renamed from: v0 */
    public String f54625v0;

    /* renamed from: w0 */
    public Integer f54626w0;

    /* renamed from: x0 */
    public boolean f54627x0 = true;

    /* renamed from: y0 */
    public int f54628y0 = 0;

    /* renamed from: z0 */
    public Set<String> f54629z0 = null;

    /* compiled from: Sta */
    public enum VideoRequestMode {
        INTERSTITIAL,
        REWARDED
    }

    /* compiled from: Sta */
    public enum VideoRequestType {
        ENABLED,
        DISABLED,
        FORCED,
        FORCED_NONVAST
    }

    public GetAdRequest() {
        super(4);
        Map<Activity, Integer> map = C5015nb.f22145a;
        this.f54600H0 = C5003d.m22884a().mo20660b();
        this.f54601I0 = MetaData.m23247r().mo21160B();
    }

    /* renamed from: a */
    public void mo46028a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair<String, String> pair) {
        this.f54611h0 = placement;
        this.f54597E0 = pair;
        this.f54605M0 = adPreferences.getAi();
        this.f54606N0 = adPreferences.getAs();
        this.f54616m0 = adPreferences.getGender(context);
        this.f54617n0 = adPreferences.getKeywords();
        this.f54612i0 = adPreferences.isTestMode();
        this.f54629z0 = adPreferences.getCategories();
        this.f54593A0 = adPreferences.getCategoriesExclude();
        this.f54620q0 = adPreferences.mo21115b();
        this.f54626w0 = adPreferences.mo21112a();
        int i = C12437y.f55146a;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 17 ? Settings.System.getInt(context.getContentResolver(), "auto_time", 0) > 0 : Settings.Global.getInt(context.getContentResolver(), "auto_time", 0) > 0) {
            z = true;
        }
        this.f54621r0 = Boolean.valueOf(z);
        this.f54623t0 = adPreferences.getMinCpm();
        this.f54624u0 = adPreferences.getAdTag();
        Object obj = MetaData.f22400d;
        this.f54627x0 = !context.getFileStreamPath("StartappMetadata").exists();
        this.f54608P0 = adPreferences.country;
        this.f54609Q0 = adPreferences.advertiserId;
        this.f54618o0 = adPreferences.template;
        this.f54610R0 = adPreferences.type;
        this.f54991b = adPreferences.getCustomProductId();
        this.f54595C0 = adPreferences.packageInclude;
    }

    /* renamed from: a */
    public boolean mo46275a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo46276b() {
        C5041Ad.AdType adType = this.f54610R0;
        return adType == C5041Ad.AdType.VIDEO || adType == C5041Ad.AdType.REWARDED_VIDEO;
    }

    /* renamed from: f */
    public void mo45515f(Context context) {
        String str;
        C12146q9 s = ComponentLocator.m23305a(context).mo21232s();
        AdPreferences.Placement placement = this.f54611h0;
        s.getClass();
        if (placement == null) {
            str = null;
        } else {
            str = s.f54069a.get(new C12146q9.C12147a(placement, -1));
        }
        this.f54625v0 = str;
    }

    /* renamed from: g */
    public void mo46277g(Context context) {
        C5001b2 f = ComponentLocator.m23305a(context).mo21219f();
        this.f54613j0 = f.mo20654b();
        this.f54614k0 = (!f.mo20656d() || !f.f22112b.contains("consentTimestamp")) ? null : Long.valueOf(f.f22112b.getLong("consentTimestamp", 0));
        this.f54615l0 = f.mo20649a();
    }

    /* renamed from: a */
    public void mo45384a(C11924g8 g8Var) throws SDKException {
        String str;
        super.mo45384a(g8Var);
        g8Var.mo45382a(IronSourceConstants.EVENTS_PLACEMENT_NAME, (Object) this.f54611h0.name(), true, true);
        g8Var.mo45382a("testMode", (Object) Boolean.toString(this.f54612i0), false, true);
        g8Var.mo45382a("gender", (Object) this.f54616m0, false, true);
        g8Var.mo45382a("keywords", (Object) this.f54617n0, false, true);
        g8Var.mo45382a("template", (Object) this.f54618o0, false, true);
        g8Var.mo45382a("adsNumber", (Object) Integer.toString(this.f54619p0), false, true);
        g8Var.mo45383a("category", this.f54629z0, false, true);
        g8Var.mo45383a("categoryExclude", this.f54593A0, false, true);
        g8Var.mo45383a("packageExclude", this.f54594B0, false, true);
        g8Var.mo45383a("campaignExclude", this.f54596D0, false, true);
        g8Var.mo45382a("offset", (Object) Integer.toString(this.f54628y0), false, true);
        g8Var.mo45382a("ai", (Object) this.f54605M0, false, true);
        g8Var.mo45382a("as", (Object) this.f54606N0, false, true);
        Double d = this.f54623t0;
        Map<Activity, Integer> map = C5015nb.f22145a;
        Boolean bool = null;
        if (d != null) {
            str = String.format(Locale.US, "%.2f", new Object[]{d});
        } else {
            str = null;
        }
        g8Var.mo45382a("minCPM", (Object) str, false, true);
        g8Var.mo45382a("adTag", (Object) this.f54624u0, false, true);
        g8Var.mo45382a("previousAdId", (Object) this.f54625v0, false, true);
        g8Var.mo45382a("twoClicks", (Object) Boolean.valueOf(!this.f54622s0), false, true);
        g8Var.mo45382a("engInclude", (Object) Boolean.toString(this.f54598F0), false, true);
        C5041Ad.AdType adType = this.f54610R0;
        if (adType == C5041Ad.AdType.INTERSTITIAL || adType == C5041Ad.AdType.RICH_TEXT) {
            g8Var.mo45382a(SessionDescription.ATTR_TYPE, (Object) adType, false, true);
        }
        g8Var.mo45382a("timeSinceSessionStart", (Object) Long.valueOf(this.f54599G0), true, true);
        g8Var.mo45382a("adsDisplayed", (Object) Integer.valueOf(this.f54600H0), true, true);
        g8Var.mo45382a("profileId", (Object) this.f54601I0, false, true);
        g8Var.mo45382a("hardwareAccelerated", (Object) Boolean.valueOf(this.f54620q0), false, true);
        g8Var.mo45382a("autoLoadAmount", (Object) this.f54626w0, false, true);
        g8Var.mo45382a("dts", (Object) this.f54621r0, false, true);
        g8Var.mo45382a("downloadingMode", (Object) "CACHE", false, true);
        g8Var.mo45382a("primaryImg", (Object) this.f54602J0, false, true);
        g8Var.mo45382a("moreImg", (Object) this.f54603K0, false, true);
        g8Var.mo45382a("contentAd", (Object) Boolean.toString(this.f54604L0), false, true);
        g8Var.mo45382a("ct", (Object) this.f54613j0, false, true);
        g8Var.mo45382a("tsc", (Object) this.f54614k0, false, true);
        g8Var.mo45382a("apc", (Object) this.f54615l0, false, true);
        Object obj = StartAppSDKInternal.f22265C;
        if (StartAppSDKInternal.C5051d.f22295a.f22268B) {
            bool = Boolean.TRUE;
        }
        g8Var.mo45382a("testAdsEnabled", (Object) bool, false, true);
        String a = C11760a.m51982a();
        g8Var.mo45382a(C11760a.f52513b, (Object) a, true, true);
        String str2 = C11760a.f52515d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f54991b);
        sb.append(this.f54611h0.name());
        String str3 = this.f54979Q;
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(this.f54993c);
        sb.append(a);
        g8Var.mo45382a(str2, (Object) C11760a.m51983a(sb.toString()), true, false);
        String str4 = this.f54608P0;
        if (str4 != null) {
            g8Var.mo45382a("country", (Object) str4, false, true);
        }
        String str5 = this.f54609Q0;
        if (str5 != null) {
            g8Var.mo45382a("advertiserId", (Object) str5, false, true);
        }
        Set<String> set = this.f54595C0;
        if (set != null) {
            g8Var.mo45383a("packageInclude", set, false, true);
        }
        g8Var.mo45382a("defaultMetaData", (Object) Boolean.valueOf(this.f54627x0), true, true);
        Pair<String, String> pair = this.f54597E0;
        g8Var.mo45382a((String) pair.first, pair.second, false, true);
        String str6 = this.f54607O0;
        if (str6 != null) {
            g8Var.mo45382a("trv", (Object) str6, false, false);
        }
    }
}
