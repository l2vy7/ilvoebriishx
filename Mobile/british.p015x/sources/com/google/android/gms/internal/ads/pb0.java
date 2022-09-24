package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pb0 {

    /* renamed from: a */
    private static final Charset f37567a = Charset.forName(C6540C.UTF8_NAME);

    /* renamed from: b */
    public static final mb0<JSONObject> f37568b = new ob0();

    /* renamed from: c */
    public static final jb0<InputStream> f37569c = nb0.f35968a;

    /* renamed from: a */
    static /* synthetic */ InputStream m36045a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f37567a));
    }
}
