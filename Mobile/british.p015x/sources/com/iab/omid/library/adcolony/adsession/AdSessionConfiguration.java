package com.iab.omid.library.adcolony.adsession;

import com.iab.omid.library.adcolony.p045d.C4843b;
import com.iab.omid.library.adcolony.p045d.C4847e;
import org.json.JSONObject;

public class AdSessionConfiguration {

    /* renamed from: a */
    private final Owner f21629a;

    /* renamed from: b */
    private final Owner f21630b;

    /* renamed from: c */
    private final boolean f21631c;

    /* renamed from: d */
    private final CreativeType f21632d;

    /* renamed from: e */
    private final ImpressionType f21633e;

    private AdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        this.f21632d = creativeType;
        this.f21633e = impressionType;
        this.f21629a = owner;
        if (owner2 == null) {
            this.f21630b = Owner.NONE;
        } else {
            this.f21630b = owner2;
        }
        this.f21631c = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        C4847e.m22345a((Object) creativeType, "CreativeType is null");
        C4847e.m22345a((Object) impressionType, "ImpressionType is null");
        C4847e.m22345a((Object) owner, "Impression owner is null");
        C4847e.m22343a(owner, creativeType, impressionType);
        return new AdSessionConfiguration(creativeType, impressionType, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.f21629a;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.f21630b;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C4843b.m22329a(jSONObject, "impressionOwner", this.f21629a);
        C4843b.m22329a(jSONObject, "mediaEventsOwner", this.f21630b);
        C4843b.m22329a(jSONObject, "creativeType", this.f21632d);
        C4843b.m22329a(jSONObject, "impressionType", this.f21633e);
        C4843b.m22329a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f21631c));
        return jSONObject;
    }
}
