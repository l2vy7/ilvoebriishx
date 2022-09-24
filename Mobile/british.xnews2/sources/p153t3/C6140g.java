package p153t3;

import java.util.Arrays;
import java.util.Objects;
import p142r3.C5996b;

/* renamed from: t3.g */
/* compiled from: EncodedPayload */
public final class C6140g {

    /* renamed from: a */
    private final C5996b f25422a;

    /* renamed from: b */
    private final byte[] f25423b;

    public C6140g(C5996b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f25422a = bVar;
        this.f25423b = bArr;
    }

    /* renamed from: a */
    public byte[] mo23517a() {
        return this.f25423b;
    }

    /* renamed from: b */
    public C5996b mo23518b() {
        return this.f25422a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6140g)) {
            return false;
        }
        C6140g gVar = (C6140g) obj;
        if (!this.f25422a.equals(gVar.f25422a)) {
            return false;
        }
        return Arrays.equals(this.f25423b, gVar.f25423b);
    }

    public int hashCode() {
        return ((this.f25422a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25423b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f25422a + ", bytes=[...]}";
    }
}
