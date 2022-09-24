package com.startapp.sdk.ads.video.vast;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.startapp.C12359u3;
import com.startapp.C12403w0;
import com.startapp.C12442y2;
import com.startapp.C5004d4;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.video.vast.C12257c;
import com.startapp.sdk.components.ComponentLocator;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.sdk.ads.video.vast.b */
/* compiled from: Sta */
public class C12256b implements C12257c.C12259b {

    /* renamed from: a */
    public final Context f54475a;

    /* renamed from: b */
    public final String f54476b;

    /* renamed from: c */
    public final JSONArray f54477c = new JSONArray();

    /* renamed from: d */
    public final String f54478d;

    /* renamed from: e */
    public final String f54479e;

    /* renamed from: f */
    public boolean f54480f;

    public C12256b(Context context, String str, String str2, String str3, boolean z) {
        this.f54475a = context;
        this.f54476b = str;
        this.f54478d = str2;
        this.f54479e = str3;
        this.f54480f = z;
    }

    /* renamed from: a */
    public void mo46092a(VASTErrorCodes vASTErrorCodes) {
        if (this.f54477c.length() != 0) {
            if (!this.f54480f || vASTErrorCodes == VASTErrorCodes.ErrorNone) {
                try {
                    String b = mo46093b(vASTErrorCodes);
                    if (!TextUtils.isEmpty(b)) {
                        C12359u3 k = ComponentLocator.m23305a(this.f54475a).mo21224k();
                        String str = this.f54476b;
                        k.getClass();
                        byte[] bytes = b.getBytes();
                        Map<Activity, Integer> map = C5015nb.f22145a;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.flush();
                        gZIPOutputStream.close();
                        k.mo46648a(str, (C12403w0) null, byteArrayOutputStream.toByteArray(), true, (C12442y2<String, Void>) null);
                    }
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo46093b(VASTErrorCodes vASTErrorCodes) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vastDocs", this.f54477c);
        String str = this.f54478d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        jSONObject.put("partnerResponse", str);
        String str3 = this.f54479e;
        if (str3 != null) {
            str2 = str3;
        }
        jSONObject.put("partnerName", str2);
        jSONObject.put("error", vASTErrorCodes.mo46084a());
        return jSONObject.toString();
    }
}
