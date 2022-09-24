package p082g3;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C3642m;
import com.facebook.appevents.C3406g;
import com.facebook.appevents.C3420m;
import com.facebook.internal.C3489g0;
import com.facebook.internal.C3516l;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g3.d */
/* compiled from: AutomaticAnalyticsLogger */
public class C5341d {

    /* renamed from: a */
    private static final String f23541a = "g3.d";

    /* renamed from: b */
    private static final C3420m f23542b = new C3420m(C3642m.m12279e());

    /* renamed from: g3.d$a */
    /* compiled from: AutomaticAnalyticsLogger */
    private static class C5342a {

        /* renamed from: a */
        BigDecimal f23543a;

        /* renamed from: b */
        Currency f23544b;

        /* renamed from: c */
        Bundle f23545c;

        C5342a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f23543a = bigDecimal;
            this.f23544b = currency;
            this.f23545c = bundle;
        }
    }

    /* renamed from: a */
    private static C5342a m24049a(String str, String str2) {
        return m24050b(str, str2, new HashMap());
    }

    /* renamed from: b */
    private static C5342a m24050b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString(SessionDescription.ATTR_TYPE);
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String next : map.keySet()) {
                bundle.putCharSequence(next, map.get(next));
            }
            double d = (double) jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d);
            return new C5342a(new BigDecimal(d / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException e) {
            Log.e(f23541a, "Error parsing in-app subscription data.", e);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m24051c() {
        C3520m j = C3522n.m11804j(C3642m.m12280f());
        return j != null && C3642m.m12283i() && j.mo12000e();
    }

    /* renamed from: d */
    public static void m24052d() {
        Context e = C3642m.m12279e();
        String f = C3642m.m12280f();
        boolean i = C3642m.m12283i();
        C3489g0.m11687i(e, "context");
        if (!i) {
            return;
        }
        if (e instanceof Application) {
            C3406g.m11393a((Application) e, f);
        } else {
            Log.w(f23541a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    /* renamed from: e */
    public static void m24053e(String str, long j) {
        Context e = C3642m.m12279e();
        String f = C3642m.m12280f();
        C3489g0.m11687i(e, "context");
        C3520m o = C3522n.m11809o(f, false);
        if (o != null && o.mo11996a() && j > 0) {
            C3420m mVar = new C3420m(e);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            mVar.mo11844e("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    /* renamed from: f */
    static void m24054f(String str, String str2, boolean z) {
        C5342a a;
        if (m24051c() && (a = m24049a(str, str2)) != null) {
            boolean z2 = false;
            if (z && C3516l.m11769g("app_events_if_auto_log_subs", C3642m.m12280f(), false)) {
                z2 = true;
            }
            if (z2) {
                f23542b.mo11850k(C5350h.m24078m(str2) ? "StartTrial" : "Subscribe", a.f23543a, a.f23544b, a.f23545c);
            } else {
                f23542b.mo11851l(a.f23543a, a.f23544b, a.f23545c);
            }
        }
    }
}
