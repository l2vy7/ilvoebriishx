package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.a7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C7493a7 extends C8215u5<String> {

    /* renamed from: n */
    private final Object f29545n = new Object();

    /* renamed from: o */
    private final C8394z5<String> f29546o;

    public C7493a7(int i, String str, C8394z5<String> z5Var, C8358y5 y5Var) {
        super(i, str, y5Var);
        this.f29546o = z5Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C7492a6<String> mo28553a(C8074q5 q5Var) {
        String str;
        try {
            byte[] bArr = q5Var.f37863b;
            Map<String, String> map = q5Var.f37864c;
            String str2 = C6540C.ISO88591_NAME;
            if (map != null) {
                String str3 = map.get(RtspHeaders.CONTENT_TYPE);
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i = 1;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        String[] split2 = split[i].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(q5Var.f37863b);
        }
        return C7492a6.m30246b(str, C8145s6.m37330b(q5Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28548c(String str) {
        C8394z5<String> z5Var;
        synchronized (this.f29545n) {
            z5Var = this.f29546o;
        }
        z5Var.zza(str);
    }
}
