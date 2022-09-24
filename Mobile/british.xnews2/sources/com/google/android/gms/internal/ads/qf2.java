package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qf2 implements zi2<pf2> {

    /* renamed from: a */
    private final Context f38016a;

    /* renamed from: b */
    private final nb3 f38017b;

    qf2(Context context, nb3 nb3) {
        this.f38016a = context;
        this.f38017b = nb3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ pf2 mo34336a() throws Exception {
        String str;
        Bundle bundle;
        zzt.zzp();
        Context context = this.f38016a;
        String str2 = "";
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37246x4)).booleanValue()) {
            str = str2;
        } else {
            str = context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str2);
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37262z4)).booleanValue()) {
            str2 = this.f38016a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str2);
        }
        zzt.zzp();
        Context context2 = this.f38016a;
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37254y4)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (defaultSharedPreferences.contains(str3)) {
                    bundle.putString(str3, defaultSharedPreferences.getString(str3, (String) null));
                }
            }
        }
        return new pf2(str, str2, bundle, (of2) null);
    }

    public final mb3<pf2> zzb() {
        return this.f38017b.mo33675b(new nf2(this));
    }
}
