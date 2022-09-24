package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.j */
/* compiled from: FacebookWebFallbackDialog */
public class C3509j extends C3494h0 {

    /* renamed from: q */
    private static final String f13132q = C3509j.class.getName();

    /* renamed from: p */
    private boolean f13133p;

    /* renamed from: com.facebook.internal.j$a */
    /* compiled from: FacebookWebFallbackDialog */
    class C3510a implements Runnable {
        C3510a() {
        }

        public void run() {
            C3509j.super.cancel();
        }
    }

    private C3509j(Context context, String str, String str2) {
        super(context, str);
        mo11958v(str2);
    }

    /* renamed from: A */
    public static C3509j m11752A(Context context, String str, String str2) {
        C3494h0.m11708n(context);
        return new C3509j(context, str, str2);
    }

    public void cancel() {
        WebView m = mo11944m();
        if (!mo11953p() || mo11945o() || m == null || !m.isShown()) {
            super.cancel();
        } else if (!this.f13133p) {
            this.f13133p = true;
            m.loadUrl("javascript:" + "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new C3510a(), 1500);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Bundle mo11954r(String str) {
        Bundle Y = C3481f0.m11614Y(Uri.parse(str).getQuery());
        String string = Y.getString("bridge_args");
        Y.remove("bridge_args");
        if (!C3481f0.m11604O(string)) {
            try {
                Y.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C3464c.m11556a(new JSONObject(string)));
            } catch (JSONException e) {
                C3481f0.m11610U(f13132q, "Unable to parse bridge_args JSON", e);
            }
        }
        String string2 = Y.getString("method_results");
        Y.remove("method_results");
        if (!C3481f0.m11604O(string2)) {
            if (C3481f0.m11604O(string2)) {
                string2 = "{}";
            }
            try {
                Y.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C3464c.m11556a(new JSONObject(string2)));
            } catch (JSONException e2) {
                C3481f0.m11610U(f13132q, "Unable to parse bridge_args JSON", e2);
            }
        }
        Y.remove(MediationMetaData.KEY_VERSION);
        Y.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C3563z.m11929u());
        return Y;
    }
}
