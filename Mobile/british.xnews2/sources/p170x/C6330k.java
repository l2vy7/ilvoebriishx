package p170x;

import java.util.ArrayList;
import p165w.C6249f;

/* renamed from: x.k */
/* compiled from: RunGroup */
class C6330k {

    /* renamed from: h */
    public static int f26126h;

    /* renamed from: a */
    public int f26127a = 0;

    /* renamed from: b */
    public boolean f26128b = false;

    /* renamed from: c */
    C6333m f26129c = null;

    /* renamed from: d */
    C6333m f26130d = null;

    /* renamed from: e */
    ArrayList<C6333m> f26131e = new ArrayList<>();

    /* renamed from: f */
    int f26132f = 0;

    /* renamed from: g */
    int f26133g;

    public C6330k(C6333m mVar, int i) {
        int i2 = f26126h;
        this.f26132f = i2;
        f26126h = i2 + 1;
        this.f26129c = mVar;
        this.f26130d = mVar;
        this.f26133g = i;
    }

    /* renamed from: c */
    private long m27881c(C6323f fVar, long j) {
        C6333m mVar = fVar.f26105d;
        if (mVar instanceof C6327i) {
            return j;
        }
        int size = fVar.f26112k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C6321d dVar = fVar.f26112k.get(i);
            if (dVar instanceof C6323f) {
                C6323f fVar2 = (C6323f) dVar;
                if (fVar2.f26105d != mVar) {
                    j2 = Math.min(j2, m27881c(fVar2, ((long) fVar2.f26107f) + j));
                }
            }
        }
        if (fVar != mVar.f26145i) {
            return j2;
        }
        long j3 = j - mVar.mo24085j();
        return Math.min(Math.min(j2, m27881c(mVar.f26144h, j3)), j3 - ((long) mVar.f26144h.f26107f));
    }

    /* renamed from: d */
    private long m27882d(C6323f fVar, long j) {
        C6333m mVar = fVar.f26105d;
        if (mVar instanceof C6327i) {
            return j;
        }
        int size = fVar.f26112k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C6321d dVar = fVar.f26112k.get(i);
            if (dVar instanceof C6323f) {
                C6323f fVar2 = (C6323f) dVar;
                if (fVar2.f26105d != mVar) {
                    j2 = Math.max(j2, m27882d(fVar2, ((long) fVar2.f26107f) + j));
                }
            }
        }
        if (fVar != mVar.f26144h) {
            return j2;
        }
        long j3 = j + mVar.mo24085j();
        return Math.max(Math.max(j2, m27882d(mVar.f26145i, j3)), j3 - ((long) mVar.f26145i.f26107f));
    }

    /* renamed from: a */
    public void mo24103a(C6333m mVar) {
        this.f26131e.add(mVar);
        this.f26130d = mVar;
    }

    /* renamed from: b */
    public long mo24104b(C6249f fVar, int i) {
        int i2;
        long j;
        C6333m mVar = this.f26129c;
        long j2 = 0;
        if (mVar instanceof C6320c) {
            if (((C6320c) mVar).f26142f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(mVar instanceof C6328j)) {
                return 0;
            }
        } else if (!(mVar instanceof C6331l)) {
            return 0;
        }
        C6323f fVar2 = (i == 0 ? fVar.f25767e : fVar.f25769f).f26144h;
        C6323f fVar3 = (i == 0 ? fVar.f25767e : fVar.f25769f).f26145i;
        boolean contains = mVar.f26144h.f26113l.contains(fVar2);
        boolean contains2 = this.f26129c.f26145i.f26113l.contains(fVar3);
        long j3 = this.f26129c.mo24085j();
        if (contains && contains2) {
            long d = m27882d(this.f26129c.f26144h, 0);
            long c = m27881c(this.f26129c.f26145i, 0);
            long j4 = d - j3;
            C6333m mVar2 = this.f26129c;
            int i3 = mVar2.f26145i.f26107f;
            if (j4 >= ((long) (-i3))) {
                j4 += (long) i3;
            }
            int i4 = mVar2.f26144h.f26107f;
            long j5 = ((-c) - j3) - ((long) i4);
            if (j5 >= ((long) i4)) {
                j5 -= (long) i4;
            }
            float p = mVar2.f26138b.mo23839p(i);
            if (p > 0.0f) {
                j2 = (long) ((((float) j5) / p) + (((float) j4) / (1.0f - p)));
            }
            float f = (float) j2;
            long j6 = ((long) ((f * p) + 0.5f)) + j3 + ((long) ((f * (1.0f - p)) + 0.5f));
            C6333m mVar3 = this.f26129c;
            j = ((long) mVar3.f26144h.f26107f) + j6;
            i2 = mVar3.f26145i.f26107f;
        } else if (contains) {
            C6323f fVar4 = this.f26129c.f26144h;
            return Math.max(m27882d(fVar4, (long) fVar4.f26107f), ((long) this.f26129c.f26144h.f26107f) + j3);
        } else if (contains2) {
            C6323f fVar5 = this.f26129c.f26145i;
            return Math.max(-m27881c(fVar5, (long) fVar5.f26107f), ((long) (-this.f26129c.f26145i.f26107f)) + j3);
        } else {
            C6333m mVar4 = this.f26129c;
            j = ((long) mVar4.f26144h.f26107f) + mVar4.mo24085j();
            i2 = this.f26129c.f26145i.f26107f;
        }
        return j - ((long) i2);
    }
}
