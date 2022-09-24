package p307g8;

import com.google.android.exoplayer2.audio.AacUtil;
import java.io.Serializable;
import p316k9.C12821b;

/* renamed from: g8.z */
/* compiled from: ProtocolVersion */
public class C12742z implements Serializable, Cloneable {

    /* renamed from: b */
    protected final String f55408b;

    /* renamed from: c */
    protected final int f55409c;

    /* renamed from: d */
    protected final int f55410d;

    public C12742z(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Protocol name must not be null.");
        } else if (i < 0) {
            throw new IllegalArgumentException("Protocol major version number must not be negative.");
        } else if (i2 >= 0) {
            this.f55408b = str;
            this.f55409c = i;
            this.f55410d = i2;
        } else {
            throw new IllegalArgumentException("Protocol minor version number may not be negative");
        }
    }

    /* renamed from: a */
    public int mo47812a(C12742z zVar) {
        if (zVar == null) {
            throw new IllegalArgumentException("Protocol version must not be null.");
        } else if (this.f55408b.equals(zVar.f55408b)) {
            int c = mo47813c() - zVar.mo47813c();
            return c == 0 ? mo47815d() - zVar.mo47815d() : c;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Versions for different protocols cannot be compared. ");
            stringBuffer.append(this);
            stringBuffer.append(" ");
            stringBuffer.append(zVar);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    /* renamed from: b */
    public C12742z mo47809b(int i, int i2) {
        if (i == this.f55409c && i2 == this.f55410d) {
            return this;
        }
        return new C12742z(this.f55408b, i, i2);
    }

    /* renamed from: c */
    public final int mo47813c() {
        return this.f55409c;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public final int mo47815d() {
        return this.f55410d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12742z)) {
            return false;
        }
        C12742z zVar = (C12742z) obj;
        if (this.f55408b.equals(zVar.f55408b) && this.f55409c == zVar.f55409c && this.f55410d == zVar.f55410d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final String mo47817g() {
        return this.f55408b;
    }

    /* renamed from: h */
    public boolean mo47818h(C12742z zVar) {
        return zVar != null && this.f55408b.equals(zVar.f55408b);
    }

    public final int hashCode() {
        return (this.f55408b.hashCode() ^ (this.f55409c * AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND)) ^ this.f55410d;
    }

    /* renamed from: i */
    public final boolean mo47820i(C12742z zVar) {
        return mo47818h(zVar) && mo47812a(zVar) <= 0;
    }

    public String toString() {
        C12821b bVar = new C12821b(16);
        bVar.mo47966c(this.f55408b);
        bVar.mo47964a('/');
        bVar.mo47966c(Integer.toString(this.f55409c));
        bVar.mo47964a('.');
        bVar.mo47966c(Integer.toString(this.f55410d));
        return bVar.toString();
    }
}
