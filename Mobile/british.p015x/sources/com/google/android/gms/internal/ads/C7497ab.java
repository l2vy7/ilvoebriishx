package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ab */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7497ab {

    /* renamed from: d */
    private static final String[] f29576d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a */
    private final String f29577a = "ad.doubleclick.net";

    /* renamed from: b */
    private final String[] f29578b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c */
    private final C8291wa f29579c;

    @Deprecated
    public C7497ab(C8291wa waVar) {
        this.f29579c = waVar;
    }

    /* renamed from: g */
    private final Uri m30263g(Uri uri, String str) throws C7533bb {
        Objects.requireNonNull(uri);
        try {
            if (uri.getHost().equals(this.f29577a)) {
                try {
                    if (!uri.toString().contains("dc_ms=")) {
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + str + ";" + uri2.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                    throw new C7533bb("Parameter already exists: dc_ms");
                } catch (UnsupportedOperationException unused) {
                    throw new C7533bb("Provided Uri is not in a valid state");
                }
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str + "&" + uri3.substring(i2));
        }
        throw new C7533bb("Query parameter already exists: ms");
    }

    @Deprecated
    /* renamed from: a */
    public final Uri mo30329a(Uri uri, Context context, View view, Activity activity) throws C7533bb {
        try {
            return m30263g(uri, this.f29579c.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C7533bb("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    /* renamed from: b */
    public final Uri mo30330b(Uri uri, Context context) throws C7533bb {
        return m30263g(uri, this.f29579c.zzg(context));
    }

    @Deprecated
    /* renamed from: c */
    public final C8291wa mo30331c() {
        return this.f29579c;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo30332d(MotionEvent motionEvent) {
        this.f29579c.zzk(motionEvent);
    }

    /* renamed from: e */
    public final boolean mo30333e(Uri uri) {
        if (mo30334f(uri)) {
            String[] strArr = f29576d;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30334f(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f29578b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
