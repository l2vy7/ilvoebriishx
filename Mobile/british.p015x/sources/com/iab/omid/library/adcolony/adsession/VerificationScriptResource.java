package com.iab.omid.library.adcolony.adsession;

import com.iab.omid.library.adcolony.p045d.C4847e;
import java.net.URL;

public final class VerificationScriptResource {

    /* renamed from: a */
    private final String f21655a;

    /* renamed from: b */
    private final URL f21656b;

    /* renamed from: c */
    private final String f21657c;

    private VerificationScriptResource(String str, URL url, String str2) {
        this.f21655a = str;
        this.f21656b = url;
        this.f21657c = str2;
    }

    public static VerificationScriptResource createVerificationScriptResourceWithParameters(String str, URL url, String str2) {
        C4847e.m22347a(str, "VendorKey is null or empty");
        C4847e.m22345a((Object) url, "ResourceURL is null");
        C4847e.m22347a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C4847e.m22345a((Object) url, "ResourceURL is null");
        return new VerificationScriptResource((String) null, url, (String) null);
    }

    public URL getResourceUrl() {
        return this.f21656b;
    }

    public String getVendorKey() {
        return this.f21655a;
    }

    public String getVerificationParameters() {
        return this.f21657c;
    }
}
