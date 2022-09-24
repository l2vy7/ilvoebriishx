package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class o60 implements p33 {

    /* renamed from: a */
    public final /* synthetic */ String f36292a;

    public /* synthetic */ o60(String str) {
        this.f36292a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f36292a;
        String str2 = (String) obj;
        e70<xt0> e70 = d70.f30654a;
        if (str2 != null) {
            if (d20.f30600f.mo34648e().booleanValue()) {
                String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                String host = Uri.parse(str).getHost();
                int i = 0;
                while (true) {
                    if (i < 3) {
                        if (host.endsWith(strArr[i])) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            String e = d20.f30595a.mo34648e();
            String e2 = d20.f30596b.mo34648e();
            if (!TextUtils.isEmpty(e)) {
                str = str.replace(e, str2);
            }
            if (!TextUtils.isEmpty(e2)) {
                Uri parse = Uri.parse(str);
                if (TextUtils.isEmpty(parse.getQueryParameter(e2))) {
                    return parse.buildUpon().appendQueryParameter(e2, str2).toString();
                }
            }
        }
        return str;
    }
}
