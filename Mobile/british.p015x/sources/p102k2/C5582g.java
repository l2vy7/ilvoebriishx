package p102k2;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p004a3.C0065j;
import p065d2.C5159f;

/* renamed from: k2.g */
/* compiled from: GlideUrl */
public class C5582g implements C5159f {

    /* renamed from: b */
    private final C5583h f24099b;

    /* renamed from: c */
    private final URL f24100c;

    /* renamed from: d */
    private final String f24101d;

    /* renamed from: e */
    private String f24102e;

    /* renamed from: f */
    private URL f24103f;

    /* renamed from: g */
    private volatile byte[] f24104g;

    /* renamed from: h */
    private int f24105h;

    public C5582g(URL url) {
        this(url, C5583h.f24107b);
    }

    /* renamed from: d */
    private byte[] m24819d() {
        if (this.f24104g == null) {
            this.f24104g = mo22142c().getBytes(C5159f.f22594a);
        }
        return this.f24104g;
    }

    /* renamed from: f */
    private String m24820f() {
        if (TextUtils.isEmpty(this.f24102e)) {
            String str = this.f24101d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C0065j.m247d(this.f24100c)).toString();
            }
            this.f24102e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f24102e;
    }

    /* renamed from: g */
    private URL m24821g() throws MalformedURLException {
        if (this.f24103f == null) {
            this.f24103f = new URL(m24820f());
        }
        return this.f24103f;
    }

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        messageDigest.update(m24819d());
    }

    /* renamed from: c */
    public String mo22142c() {
        String str = this.f24101d;
        return str != null ? str : ((URL) C0065j.m247d(this.f24100c)).toString();
    }

    /* renamed from: e */
    public Map<String, String> mo22143e() {
        return this.f24099b.mo22146a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5582g)) {
            return false;
        }
        C5582g gVar = (C5582g) obj;
        if (!mo22142c().equals(gVar.mo22142c()) || !this.f24099b.equals(gVar.f24099b)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public URL mo22144h() throws MalformedURLException {
        return m24821g();
    }

    public int hashCode() {
        if (this.f24105h == 0) {
            int hashCode = mo22142c().hashCode();
            this.f24105h = hashCode;
            this.f24105h = (hashCode * 31) + this.f24099b.hashCode();
        }
        return this.f24105h;
    }

    public String toString() {
        return mo22142c();
    }

    public C5582g(String str) {
        this(str, C5583h.f24107b);
    }

    public C5582g(URL url, C5583h hVar) {
        this.f24100c = (URL) C0065j.m247d(url);
        this.f24101d = null;
        this.f24099b = (C5583h) C0065j.m247d(hVar);
    }

    public C5582g(String str, C5583h hVar) {
        this.f24100c = null;
        this.f24101d = C0065j.m245b(str);
        this.f24099b = (C5583h) C0065j.m247d(hVar);
    }
}
