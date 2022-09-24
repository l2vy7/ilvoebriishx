package com.adcolony.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.h */
class C2787h extends ContentObserver {

    /* renamed from: a */
    private AudioManager f11336a;

    /* renamed from: b */
    private AdColonyInterstitial f11337b;

    C2787h(Handler handler, AdColonyInterstitial adColonyInterstitial) {
        super(handler);
        Context b = C2684a.m9407b();
        if (b != null) {
            this.f11336a = (AudioManager) b.getSystemService("audio");
            this.f11337b = adColonyInterstitial;
            b.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9667a() {
        Context b = C2684a.m9407b();
        if (b != null) {
            b.getApplicationContext().getContentResolver().unregisterContentObserver(this);
        }
        this.f11337b = null;
        this.f11336a = null;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        AdColonyInterstitial adColonyInterstitial;
        if (this.f11336a != null && (adColonyInterstitial = this.f11337b) != null && adColonyInterstitial.mo9471d() != null) {
            double streamVolume = (double) ((((float) this.f11336a.getStreamVolume(3)) / 15.0f) * 100.0f);
            JSONObject b = C2976x.m10319b();
            C2976x.m10312a(b, "audio_percentage", streamVolume);
            C2976x.m10313a(b, "ad_session_id", this.f11337b.mo9471d().mo9563a());
            C2976x.m10323b(b, TtmlNode.ATTR_ID, this.f11337b.mo9471d().mo9573c());
            new C2714c0("AdContainer.on_audio_change", this.f11337b.mo9471d().mo9591k(), b).mo9612d();
        }
    }
}
