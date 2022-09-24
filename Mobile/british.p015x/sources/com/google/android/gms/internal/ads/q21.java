package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzaf;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q21 implements lb0<t21> {

    /* renamed from: a */
    private final Context f37839a;

    /* renamed from: b */
    private final C7580cn f37840b;

    /* renamed from: c */
    private final PowerManager f37841c;

    public q21(Context context, C7580cn cnVar) {
        this.f37839a = context;
        this.f37840b = cnVar;
        this.f37841c = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: a */
    public final JSONObject zzb(t21 t21) throws JSONException {
        JSONObject jSONObject;
        boolean z;
        Integer num;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C7689fn fnVar = t21.f39257f;
        if (fnVar == null) {
            jSONObject = new JSONObject();
        } else if (this.f37840b.mo30966d() != null) {
            boolean z2 = fnVar.f31815a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.f37840b.mo30964b()).put("activeViewJSON", this.f37840b.mo30966d()).put("timestamp", t21.f39255d).put("adFormat", this.f37840b.mo30963a()).put("hashCode", this.f37840b.mo30965c()).put("isMraid", false).put("isStopped", false).put("isPaused", t21.f39253b).put("isNative", this.f37840b.mo30967e());
            if (Build.VERSION.SDK_INT >= 20) {
                z = this.f37841c.isInteractive();
            } else {
                z = this.f37841c.isScreenOn();
            }
            put.put("isScreenOn", z).put("appMuted", zzt.zzr().zze()).put("appVolume", (double) zzt.zzr().zza()).put("deviceVolume", (double) zzaf.zzb(this.f37839a.getApplicationContext()));
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37089f4)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f37839a.getApplicationContext().getSystemService("audio");
                if (audioManager == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(audioManager.getMode());
                }
                if (num != null) {
                    jSONObject3.put("audioMode", num);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f37839a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", fnVar.f31816b).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put("top", fnVar.f31817c.top).put("bottom", fnVar.f31817c.bottom).put(TtmlNode.LEFT, fnVar.f31817c.left).put(TtmlNode.RIGHT, fnVar.f31817c.right)).put("adBox", new JSONObject().put("top", fnVar.f31818d.top).put("bottom", fnVar.f31818d.bottom).put(TtmlNode.LEFT, fnVar.f31818d.left).put(TtmlNode.RIGHT, fnVar.f31818d.right)).put("globalVisibleBox", new JSONObject().put("top", fnVar.f31819e.top).put("bottom", fnVar.f31819e.bottom).put(TtmlNode.LEFT, fnVar.f31819e.left).put(TtmlNode.RIGHT, fnVar.f31819e.right)).put("globalVisibleBoxVisible", fnVar.f31820f).put("localVisibleBox", new JSONObject().put("top", fnVar.f31821g.top).put("bottom", fnVar.f31821g.bottom).put(TtmlNode.LEFT, fnVar.f31821g.left).put(TtmlNode.RIGHT, fnVar.f31821g.right)).put("localVisibleBoxVisible", fnVar.f31822h).put("hitBox", new JSONObject().put("top", fnVar.f31823i.top).put("bottom", fnVar.f31823i.bottom).put(TtmlNode.LEFT, fnVar.f31823i.left).put(TtmlNode.RIGHT, fnVar.f31823i.right)).put("screenDensity", (double) this.f37839a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", t21.f39252a);
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37041a1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = fnVar.f31825k;
                if (list != null) {
                    for (Rect next : list) {
                        jSONArray2.put(new JSONObject().put("top", next.top).put("bottom", next.bottom).put(TtmlNode.LEFT, next.left).put(TtmlNode.RIGHT, next.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(t21.f39256e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
