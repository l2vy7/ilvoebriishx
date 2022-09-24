package com.ironsource.sdk.p290e.p291a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.p288c.C11539d;
import com.ironsource.sdk.p293g.C11710f;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.e.a.a */
public final class C11693a {

    /* renamed from: a */
    private static final Partner f52335a = Partner.createPartner("Ironsrc", "7");

    /* renamed from: b */
    private static AdSession f52336b;

    /* renamed from: c */
    private static boolean f52337c = false;

    /* renamed from: com.ironsource.sdk.e.a.a$a */
    static class C11694a {

        /* renamed from: a */
        public boolean f52338a;

        /* renamed from: b */
        public Owner f52339b;

        /* renamed from: c */
        public Owner f52340c;

        /* renamed from: d */
        public String f52341d;

        /* renamed from: e */
        public ImpressionType f52342e;

        /* renamed from: f */
        public CreativeType f52343f;

        /* renamed from: g */
        public String f52344g;

        /* renamed from: h */
        private Owner f52345h;

        /* renamed from: a */
        public static C11694a m51779a(JSONObject jSONObject) {
            C11694a aVar = new C11694a();
            aVar.f52338a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    aVar.f52339b = Owner.valueOf(optString.toUpperCase());
                    String optString2 = jSONObject.optString("videoEventsOwner", "");
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            aVar.f52340c = Owner.valueOf(optString2.toUpperCase());
                            aVar.f52341d = jSONObject.optString("customReferenceData", "");
                            aVar.f52343f = m51781c(jSONObject);
                            aVar.f52342e = m51780b(jSONObject);
                            String optString3 = jSONObject.optString("adViewId", "");
                            if (!TextUtils.isEmpty(optString3)) {
                                aVar.f52344g = optString3;
                                jSONObject.optBoolean("signalLoaded", false);
                                aVar.f52345h = m51782d(jSONObject);
                                return aVar;
                            }
                            throw new IllegalArgumentException(String.format("Missing OMID webview id", new Object[]{optString3}));
                        } catch (IllegalArgumentException unused) {
                            throw new IllegalArgumentException(String.format("%s | Invalid OMID videoEventsOwner", new Object[]{optString2}));
                        }
                    } else {
                        throw new IllegalArgumentException(String.format("Missing OMID videoEventsOwner", new Object[]{optString2}));
                    }
                } catch (IllegalArgumentException unused2) {
                    throw new IllegalArgumentException(String.format("%s | Invalid OMID impressionOwner", new Object[]{optString}));
                }
            } else {
                throw new IllegalArgumentException(String.format("Missing OMID impressionOwner", new Object[]{optString}));
            }
        }

        /* renamed from: b */
        private static ImpressionType m51780b(JSONObject jSONObject) {
            String optString = jSONObject.optString("impressionType", "");
            if (!TextUtils.isEmpty(optString)) {
                for (ImpressionType impressionType : ImpressionType.values()) {
                    if (optString.equalsIgnoreCase(impressionType.toString())) {
                        return impressionType;
                    }
                }
                throw new IllegalArgumentException(String.format("Missing OMID creativeType", new Object[]{optString}));
            }
            throw new IllegalArgumentException(String.format("Missing OMID creativeType", new Object[]{optString}));
        }

        /* renamed from: c */
        private static CreativeType m51781c(JSONObject jSONObject) {
            String optString = jSONObject.optString("creativeType", "");
            if (!TextUtils.isEmpty(optString)) {
                for (CreativeType creativeType : CreativeType.values()) {
                    if (optString.equalsIgnoreCase(creativeType.toString())) {
                        return creativeType;
                    }
                }
                throw new IllegalArgumentException(String.format("Missing OMID creativeType", new Object[]{optString}));
            }
            throw new IllegalArgumentException(String.format("Missing OMID creativeType", new Object[]{optString}));
        }

        /* renamed from: d */
        private static Owner m51782d(JSONObject jSONObject) {
            try {
                return Owner.valueOf(jSONObject.optString("videoEventsOwner", "").toUpperCase());
            } catch (IllegalArgumentException unused) {
                return Owner.NONE;
            }
        }
    }

    /* renamed from: a */
    public static C11710f m51773a() {
        C11710f fVar = new C11710f();
        fVar.mo45017a(SDKUtils.encodeString("omidVersion"), SDKUtils.encodeString(Omid.getVersion()));
        fVar.mo45017a(SDKUtils.encodeString("omidPartnerName"), SDKUtils.encodeString("Ironsrc"));
        fVar.mo45017a(SDKUtils.encodeString("omidPartnerVersion"), SDKUtils.encodeString("7"));
        return fVar;
    }

    /* renamed from: a */
    public static void m51774a(Context context) {
        if (!f52337c) {
            Omid.activate(context);
            f52337c = true;
        }
    }

    /* renamed from: a */
    public static void m51775a(JSONObject jSONObject) {
        m51778c();
        AdEvents createAdEvents = AdEvents.createAdEvents(f52336b);
        try {
            if (((Boolean) jSONObject.get("signalLoaded")).booleanValue()) {
                createAdEvents.loaded();
            }
        } catch (Exception unused) {
        }
        createAdEvents.impressionOccurred();
    }

    /* renamed from: a */
    public static void m51776a(JSONObject jSONObject, WebView webView) {
        C11694a a = C11694a.m51779a(jSONObject);
        if (!f52337c) {
            throw new IllegalStateException("OMID has not been activated");
        } else if (f52336b != null) {
            throw new IllegalStateException("OMID Session has already started");
        } else if (TextUtils.isEmpty(a.f52344g) || (webView = C11539d.m51410a().mo44638a(a.f52344g)) != null) {
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(a.f52343f, a.f52342e, a.f52339b, a.f52340c, a.f52338a), AdSessionContext.createHtmlAdSessionContext(f52335a, webView, (String) null, a.f52341d));
            createAdSession.registerAdView(webView);
            f52336b = createAdSession;
            createAdSession.start();
        } else {
            throw new IllegalStateException("webview not found");
        }
    }

    /* renamed from: b */
    public static void m51777b() {
        m51778c();
        f52336b.finish();
        f52336b = null;
    }

    /* renamed from: c */
    private static void m51778c() {
        if (!f52337c) {
            throw new IllegalStateException("OMID has not been activated");
        } else if (f52336b == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }
}
