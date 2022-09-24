package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.ValueCallback;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.co0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzai extends QueryInfoGenerationCallback {

    /* renamed from: a */
    final /* synthetic */ String f28076a;

    /* renamed from: b */
    final /* synthetic */ TaggingLibraryJsInterface f28077b;

    zzai(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.f28077b = taggingLibraryJsInterface;
        this.f28076a = str;
    }

    public final void onFailure(String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Failed to generate query info for the tagging library, error: ".concat(valueOf);
        } else {
            str2 = new String("Failed to generate query info for the tagging library, error: ");
        }
        co0.zzj(str2);
        this.f28077b.f28063b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", new Object[]{this.f28076a, str}), (ValueCallback) null);
    }

    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f28076a);
            jSONObject.put("signal", query);
            str = String.format("window.postMessage(%1$s, '*');", new Object[]{jSONObject});
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", new Object[]{this.f28076a, queryInfo.getQuery()});
        }
        this.f28077b.f28063b.evaluateJavascript(str, (ValueCallback) null);
    }
}
