package p076f3;

import com.facebook.appevents.C3392c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.a */
/* compiled from: EventDeactivationManager */
public final class C5261a {

    /* renamed from: a */
    private static boolean f23276a = false;

    /* renamed from: b */
    private static final List<C5262a> f23277b = new ArrayList();

    /* renamed from: c */
    private static final Set<String> f23278c = new HashSet();

    /* renamed from: f3.a$a */
    /* compiled from: EventDeactivationManager */
    static class C5262a {

        /* renamed from: a */
        String f23279a;

        /* renamed from: b */
        List<String> f23280b;

        C5262a(String str, List<String> list) {
            this.f23279a = str;
            this.f23280b = list;
        }
    }

    /* renamed from: a */
    public static void m23776a() {
        f23276a = true;
        m23777b();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m23777b() {
        /*
            java.lang.Class<f3.a> r0 = p076f3.C5261a.class
            monitor-enter(r0)
            java.lang.String r1 = com.facebook.C3642m.m12280f()     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            r2 = 0
            com.facebook.internal.m r1 = com.facebook.internal.C3522n.m11809o(r1, r2)     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)
            return
        L_0x0010:
            java.lang.String r1 = r1.mo12004i()     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            if (r2 != 0) goto L_0x0069
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            java.util.List<f3.a$a> r1 = f23277b     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            r1.clear()     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            java.util.Iterator r1 = r2.keys()     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
        L_0x0028:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            if (r3 == 0) goto L_0x0069
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            if (r4 == 0) goto L_0x0028
            java.lang.String r5 = "is_deprecated_event"
            boolean r5 = r4.optBoolean(r5)     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            if (r5 == 0) goto L_0x0048
            java.util.Set<java.lang.String> r4 = f23278c     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            r4.add(r3)     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            goto L_0x0028
        L_0x0048:
            java.lang.String r5 = "deprecated_param"
            org.json.JSONArray r4 = r4.optJSONArray(r5)     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            f3.a$a r5 = new f3.a$a     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            r6.<init>()     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            r5.<init>(r3, r6)     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            if (r4 == 0) goto L_0x0060
            java.util.List r3 = com.facebook.internal.C3481f0.m11636k(r4)     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            r5.f23280b = r3     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
        L_0x0060:
            java.util.List<f3.a$a> r3 = f23277b     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            r3.add(r5)     // Catch:{ Exception -> 0x0069, all -> 0x0066 }
            goto L_0x0028
        L_0x0066:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0069:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p076f3.C5261a.m23777b():void");
    }

    /* renamed from: c */
    public static void m23778c(Map<String, String> map, String str) {
        if (f23276a) {
            ArrayList<String> arrayList = new ArrayList<>(map.keySet());
            for (C5262a aVar : new ArrayList(f23277b)) {
                if (aVar.f23279a.equals(str)) {
                    for (String str2 : arrayList) {
                        if (aVar.f23280b.contains(str2)) {
                            map.remove(str2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public static void m23779d(List<C3392c> list) {
        if (f23276a) {
            Iterator<C3392c> it = list.iterator();
            while (it.hasNext()) {
                if (f23278c.contains(it.next().mo11814e())) {
                    it.remove();
                }
            }
        }
    }
}
