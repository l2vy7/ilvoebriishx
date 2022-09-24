package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.p051d.C4893b;
import com.iab.omid.library.ironsrc.p051d.C4897e;
import org.json.JSONObject;

public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z) {
        this.creativeType = creativeType2;
        this.impressionType = impressionType2;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z) {
        C4897e.m22566a((Object) creativeType2, "CreativeType is null");
        C4897e.m22566a((Object) impressionType2, "ImpressionType is null");
        C4897e.m22566a((Object) owner, "Impression owner is null");
        C4897e.m22564a(owner, creativeType2, impressionType2);
        return new AdSessionConfiguration(creativeType2, impressionType2, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C4893b.m22550a(jSONObject, "impressionOwner", this.impressionOwner);
        C4893b.m22550a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C4893b.m22550a(jSONObject, "creativeType", this.creativeType);
        C4893b.m22550a(jSONObject, "impressionType", this.impressionType);
        C4893b.m22550a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
