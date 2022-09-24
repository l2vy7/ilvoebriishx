package p094j0;

import android.util.Base64;
import java.util.List;
import p104l0.C5648h;

/* renamed from: j0.d */
/* compiled from: FontRequest */
public final class C5477d {

    /* renamed from: a */
    private final String f23852a;

    /* renamed from: b */
    private final String f23853b;

    /* renamed from: c */
    private final String f23854c;

    /* renamed from: d */
    private final List<List<byte[]>> f23855d;

    /* renamed from: e */
    private final int f23856e = 0;

    /* renamed from: f */
    private final String f23857f;

    public C5477d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f23852a = (String) C5648h.m24964c(str);
        this.f23853b = (String) C5648h.m24964c(str2);
        this.f23854c = (String) C5648h.m24964c(str3);
        this.f23855d = (List) C5648h.m24964c(list);
        this.f23857f = m24493a(str, str2, str3);
    }

    /* renamed from: a */
    private String m24493a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> mo21939b() {
        return this.f23855d;
    }

    /* renamed from: c */
    public int mo21940c() {
        return this.f23856e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo21941d() {
        return this.f23857f;
    }

    /* renamed from: e */
    public String mo21942e() {
        return this.f23852a;
    }

    /* renamed from: f */
    public String mo21943f() {
        return this.f23853b;
    }

    /* renamed from: g */
    public String mo21944g() {
        return this.f23854c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f23852a + ", mProviderPackage: " + this.f23853b + ", mQuery: " + this.f23854c + ", mCertificates:");
        for (int i = 0; i < this.f23855d.size(); i++) {
            sb.append(" [");
            List list = this.f23855d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f23856e);
        return sb.toString();
    }
}
