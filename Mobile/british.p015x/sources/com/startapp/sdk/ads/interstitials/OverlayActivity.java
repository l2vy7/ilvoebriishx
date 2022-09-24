package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.C11796b3;
import com.startapp.C12146q9;
import com.startapp.C12437y;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Sta */
public class OverlayActivity extends Activity {

    /* renamed from: a */
    public C11796b3 f22195a;

    /* renamed from: b */
    public boolean f22196b;

    /* renamed from: c */
    public int f22197c;

    /* renamed from: d */
    public boolean f22198d;

    /* renamed from: e */
    public Bundle f22199e;

    /* renamed from: f */
    public int f22200f = -1;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20763a() {
        /*
            r8 = this;
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "placement"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            android.content.Intent r1 = r8.getIntent()
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.m23239a(r0)
            int r3 = r0.ordinal()
            if (r3 == 0) goto L_0x0063
            r4 = 2
            if (r3 == r4) goto L_0x005b
            r4 = 3
            if (r3 == r4) goto L_0x0053
            r4 = 4
            if (r3 == r4) goto L_0x002f
            r4 = 7
            if (r3 == r4) goto L_0x002f
            r4 = 8
            if (r3 == r4) goto L_0x0063
            com.startapp.a5 r3 = new com.startapp.a5
            r3.<init>()
            goto L_0x0078
        L_0x002f:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.C5015nb.f22145a
            java.lang.String r3 = "videoAd"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x003f
            com.startapp.sdk.ads.video.VideoMode r3 = new com.startapp.sdk.ads.video.VideoMode
            r3.<init>()
            goto L_0x0078
        L_0x003f:
            java.lang.String r3 = "mraidAd"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x004d
            com.startapp.i6 r3 = new com.startapp.i6
            r3.<init>()
            goto L_0x0078
        L_0x004d:
            com.startapp.r7 r3 = new com.startapp.r7
            r3.<init>()
            goto L_0x0078
        L_0x0053:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.C5015nb.f22145a
            com.startapp.sdk.ads.splash.b r3 = new com.startapp.sdk.ads.splash.b
            r3.<init>()
            goto L_0x0078
        L_0x005b:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.C5015nb.f22145a
            com.startapp.m7 r3 = new com.startapp.m7
            r3.<init>()
            goto L_0x0078
        L_0x0063:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.C5015nb.f22145a
            android.net.Uri r3 = r1.getData()
            if (r3 != 0) goto L_0x006e
            r0 = 0
            goto L_0x014a
        L_0x006e:
            java.lang.String r3 = r3.toString()
            com.startapp.w3 r4 = new com.startapp.w3
            r4.<init>(r3)
            r3 = r4
        L_0x0078:
            r3.f52599a = r1
            r3.f52600b = r8
            java.lang.String r4 = "position"
            java.lang.String r4 = r1.getStringExtra(r4)
            r3.f52606h = r4
            java.lang.String r4 = "tracking"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f52607i = r4
            java.lang.String r4 = "trackingClickUrl"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f52608j = r4
            java.lang.String r4 = "packageNames"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f52609k = r4
            java.lang.String r4 = "closingUrl"
            java.lang.String[] r5 = r1.getStringArrayExtra(r4)
            r3.f52603e = r5
            java.lang.String r5 = "smartRedirect"
            boolean[] r5 = r1.getBooleanArrayExtra(r5)
            r3.f52604f = r5
            java.lang.String r5 = "browserEnabled"
            boolean[] r5 = r1.getBooleanArrayExtra(r5)
            r3.f52605g = r5
            java.lang.String r5 = "adTag"
            java.lang.String r5 = r1.getStringExtra(r5)
            r3.f52614p = r5
            java.lang.String r5 = "htmlUuid"
            java.lang.String r5 = r1.getStringExtra(r5)
            if (r5 == 0) goto L_0x00e7
            java.lang.Boolean r6 = com.startapp.sdk.adsbase.AdsConstants.f54495f
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00da
            com.startapp.sdk.adsbase.cache.d r6 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f22348b
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo45147a((java.lang.String) r5)
            goto L_0x00e7
        L_0x00da:
            com.startapp.sdk.adsbase.cache.d r6 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f22348b
            java.lang.Object r5 = r6.remove(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo45147a((java.lang.String) r5)
        L_0x00e7:
            java.lang.String r5 = "isSplash"
            r1.getBooleanExtra(r5, r2)
            java.lang.String r5 = "adInfoOverride"
            java.io.Serializable r5 = r1.getSerializableExtra(r5)
            com.startapp.sdk.adsbase.adinformation.AdInformationOverrides r5 = (com.startapp.sdk.adsbase.adinformation.AdInformationOverrides) r5
            r3.f52613o = r5
            r3.f52612n = r0
            java.lang.String[] r0 = r1.getStringArrayExtra(r4)
            r3.f52603e = r0
            java.lang.String r0 = "rewardDuration"
            int r0 = r1.getIntExtra(r0, r2)
            r3.f52617s = r0
            java.lang.String r0 = "rewardedHideTimer"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r3.f52618t = r0
            boolean[] r0 = r3.f52604f
            r4 = 1
            if (r0 != 0) goto L_0x0119
            boolean[] r0 = new boolean[r4]
            r0[r2] = r4
            r3.f52604f = r0
        L_0x0119:
            boolean[] r0 = r3.f52605g
            if (r0 != 0) goto L_0x0123
            boolean[] r0 = new boolean[r4]
            r0[r2] = r4
            r3.f52605g = r0
        L_0x0123:
            java.lang.String r0 = "ad"
            java.io.Serializable r0 = r1.getSerializableExtra(r0)
            com.startapp.sdk.adsbase.Ad r0 = (com.startapp.sdk.adsbase.C5041Ad) r0
            r3.f52610l = r0
            java.lang.String r0 = "delayImpressionSeconds"
            r4 = -1
            long r6 = r1.getLongExtra(r0, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x013f
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r3.f52615q = r0
        L_0x013f:
            java.lang.String r0 = "sendRedirectHops"
            java.io.Serializable r0 = r1.getSerializableExtra(r0)
            java.lang.Boolean[] r0 = (java.lang.Boolean[]) r0
            r3.f52616r = r0
            r0 = r3
        L_0x014a:
            r8.f22195a = r0
            if (r0 != 0) goto L_0x0151
            r8.finish()
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.interstitials.OverlayActivity.mo20763a():void");
    }

    /* renamed from: b */
    public final boolean mo20764b() {
        return this.f22196b && Build.VERSION.SDK_INT != 26;
    }

    public void finish() {
        C11796b3 b3Var = this.f22195a;
        if (b3Var != null) {
            b3Var.mo45151h();
        }
        super.finish();
    }

    public void onBackPressed() {
        C11796b3 b3Var = this.f22195a;
        if (b3Var == null || !b3Var.mo45106c()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (mo20764b()) {
            mo20763a();
            C11796b3 b3Var = this.f22195a;
            if (b3Var != null) {
                b3Var.mo45095a(this.f22199e);
                this.f22195a.mo45109f();
            }
            this.f22196b = false;
        }
        C11796b3 b3Var2 = this.f22195a;
        if (b3Var2 != null) {
            b3Var2.mo45146a(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = false;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra(IronSourceConstants.EVENTS_PLACEMENT_NAME, -1);
        Serializable serializableExtra = getIntent().getSerializableExtra("ad");
        if (intExtra >= 0 && (serializableExtra instanceof C5041Ad)) {
            C12146q9 s = ComponentLocator.m23305a(getApplicationContext()).mo21232s();
            AdPreferences.Placement a = AdPreferences.Placement.m23239a(intExtra);
            String adId = ((C5041Ad) serializableExtra).getAdId();
            s.getClass();
            if (adId != null) {
                s.f54069a.put(new C12146q9.C12147a(a, -1), adId);
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("fullscreen", false) || booleanExtra) {
            getWindow().setFlags(1024, 1024);
        }
        this.f22198d = getIntent().getBooleanExtra("activityShouldLockOrientation", true);
        if (bundle != null) {
            this.f22200f = bundle.getInt("activityLockedOrientation", -1);
            this.f22198d = bundle.getBoolean("activityShouldLockOrientation", true);
        }
        this.f22197c = getIntent().getIntExtra(AdUnitActivity.EXTRA_ORIENTATION, getResources().getConfiguration().orientation);
        if (getResources().getConfiguration().orientation != this.f22197c) {
            z = true;
        }
        this.f22196b = z;
        if (mo20764b()) {
            this.f22199e = bundle;
            return;
        }
        mo20763a();
        C11796b3 b3Var = this.f22195a;
        if (b3Var != null) {
            b3Var.mo45095a(bundle);
        }
    }

    public void onDestroy() {
        if (!mo20764b()) {
            C11796b3 b3Var = this.f22195a;
            if (b3Var != null) {
                b3Var.mo45107d();
                this.f22195a = null;
            }
            Map<Activity, Integer> map = C5015nb.f22145a;
            C5015nb.m22899a((Activity) this, getResources().getConfiguration().orientation, false);
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C11796b3 b3Var = this.f22195a;
        if (b3Var == null || b3Var.mo45149a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        if (!mo20764b()) {
            C11796b3 b3Var = this.f22195a;
            if (b3Var != null) {
                b3Var.mo45108e();
            }
            C5055a.m23161b((Context) this);
        }
        overridePendingTransition(0, 0);
    }

    public void onResume() {
        C11796b3 b3Var;
        super.onResume();
        int i = this.f22200f;
        if (i == -1) {
            this.f22200f = C5015nb.m22899a((Activity) this, this.f22197c, this.f22198d);
        } else {
            int i2 = C12437y.f55146a;
            try {
                setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
        }
        if (!mo20764b() && (b3Var = this.f22195a) != null) {
            b3Var.mo45109f();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!mo20764b()) {
            C11796b3 b3Var = this.f22195a;
            if (b3Var != null) {
                b3Var.mo45102b(bundle);
            }
            bundle.putInt("activityLockedOrientation", this.f22200f);
            bundle.putBoolean("activityShouldLockOrientation", this.f22198d);
        }
    }

    public void onStop() {
        C11796b3 b3Var;
        super.onStop();
        if (!mo20764b() && (b3Var = this.f22195a) != null) {
            b3Var.mo45150g();
        }
    }
}
