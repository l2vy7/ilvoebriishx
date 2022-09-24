package p182z0;

import android.media.VolumeProvider;
import android.os.Build;

/* renamed from: z0.i */
/* compiled from: VolumeProviderCompat */
public abstract class C6432i {

    /* renamed from: a */
    private final int f26472a;

    /* renamed from: b */
    private final int f26473b;

    /* renamed from: c */
    private final String f26474c;

    /* renamed from: d */
    private int f26475d;

    /* renamed from: e */
    private C6435c f26476e;

    /* renamed from: f */
    private VolumeProvider f26477f;

    /* renamed from: z0.i$a */
    /* compiled from: VolumeProviderCompat */
    class C6433a extends VolumeProvider {
        C6433a(int i, int i2, int i3, String str) {
            super(i, i2, i3, str);
        }

        public void onAdjustVolume(int i) {
            C6432i.this.mo4764e(i);
        }

        public void onSetVolumeTo(int i) {
            C6432i.this.mo4765f(i);
        }
    }

    /* renamed from: z0.i$b */
    /* compiled from: VolumeProviderCompat */
    class C6434b extends VolumeProvider {
        C6434b(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public void onAdjustVolume(int i) {
            C6432i.this.mo4764e(i);
        }

        public void onSetVolumeTo(int i) {
            C6432i.this.mo4765f(i);
        }
    }

    /* renamed from: z0.i$c */
    /* compiled from: VolumeProviderCompat */
    public static abstract class C6435c {
        /* renamed from: a */
        public abstract void mo582a(C6432i iVar);
    }

    public C6432i(int i, int i2, int i3, String str) {
        this.f26472a = i;
        this.f26473b = i2;
        this.f26475d = i3;
        this.f26474c = str;
    }

    /* renamed from: a */
    public final int mo24248a() {
        return this.f26475d;
    }

    /* renamed from: b */
    public final int mo24249b() {
        return this.f26473b;
    }

    /* renamed from: c */
    public final int mo24250c() {
        return this.f26472a;
    }

    /* renamed from: d */
    public Object mo24251d() {
        if (this.f26477f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f26477f = new C6433a(this.f26472a, this.f26473b, this.f26475d, this.f26474c);
            } else if (i >= 21) {
                this.f26477f = new C6434b(this.f26472a, this.f26473b, this.f26475d);
            }
        }
        return this.f26477f;
    }

    /* renamed from: e */
    public abstract void mo4764e(int i);

    /* renamed from: f */
    public abstract void mo4765f(int i);

    /* renamed from: g */
    public void mo24252g(C6435c cVar) {
        this.f26476e = cVar;
    }

    /* renamed from: h */
    public final void mo24253h(int i) {
        this.f26475d = i;
        if (Build.VERSION.SDK_INT >= 21) {
            ((VolumeProvider) mo24251d()).setCurrentVolume(i);
        }
        C6435c cVar = this.f26476e;
        if (cVar != null) {
            cVar.mo582a(this);
        }
    }
}
