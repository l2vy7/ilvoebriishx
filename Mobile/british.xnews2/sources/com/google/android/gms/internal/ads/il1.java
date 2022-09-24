package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.C4604n;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6483e;
import p006a5.C6492o;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class il1 implements qm1 {

    /* renamed from: a */
    private final Context f20415a;

    /* renamed from: b */
    private final tm1 f20416b;

    /* renamed from: c */
    private final JSONObject f20417c;

    /* renamed from: d */
    private final ir1 f20418d;

    /* renamed from: e */
    private final im1 f20419e;

    /* renamed from: f */
    private final C7497ab f20420f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final fb1 f20421g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ka1 f20422h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ei1 f20423i;

    /* renamed from: j */
    private final ir2 f20424j;

    /* renamed from: k */
    private final zzcjf f20425k;

    /* renamed from: l */
    private final bs2 f20426l;

    /* renamed from: m */
    private final u21 f20427m;

    /* renamed from: n */
    private final ln1 f20428n;

    /* renamed from: o */
    private final C6483e f20429o;

    /* renamed from: p */
    private final ai1 f20430p;

    /* renamed from: q */
    private final sx2 f20431q;

    /* renamed from: r */
    private boolean f20432r = false;

    /* renamed from: s */
    private boolean f20433s;

    /* renamed from: t */
    private boolean f20434t = false;

    /* renamed from: u */
    private boolean f20435u = false;

    /* renamed from: v */
    private Point f20436v = new Point();

    /* renamed from: w */
    private Point f20437w = new Point();

    /* renamed from: x */
    private long f20438x = 0;

    /* renamed from: y */
    private long f20439y = 0;

    /* renamed from: z */
    private C7994nx f20440z;

    public il1(Context context, tm1 tm1, JSONObject jSONObject, ir1 ir1, im1 im1, C7497ab abVar, fb1 fb1, ka1 ka1, ei1 ei1, ir2 ir2, zzcjf zzcjf, bs2 bs2, u21 u21, ln1 ln1, C6483e eVar, ai1 ai1, sx2 sx2) {
        this.f20415a = context;
        this.f20416b = tm1;
        this.f20417c = jSONObject;
        this.f20418d = ir1;
        this.f20419e = im1;
        this.f20420f = abVar;
        this.f20421g = fb1;
        this.f20422h = ka1;
        this.f20423i = ei1;
        this.f20424j = ir2;
        this.f20425k = zzcjf;
        this.f20426l = bs2;
        this.f20427m = u21;
        this.f20428n = ln1;
        this.f20429o = eVar;
        this.f20430p = ai1;
        this.f20431q = sx2;
    }

    /* renamed from: q */
    private final String m20551q(View view, Map<String, WeakReference<View>> map) {
        if (!(map == null || view == null)) {
            for (Map.Entry next : map.entrySet()) {
                if (view.equals((View) ((WeakReference) next.getValue()).get())) {
                    return (String) next.getKey();
                }
            }
        }
        int K = this.f20419e.mo32651K();
        if (K == 1) {
            return "1099";
        }
        if (K == 2) {
            return "2099";
        }
        if (K != 6) {
            return null;
        }
        return "3099";
    }

    /* renamed from: r */
    private final boolean m20552r(String str) {
        JSONObject optJSONObject = this.f20417c.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private final boolean m20553s() {
        return this.f20417c.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: t */
    private final boolean m20554t(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        C4604n.m20093f("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f20417c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37105h2)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.f20415a;
            JSONObject jSONObject7 = new JSONObject();
            zzt.zzp();
            DisplayMetrics zzy = com.google.android.gms.ads.internal.util.zzt.zzy((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", C8241uv.m38463b().mo35447b(context, zzy.widthPixels));
                jSONObject7.put("height", C8241uv.m38463b().mo35447b(context, zzy.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37136k6)).booleanValue()) {
                this.f20418d.mo32758i("/clickRecorded", new el1(this, (dl1) null));
            } else {
                this.f20418d.mo32758i("/logScionEvent", new cl1(this, (bl1) null));
            }
            this.f20418d.mo32758i("/nativeImpression", new hl1(this, (gl1) null));
            so0.m37458a(this.f20418d.mo32753d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f20432r) {
                return true;
            }
            this.f20432r = zzt.zzs().zzn(this.f20415a, this.f20425k.f43036b, this.f20424j.f33441D.toString(), this.f20426l.f30089f);
            return true;
        } catch (JSONException e) {
            co0.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: T */
    public final void mo18359T(Bundle bundle) {
        if (bundle == null) {
            co0.zze("Touch event data is null. No touch event is reported.");
        } else if (!m20552r("touch_reporting")) {
            co0.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f = bundle.getFloat("x");
            float f2 = bundle.getFloat("y");
            this.f20420f.mo30331c().zzl((int) f, (int) f2, bundle.getInt("duration_ms"));
        }
    }

    /* renamed from: a */
    public final JSONObject mo18360a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject zzd = zzcb.zzd(this.f20415a, map, map2, view);
        JSONObject zzg = zzcb.zzg(this.f20415a, view);
        JSONObject zzf = zzcb.zzf(view);
        JSONObject zze = zzcb.zze(this.f20415a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd);
            jSONObject.put("ad_view_signal", zzg);
            jSONObject.put("scroll_view_signal", zzf);
            jSONObject.put("lock_screen_signal", zze);
            return jSONObject;
        } catch (JSONException e) {
            co0.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo18361b(View view, MotionEvent motionEvent, View view2) {
        this.f20436v = zzcb.zza(motionEvent, view2);
        long currentTimeMillis = this.f20429o.currentTimeMillis();
        this.f20439y = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f20438x = currentTimeMillis;
            this.f20437w = this.f20436v;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f20436v;
        obtain.setLocation((float) point.x, (float) point.y);
        this.f20420f.mo30332d(obtain);
        obtain.recycle();
    }

    /* renamed from: c */
    public final void mo18362c(String str) {
        mo18422x((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    /* renamed from: d */
    public final void mo18363d(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        View view3 = view2;
        Map<String, WeakReference<View>> map3 = map;
        JSONObject zzd = zzcb.zzd(this.f20415a, map, map2, view2);
        JSONObject zzg = zzcb.zzg(this.f20415a, view2);
        JSONObject zzf = zzcb.zzf(view2);
        JSONObject zze = zzcb.zze(this.f20415a, view2);
        View view4 = view;
        String q = m20551q(view, map);
        mo18422x(true == ((Boolean) C8311wv.m39277c().mo18570b(p00.f37114i2)).booleanValue() ? view3 : view4, zzg, zzd, zzf, zze, q, zzcb.zzc(q, this.f20415a, this.f20437w, this.f20436v), (JSONObject) null, z, false);
    }

    /* renamed from: e */
    public final void mo18364e(View view) {
        if (!this.f20417c.optBoolean("custom_one_point_five_click_enabled", false)) {
            co0.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ln1 ln1 = this.f20428n;
        if (view != null) {
            view.setOnClickListener(ln1);
            view.setClickable(true);
            ln1.f35145h = new WeakReference<>(view);
        }
    }

    /* renamed from: f */
    public final void mo18365f(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f20436v = new Point();
        this.f20437w = new Point();
        if (!this.f20433s) {
            this.f20430p.mo30383E0(view);
            this.f20433s = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f20427m.mo35095f(this);
        boolean zzi = zzcb.zzi(this.f20425k.f43038d);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (zzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (zzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean mo18366g(Bundle bundle) {
        if (!m20552r("impression_reporting")) {
            co0.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return m20554t((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, zzt.zzp().zzg(bundle, (JSONObject) null), false);
    }

    /* renamed from: h */
    public final void mo18367h(Bundle bundle) {
        if (bundle == null) {
            co0.zze("Click data is null. No click is reported.");
        } else if (!m20552r("click_reporting")) {
            co0.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            mo18422x((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, zzt.zzp().zzg(bundle, (JSONObject) null), false, false);
        }
    }

    /* renamed from: i */
    public final void mo18368i(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        String str;
        JSONObject zzd = zzcb.zzd(this.f20415a, map, map2, view);
        JSONObject zzg = zzcb.zzg(this.f20415a, view);
        JSONObject zzf = zzcb.zzf(view);
        JSONObject zze = zzcb.zze(this.f20415a, view);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37105h2)).booleanValue()) {
            try {
                str = this.f20420f.mo30331c().zzh(this.f20415a, view, (Activity) null);
            } catch (Exception unused) {
                co0.zzg("Exception getting data.");
            }
            m20554t(zzg, zzd, zzf, zze, str, (JSONObject) null, zzcb.zzh(this.f20415a, this.f20424j));
        }
        str = null;
        m20554t(zzg, zzd, zzf, zze, str, (JSONObject) null, zzcb.zzh(this.f20415a, this.f20424j));
    }

    /* renamed from: j */
    public final void mo18369j(C7994nx nxVar) {
        this.f20440z = nxVar;
    }

    /* renamed from: k */
    public final void mo18370k(C8137rx rxVar) {
        try {
            if (!this.f20434t) {
                if (rxVar == null) {
                    if (this.f20419e.mo32659S() != null) {
                        this.f20434t = true;
                        this.f20431q.mo34829b(this.f20419e.mo32659S().zzf());
                        zzf();
                        return;
                    }
                }
                this.f20434t = true;
                this.f20431q.mo34829b(rxVar.zzf());
                zzf();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: l */
    public final void mo18371l(m50 m50) {
        if (!this.f20417c.optBoolean("custom_one_point_five_click_enabled", false)) {
            co0.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.f20428n.mo33361c(m50);
        }
    }

    /* renamed from: m */
    public final void mo18372m(View view, Map<String, WeakReference<View>> map) {
        this.f20436v = new Point();
        this.f20437w = new Point();
        if (view != null) {
            this.f20430p.mo30384G0(view);
        }
        this.f20433s = false;
    }

    /* renamed from: n */
    public final void mo18373n() {
        this.f20435u = true;
    }

    /* renamed from: o */
    public final void mo18374o(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        View view2 = view;
        Map<String, WeakReference<View>> map3 = map;
        if (!this.f20435u) {
            co0.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!m20553s()) {
            co0.zze("Custom click reporting failed. Ad unit id not in the allow list.");
        } else {
            Map<String, WeakReference<View>> map4 = map2;
            JSONObject zzd = zzcb.zzd(this.f20415a, map, map2, view);
            JSONObject zzg = zzcb.zzg(this.f20415a, view);
            JSONObject zzf = zzcb.zzf(view);
            JSONObject zze = zzcb.zze(this.f20415a, view);
            String q = m20551q((View) null, map);
            mo18422x(view, zzg, zzd, zzf, zze, q, zzcb.zzc(q, this.f20415a, this.f20437w, this.f20436v), (JSONObject) null, z, true);
        }
    }

    /* renamed from: p */
    public final JSONObject mo18375p(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject a = mo18360a(view, map, map2);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f20435u && m20553s()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (a != null) {
                jSONObject.put("nas", a);
            }
        } catch (JSONException e) {
            co0.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo18422x(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        C4604n.m20093f("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f20417c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.f20416b.mo34981c(this.f20419e.mo32679g0()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f20419e.mo32651K());
            jSONObject8.put("view_aware_api_used", z);
            zzbnw zzbnw = this.f20426l.f30092i;
            jSONObject8.put("custom_mute_requested", zzbnw != null && zzbnw.f42999h);
            jSONObject8.put("custom_mute_enabled", !this.f20419e.mo32676f().isEmpty() && this.f20419e.mo32659S() != null);
            if (this.f20428n.mo33359a() != null && this.f20417c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f20429o.currentTimeMillis());
            if (this.f20435u && m20553s()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f20416b.mo34981c(this.f20419e.mo32679g0()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            try {
                JSONObject optJSONObject = this.f20417c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f20420f.mo30331c().zze(this.f20415a, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                co0.zzh("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37088f3)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37172o6)).booleanValue() && C6492o.m28290m()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37181p6)).booleanValue() && C6492o.m28290m()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.f20429o.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.f20438x);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.f20439y);
            jSONObject7.put("touch_signal", jSONObject9);
            so0.m37458a(this.f20418d.mo32753d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            co0.zzh("Unable to create click JSON.", e2);
        }
    }

    public final void zzf() {
        try {
            C7994nx nxVar = this.f20440z;
            if (nxVar != null) {
                nxVar.zze();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzg() {
        if (this.f20417c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f20428n.mo33360b();
        }
    }

    public final void zzh() {
        this.f20418d.mo32755f();
    }

    public final void zzo() {
        C4604n.m20093f("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f20417c);
            so0.m37458a(this.f20418d.mo32753d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            co0.zzh("", e);
        }
    }

    public final void zzq() {
        m20554t((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    public final boolean zzz() {
        return m20553s();
    }
}
