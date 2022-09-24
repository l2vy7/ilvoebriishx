package com.facebook.internal;

import android.net.Uri;
import com.facebook.internal.C3528o;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* renamed from: com.facebook.internal.e0 */
/* compiled from: UrlRedirectCache */
class C3479e0 {

    /* renamed from: a */
    static final String f13053a = "e0";

    /* renamed from: b */
    private static final String f13054b;

    /* renamed from: c */
    private static C3528o f13055c;

    static {
        String simpleName = C3479e0.class.getSimpleName();
        f13054b = simpleName + "_Redirect";
    }

    C3479e0() {
    }

    /* renamed from: a */
    static void m11587a(Uri uri, Uri uri2) {
        if (uri != null && uri2 != null) {
            OutputStream outputStream = null;
            try {
                outputStream = m11588b().mo12022j(uri.toString(), f13054b);
                outputStream.write(uri2.toString().getBytes());
            } catch (IOException unused) {
            } catch (Throwable th) {
                C3481f0.m11630h(outputStream);
                throw th;
            }
            C3481f0.m11630h(outputStream);
        }
    }

    /* renamed from: b */
    static synchronized C3528o m11588b() throws IOException {
        C3528o oVar;
        synchronized (C3479e0.class) {
            if (f13055c == null) {
                f13055c = new C3528o(f13053a, new C3528o.C3537g());
            }
            oVar = f13055c;
        }
        return oVar;
    }

    /* renamed from: c */
    static Uri m11589c(Uri uri) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        Throwable th;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        try {
            C3528o b = m11588b();
            inputStreamReader = null;
            boolean z = false;
            while (true) {
                try {
                    InputStream g = b.mo12019g(uri2, f13054b);
                    if (g == null) {
                        break;
                    }
                    z = true;
                    inputStreamReader2 = new InputStreamReader(g);
                    try {
                        char[] cArr = new char[128];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int read = inputStreamReader2.read(cArr, 0, 128);
                            if (read <= 0) {
                                break;
                            }
                            sb.append(cArr, 0, read);
                        }
                        C3481f0.m11630h(inputStreamReader2);
                        inputStreamReader = inputStreamReader2;
                        uri2 = sb.toString();
                    } catch (IOException unused) {
                        inputStreamReader = inputStreamReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        C3481f0.m11630h(inputStreamReader2);
                        throw th;
                    }
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader2 = inputStreamReader;
                    C3481f0.m11630h(inputStreamReader2);
                    throw th;
                }
            }
            if (z) {
                Uri parse = Uri.parse(uri2);
                C3481f0.m11630h(inputStreamReader);
                return parse;
            }
        } catch (IOException unused3) {
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader2 = null;
            C3481f0.m11630h(inputStreamReader2);
            throw th;
        }
        C3481f0.m11630h(inputStreamReader);
        return null;
    }
}
