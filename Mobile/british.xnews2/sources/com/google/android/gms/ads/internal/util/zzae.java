package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C7728gq;
import com.google.android.gms.internal.ads.av0;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.xt0;
import java.io.InputStream;
import java.util.Map;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class zzae {
    private zzae() {
    }

    /* synthetic */ zzae(zzad zzad) {
    }

    public static zzae zzt(int i) {
        return i >= 28 ? new zzac() : i >= 26 ? new zzaa() : i >= 24 ? new zzz() : i >= 21 ? new zzy() : i >= 19 ? new zzx() : i >= 18 ? new zzw() : i >= 17 ? new zzv() : new zzae();
    }

    public static final boolean zzu() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public int zza(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public int zzb(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public Drawable zzc(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public String zzd(Context context) {
        return "";
    }

    public void zze(Context context) {
    }

    public boolean zzf(Context context, WebSettings webSettings) {
        zzcf.zza(context, new zzu(context, webSettings));
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public int zzg() {
        return 5;
    }

    public long zzh() {
        return -1;
    }

    public boolean zzi(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public ViewGroup.LayoutParams zzj() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public int zzk() {
        return 1;
    }

    public CookieManager zzl(Context context) {
        if (zzu()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            co0.zzh("Failed to obtain CookieManager.", th);
            zzt.zzo().mo18592s(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzm(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public eu0 zzn(xt0 xt0, C7728gq gqVar, boolean z) {
        return new av0(xt0, gqVar, z);
    }

    public boolean zzo(Activity activity, Configuration configuration) {
        return false;
    }

    public int zzq(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public void zzr(Activity activity) {
    }
}
