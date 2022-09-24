package com.adcolony.sdk;

import android.webkit.WebView;
import com.adcolony.sdk.C2978z;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.CreativeType;
import com.iab.omid.library.adcolony.adsession.ImpressionType;
import com.iab.omid.library.adcolony.adsession.Owner;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.InteractionType;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.adsession.media.Position;
import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.j0 */
class C2829j0 {

    /* renamed from: a */
    private AdSession f11484a;

    /* renamed from: b */
    private AdEvents f11485b;

    /* renamed from: c */
    private MediaEvents f11486c;

    /* renamed from: d */
    private List<VerificationScriptResource> f11487d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f11488e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f11489f = "";

    /* renamed from: g */
    private boolean f11490g;

    /* renamed from: h */
    private boolean f11491h;

    /* renamed from: i */
    private boolean f11492i;

    /* renamed from: j */
    private boolean f11493j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f11494k;

    /* renamed from: l */
    private int f11495l;

    /* renamed from: m */
    private int f11496m;

    /* renamed from: n */
    private String f11497n = "";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f11498o = "";

    /* renamed from: com.adcolony.sdk.j0$a */
    class C2830a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11499a;

        C2830a(String str) {
            this.f11499a = str;
        }

        public void run() {
            JSONObject b = C2976x.m10319b();
            JSONObject b2 = C2976x.m10319b();
            C2976x.m10323b(b2, "session_type", C2829j0.this.f11488e);
            C2976x.m10313a(b2, "session_id", C2829j0.this.f11489f);
            C2976x.m10313a(b2, "event", this.f11499a);
            C2976x.m10313a(b, SessionDescription.ATTR_TYPE, "iab_hook");
            C2976x.m10313a(b, "message", b2.toString());
            new C2714c0("CustomMessage.controller_send", 0, b).mo9612d();
        }
    }

    /* renamed from: com.adcolony.sdk.j0$b */
    class C2831b implements AdColonyCustomMessageListener {

        /* renamed from: com.adcolony.sdk.j0$b$a */
        class C2832a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11502a;

            /* renamed from: b */
            final /* synthetic */ String f11503b;

            /* renamed from: c */
            final /* synthetic */ float f11504c;

            C2832a(String str, String str2, float f) {
                this.f11502a = str;
                this.f11503b = str2;
                this.f11504c = f;
            }

            public void run() {
                if (this.f11502a.equals(C2829j0.this.f11498o)) {
                    C2829j0.this.mo9777a(this.f11503b, this.f11504c);
                    return;
                }
                AdColonyAdView adColonyAdView = C2684a.m9409c().mo9708b().mo9621b().get(this.f11502a);
                C2829j0 omidManager = adColonyAdView != null ? adColonyAdView.getOmidManager() : null;
                if (omidManager != null) {
                    omidManager.mo9777a(this.f11503b, this.f11504c);
                }
            }
        }

        C2831b() {
        }

        public void onAdColonyCustomMessage(AdColonyCustomMessage adColonyCustomMessage) {
            JSONObject b = C2976x.m10320b(adColonyCustomMessage.getMessage());
            String i = C2976x.m10337i(b, "event_type");
            float floatValue = BigDecimal.valueOf(C2976x.m10330d(b, IronSourceConstants.EVENTS_DURATION)).floatValue();
            boolean c = C2976x.m10329c(b, "replay");
            boolean equals = C2976x.m10337i(b, "skip_type").equals("dec");
            String i2 = C2976x.m10337i(b, "asi");
            if (i.equals("skip") && equals) {
                boolean unused = C2829j0.this.f11494k = true;
            } else if (!c || (!i.equals(TtmlNode.START) && !i.equals("first_quartile") && !i.equals("midpoint") && !i.equals("third_quartile") && !i.equals("complete"))) {
                C2916s0.m10063a((Runnable) new C2832a(i2, i, floatValue));
            }
        }
    }

    C2829j0(JSONObject jSONObject, String str) {
        VerificationScriptResource verificationScriptResource;
        this.f11488e = m9758a(jSONObject);
        this.f11493j = C2976x.m10329c(jSONObject, "skippable");
        this.f11495l = C2976x.m10332e(jSONObject, "skip_offset");
        this.f11496m = C2976x.m10332e(jSONObject, "video_duration");
        JSONArray b = C2976x.m10318b(jSONObject, "js_resources");
        JSONArray b2 = C2976x.m10318b(jSONObject, "verification_params");
        JSONArray b3 = C2976x.m10318b(jSONObject, "vendor_keys");
        this.f11498o = str;
        for (int i = 0; i < b.length(); i++) {
            try {
                String d = C2976x.m10331d(b2, i);
                String d2 = C2976x.m10331d(b3, i);
                URL url = new URL(C2976x.m10331d(b, i));
                if (!d.equals("") && !d2.equals("")) {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(d2, url, d);
                } else if (!d2.equals("")) {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                } else {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                }
                this.f11487d.add(verificationScriptResource);
            } catch (MalformedURLException unused) {
                new C2978z.C2979a().mo10088a("Invalid js resource url passed to Omid").mo10090a(C2978z.f11950j);
            }
        }
        try {
            this.f11497n = C2684a.m9409c().mo9726m().mo10011a(C2976x.m10337i(jSONObject, "filepath"), true).toString();
        } catch (IOException unused2) {
            new C2978z.C2979a().mo10088a("Error loading IAB JS Client").mo10090a(C2978z.f11950j);
        }
    }

    /* renamed from: e */
    private void m9764e() {
        AdColony.addCustomMessageListener(new C2831b(), "viewability_ad_event");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo9780d() {
        return this.f11488e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9781f() {
        this.f11491h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9778b() {
        AdColony.removeCustomMessageListener("viewability_ad_event");
        this.f11484a.finish();
        m9762b("end_session");
        this.f11484a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AdSession mo9779c() {
        return this.f11484a;
    }

    /* renamed from: a */
    private int m9758a(JSONObject jSONObject) {
        if (this.f11488e == -1) {
            int e = C2976x.m10332e(jSONObject, "ad_unit_type");
            String i = C2976x.m10337i(jSONObject, "ad_type");
            if (e == 0) {
                return 0;
            }
            if (e == 1) {
                if (i.equals("video")) {
                    return 0;
                }
                if (i.equals("display")) {
                    return 1;
                }
                if (i.equals("banner_display") || i.equals("interstitial_display")) {
                    return 2;
                }
            }
        }
        return this.f11488e;
    }

    /* renamed from: b */
    private void m9762b(String str) {
        try {
            C2916s0.f11754b.execute(new C2830a(str));
        } catch (RejectedExecutionException e) {
            C2978z.C2979a aVar = new C2978z.C2979a();
            aVar.mo10088a("ADCOmidManager.sendIabCustomMessage failed with error: " + e.toString()).mo10090a(C2978z.f11950j);
        }
    }

    /* renamed from: b */
    private void m9761b(C2701c cVar) {
        m9762b("register_ad_view");
        C2951u0 u0Var = C2684a.m9409c().mo9690A().get(Integer.valueOf(cVar.mo9591k()));
        if (u0Var == null && !cVar.mo9594n().isEmpty()) {
            u0Var = (C2951u0) cVar.mo9594n().entrySet().iterator().next().getValue();
        }
        AdSession adSession = this.f11484a;
        if (adSession != null && u0Var != null) {
            adSession.registerAdView(u0Var);
            u0Var.mo10036e();
        } else if (adSession != null) {
            adSession.registerAdView(cVar);
            cVar.mo9567a(this.f11484a);
            m9762b("register_obstructions");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9775a(C2701c cVar) {
        MediaEvents mediaEvents;
        VastProperties vastProperties;
        if (!this.f11492i && this.f11488e >= 0 && this.f11484a != null) {
            m9761b(cVar);
            m9764e();
            if (this.f11488e != 0) {
                mediaEvents = null;
            } else {
                mediaEvents = MediaEvents.createMediaEvents(this.f11484a);
            }
            this.f11486c = mediaEvents;
            this.f11484a.start();
            this.f11485b = AdEvents.createAdEvents(this.f11484a);
            m9762b("start_session");
            if (this.f11486c != null) {
                Position position = Position.PREROLL;
                if (this.f11493j) {
                    vastProperties = VastProperties.createVastPropertiesForSkippableMedia((float) this.f11495l, true, position);
                } else {
                    vastProperties = VastProperties.createVastPropertiesForNonSkippableMedia(true, position);
                }
                this.f11485b.loaded(vastProperties);
            } else {
                this.f11485b.loaded();
            }
            this.f11492i = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9773a() throws IllegalArgumentException {
        mo9774a((WebView) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9774a(WebView webView) throws IllegalArgumentException {
        String str;
        List<VerificationScriptResource> list;
        if (this.f11488e >= 0 && (str = this.f11497n) != null && !str.equals("") && (list = this.f11487d) != null) {
            if (!list.isEmpty() || mo9780d() == 2) {
                C2794i c = C2684a.m9409c();
                Owner owner = Owner.NATIVE;
                ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                int d = mo9780d();
                if (d == 0) {
                    CreativeType creativeType = CreativeType.VIDEO;
                    AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createNativeAdSessionContext(c.mo9732s(), this.f11497n, this.f11487d, (String) null, (String) null));
                    this.f11484a = createAdSession;
                    this.f11489f = createAdSession.getAdSessionId();
                    m9762b("inject_javascript");
                } else if (d == 1) {
                    CreativeType creativeType2 = CreativeType.NATIVE_DISPLAY;
                    AdSession createAdSession2 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType2, impressionType, owner, (Owner) null, false), AdSessionContext.createNativeAdSessionContext(c.mo9732s(), this.f11497n, this.f11487d, (String) null, (String) null));
                    this.f11484a = createAdSession2;
                    this.f11489f = createAdSession2.getAdSessionId();
                    m9762b("inject_javascript");
                } else if (d == 2) {
                    CreativeType creativeType3 = CreativeType.HTML_DISPLAY;
                    AdSession createAdSession3 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType3, impressionType, owner, (Owner) null, false), AdSessionContext.createHtmlAdSessionContext(c.mo9732s(), webView, "", (String) null));
                    this.f11484a = createAdSession3;
                    this.f11489f = createAdSession3.getAdSessionId();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9776a(String str) {
        mo9777a(str, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9777a(String str, float f) {
        if (C2684a.m9410d() && this.f11484a != null) {
            if (this.f11486c != null || str.equals(TtmlNode.START) || str.equals("skip") || str.equals("continue") || str.equals("cancel")) {
                char c = 65535;
                try {
                    switch (str.hashCode()) {
                        case -1941887438:
                            if (str.equals("first_quartile")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1710060637:
                            if (str.equals("buffer_start")) {
                                c = 12;
                                break;
                            }
                            break;
                        case -1638835128:
                            if (str.equals("midpoint")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1367724422:
                            if (str.equals("cancel")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -934426579:
                            if (str.equals("resume")) {
                                c = 11;
                                break;
                            }
                            break;
                        case -651914917:
                            if (str.equals("third_quartile")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -599445191:
                            if (str.equals("complete")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -567202649:
                            if (str.equals("continue")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -342650039:
                            if (str.equals("sound_mute")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 3532159:
                            if (str.equals("skip")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 106440182:
                            if (str.equals("pause")) {
                                c = 10;
                                break;
                            }
                            break;
                        case 109757538:
                            if (str.equals(TtmlNode.START)) {
                                c = 0;
                                break;
                            }
                            break;
                        case 583742045:
                            if (str.equals("in_video_engagement")) {
                                c = 14;
                                break;
                            }
                            break;
                        case 823102269:
                            if (str.equals("html5_interaction")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 1648173410:
                            if (str.equals("sound_unmute")) {
                                c = 9;
                                break;
                            }
                            break;
                        case 1906584668:
                            if (str.equals("buffer_end")) {
                                c = 13;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f11485b.impressionOccurred();
                            MediaEvents mediaEvents = this.f11486c;
                            if (mediaEvents != null) {
                                if (f <= 0.0f) {
                                    f = (float) this.f11496m;
                                }
                                mediaEvents.start(f, 1.0f);
                            }
                            m9762b(str);
                            return;
                        case 1:
                            this.f11486c.firstQuartile();
                            m9762b(str);
                            return;
                        case 2:
                            this.f11486c.midpoint();
                            m9762b(str);
                            return;
                        case 3:
                            this.f11486c.thirdQuartile();
                            m9762b(str);
                            return;
                        case 4:
                            this.f11494k = true;
                            this.f11486c.complete();
                            m9762b(str);
                            return;
                        case 5:
                            m9762b(str);
                            mo9778b();
                            return;
                        case 6:
                        case 7:
                            MediaEvents mediaEvents2 = this.f11486c;
                            if (mediaEvents2 != null) {
                                mediaEvents2.skipped();
                            }
                            m9762b(str);
                            mo9778b();
                            return;
                        case 8:
                            this.f11486c.volumeChange(0.0f);
                            m9762b(str);
                            return;
                        case 9:
                            this.f11486c.volumeChange(1.0f);
                            m9762b(str);
                            return;
                        case 10:
                            if (!this.f11490g && !this.f11491h && !this.f11494k) {
                                this.f11486c.pause();
                                m9762b(str);
                                this.f11490g = true;
                                this.f11491h = false;
                                return;
                            }
                            return;
                        case 11:
                            if (this.f11490g && !this.f11494k) {
                                this.f11486c.resume();
                                m9762b(str);
                                this.f11490g = false;
                                return;
                            }
                            return;
                        case 12:
                            this.f11486c.bufferStart();
                            m9762b(str);
                            return;
                        case 13:
                            this.f11486c.bufferFinish();
                            m9762b(str);
                            return;
                        case 14:
                        case 15:
                            this.f11486c.adUserInteraction(InteractionType.CLICK);
                            m9762b(str);
                            if (this.f11491h && !this.f11490g && !this.f11494k) {
                                this.f11486c.pause();
                                m9762b("pause");
                                this.f11490g = true;
                                this.f11491h = false;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } catch (IllegalArgumentException | IllegalStateException e) {
                    C2978z.C2979a a = new C2978z.C2979a().mo10088a("Recording IAB event for ").mo10088a(str);
                    a.mo10088a(" caused " + e.getClass()).mo10090a(C2978z.f11948h);
                }
            }
        }
    }
}
