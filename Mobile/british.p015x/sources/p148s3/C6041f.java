package p148s3;

import java.util.Arrays;
import p148s3.C6055l;

/* renamed from: s3.f */
/* compiled from: AutoValue_LogEvent */
final class C6041f extends C6055l {

    /* renamed from: a */
    private final long f25158a;

    /* renamed from: b */
    private final Integer f25159b;

    /* renamed from: c */
    private final long f25160c;

    /* renamed from: d */
    private final byte[] f25161d;

    /* renamed from: e */
    private final String f25162e;

    /* renamed from: f */
    private final long f25163f;

    /* renamed from: g */
    private final C6060o f25164g;

    /* renamed from: s3.f$b */
    /* compiled from: AutoValue_LogEvent */
    static final class C6043b extends C6055l.C6056a {

        /* renamed from: a */
        private Long f25165a;

        /* renamed from: b */
        private Integer f25166b;

        /* renamed from: c */
        private Long f25167c;

        /* renamed from: d */
        private byte[] f25168d;

        /* renamed from: e */
        private String f25169e;

        /* renamed from: f */
        private Long f25170f;

        /* renamed from: g */
        private C6060o f25171g;

        C6043b() {
        }

        /* renamed from: a */
        public C6055l mo23211a() {
            String str = "";
            if (this.f25165a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f25167c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f25170f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C6041f(this.f25165a.longValue(), this.f25166b, this.f25167c.longValue(), this.f25168d, this.f25169e, this.f25170f.longValue(), this.f25171g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6055l.C6056a mo23212b(Integer num) {
            this.f25166b = num;
            return this;
        }

        /* renamed from: c */
        public C6055l.C6056a mo23213c(long j) {
            this.f25165a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C6055l.C6056a mo23214d(long j) {
            this.f25167c = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C6055l.C6056a mo23215e(C6060o oVar) {
            this.f25171g = oVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C6055l.C6056a mo23216f(byte[] bArr) {
            this.f25168d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C6055l.C6056a mo23217g(String str) {
            this.f25169e = str;
            return this;
        }

        /* renamed from: h */
        public C6055l.C6056a mo23218h(long j) {
            this.f25170f = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public Integer mo23201b() {
        return this.f25159b;
    }

    /* renamed from: c */
    public long mo23202c() {
        return this.f25158a;
    }

    /* renamed from: d */
    public long mo23203d() {
        return this.f25160c;
    }

    /* renamed from: e */
    public C6060o mo23204e() {
        return this.f25164g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6055l)) {
            return false;
        }
        C6055l lVar = (C6055l) obj;
        if (this.f25158a == lVar.mo23202c() && ((num = this.f25159b) != null ? num.equals(lVar.mo23201b()) : lVar.mo23201b() == null) && this.f25160c == lVar.mo23203d()) {
            if (Arrays.equals(this.f25161d, lVar instanceof C6041f ? ((C6041f) lVar).f25161d : lVar.mo23206f()) && ((str = this.f25162e) != null ? str.equals(lVar.mo23207g()) : lVar.mo23207g() == null) && this.f25163f == lVar.mo23208h()) {
                C6060o oVar = this.f25164g;
                if (oVar == null) {
                    if (lVar.mo23204e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.mo23204e())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte[] mo23206f() {
        return this.f25161d;
    }

    /* renamed from: g */
    public String mo23207g() {
        return this.f25162e;
    }

    /* renamed from: h */
    public long mo23208h() {
        return this.f25163f;
    }

    public int hashCode() {
        long j = this.f25158a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f25159b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f25160c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f25161d)) * 1000003;
        String str = this.f25162e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f25163f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        C6060o oVar = this.f25164g;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f25158a + ", eventCode=" + this.f25159b + ", eventUptimeMs=" + this.f25160c + ", sourceExtension=" + Arrays.toString(this.f25161d) + ", sourceExtensionJsonProto3=" + this.f25162e + ", timezoneOffsetSeconds=" + this.f25163f + ", networkConnectionInfo=" + this.f25164g + "}";
    }

    private C6041f(long j, Integer num, long j2, byte[] bArr, String str, long j3, C6060o oVar) {
        this.f25158a = j;
        this.f25159b = num;
        this.f25160c = j2;
        this.f25161d = bArr;
        this.f25162e = str;
        this.f25163f = j3;
        this.f25164g = oVar;
    }
}
