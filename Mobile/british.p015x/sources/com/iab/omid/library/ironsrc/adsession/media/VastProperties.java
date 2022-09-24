package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.p051d.C4895c;
import com.iab.omid.library.ironsrc.p051d.C4897e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f21790a;

    /* renamed from: b */
    private final Float f21791b;

    /* renamed from: c */
    private final boolean f21792c;

    /* renamed from: d */
    private final Position f21793d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f21790a = z;
        this.f21791b = f;
        this.f21792c = z2;
        this.f21793d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4897e.m22566a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4897e.m22566a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public final JSONObject mo20287a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f21790a);
            if (this.f21790a) {
                jSONObject.put("skipOffset", this.f21791b);
            }
            jSONObject.put("autoPlay", this.f21792c);
            jSONObject.put("position", this.f21793d);
        } catch (JSONException e) {
            C4895c.m22561a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f21793d;
    }

    public final Float getSkipOffset() {
        return this.f21791b;
    }

    public final boolean isAutoPlay() {
        return this.f21792c;
    }

    public final boolean isSkippable() {
        return this.f21790a;
    }
}
