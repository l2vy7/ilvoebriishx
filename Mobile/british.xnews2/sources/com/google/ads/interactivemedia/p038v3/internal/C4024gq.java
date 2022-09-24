package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gq */
/* compiled from: IMASDK */
public final class C4024gq {

    /* renamed from: a */
    private String f17332a = "googleads.g.doubleclick.net";

    /* renamed from: b */
    private String f17333b = "/pagead/ads";

    /* renamed from: c */
    private final String f17334c = "ad.doubleclick.net";

    /* renamed from: d */
    private String[] f17335d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: e */
    private final C4019gl f17336e;

    public C4024gq(C4019gl glVar) {
        this.f17336e = glVar;
    }

    /* renamed from: h */
    private final Uri m17274h(Uri uri, String str) throws C4025gr {
        Objects.requireNonNull(uri);
        try {
            if (uri.getHost().equals(this.f17334c)) {
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
                    throw new C4025gr("Parameter already exists: dc_ms");
                } catch (UnsupportedOperationException unused) {
                    throw new C4025gr("Provided Uri is not in a valid state");
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
        throw new C4025gr("Query parameter already exists: ms");
    }

    /* renamed from: a */
    public final void mo15879a(String str, String str2) {
        this.f17332a = str;
        this.f17333b = str2;
    }

    /* renamed from: b */
    public final boolean mo15880b(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            if (!uri.getHost().equals(this.f17332a) || !uri.getPath().equals(this.f17333b)) {
                return false;
            }
            return true;
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: c */
    public final boolean mo15881c(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            for (String endsWith : this.f17335d) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: d */
    public final void mo15882d(String str) {
        this.f17335d = str.split(",");
    }

    /* renamed from: e */
    public final Uri mo15883e(Uri uri, Context context) throws C4025gr {
        return m17274h(uri, this.f17336e.mo15865a(context));
    }

    /* renamed from: f */
    public final void mo15884f(MotionEvent motionEvent) {
        this.f17336e.mo15866b(motionEvent);
    }

    /* renamed from: g */
    public final Uri mo15885g(Uri uri, Context context) throws C4025gr {
        try {
            return m17274h(uri, this.f17336e.mo15867c(context, uri.getQueryParameter("ai")));
        } catch (UnsupportedOperationException unused) {
            throw new C4025gr("Provided Uri is not in a valid state");
        }
    }
}
