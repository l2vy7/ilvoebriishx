package com.google.ads.interactivemedia.p039v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.webkit.WebView;
import com.google.ads.interactivemedia.p039v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p039v3.impl.data.C3779as;
import com.google.ads.interactivemedia.p039v3.impl.data.CompanionData;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dk */
/* compiled from: IMASDK */
public final class C3937dk extends WebView {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C3937dk(Context context, C3958ee eeVar, CompanionData companionData, List<CompanionAdSlot.ClickListener> list) {
        super(context);
        if (Build.VERSION.SDK_INT >= 21) {
            getSettings().setJavaScriptEnabled(true);
        }
        getSettings().setSupportMultipleWindows(true);
        setWebChromeClient(new C3936dj(context, eeVar, list));
        if (companionData.type() == C3779as.Html) {
            loadData(Base64.encodeToString(companionData.src().getBytes(), 1), "text/html", "base64");
        } else if (companionData.type() == C3779as.IFrame) {
            loadUrl(companionData.src());
        } else {
            String valueOf = String.valueOf(companionData.type());
            StringBuilder sb = new StringBuilder(valueOf.length() + 51);
            sb.append("Companion type ");
            sb.append(valueOf);
            sb.append(" is not valid for a CompanionWebView");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
