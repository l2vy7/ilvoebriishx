package p160v;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: v.i */
/* compiled from: SolverVariable */
public class C6222i {

    /* renamed from: o */
    private static int f25627o = 1;

    /* renamed from: a */
    public boolean f25628a;

    /* renamed from: b */
    private String f25629b;

    /* renamed from: c */
    public int f25630c = -1;

    /* renamed from: d */
    int f25631d = -1;

    /* renamed from: e */
    public int f25632e = 0;

    /* renamed from: f */
    public float f25633f;

    /* renamed from: g */
    public boolean f25634g = false;

    /* renamed from: h */
    float[] f25635h = new float[9];

    /* renamed from: i */
    float[] f25636i = new float[9];

    /* renamed from: j */
    C6223a f25637j;

    /* renamed from: k */
    C6210b[] f25638k = new C6210b[16];

    /* renamed from: l */
    int f25639l = 0;

    /* renamed from: m */
    public int f25640m = 0;

    /* renamed from: n */
    HashSet<C6210b> f25641n = null;

    /* renamed from: v.i$a */
    /* compiled from: SolverVariable */
    public enum C6223a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C6222i(C6223a aVar, String str) {
        this.f25637j = aVar;
    }

    /* renamed from: b */
    static void m27281b() {
        f25627o++;
    }

    /* renamed from: a */
    public final void mo23727a(C6210b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f25639l;
            if (i >= i2) {
                C6210b[] bVarArr = this.f25638k;
                if (i2 >= bVarArr.length) {
                    this.f25638k = (C6210b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C6210b[] bVarArr2 = this.f25638k;
                int i3 = this.f25639l;
                bVarArr2[i3] = bVar;
                this.f25639l = i3 + 1;
                return;
            } else if (this.f25638k[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo23728c(C6210b bVar) {
        int i = this.f25639l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f25638k[i2] == bVar) {
                while (i2 < i - 1) {
                    C6210b[] bVarArr = this.f25638k;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f25639l--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void mo23729d() {
        this.f25629b = null;
        this.f25637j = C6223a.UNKNOWN;
        this.f25632e = 0;
        this.f25630c = -1;
        this.f25631d = -1;
        this.f25633f = 0.0f;
        this.f25634g = false;
        int i = this.f25639l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f25638k[i2] = null;
        }
        this.f25639l = 0;
        this.f25640m = 0;
        this.f25628a = false;
        Arrays.fill(this.f25636i, 0.0f);
    }

    /* renamed from: e */
    public void mo23730e(C6213d dVar, float f) {
        this.f25633f = f;
        this.f25634g = true;
        int i = this.f25639l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f25638k[i2].mo23664B(dVar, this, false);
        }
        this.f25639l = 0;
    }

    /* renamed from: f */
    public void mo23731f(C6223a aVar, String str) {
        this.f25637j = aVar;
    }

    /* renamed from: g */
    public final void mo23732g(C6210b bVar) {
        int i = this.f25639l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f25638k[i2].mo23665C(bVar, false);
        }
        this.f25639l = 0;
    }

    public String toString() {
        if (this.f25629b != null) {
            return "" + this.f25629b;
        }
        return "" + this.f25630c;
    }
}
