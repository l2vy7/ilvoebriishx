package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.p045d.C4845c;
import com.iab.omid.library.adcolony.p045d.C4847e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f21676a;

    /* renamed from: b */
    private final Float f21677b;

    /* renamed from: c */
    private final boolean f21678c;

    /* renamed from: d */
    private final Position f21679d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f21676a = z;
        this.f21677b = f;
        this.f21678c = z2;
        this.f21679d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4847e.m22345a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4847e.m22345a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo20101a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f21676a);
            if (this.f21676a) {
                jSONObject.put("skipOffset", this.f21677b);
            }
            jSONObject.put("autoPlay", this.f21678c);
            jSONObject.put("position", this.f21679d);
        } catch (JSONException e) {
            C4845c.m22340a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f21679d;
    }

    public Float getSkipOffset() {
        return this.f21677b;
    }

    public boolean isAutoPlay() {
        return this.f21678c;
    }

    public boolean isSkippable() {
        return this.f21676a;
    }
}
