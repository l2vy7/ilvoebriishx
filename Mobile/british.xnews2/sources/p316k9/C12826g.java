package p316k9;

import java.util.Map;

/* renamed from: k9.g */
/* compiled from: VersionInfo */
public class C12826g {

    /* renamed from: a */
    private final String f55493a;

    /* renamed from: b */
    private final String f55494b;

    /* renamed from: c */
    private final String f55495c;

    /* renamed from: d */
    private final String f55496d;

    /* renamed from: e */
    private final String f55497e;

    protected C12826g(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            this.f55493a = str;
            this.f55494b = str2 == null ? "UNAVAILABLE" : str2;
            this.f55495c = str3 == null ? "UNAVAILABLE" : str3;
            this.f55496d = str4 == null ? "UNAVAILABLE" : str4;
            this.f55497e = str5 == null ? "UNAVAILABLE" : str5;
            return;
        }
        throw new IllegalArgumentException("Package identifier must not be null.");
    }

    /* renamed from: a */
    protected static final C12826g m54382a(String str, Map map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        if (str != null) {
            String str5 = null;
            if (map != null) {
                String str6 = (String) map.get("info.module");
                if (str6 != null && str6.length() < 1) {
                    str6 = null;
                }
                String str7 = (String) map.get("info.release");
                if (str7 != null && (str7.length() < 1 || str7.equals("${pom.version}"))) {
                    str7 = null;
                }
                String str8 = (String) map.get("info.timestamp");
                str2 = (str8 == null || (str8.length() >= 1 && !str8.equals("${mvn.timestamp}"))) ? str8 : null;
                str4 = str6;
                str3 = str7;
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
            }
            if (classLoader != null) {
                str5 = classLoader.toString();
            }
            return new C12826g(str, str4, str3, str2, str5);
        }
        throw new IllegalArgumentException("Package identifier must not be null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p316k9.C12826g m54383c(java.lang.String r4, java.lang.ClassLoader r5) {
        /*
            if (r4 == 0) goto L_0x004c
            if (r5 != 0) goto L_0x000c
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r5 = r5.getContextClassLoader()
        L_0x000c:
            r0 = 0
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x0044 }
            r1.<init>()     // Catch:{ IOException -> 0x0044 }
            r2 = 46
            r3 = 47
            java.lang.String r2 = r4.replace(r2, r3)     // Catch:{ IOException -> 0x0044 }
            r1.append(r2)     // Catch:{ IOException -> 0x0044 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ IOException -> 0x0044 }
            java.lang.String r2 = "version.properties"
            r1.append(r2)     // Catch:{ IOException -> 0x0044 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0044 }
            java.io.InputStream r1 = r5.getResourceAsStream(r1)     // Catch:{ IOException -> 0x0044 }
            if (r1 == 0) goto L_0x0044
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x003f }
            r2.<init>()     // Catch:{ all -> 0x003f }
            r2.load(r1)     // Catch:{ all -> 0x003f }
            r1.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0045
        L_0x003d:
            goto L_0x0045
        L_0x003f:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0044 }
            throw r2     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r2 = r0
        L_0x0045:
            if (r2 == 0) goto L_0x004b
            k9.g r0 = m54382a(r4, r2, r5)
        L_0x004b:
            return r0
        L_0x004c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Package identifier must not be null."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p316k9.C12826g.m54383c(java.lang.String, java.lang.ClassLoader):k9.g");
    }

    /* renamed from: b */
    public final String mo47982b() {
        return this.f55495c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.f55493a.length() + 20 + this.f55494b.length() + this.f55495c.length() + this.f55496d.length() + this.f55497e.length());
        stringBuffer.append("VersionInfo(");
        stringBuffer.append(this.f55493a);
        stringBuffer.append(':');
        stringBuffer.append(this.f55494b);
        if (!"UNAVAILABLE".equals(this.f55495c)) {
            stringBuffer.append(':');
            stringBuffer.append(this.f55495c);
        }
        if (!"UNAVAILABLE".equals(this.f55496d)) {
            stringBuffer.append(':');
            stringBuffer.append(this.f55496d);
        }
        stringBuffer.append(')');
        if (!"UNAVAILABLE".equals(this.f55497e)) {
            stringBuffer.append('@');
            stringBuffer.append(this.f55497e);
        }
        return stringBuffer.toString();
    }
}
