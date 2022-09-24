package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C7046R;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sf0 extends vf0 {

    /* renamed from: c */
    private final Map<String, String> f38961c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f38962d;

    public sf0(xt0 xt0, Map<String, String> map) {
        super(xt0, "storePicture");
        this.f38961c = map;
        this.f38962d = xt0.zzk();
    }

    /* renamed from: i */
    public final void mo34702i() {
        if (this.f38962d == null) {
            mo35419c("Activity context is not available");
            return;
        }
        zzt.zzp();
        if (!new C8387yz(this.f38962d).mo35983c()) {
            mo35419c("Feature is not supported by the device.");
            return;
        }
        String str = this.f38961c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            mo35419c("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            mo35419c(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzt.zzp();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources d = zzt.zzo().mo18580d();
                zzt.zzp();
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f38962d);
                builder.setTitle(d != null ? d.getString(C7046R.string.f27780s1) : "Save image");
                builder.setMessage(d != null ? d.getString(C7046R.string.f27781s2) : "Allow Ad to store image in Picture gallery?");
                builder.setPositiveButton(d != null ? d.getString(C7046R.string.f27782s3) : RtspHeaders.ACCEPT, new qf0(this, str, lastPathSegment));
                builder.setNegativeButton(d != null ? d.getString(C7046R.string.f27783s4) : "Decline", new rf0(this));
                builder.create().show();
                return;
            }
            String valueOf2 = String.valueOf(lastPathSegment);
            mo35419c(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
        }
    }
}
