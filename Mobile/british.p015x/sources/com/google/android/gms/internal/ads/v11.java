package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v11 implements e11 {

    /* renamed from: a */
    private final CookieManager f40235a;

    public v11(Context context) {
        this.f40235a = zzt.zzq().zzl(context);
    }

    /* renamed from: a */
    public final void mo31442a(Map<String, String> map) {
        String str;
        if (this.f40235a != null) {
            if (map.get("clear") != null) {
                String str2 = (String) C8311wv.m39277c().mo18570b(p00.f36848C0);
                String cookie = this.f40235a.getCookie(str2);
                if (cookie != null) {
                    List<String> f = k43.m33841c(m33.m34676b(';')).mo33029f(cookie);
                    int i = 0;
                    while (i < f.size()) {
                        CookieManager cookieManager = this.f40235a;
                        Iterator<String> it = k43.m33841c(m33.m34676b('=')).mo33028d(f.get(i)).iterator();
                        Objects.requireNonNull(it);
                        if (it.hasNext()) {
                            String valueOf = String.valueOf(it.next());
                            String valueOf2 = String.valueOf((String) C8311wv.m39277c().mo18570b(p00.f37193r0));
                            if (valueOf2.length() != 0) {
                                str = valueOf.concat(valueOf2);
                            } else {
                                str = new String(valueOf);
                            }
                            cookieManager.setCookie(str2, str);
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder(91);
                            sb.append("position (0) must be less than the number of elements that remained (");
                            sb.append(0);
                            sb.append(")");
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                    }
                    return;
                }
                return;
            }
            String str3 = map.get("cookie");
            if (!TextUtils.isEmpty(str3)) {
                this.f40235a.setCookie((String) C8311wv.m39277c().mo18570b(p00.f36848C0), str3);
            }
        }
    }
}
