package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e10 {

    /* renamed from: a */
    private final List<b10> f20270a = new LinkedList();

    /* renamed from: b */
    private final Map<String, String> f20271b;

    /* renamed from: c */
    private final Object f20272c;

    public e10(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f20271b = linkedHashMap;
        this.f20272c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    /* renamed from: f */
    public static final b10 m20393f() {
        return new b10(zzt.zzA().elapsedRealtime(), (String) null, (b10) null);
    }

    /* renamed from: a */
    public final d10 mo18240a() {
        d10 d10;
        boolean booleanValue = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f20272c) {
            for (b10 next : this.f20270a) {
                long a = next.mo18105a();
                String c = next.mo18107c();
                b10 b = next.mo18106b();
                if (b != null && a > 0) {
                    sb.append(c);
                    sb.append('.');
                    sb.append(a - b.mo18105a());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(b.mo18105a()))) {
                            hashMap.put(Long.valueOf(b.mo18105a()), new StringBuilder(c));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(b.mo18105a()));
                            sb2.append('+');
                            sb2.append(c);
                        }
                    }
                }
            }
            this.f20270a.clear();
            String str = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(zzt.zzA().currentTimeMillis() + (((Long) entry.getKey()).longValue() - zzt.zzA().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            d10 = new d10(sb.toString(), str);
        }
        return d10;
    }

    /* renamed from: b */
    public final Map<String, String> mo18241b() {
        Map<String, String> map;
        synchronized (this.f20272c) {
            zzt.zzo().mo18581f();
            map = this.f20271b;
        }
        return map;
    }

    /* renamed from: c */
    public final void mo18242c(e10 e10) {
        synchronized (this.f20272c) {
        }
    }

    /* renamed from: d */
    public final void mo18243d(String str, String str2) {
        u00 f;
        if (!TextUtils.isEmpty(str2) && (f = zzt.zzo().mo18581f()) != null) {
            synchronized (this.f20272c) {
                a10 a = f.mo18865a(str);
                Map<String, String> map = this.f20271b;
                map.put(str, a.mo30285a(map.get(str), str2));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo18244e(b10 b10, long j, String... strArr) {
        synchronized (this.f20272c) {
            for (int i = 0; i <= 0; i++) {
                this.f20270a.add(new b10(j, strArr[i], b10));
            }
        }
        return true;
    }
}
