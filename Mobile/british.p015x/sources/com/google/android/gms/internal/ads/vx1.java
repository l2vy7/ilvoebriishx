package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p193c5.C6520c;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vx1 {

    /* renamed from: a */
    private final Context f40575a;

    /* renamed from: b */
    private final ApplicationInfo f40576b;

    /* renamed from: c */
    private final int f40577c;

    /* renamed from: d */
    private final int f40578d;

    /* renamed from: e */
    private String f40579e = "";

    public vx1(Context context) {
        this.f40575a = context;
        this.f40576b = context.getApplicationInfo();
        this.f40577c = ((Integer) C8311wv.m39277c().mo18570b(p00.f36942N6)).intValue();
        this.f40578d = ((Integer) C8311wv.m39277c().mo18570b(p00.f36950O6)).intValue();
    }

    /* renamed from: a */
    public final JSONObject mo35510a() throws JSONException {
        Drawable drawable;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MediationMetaData.KEY_NAME, C6520c.m28321a(this.f40575a).mo24353d(this.f40576b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f40576b.packageName);
        zzt.zzp();
        jSONObject.put("adMobAppId", com.google.android.gms.ads.internal.util.zzt.zzv(this.f40575a));
        if (this.f40579e.isEmpty()) {
            try {
                drawable = (Drawable) C6520c.m28321a(this.f40575a).mo24354e(this.f40576b.packageName).f24211b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                str = "";
            } else {
                drawable.setBounds(0, 0, this.f40577c, this.f40578d);
                Bitmap createBitmap = Bitmap.createBitmap(this.f40577c, this.f40578d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f40579e = str;
        }
        if (!this.f40579e.isEmpty()) {
            jSONObject.put("icon", this.f40579e);
            jSONObject.put("iconWidthPx", this.f40577c);
            jSONObject.put("iconHeightPx", this.f40578d);
        }
        return jSONObject;
    }
}
