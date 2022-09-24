package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadata;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.r8 */
/* compiled from: Sta */
public class C12165r8 {

    /* renamed from: a */
    public final Context f54109a;

    /* renamed from: b */
    public final C12462z2<RscMetadata> f54110b;

    /* renamed from: c */
    public RscMetadata f54111c;

    /* renamed from: d */
    public List<C12372u8> f54112d;

    /* renamed from: e */
    public List<C12346t8> f54113e;

    /* renamed from: f */
    public final Map<C12120p1, Pair<Long, SoftReference<JSONObject>>> f54114f = new WeakHashMap();

    public C12165r8(Context context, C12462z2<RscMetadata> z2Var) {
        this.f54109a = context;
        this.f54110b = z2Var;
    }

    /* renamed from: a */
    public static JSONArray m52795a(C12346t8 t8Var) {
        C12120p1 p1Var = t8Var.f54766a;
        String[] strArr = p1Var.f53993c;
        Object[] objArr = p1Var.f53995e;
        if (strArr.length == objArr.length) {
            int length = strArr.length;
            if (length == 0) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(strArr[i], objArr[i]);
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            } catch (JSONException e) {
                if (t8Var.mo46641a(32)) {
                    C5004d4.m22887a((Throwable) e);
                }
            }
        } else {
            if (t8Var.mo46641a(512)) {
                C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                d4Var.f22126d = "c690e4ef5365d88b";
                d4Var.f22127e = Arrays.toString(strArr) + ", " + Arrays.toString(objArr);
                d4Var.mo20661a();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo45719a(int i) {
        RscMetadata call = this.f54110b.call();
        if (call == null || !call.mo46390d()) {
            call = null;
        }
        return (call == null || (i & call.mo46386a()) == 0) ? false : true;
    }

    /* renamed from: a */
    public static boolean m52796a(RscMetadata rscMetadata, int i) {
        return (rscMetadata == null || (rscMetadata.mo46386a() & i) == 0) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x019d, code lost:
        r9 = new java.util.LinkedList();
        r10 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01aa, code lost:
        if (r10.hasNext() != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ac, code lost:
        r11 = r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b3, code lost:
        if (r11 != null) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b6, code lost:
        r0 = r11.mo46393a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01cb, code lost:
        r14 = com.startapp.C12137q1.m52766a(m52794a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ce, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01d4, code lost:
        if ((r3.mo46387a(r11) & r4) != 0) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d8, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d9, code lost:
        if (r0 != false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01db, code lost:
        com.startapp.C5004d4.m22887a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01e0, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e6, code lost:
        if ((r3.mo46387a(r11) & r5) != 0) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01e8, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01ea, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01eb, code lost:
        if (r0 != false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ed, code lost:
        com.startapp.C5004d4.m22887a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01f0, code lost:
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f1, code lost:
        if (r14 != null) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f4, code lost:
        r0 = r11.mo46401h();
        r12 = r11.mo46396d();
        r15 = new java.util.ArrayList(java.lang.Math.min(r8.size(), java.lang.Integer.bitCount(r0)));
        r4 = r8.iterator();
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0216, code lost:
        if (r4.hasNext() != false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0218, code lost:
        r5 = (com.startapp.C12372u8) r4.next();
        r16 = 1 << r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0224, code lost:
        if ((r0 & r16) == 0) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0228, code lost:
        if ((r12 & r16) != 0) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x022a, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x022d, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x022f, code lost:
        r15.add(new android.util.Pair(r5, java.lang.Boolean.valueOf(r16)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x023b, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0245, code lost:
        if (r15.size() >= 1) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0247, code lost:
        r2 = null;
        r4 = 4;
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0253, code lost:
        if (r11.mo46403i() != null) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0255, code lost:
        r16 = r11.mo46403i().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0260, code lost:
        r16 = 300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0264, code lost:
        r17 = r11.mo46400g();
        r18 = r11.mo46395c();
        r19 = r11.mo46399f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0274, code lost:
        if (r11.mo46397e() != null) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0276, code lost:
        r20 = r11.mo46397e().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0281, code lost:
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0283, code lost:
        r9.add(new com.startapp.C12346t8(r14, r15, r16, r17, r18, r19, r20, r3.mo46387a(r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0293, code lost:
        return mo45718a(r3, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0298, code lost:
        return mo45718a(r3, (java.util.List<com.startapp.C12372u8>) null, (java.util.List<com.startapp.C12346t8>) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x029d, code lost:
        return mo45718a(r3, (java.util.List<com.startapp.C12372u8>) null, (java.util.List<com.startapp.C12346t8>) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        r0 = r3.mo46389c();
        r4 = 4;
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r0 == null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r0.length() >= 1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0 = com.startapp.C12008k5.m52529a(new android.util.JsonReader(new java.io.StringReader(m52794a(r0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        r8 = new java.util.ArrayList();
        r0 = ((java.util.ArrayList) r0).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        if (r0.hasNext() == false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r9 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        if ((r9 instanceof java.util.Map) != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        r9 = new com.startapp.C12372u8();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        r9 = (java.util.Map) r9;
        r10 = r9.get(com.google.android.exoplayer2.source.rtsp.SessionDescription.ATTR_TYPE);
        r9 = r9.get("params");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if ((r10 instanceof java.lang.Number) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        r10 = ((java.lang.Number) r10).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r10 == 1) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r10 == 2) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        if (r10 == 3) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        if (r10 == 4) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009b, code lost:
        if ((r9 instanceof java.util.List) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009d, code lost:
        r9 = (java.util.List) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
        if (r9.size() <= 0) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a5, code lost:
        r10 = com.startapp.C11882e4.m52266a(java.lang.String.valueOf(r9.get(0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b1, code lost:
        if (r10 == null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
        if (r9.size() <= 1) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b9, code lost:
        r9 = java.lang.String.valueOf(r9.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c3, code lost:
        r9 = new com.startapp.C12076n8(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cd, code lost:
        if ((r9 instanceof java.util.Map) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cf, code lost:
        r9 = (java.util.Map) r9;
        r10 = r9.get("action");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d9, code lost:
        if ((r10 instanceof java.lang.String) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00db, code lost:
        r9 = r9.get("extras");
        r11 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e8, code lost:
        if ((r9 instanceof java.util.Map) == false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ea, code lost:
        r9 = ((java.util.Map) r9).entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f8, code lost:
        if (r9.hasNext() == false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fa, code lost:
        r12 = (java.util.Map.Entry) r9.next();
        r13 = r12.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        if ((r13 instanceof java.lang.String) == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        r11.put((java.lang.String) r13, java.lang.String.valueOf(r12.getValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0116, code lost:
        r9 = new com.startapp.C12049m8((java.lang.String) r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0120, code lost:
        if ((r9 instanceof java.util.List) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0122, code lost:
        r10 = new java.util.LinkedList();
        r9 = ((java.util.List) r9).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0131, code lost:
        if (r9.hasNext() == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0133, code lost:
        r11 = r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0139, code lost:
        if ((r11 instanceof java.lang.String) == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013b, code lost:
        r11 = com.startapp.C11882e4.m52266a((java.lang.String) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0141, code lost:
        if (r11 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0143, code lost:
        r10.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014b, code lost:
        if (r10.size() <= 0) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014d, code lost:
        r9 = new com.startapp.C12110o8(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0155, code lost:
        if ((r9 instanceof java.lang.Number) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0157, code lost:
        r9 = new com.startapp.C12031l8(((java.lang.Number) r9).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0164, code lost:
        r9 = new com.startapp.C12372u8();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0169, code lost:
        r8.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0173, code lost:
        if (m52796a(r3, 1) != false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0175, code lost:
        com.startapp.C5004d4.m22887a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0179, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017a, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017f, code lost:
        if (m52796a(r3, 1) != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0181, code lost:
        com.startapp.C5004d4.m22887a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0184, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0185, code lost:
        if (r8 == null) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x018f, code lost:
        r0 = r3.mo46388b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0193, code lost:
        if (r0 == null) goto L_0x0294;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x01a6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.startapp.C12346t8> mo45717a() {
        /*
            r22 = this;
            r1 = r22
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 11
            if (r0 >= r3) goto L_0x000a
            return r2
        L_0x000a:
            com.startapp.z2<com.startapp.sdk.adsbase.remoteconfig.RscMetadata> r0 = r1.f54110b
            java.lang.Object r0 = r0.call()
            com.startapp.sdk.adsbase.remoteconfig.RscMetadata r0 = (com.startapp.sdk.adsbase.remoteconfig.RscMetadata) r0
            if (r0 == 0) goto L_0x001c
            boolean r3 = r0.mo46390d()
            if (r3 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 != 0) goto L_0x0024
            java.util.List r0 = r1.mo45718a(r2, r2, r2)
            return r0
        L_0x0024:
            monitor-enter(r22)
            com.startapp.sdk.adsbase.remoteconfig.RscMetadata r0 = r1.f54111c     // Catch:{ all -> 0x029e }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x0031
            java.util.List<com.startapp.t8> r0 = r1.f54113e     // Catch:{ all -> 0x029e }
            monitor-exit(r22)     // Catch:{ all -> 0x029e }
            return r0
        L_0x0031:
            monitor-exit(r22)     // Catch:{ all -> 0x029e }
            java.lang.String r0 = r3.mo46389c()
            r4 = 4
            r5 = 2
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0184
            int r8 = r0.length()
            if (r8 >= r7) goto L_0x0044
            goto L_0x0184
        L_0x0044:
            java.lang.String r0 = m52794a((java.lang.String) r0)     // Catch:{ all -> 0x0179 }
            android.util.JsonReader r8 = new android.util.JsonReader     // Catch:{ all -> 0x016e }
            java.io.StringReader r9 = new java.io.StringReader     // Catch:{ all -> 0x016e }
            r9.<init>(r0)     // Catch:{ all -> 0x016e }
            r8.<init>(r9)     // Catch:{ all -> 0x016e }
            java.util.List r0 = com.startapp.C12008k5.m52529a(r8)     // Catch:{ all -> 0x016e }
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0061:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0185
            java.lang.Object r9 = r0.next()
            boolean r10 = r9 instanceof java.util.Map
            if (r10 != 0) goto L_0x0076
            com.startapp.u8 r9 = new com.startapp.u8
            r9.<init>()
            goto L_0x0169
        L_0x0076:
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r10 = "type"
            java.lang.Object r10 = r9.get(r10)
            java.lang.String r11 = "params"
            java.lang.Object r9 = r9.get(r11)
            boolean r11 = r10 instanceof java.lang.Number
            if (r11 == 0) goto L_0x0164
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 == r7) goto L_0x0153
            if (r10 == r5) goto L_0x011e
            r11 = 3
            if (r10 == r11) goto L_0x00cb
            if (r10 == r4) goto L_0x0099
            goto L_0x0164
        L_0x0099:
            boolean r10 = r9 instanceof java.util.List
            if (r10 == 0) goto L_0x0164
            java.util.List r9 = (java.util.List) r9
            int r10 = r9.size()
            if (r10 <= 0) goto L_0x0164
            java.lang.Object r10 = r9.get(r6)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            com.startapp.e4 r10 = com.startapp.C11882e4.m52266a(r10)
            if (r10 == 0) goto L_0x0164
            int r11 = r9.size()
            if (r11 <= r7) goto L_0x00c2
            java.lang.Object r9 = r9.get(r7)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            goto L_0x00c3
        L_0x00c2:
            r9 = r2
        L_0x00c3:
            com.startapp.n8 r11 = new com.startapp.n8
            r11.<init>(r10, r9)
            r9 = r11
            goto L_0x0169
        L_0x00cb:
            boolean r10 = r9 instanceof java.util.Map
            if (r10 == 0) goto L_0x0164
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r10 = "action"
            java.lang.Object r10 = r9.get(r10)
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L_0x0164
            java.lang.String r11 = "extras"
            java.lang.Object r9 = r9.get(r11)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            boolean r12 = r9 instanceof java.util.Map
            if (r12 == 0) goto L_0x0116
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x00f4:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0116
            java.lang.Object r12 = r9.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            boolean r14 = r13 instanceof java.lang.String
            if (r14 == 0) goto L_0x00f4
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r11.put(r13, r12)
            goto L_0x00f4
        L_0x0116:
            com.startapp.m8 r9 = new com.startapp.m8
            java.lang.String r10 = (java.lang.String) r10
            r9.<init>(r10, r11)
            goto L_0x0169
        L_0x011e:
            boolean r10 = r9 instanceof java.util.List
            if (r10 == 0) goto L_0x0164
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x012d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0147
            java.lang.Object r11 = r9.next()
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto L_0x012d
            java.lang.String r11 = (java.lang.String) r11
            com.startapp.e4 r11 = com.startapp.C11882e4.m52266a(r11)
            if (r11 == 0) goto L_0x012d
            r10.add(r11)
            goto L_0x012d
        L_0x0147:
            int r9 = r10.size()
            if (r9 <= 0) goto L_0x0164
            com.startapp.o8 r9 = new com.startapp.o8
            r9.<init>(r10)
            goto L_0x0169
        L_0x0153:
            boolean r10 = r9 instanceof java.lang.Number
            if (r10 == 0) goto L_0x0164
            com.startapp.l8 r10 = new com.startapp.l8
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r10.<init>(r9)
            r9 = r10
            goto L_0x0169
        L_0x0164:
            com.startapp.u8 r9 = new com.startapp.u8
            r9.<init>()
        L_0x0169:
            r8.add(r9)
            goto L_0x0061
        L_0x016e:
            r0 = move-exception
            boolean r8 = m52796a(r3, r7)
            if (r8 == 0) goto L_0x0184
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
            goto L_0x0184
        L_0x0179:
            r0 = move-exception
            r8 = r0
            boolean r0 = m52796a(r3, r7)
            if (r0 == 0) goto L_0x0184
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r8)
        L_0x0184:
            r8 = r2
        L_0x0185:
            if (r8 == 0) goto L_0x0299
            int r0 = r8.size()
            if (r0 >= r7) goto L_0x018f
            goto L_0x0299
        L_0x018f:
            java.util.List r0 = r3.mo46388b()
            if (r0 == 0) goto L_0x0294
            int r9 = r0.size()
            if (r9 >= r7) goto L_0x019d
            goto L_0x0294
        L_0x019d:
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.util.Iterator r10 = r0.iterator()
        L_0x01a6:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x028f
            java.lang.Object r0 = r10.next()
            r11 = r0
            com.startapp.sdk.adsbase.remoteconfig.RscMetadataItem r11 = (com.startapp.sdk.adsbase.remoteconfig.RscMetadataItem) r11
            if (r11 != 0) goto L_0x01b6
            goto L_0x01a6
        L_0x01b6:
            java.lang.String r0 = r11.mo46393a()
            if (r0 == 0) goto L_0x01f0
            int r12 = r0.length()
            if (r12 >= r7) goto L_0x01c3
            goto L_0x01f0
        L_0x01c3:
            java.lang.String r0 = m52794a((java.lang.String) r0)     // Catch:{ all -> 0x01df }
            com.startapp.p1 r0 = com.startapp.C12137q1.m52766a(r0)     // Catch:{ all -> 0x01cd }
            r14 = r0
            goto L_0x01f1
        L_0x01cd:
            r0 = move-exception
            r12 = r0
            int r0 = r3.mo46387a(r11)
            r0 = r0 & r4
            if (r0 == 0) goto L_0x01d8
            r0 = 1
            goto L_0x01d9
        L_0x01d8:
            r0 = 0
        L_0x01d9:
            if (r0 == 0) goto L_0x01f0
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r12)
            goto L_0x01f0
        L_0x01df:
            r0 = move-exception
            r12 = r0
            int r0 = r3.mo46387a(r11)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x01ea
            r0 = 1
            goto L_0x01eb
        L_0x01ea:
            r0 = 0
        L_0x01eb:
            if (r0 == 0) goto L_0x01f0
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r12)
        L_0x01f0:
            r14 = r2
        L_0x01f1:
            if (r14 != 0) goto L_0x01f4
            goto L_0x01a6
        L_0x01f4:
            int r0 = r11.mo46401h()
            int r12 = r11.mo46396d()
            java.util.ArrayList r15 = new java.util.ArrayList
            int r13 = r8.size()
            int r4 = java.lang.Integer.bitCount(r0)
            int r4 = java.lang.Math.min(r13, r4)
            r15.<init>(r4)
            java.util.Iterator r4 = r8.iterator()
            r13 = 0
        L_0x0212:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x0241
            java.lang.Object r16 = r4.next()
            r5 = r16
            com.startapp.u8 r5 = (com.startapp.C12372u8) r5
            int r16 = r7 << r13
            r17 = r0 & r16
            if (r17 == 0) goto L_0x023b
            r16 = r12 & r16
            if (r16 == 0) goto L_0x022d
            r16 = 1
            goto L_0x022f
        L_0x022d:
            r16 = 0
        L_0x022f:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r16)
            r6.<init>(r5, r2)
            r15.add(r6)
        L_0x023b:
            int r13 = r13 + 1
            r2 = 0
            r5 = 2
            r6 = 0
            goto L_0x0212
        L_0x0241:
            int r0 = r15.size()
            if (r0 >= r7) goto L_0x024d
        L_0x0247:
            r2 = 0
            r4 = 4
            r5 = 2
            r6 = 0
            goto L_0x01a6
        L_0x024d:
            com.startapp.t8 r0 = new com.startapp.t8
            java.lang.Integer r2 = r11.mo46403i()
            if (r2 == 0) goto L_0x0260
            java.lang.Integer r2 = r11.mo46403i()
            int r2 = r2.intValue()
            r16 = r2
            goto L_0x0264
        L_0x0260:
            r2 = 300(0x12c, float:4.2E-43)
            r16 = 300(0x12c, float:4.2E-43)
        L_0x0264:
            int[] r17 = r11.mo46400g()
            java.lang.Integer r18 = r11.mo46395c()
            java.lang.Integer r19 = r11.mo46399f()
            java.lang.Integer r2 = r11.mo46397e()
            if (r2 == 0) goto L_0x0281
            java.lang.Integer r2 = r11.mo46397e()
            int r2 = r2.intValue()
            r20 = r2
            goto L_0x0283
        L_0x0281:
            r20 = 0
        L_0x0283:
            int r21 = r3.mo46387a(r11)
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r9.add(r0)
            goto L_0x0247
        L_0x028f:
            java.util.List r0 = r1.mo45718a(r3, r8, r9)
            return r0
        L_0x0294:
            java.util.List r0 = r1.mo45718a(r3, r2, r2)
            return r0
        L_0x0299:
            java.util.List r0 = r1.mo45718a(r3, r2, r2)
            return r0
        L_0x029e:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x029e }
            goto L_0x02a2
        L_0x02a1:
            throw r0
        L_0x02a2:
            goto L_0x02a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12165r8.mo45717a():java.util.List");
    }

    /* renamed from: a */
    public final synchronized List<C12346t8> mo45718a(RscMetadata rscMetadata, List<C12372u8> list, List<C12346t8> list2) {
        List<C12372u8> list3 = this.f54112d;
        if (list3 != null) {
            for (C12372u8 a : list3) {
                try {
                    a.mo45536a(this.f54109a);
                } catch (Throwable th) {
                    if (m52796a(this.f54111c, 64)) {
                        C5004d4.m22887a(th);
                    }
                }
            }
        }
        this.f54111c = rscMetadata;
        this.f54112d = list;
        this.f54113e = list2;
        if (list != null) {
            for (C12372u8 a2 : list) {
                try {
                    a2.mo45537a(this.f54109a, this);
                } catch (Throwable th2) {
                    if (m52796a(rscMetadata, 128)) {
                        C5004d4.m22887a(th2);
                    }
                }
            }
        }
        return list2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        if ((((java.lang.Long) r10.first).longValue() + ((long) (r0 * 1000))) < android.os.SystemClock.elapsedRealtime()) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo45716a(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            java.util.List r0 = r18.mo45717a()
            r2 = 0
            if (r0 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Iterator r3 = r0.iterator()
            r4 = r2
        L_0x000f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r0 = r3.next()
            r5 = r0
            com.startapp.t8 r5 = (com.startapp.C12346t8) r5
            r6 = 2
            r8 = 1
            java.util.List<android.util.Pair<com.startapp.u8, java.lang.Boolean>> r0 = r5.f54767b     // Catch:{ all -> 0x0050 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0050 }
        L_0x0024:
            boolean r9 = r0.hasNext()     // Catch:{ all -> 0x0050 }
            if (r9 == 0) goto L_0x004d
            java.lang.Object r9 = r0.next()     // Catch:{ all -> 0x0050 }
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x0050 }
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0050 }
            com.startapp.u8 r10 = (com.startapp.C12372u8) r10     // Catch:{ all -> 0x0050 }
            r11 = r19
            boolean r10 = r10.mo45522a((java.lang.Object) r11)     // Catch:{ all -> 0x004b }
            if (r10 == 0) goto L_0x0024
            java.lang.Object r0 = r9.second     // Catch:{ all -> 0x004b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0048
            r0 = 2
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r0 = r0 | r8
            goto L_0x005f
        L_0x004b:
            r0 = move-exception
            goto L_0x0053
        L_0x004d:
            r11 = r19
            goto L_0x005e
        L_0x0050:
            r0 = move-exception
            r11 = r19
        L_0x0053:
            r9 = 256(0x100, float:3.59E-43)
            boolean r9 = r5.mo46641a(r9)
            if (r9 == 0) goto L_0x005e
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x005e:
            r0 = 0
        L_0x005f:
            r9 = r0 & 1
            if (r9 != 0) goto L_0x0067
            r17 = r3
            goto L_0x0183
        L_0x0067:
            com.startapp.p1 r9 = r5.f54766a
            r0 = r0 & 2
            if (r0 != 0) goto L_0x00a5
            int r0 = r5.f54768c
            monitor-enter(r18)
            java.util.Map<com.startapp.p1, android.util.Pair<java.lang.Long, java.lang.ref.SoftReference<org.json.JSONObject>>> r10 = r1.f54114f     // Catch:{ all -> 0x00a2 }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ all -> 0x00a2 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x00a2 }
            monitor-exit(r18)     // Catch:{ all -> 0x00a2 }
            if (r10 != 0) goto L_0x007e
        L_0x007b:
            r17 = r3
            goto L_0x00a1
        L_0x007e:
            java.lang.Object r12 = r10.second
            java.lang.ref.SoftReference r12 = (java.lang.ref.SoftReference) r12
            java.lang.Object r12 = r12.get()
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            if (r12 != 0) goto L_0x008b
            goto L_0x007b
        L_0x008b:
            java.lang.Object r10 = r10.first
            java.lang.Long r10 = (java.lang.Long) r10
            long r13 = r10.longValue()
            long r15 = android.os.SystemClock.elapsedRealtime()
            int r0 = r0 * 1000
            r17 = r3
            long r2 = (long) r0
            long r13 = r13 + r2
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a8
        L_0x00a1:
            goto L_0x00a7
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x00a2 }
            throw r0
        L_0x00a5:
            r17 = r3
        L_0x00a7:
            r12 = 0
        L_0x00a8:
            r2 = 32
            if (r12 != 0) goto L_0x0181
            android.content.Context r0 = r1.f54109a     // Catch:{ all -> 0x00b8 }
            int[] r3 = r5.f54769d     // Catch:{ all -> 0x00b8 }
            java.lang.Integer r13 = r5.f54770e     // Catch:{ all -> 0x00b8 }
            org.json.JSONArray r0 = r9.mo45653a((android.content.Context) r0, (int[]) r3, (java.lang.Integer) r13)     // Catch:{ all -> 0x00b8 }
            r3 = r0
            goto L_0x00c5
        L_0x00b8:
            r0 = move-exception
            r3 = 8
            boolean r3 = r5.mo46641a(r3)
            if (r3 == 0) goto L_0x00c4
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x00c4:
            r3 = 0
        L_0x00c5:
            if (r3 == 0) goto L_0x0116
            java.lang.Integer r0 = r5.f54771f
            if (r0 == 0) goto L_0x0116
            int r0 = r0.intValue()     // Catch:{ all -> 0x010a }
            if (r0 != r8) goto L_0x00d7
            com.startapp.s8 r0 = new com.startapp.s8     // Catch:{ all -> 0x010a }
            r0.<init>()     // Catch:{ all -> 0x010a }
            goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            if (r0 == 0) goto L_0x0116
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x010a }
            r0.<init>()     // Catch:{ all -> 0x010a }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x010a }
            int r14 = r3.length()     // Catch:{ all -> 0x010a }
            r13.<init>(r14)     // Catch:{ all -> 0x010a }
            int r14 = r3.length()     // Catch:{ all -> 0x010a }
            r15 = 0
        L_0x00ed:
            if (r15 >= r14) goto L_0x0101
            org.json.JSONObject r7 = r3.getJSONObject(r15)     // Catch:{ all -> 0x010a }
            if (r7 == 0) goto L_0x00fe
            java.lang.String r10 = com.startapp.C12181s8.f54145a     // Catch:{ all -> 0x010a }
            java.lang.String r7 = r7.getString(r10)     // Catch:{ all -> 0x010a }
            r13.add(r7)     // Catch:{ all -> 0x010a }
        L_0x00fe:
            int r15 = r15 + 1
            goto L_0x00ed
        L_0x0101:
            java.lang.String r7 = com.startapp.C12347t9.m53508a(r13)     // Catch:{ all -> 0x010a }
            r0.put(r7)     // Catch:{ all -> 0x010a }
            r3 = r0
            goto L_0x0116
        L_0x010a:
            r0 = move-exception
            r7 = 2048(0x800, float:2.87E-42)
            boolean r7 = r5.mo46641a(r7)
            if (r7 == 0) goto L_0x0116
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x0116:
            if (r3 == 0) goto L_0x0181
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0181
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            int r0 = r5.f54772g     // Catch:{ JSONException -> 0x015a }
            r0 = r0 & r8
            if (r0 == 0) goto L_0x012a
            r0 = 1
            goto L_0x012b
        L_0x012a:
            r0 = 0
        L_0x012b:
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = "currentTimeMillis"
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x015a }
            r12.put(r0, r13)     // Catch:{ JSONException -> 0x015a }
        L_0x0136:
            int r0 = r5.f54772g     // Catch:{ JSONException -> 0x015a }
            r0 = r0 & r6
            if (r0 == 0) goto L_0x013d
            r7 = 1
            goto L_0x013e
        L_0x013d:
            r7 = 0
        L_0x013e:
            if (r7 == 0) goto L_0x0149
            java.lang.String r0 = "bootTimeMillis"
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x015a }
            r12.put(r0, r6)     // Catch:{ JSONException -> 0x015a }
        L_0x0149:
            org.json.JSONArray r0 = m52795a((com.startapp.C12346t8) r5)     // Catch:{ JSONException -> 0x015a }
            if (r0 == 0) goto L_0x0154
            java.lang.String r6 = "params"
            r12.put(r6, r0)     // Catch:{ JSONException -> 0x015a }
        L_0x0154:
            java.lang.String r0 = "items"
            r12.put(r0, r3)     // Catch:{ JSONException -> 0x015a }
            goto L_0x0164
        L_0x015a:
            r0 = move-exception
            boolean r3 = r5.mo46641a(r2)
            if (r3 == 0) goto L_0x0164
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x0164:
            monitor-enter(r18)
            java.util.Map<com.startapp.p1, android.util.Pair<java.lang.Long, java.lang.ref.SoftReference<org.json.JSONObject>>> r0 = r1.f54114f     // Catch:{ all -> 0x017e }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x017e }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x017e }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x017e }
            java.lang.ref.SoftReference r7 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x017e }
            r7.<init>(r12)     // Catch:{ all -> 0x017e }
            r3.<init>(r6, r7)     // Catch:{ all -> 0x017e }
            r0.put(r9, r3)     // Catch:{ all -> 0x017e }
            monitor-exit(r18)
            goto L_0x0181
        L_0x017e:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        L_0x0181:
            if (r12 != 0) goto L_0x0188
        L_0x0183:
            r3 = r17
            r2 = 0
            goto L_0x000f
        L_0x0188:
            if (r4 != 0) goto L_0x0190
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r4 = r0
        L_0x0190:
            java.lang.String r0 = r9.f53991a     // Catch:{ JSONException -> 0x01b8 }
            org.json.JSONObject r0 = r4.optJSONObject(r0)     // Catch:{ JSONException -> 0x01b8 }
            if (r0 != 0) goto L_0x01a2
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01b8 }
            r0.<init>()     // Catch:{ JSONException -> 0x01b8 }
            java.lang.String r3 = r9.f53991a     // Catch:{ JSONException -> 0x01b8 }
            r4.put(r3, r0)     // Catch:{ JSONException -> 0x01b8 }
        L_0x01a2:
            java.lang.String r3 = r9.f53992b     // Catch:{ JSONException -> 0x01b8 }
            org.json.JSONArray r3 = r0.optJSONArray(r3)     // Catch:{ JSONException -> 0x01b8 }
            if (r3 != 0) goto L_0x01b4
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01b8 }
            r3.<init>()     // Catch:{ JSONException -> 0x01b8 }
            java.lang.String r6 = r9.f53992b     // Catch:{ JSONException -> 0x01b8 }
            r0.put(r6, r3)     // Catch:{ JSONException -> 0x01b8 }
        L_0x01b4:
            r3.put(r12)     // Catch:{ JSONException -> 0x01b8 }
            goto L_0x0183
        L_0x01b8:
            r0 = move-exception
            boolean r2 = r5.mo46641a(r2)
            if (r2 == 0) goto L_0x0183
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
            goto L_0x0183
        L_0x01c3:
            r2 = 0
            if (r4 != 0) goto L_0x01c7
            return r2
        L_0x01c7:
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01d0 }
            java.lang.String r2 = com.startapp.C5015nb.m22932c((java.lang.String) r0)     // Catch:{ all -> 0x01d0 }
            goto L_0x01dc
        L_0x01d0:
            r0 = move-exception
            r3 = 16
            boolean r3 = r1.mo45719a((int) r3)
            if (r3 == 0) goto L_0x01dc
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x01dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12165r8.mo45716a(java.lang.Object):java.lang.String");
    }

    /* renamed from: a */
    public static String m52794a(String str) throws IOException {
        byte[] a = C11760a.m51984a(Base64.decode(str, 8));
        Map<Activity, Integer> map = C5015nb.f22145a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream, new Inflater(true));
        inflaterOutputStream.write(a);
        inflaterOutputStream.close();
        return new String(byteArrayOutputStream.toByteArray());
    }
}
