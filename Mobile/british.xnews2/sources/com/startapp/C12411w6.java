package com.startapp;

import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import com.startapp.sdk.common.SDKException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.startapp.w6 */
/* compiled from: Sta */
public class C12411w6 extends C11924g8 {

    /* renamed from: a */
    public final Set<C12429x6> f55082a = new HashSet();

    /* renamed from: a */
    public void mo45382a(String str, Object obj, boolean z, boolean z2) throws SDKException {
        if (z && obj == null) {
            throw new SDKException(str, (Throwable) null);
        } else if (obj != null && !TextUtils.isEmpty(obj.toString())) {
            try {
                C12429x6 x6Var = new C12429x6();
                x6Var.f55127a = str;
                String obj2 = obj.toString();
                if (z2) {
                    obj2 = URLEncoder.encode(obj2, C6540C.UTF8_NAME);
                }
                x6Var.f55128b = obj2;
                if (!this.f55082a.add(x6Var)) {
                    this.f55082a.remove(x6Var);
                    this.f55082a.add(x6Var);
                }
            } catch (UnsupportedEncodingException e) {
                if (z) {
                    throw new SDKException(str, e);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        for (C12429x6 next : this.f55082a) {
            if (next.f55128b != null) {
                sb.append(next.f55127a);
                sb.append('=');
                sb.append(next.f55128b);
                sb.append('&');
            } else {
                Set<String> set = next.f55129c;
                if (set != null) {
                    for (String append : set) {
                        sb.append(next.f55127a);
                        sb.append('=');
                        sb.append(append);
                        sb.append('&');
                    }
                }
            }
        }
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString().replace("+", "%20");
    }

    /* renamed from: a */
    public void mo45383a(String str, Set<String> set, boolean z, boolean z2) throws SDKException {
        if (z && set == null) {
            throw new SDKException(str, (Throwable) null);
        } else if (set != null) {
            C12429x6 x6Var = new C12429x6();
            x6Var.f55127a = str;
            HashSet hashSet = new HashSet();
            for (String next : set) {
                if (z2) {
                    try {
                        next = URLEncoder.encode(next, C6540C.UTF8_NAME);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                hashSet.add(next);
            }
            if (!z || hashSet.size() != 0) {
                x6Var.f55129c = hashSet;
                if (!this.f55082a.add(x6Var)) {
                    this.f55082a.remove(x6Var);
                    this.f55082a.add(x6Var);
                    return;
                }
                return;
            }
            throw new SDKException(str, (Throwable) null);
        }
    }
}
