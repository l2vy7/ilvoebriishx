package com.startapp;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.C6540C;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.startapp.p6 */
/* compiled from: Sta */
public class C12127p6 extends WebViewClient {
    private static final String LOG_TAG = C12127p6.class.getSimpleName();
    private static final String MRAID_JS = "mraid.js";
    private static final String MRAID_PREFIX = "mraid://";
    private C11902f6 controller;
    private boolean isMraidInjected = false;

    public C12127p6(C11902f6 f6Var) {
        this.controller = f6Var;
    }

    @TargetApi(11)
    private WebResourceResponse createMraidInjectionResponse() {
        StringBuilder a = C12458z0.m53804a("javascript:");
        a.append(C11921g6.m52343a());
        return new WebResourceResponse("text/javascript", C6540C.UTF8_NAME, new ByteArrayInputStream(a.toString().getBytes()));
    }

    public boolean invokeMraidMethod(String str) {
        Class<C11902f6> cls = C11902f6.class;
        String[] strArr = {"close", "resize"};
        String[] strArr2 = {"createCalendarEvent", "expand", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "playVideo", "storePicture", "useCustomClose"};
        String[] strArr3 = {"setOrientationProperties", "setResizeProperties"};
        try {
            Map<String, String> a = C12074n6.m52624a(str);
            String str2 = a.get("command");
            if (Arrays.asList(strArr).contains(str2)) {
                cls.getDeclaredMethod(str2, new Class[0]).invoke(this.controller, new Object[0]);
            } else if (Arrays.asList(strArr2).contains(str2)) {
                Method declaredMethod = cls.getDeclaredMethod(str2, new Class[]{String.class});
                char c = 65535;
                int hashCode = str2.hashCode();
                String str3 = "useCustomClose";
                if (hashCode != -733616544) {
                    if (hashCode == 1614272768) {
                        if (str2.equals(str3)) {
                            c = 1;
                        }
                    }
                } else if (str2.equals("createCalendarEvent")) {
                    c = 0;
                }
                if (c == 0) {
                    str3 = "eventJSON";
                } else if (c != 1) {
                    str3 = "url";
                }
                declaredMethod.invoke(this.controller, new Object[]{a.get(str3)});
            } else if (Arrays.asList(strArr3).contains(str2)) {
                cls.getDeclaredMethod(str2, new Class[]{Map.class}).invoke(this.controller, new Object[]{a});
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isMraidUrl(String str) {
        return str != null && str.startsWith(MRAID_PREFIX);
    }

    public boolean matchesInjectionUrl(String str) {
        try {
            return MRAID_JS.equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment());
        } catch (Exception unused) {
            return false;
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (this.isMraidInjected || !matchesInjectionUrl(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        this.isMraidInjected = true;
        return createMraidInjectionResponse();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null || C5015nb.m22929b(webView.getContext(), str)) {
            return true;
        }
        if (isMraidUrl(str)) {
            return invokeMraidMethod(str);
        }
        return this.controller.open(str);
    }
}
