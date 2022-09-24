package com.startapp.sdk.ads.offerWall.offerWallJson;

import android.content.Context;
import android.content.Intent;
import com.startapp.C11955i3;
import com.startapp.C12178s5;
import com.startapp.C12342t5;
import com.startapp.C12458z0;
import com.startapp.C5004d4;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.C5068d;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.UUID;

/* compiled from: Sta */
public class OfferWall3DAd extends JsonAd implements C5068d {

    /* renamed from: c */
    public static String f54273c = null;
    private static final long serialVersionUID = 1;
    private final String uuid = UUID.randomUUID().toString();

    public OfferWall3DAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OFFER_WALL);
        if (f54273c == null) {
            f54273c = C5015nb.m22905a(context);
        }
    }

    /* renamed from: a */
    public boolean mo21075a(String str) {
        C12178s5 a = C12342t5.f54758b.mo46637a(this.uuid);
        StringBuilder a2 = C12458z0.m53804a("&position=");
        a2.append(C5055a.m23140a());
        a.f54142c = a2.toString();
        ActivityExtra activityExtra = this.activityExtra;
        boolean a3 = activityExtra != null ? activityExtra.mo20837a() : false;
        if (super.mo20844d()) {
            mo20838a(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        Intent intent = new Intent(this.f22229a, List3DActivity.class);
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("fullscreen", a3);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.mo20842b());
        intent.putExtra("adCacheTtl", super.mo20843c());
        intent.putExtra("position", C5055a.m23140a());
        intent.putExtra("listModelUuid", this.uuid);
        intent.addFlags(343932928);
        try {
            this.f22229a.startActivity(intent);
            if (AdsConstants.f54495f.booleanValue()) {
                return true;
            }
            setState(C5041Ad.AdState.UN_INITIALIZED);
            return true;
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return false;
        }
    }

    /* renamed from: b */
    public Long mo20842b() {
        return super.mo20842b();
    }

    /* renamed from: c */
    public Long mo20843c() {
        return super.mo20843c();
    }

    /* renamed from: d */
    public boolean mo20844d() {
        return super.mo20844d();
    }

    /* renamed from: h */
    public String mo45939h() {
        return this.uuid;
    }

    /* renamed from: a */
    public void mo20839a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C11955i3(this.f22229a, this, adPreferences, adEventListener).mo46157c();
    }

    /* renamed from: a */
    public boolean mo20841a() {
        return super.mo20841a();
    }

    /* renamed from: a */
    public void mo20840a(boolean z) {
        super.mo20840a(z);
    }
}
