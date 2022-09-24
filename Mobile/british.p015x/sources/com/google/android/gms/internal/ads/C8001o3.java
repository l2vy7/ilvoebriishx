package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8001o3 {

    /* renamed from: a */
    private final C8071q2 f36259a;

    /* renamed from: b */
    private final ay2 f36260b;

    /* renamed from: c */
    private final tp2 f36261c = new tp2(new byte[64], 64);

    /* renamed from: d */
    private boolean f36262d;

    /* renamed from: e */
    private boolean f36263e;

    /* renamed from: f */
    private boolean f36264f;

    public C8001o3(C8071q2 q2Var, ay2 ay2) {
        this.f36259a = q2Var;
        this.f36260b = ay2;
    }

    /* renamed from: a */
    public final void mo33830a(uq2 uq2) throws C7811iy {
        long j;
        uq2.mo35232b(this.f36261c.f39483a, 0, 3);
        this.f36261c.mo35013h(0);
        this.f36261c.mo35015j(8);
        this.f36262d = this.f36261c.mo35017l();
        this.f36263e = this.f36261c.mo35017l();
        this.f36261c.mo35015j(6);
        uq2.mo35232b(this.f36261c.f39483a, 0, this.f36261c.mo35008c(8));
        this.f36261c.mo35013h(0);
        if (this.f36262d) {
            this.f36261c.mo35015j(4);
            int c = this.f36261c.mo35008c(3);
            this.f36261c.mo35015j(1);
            int c2 = this.f36261c.mo35008c(15);
            this.f36261c.mo35015j(1);
            long c3 = (((long) c) << 30) | ((long) (c2 << 15)) | ((long) this.f36261c.mo35008c(15));
            this.f36261c.mo35015j(1);
            if (!this.f36264f && this.f36263e) {
                this.f36261c.mo35015j(4);
                int c4 = this.f36261c.mo35008c(3);
                this.f36261c.mo35015j(1);
                int c5 = this.f36261c.mo35008c(15);
                this.f36261c.mo35015j(1);
                int c6 = this.f36261c.mo35008c(15);
                this.f36261c.mo35015j(1);
                this.f36260b.mo30573b(((long) (c5 << 15)) | (((long) c4) << 30) | ((long) c6));
                this.f36264f = true;
            }
            j = this.f36260b.mo30573b(c3);
        } else {
            j = 0;
        }
        this.f36259a.mo18074c(j, 4);
        this.f36259a.mo18072a(uq2);
        this.f36259a.zzc();
    }

    /* renamed from: b */
    public final void mo33831b() {
        this.f36264f = false;
        this.f36259a.zze();
    }
}
