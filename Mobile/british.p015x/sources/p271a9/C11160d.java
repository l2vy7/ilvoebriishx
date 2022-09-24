package p271a9;

import com.google.android.exoplayer2.C6540C;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Locale;
import java.util.StringTokenizer;
import p308g8.C12716c;
import p308g8.C12731o;
import p310h8.C12755f;
import p310h8.C12757h;
import p310h8.C12759j;
import p311h9.C12766e;
import p311h9.C12773l;
import p311h9.C12777p;
import p312i8.C12786a;
import p317k9.C12821b;
import p317k9.C12822c;

/* renamed from: a9.d */
/* compiled from: DigestScheme */
public class C11160d extends C11177m {

    /* renamed from: i */
    private static final char[] f50176i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c */
    private boolean f50177c = false;

    /* renamed from: d */
    private int f50178d = 0;

    /* renamed from: e */
    private String f50179e;

    /* renamed from: f */
    private long f50180f;

    /* renamed from: g */
    private String f50181g;

    /* renamed from: h */
    private String f50182h;

    /* renamed from: l */
    public static String m49775l() {
        return m49779p(m49778o("MD5").digest(C12822c.m54365a(Long.toString(System.currentTimeMillis()))));
    }

    /* renamed from: m */
    private String m49776m(C12757h hVar) throws C12755f {
        String str;
        String j = mo43499j("uri");
        String j2 = mo43499j("realm");
        String j3 = mo43499j("nonce");
        String j4 = mo43499j("methodname");
        String j5 = mo43499j("algorithm");
        if (j == null) {
            throw new IllegalStateException("URI may not be null");
        } else if (j2 == null) {
            throw new IllegalStateException("Realm may not be null");
        } else if (j3 != null) {
            String str2 = null;
            this.f50181g = null;
            this.f50182h = null;
            String str3 = "MD5";
            if (j5 == null) {
                j5 = str3;
            }
            String j6 = mo43499j("charset");
            if (j6 == null) {
                j6 = C6540C.ISO88591_NAME;
            }
            if (this.f50178d != 1) {
                if (!j5.equalsIgnoreCase("MD5-sess")) {
                    str3 = j5;
                }
                if (j3.equals(this.f50179e)) {
                    this.f50180f++;
                } else {
                    this.f50180f = 1;
                    this.f50179e = j3;
                }
                MessageDigest o = m49778o(str3);
                String name = hVar.mo47837a().getName();
                String b = hVar.mo47838b();
                StringBuilder sb = new StringBuilder(name.length() + j2.length() + b.length() + 2);
                sb.append(name);
                sb.append(':');
                sb.append(j2);
                sb.append(':');
                sb.append(b);
                String sb2 = sb.toString();
                if (j5.equalsIgnoreCase("MD5-sess")) {
                    String q = m49780q();
                    String p = m49779p(o.digest(C12822c.m54368d(sb2, j6)));
                    StringBuilder sb3 = new StringBuilder(p.length() + j3.length() + q.length() + 2);
                    sb3.append(p);
                    sb3.append(':');
                    sb3.append(j3);
                    sb3.append(':');
                    sb3.append(q);
                    sb2 = sb3.toString();
                }
                String p2 = m49779p(o.digest(C12822c.m54368d(sb2, j6)));
                if (this.f50178d != 1) {
                    str2 = j4 + ':' + j;
                }
                String p3 = m49779p(o.digest(C12822c.m54365a(str2)));
                if (this.f50178d == 0) {
                    StringBuilder sb4 = new StringBuilder(p2.length() + j3.length() + p2.length());
                    sb4.append(p2);
                    sb4.append(':');
                    sb4.append(j3);
                    sb4.append(':');
                    sb4.append(p3);
                    str = sb4.toString();
                } else {
                    String s = m49782s();
                    String q2 = m49780q();
                    String r = m49781r();
                    StringBuilder sb5 = new StringBuilder(p2.length() + j3.length() + r.length() + q2.length() + s.length() + p3.length() + 5);
                    sb5.append(p2);
                    sb5.append(':');
                    sb5.append(j3);
                    sb5.append(':');
                    sb5.append(r);
                    sb5.append(':');
                    sb5.append(q2);
                    sb5.append(':');
                    sb5.append(s);
                    sb5.append(':');
                    sb5.append(p3);
                    str = sb5.toString();
                }
                return m49779p(o.digest(C12822c.m54365a(str)));
            }
            throw new C12755f("Unsupported qop in HTTP Digest authentication");
        } else {
            throw new IllegalStateException("Nonce may not be null");
        }
    }

