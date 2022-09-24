package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: androidx.work.w */
/* compiled from: WorkInfo */
public final class C1501w {

    /* renamed from: a */
    private UUID f6508a;

    /* renamed from: b */
    private C1502a f6509b;

    /* renamed from: c */
    private C1427e f6510c;

    /* renamed from: d */
    private Set<String> f6511d;

    /* renamed from: e */
    private C1427e f6512e;

    /* renamed from: f */
    private int f6513f;

    /* renamed from: androidx.work.w$a */
    /* compiled from: WorkInfo */
    public enum C1502a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        /* renamed from: d */
        public boolean mo7038d() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public C1501w(UUID uuid, C1502a aVar, C1427e eVar, List<String> list, C1427e eVar2, int i) {
        this.f6508a = uuid;
        this.f6509b = aVar;
        this.f6510c = eVar;
        this.f6511d = new HashSet(list);
        this.f6512e = eVar2;
        this.f6513f = i;
    }

    /* renamed from: a */
    public C1502a mo7034a() {
        return this.f6509b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1501w.class != obj.getClass()) {
            return false;
        }
        C1501w wVar = (C1501w) obj;
        if (this.f6513f == wVar.f6513f && this.f6508a.equals(wVar.f6508a) && this.f6509b == wVar.f6509b && this.f6510c.equals(wVar.f6510c) && this.f6511d.equals(wVar.f6511d)) {
            return this.f6512e.equals(wVar.f6512e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f6508a.hashCode() * 31) + this.f6509b.hashCode()) * 31) + this.f6510c.hashCode()) * 31) + this.f6511d.hashCode()) * 31) + this.f6512e.hashCode()) * 31) + this.f6513f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f6508a + '\'' + ", mState=" + this.f6509b + ", mOutputData=" + this.f6510c + ", mTags=" + this.f6511d + ", mProgress=" + this.f6512e + '}';
    }
}
