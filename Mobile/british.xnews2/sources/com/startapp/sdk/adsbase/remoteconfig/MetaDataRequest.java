package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.C11760a;
import com.startapp.C11924g8;
import com.startapp.C12403w0;
import com.startapp.C12437y;
import com.startapp.C5001b2;
import com.startapp.C5004d4;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Map;

/* compiled from: Sta */
public class MetaDataRequest extends C12403w0 {

    /* renamed from: h0 */
    public final C5069e f54646h0;

    /* renamed from: i0 */
    public int f54647i0;

    /* renamed from: j0 */
    public int f54648j0 = mo46335b();

    /* renamed from: k0 */
    public boolean f54649k0;

    /* renamed from: l0 */
    public float f54650l0;

    /* renamed from: m0 */
    public RequestReason f54651m0;

    /* renamed from: n0 */
    public String f54652n0;

    /* renamed from: o0 */
    public String f54653o0;

    /* renamed from: p0 */
    public Integer f54654p0;

    /* renamed from: q0 */
    public Pair<String, String> f54655q0;

    /* renamed from: r0 */
    public Integer f54656r0;

    /* renamed from: s0 */
    public Boolean f54657s0;

    /* renamed from: t0 */
    public long f54658t0;

    /* compiled from: Sta */
    public enum RequestReason {
        LAUNCH(1),
        APP_IDLE(2),
        IN_APP_PURCHASE(3),
        CUSTOM(4),
        PERIODIC(5),
        PAS(6),
        CONSENT(7),
        IMPLICIT_LAUNCH(8),
        EXTRAS(9);
        
        private int index;

        /* access modifiers changed from: public */
        RequestReason(int i) {
            this.index = i;
        }
    }

    public MetaDataRequest(Context context, C5069e eVar, RequestReason requestReason) {
        super(2);
        this.f54646h0 = eVar;
        this.f54647i0 = eVar.getInt("totalSessions", 0);
        this.f54650l0 = eVar.getFloat("inAppPurchaseAmount", 0.0f);
        this.f54649k0 = eVar.getBoolean("payingUser", false);
        this.f54652n0 = MetaData.m23247r().mo21160B();
        this.f54651m0 = requestReason;
        this.f54653o0 = m53333a(context, eVar, StartAppSDKInternal.m23097a().mo20984b());
        mo46336f(context);
        this.f54655q0 = SimpleTokenUtils.m23077a();
        this.f54658t0 = SimpleTokenUtils.m23083c();
        C5001b2 f = ComponentLocator.m23305a(context).mo21219f();
        this.f54656r0 = f.mo20654b();
        this.f54657s0 = f.mo20649a();
        mo46693a(ComponentLocator.m23305a(context).mo21215b().mo46668a());
    }

    /* renamed from: a */
    public void mo45384a(C11924g8 g8Var) throws SDKException {
        super.mo45384a(g8Var);
        g8Var.mo45382a(C11760a.f52513b, (Object) C11760a.m51982a(), true, true);
        g8Var.mo45382a("totalSessions", (Object) Integer.valueOf(this.f54647i0), true, true);
        g8Var.mo45382a("daysSinceFirstSession", (Object) Integer.valueOf(this.f54648j0), true, true);
        g8Var.mo45382a("payingUser", (Object) Boolean.valueOf(this.f54649k0), true, true);
        g8Var.mo45382a("profileId", (Object) this.f54652n0, false, true);
        g8Var.mo45382a("paidAmount", (Object) Float.valueOf(this.f54650l0), true, true);
        g8Var.mo45382a(IronSourceConstants.EVENTS_ERROR_REASON, (Object) this.f54651m0, true, true);
        g8Var.mo45382a("ct", (Object) this.f54656r0, false, true);
        g8Var.mo45382a("apc", (Object) this.f54657s0, false, true);
        Object obj = StartAppSDKInternal.f22265C;
        g8Var.mo45382a("testAdsEnabled", (Object) StartAppSDKInternal.C5051d.f22295a.f22268B ? Boolean.TRUE : null, false, true);
        g8Var.mo45382a("apkHash", (Object) this.f54653o0, false, true);
        g8Var.mo45382a("ian", (Object) this.f54654p0, false, true);
        Pair<String, String> pair = this.f54655q0;
        g8Var.mo45382a((String) pair.first, pair.second, false, true);
        if (Build.VERSION.SDK_INT >= 9) {
            long j = this.f54658t0;
            if (j != 0) {
                g8Var.mo45382a("firstInstalledAppTS", (Object) Long.valueOf(j), false, true);
            }
        }
    }

    /* renamed from: b */
    public final int mo46335b() {
        return (int) ((System.currentTimeMillis() - this.f54646h0.getLong("firstSessionTime", System.currentTimeMillis())) / 86400000);
    }

    /* renamed from: f */
    public void mo46336f(Context context) {
        SimpleTokenConfig G = MetaData.f22407k.mo21165G();
        if (G != null && G.mo46418a(context)) {
            int i = C12437y.f55146a;
            int i2 = 0;
            try {
                for (PackageInfo next : C12437y.m53776a(context.getPackageManager())) {
                    if (!C12437y.m53784a(next) || next.packageName.equals(Constants.f54684a)) {
                        i2++;
                    }
                }
            } catch (Throwable unused) {
            }
            if (i2 > 0) {
                this.f54654p0 = Integer.valueOf(i2);
            }
        }
    }

    /* renamed from: a */
    public static String m53333a(Context context, C5069e eVar, boolean z) {
        String str = null;
        String string = eVar.getString("shared_prefs_app_apk_hash", (String) null);
        if (!TextUtils.isEmpty(string) && !z) {
            return string;
        }
        Map<Activity, Integer> map = C5015nb.f22145a;
        try {
            str = C12437y.m53775a("SHA-256", context);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
        C5069e.C5070a a = eVar.edit();
        a.mo21101a("shared_prefs_app_apk_hash", str);
        a.f22385a.putString("shared_prefs_app_apk_hash", str);
        a.apply();
        return str;
    }
}
