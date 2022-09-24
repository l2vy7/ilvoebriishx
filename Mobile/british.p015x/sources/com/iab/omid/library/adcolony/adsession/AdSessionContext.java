package com.iab.omid.library.adcolony.adsession;

import android.webkit.WebView;
import com.iab.omid.library.adcolony.p045d.C4847e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class AdSessionContext {

    /* renamed from: a */
    private final Partner f21634a;

    /* renamed from: b */
    private final WebView f21635b;

    /* renamed from: c */
    private final List<VerificationScriptResource> f21636c;

    /* renamed from: d */
    private final Map<String, VerificationScriptResource> f21637d = new HashMap();

    /* renamed from: e */
    private final String f21638e;

    /* renamed from: f */
    private final String f21639f;

    /* renamed from: g */
    private final String f21640g;

    /* renamed from: h */
    private final AdSessionContextType f21641h;

    private AdSessionContext(Partner partner, WebView webView, String str, List<VerificationScriptResource> list, String str2, String str3, AdSessionContextType adSessionContextType) {
        ArrayList arrayList = new ArrayList();
        this.f21636c = arrayList;
        this.f21634a = partner;
        this.f21635b = webView;
        this.f21638e = str;
        this.f21641h = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            for (VerificationScriptResource put : list) {
                String uuid = UUID.randomUUID().toString();
                this.f21637d.put(uuid, put);
            }
        }
        this.f21640g = str2;
        this.f21639f = str3;
    }

    public static AdSessionContext createHtmlAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        C4847e.m22345a((Object) partner, "Partner is null");
        C4847e.m22345a((Object) webView, "WebView is null");
        if (str2 != null) {
            C4847e.m22346a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, webView, (String) null, (List<VerificationScriptResource>) null, str, str2, AdSessionContextType.HTML);
    }

    public static AdSessionContext createJavascriptAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        C4847e.m22345a((Object) partner, "Partner is null");
        C4847e.m22345a((Object) webView, "WebView is null");
        if (str2 != null) {
            C4847e.m22346a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, webView, (String) null, (List<VerificationScriptResource>) null, str, str2, AdSessionContextType.JAVASCRIPT);
    }

    public static AdSessionContext createNativeAdSessionContext(Partner partner, String str, List<VerificationScriptResource> list, String str2, String str3) {
        C4847e.m22345a((Object) partner, "Partner is null");
        C4847e.m22345a((Object) str, "OM SDK JS script content is null");
        C4847e.m22345a((Object) list, "VerificationScriptResources is null");
        if (str3 != null) {
            C4847e.m22346a(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, (WebView) null, str, list, str2, str3, AdSessionContextType.NATIVE);
    }

    public AdSessionContextType getAdSessionContextType() {
        return this.f21641h;
    }

    public String getContentUrl() {
        return this.f21640g;
    }

    public String getCustomReferenceData() {
        return this.f21639f;
    }

    public Map<String, VerificationScriptResource> getInjectedResourcesMap() {
        return Collections.unmodifiableMap(this.f21637d);
    }

    public String getOmidJsScriptContent() {
        return this.f21638e;
    }

    public Partner getPartner() {
        return this.f21634a;
    }

    public List<VerificationScriptResource> getVerificationScriptResources() {
        return Collections.unmodifiableList(this.f21636c);
    }

    public WebView getWebView() {
        return this.f21635b;
    }
}
