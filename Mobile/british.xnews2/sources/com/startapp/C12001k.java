package com.startapp;

import android.content.Context;
import com.startapp.C11963i7;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.startapp.k */
/* compiled from: Sta */
public class C12001k {

    /* renamed from: a */
    public final C12462z2<AnalyticsConfig> f53183a;

    public C12001k(Context context, C12462z2<AnalyticsConfig> z2Var) {
        this.f53183a = z2Var;
    }

    /* renamed from: a */
    public void mo45490a(C12021l lVar) {
        long j;
        long j2;
        List list;
        String group;
        C12021l lVar2 = lVar;
        AnalyticsConfig call = this.f53183a.call();
        if (call != null && Math.random() < call.mo46309c()) {
            StringBuilder sb = new StringBuilder();
            boolean z = lVar2.f53229c;
            sb.append("preLoading");
            sb.append('=');
            sb.append(z ? 1 : 0);
            sb.append(", ");
            if (lVar2.f53230d) {
                boolean z2 = lVar2.f53232f;
                sb.append("appPresent");
                sb.append('=');
                sb.append(z2 ? 1 : 0);
                sb.append(", ");
            }
            C12021l.m52546a(sb);
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            List<String> b = call.mo46308b();
            C12021l.m52547a(sb, "adId", lVar2.f53227a, true);
            long j3 = lVar2.f53228b.f53102d;
            sb.append(TtmlNode.START);
            sb.append('=');
            sb.append(j3);
            sb.append(", ");
            Map<String, List<String>> map = lVar2.f53228b.f53101c;
            if (map != null && (list = map.get("Server-Timing")) != null) {
                Pattern pattern = C12021l.f53226m;
                if (pattern == null) {
                    pattern = Pattern.compile("^total;dur=(\\d+(\\.\\d*)?)$");
                    C12021l.f53226m = pattern;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Matcher matcher = pattern.matcher((String) it.next());
                    if (matcher.matches() && (group = matcher.group(1)) != null) {
                        j = (long) (Double.parseDouble(group) * 1000000.0d);
                        break;
                    }
                }
            }
            j = 0;
            if (j > 0) {
                C12021l.m52547a(sb, "serverTotal", C12021l.m52545a(j), false);
            }
            C11963i7.C11964a aVar = lVar2.f53228b;
            String str = sb2;
            C12021l.m52547a(sb, "network", C12021l.m52545a((aVar.f53104f - aVar.f53103e) - j), false);
            long j4 = lVar2.f53233g;
            if (j4 > 0) {
                C12021l.m52547a(sb, "parsing", C12021l.m52545a(j4 - lVar2.f53228b.f53104f), false);
                if (lVar2.f53229c) {
                    long j5 = lVar2.f53234h;
                    if (j5 > 0) {
                        C12021l.m52547a(sb, "beforeLoad", C12021l.m52545a(j5 - lVar2.f53233g), false);
                        if (lVar2.f53231e) {
                            sb.append("preLoadingSkipped");
                            sb.append('=');
                            sb.append(1);
                            sb.append(", ");
                            j2 = lVar2.f53234h;
                        } else {
                            long j6 = lVar2.f53235i;
                            if (j6 > 0) {
                                C12021l.m52547a(sb, "init", C12021l.m52545a(j6 - lVar2.f53234h), false);
                                C12021l.m52547a(sb, "loading", C12021l.m52545a(lVar2.f53236j - lVar2.f53235i), false);
                                boolean z3 = lVar2.f53238l;
                                sb.append("pageFinished");
                                sb.append('=');
                                sb.append(z3 ? 1 : 0);
                                sb.append(", ");
                                j2 = lVar2.f53236j;
                            } else {
                                sb.append("error");
                                sb.append('=');
                                sb.append((long) lVar2.f53237k);
                                sb.append(", ");
                                j2 = lVar2.f53234h;
                            }
                        }
                    }
                }
                j2 = lVar2.f53233g;
            } else {
                j2 = lVar2.f53228b.f53104f;
            }
            C12021l.m52547a(sb, "total", C12021l.m52545a(j2 - lVar2.f53228b.f53103e), false);
            Map<String, List<String>> map2 = lVar2.f53228b.f53101c;
            if (!(map2 == null || b == null)) {
                sb.append("headers");
                sb.append("={");
                for (Map.Entry next : map2.entrySet()) {
                    if (b.contains(next.getKey()) && next.getValue() != null) {
                        sb.append((String) next.getKey());
                        sb.append("=[");
                        for (String a : (List) next.getValue()) {
                            C12021l.m52547a(sb, (String) null, a, true);
                        }
                        C12021l.m52546a(sb);
                        sb.append(']');
                        sb.append(", ");
                    }
                }
                C12021l.m52546a(sb);
                sb.append("}");
                sb.append(", ");
            }
            C12021l.m52546a(sb);
            String sb3 = sb.toString();
            C5004d4 d4Var = new C5004d4(C11882e4.f52885d);
            d4Var.f22126d = "ADM";
            d4Var.f22131i = str;
            d4Var.f22127e = sb3;
            d4Var.mo20661a();
        }
    }
}
