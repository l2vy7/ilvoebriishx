package com.adcolony.sdk;

import org.json.JSONObject;

public class AdColonyAdOptions {

    /* renamed from: a */
    boolean f10502a;

    /* renamed from: b */
    boolean f10503b;

    /* renamed from: c */
    AdColonyUserMetadata f10504c;

    /* renamed from: d */
    JSONObject f10505d = C2976x.m10319b();

    public AdColonyAdOptions enableConfirmationDialog(boolean z) {
        this.f10502a = z;
        C2976x.m10325b(this.f10505d, "confirmation_enabled", true);
        return this;
    }

    public AdColonyAdOptions enableResultsDialog(boolean z) {
        this.f10503b = z;
        C2976x.m10325b(this.f10505d, "results_enabled", true);
        return this;
    }

    public Object getOption(String str) {
        return C2976x.m10336h(this.f10505d, str);
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f10504c;
    }

    public AdColonyAdOptions setOption(String str, boolean z) {
        if (C2916s0.m10083e(str)) {
            C2976x.m10325b(this.f10505d, str, z);
        }
        return this;
    }

    @Deprecated
    public AdColonyAdOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f10504c = adColonyUserMetadata;
        C2976x.m10315a(this.f10505d, "user_metadata", adColonyUserMetadata.f10566b);
        return this;
    }

    public AdColonyAdOptions setOption(String str, double d) {
        if (C2916s0.m10083e(str)) {
            C2976x.m10312a(this.f10505d, str, d);
        }
        return this;
    }

    public AdColonyAdOptions setOption(String str, String str2) {
        if (str != null) {
            C2976x.m10313a(this.f10505d, str, str2);
        }
        return this;
    }
}