    /* renamed from: n */
    private C12716c m49777n(C12757h hVar, String str) {
        C12821b bVar = new C12821b(128);
        if (mo43462b()) {
            bVar.mo47966c("Proxy-Authorization");
        } else {
            bVar.mo47966c(RtspHeaders.AUTHORIZATION);
        }
        bVar.mo47966c(": Digest ");
        String j = mo43499j("uri");
        String j2 = mo43499j("realm");
        String j3 = mo43499j("nonce");
        String j4 = mo43499j("opaque");
        String j5 = mo43499j("algorithm");
        String name = hVar.mo47837a().getName();
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(new C12773l("username", name));
        arrayList.add(new C12773l("realm", j2));
        arrayList.add(new C12773l("nonce", j3));
        arrayList.add(new C12773l("uri", j));
        arrayList.add(new C12773l("response", str));
        if (this.f50178d != 0) {
            arrayList.add(new C12773l("qop", m49782s()));
            arrayList.add(new C12773l("nc", m49781r()));
            arrayList.add(new C12773l("cnonce", m49780q()));
        }
        if (j5 != null) {
            arrayList.add(new C12773l("algorithm", j5));
        }
        if (j4 != null) {
            arrayList.add(new C12773l("opaque", j4));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C12773l lVar = (C12773l) arrayList.get(i);
            if (i > 0) {
                bVar.mo47966c(", ");
            }
            C12766e.f55438a.mo47855c(bVar, lVar, !("nc".equals(lVar.getName()) || "qop".equals(lVar.getName())));
        }
        return new C12777p(bVar);
    }

    /* renamed from: o */
    private static MessageDigest m49778o(String str) throws C11179o {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            throw new C11179o("Unsupported algorithm in HTTP Digest authentication: " + str);
        }
    }

    /* renamed from: p */
    private static String m49779p(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            char[] cArr2 = f50176i;
            cArr[i2] = cArr2[(bArr[i] & 240) >> 4];
            cArr[i2 + 1] = cArr2[bArr[i] & 15];
        }
        return new String(cArr);
    }

    /* renamed from: q */
    private String m49780q() {
        if (this.f50181g == null) {
            this.f50181g = m49775l();
        }
        return this.f50181g;
    }

    /* renamed from: r */
    private String m49781r() {
        if (this.f50182h == null) {
            StringBuilder sb = new StringBuilder();
            new Formatter(sb, Locale.US).format("%08x", new Object[]{Long.valueOf(this.f50180f)});
            this.f50182h = sb.toString();
        }
        return this.f50182h;
    }

    /* renamed from: s */
    private String m49782s() {
        return this.f50178d == 1 ? "auth-int" : "auth";
    }

    /* renamed from: d */
    public boolean mo43466d() {
        if ("true".equalsIgnoreCase(mo43499j("stale"))) {
            return false;
        }
        return this.f50177c;
    }

    /* renamed from: e */
    public C12716c mo43467e(C12757h hVar, C12731o oVar) throws C12755f {
        if (hVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (oVar != null) {
            mo43500k().put("methodname", oVar.mo43589y().mo47758c());
            mo43500k().put("uri", oVar.mo43589y().getUri());
            if (mo43499j("charset") == null) {
                mo43500k().put("charset", C12786a.m54249a(oVar.mo47801s()));
            }
            return m49777n(hVar, m49776m(hVar));
        } else {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
    }

    /* renamed from: f */
    public void mo43464f(C12716c cVar) throws C12759j {
        super.mo43464f(cVar);
        if (mo43499j("realm") == null) {
            throw new C12759j("missing realm in challange");
        } else if (mo43499j("nonce") != null) {
            boolean z = false;
            String j = mo43499j("qop");
            if (j != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(j, ",");
                while (true) {
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    String trim = stringTokenizer.nextToken().trim();
                    if (trim.equals("auth")) {
                        this.f50178d = 2;
                        break;
                    } else if (trim.equals("auth-int")) {
                        this.f50178d = 1;
                    } else {
                        z = true;
                    }
                }
            }
            if (!z || this.f50178d != 0) {
                this.f50177c = true;
                return;
            }
            throw new C12759j("None of the qop methods is supported");
        } else {
            throw new C12759j("missing nonce in challange");
        }
    }

    /* renamed from: h */
    public boolean mo43468h() {
        return false;
    }

    /* renamed from: i */
    public String mo43469i() {
        return "digest";
    }
}
