package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7212h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.clearcut.C8854b;
import com.google.android.gms.internal.clearcut.C8882d5;
import com.google.android.gms.internal.clearcut.C8964n5;
import com.google.android.gms.internal.clearcut.C8985q5;
import com.google.android.gms.internal.clearcut.C9024w2;
import com.google.android.gms.internal.clearcut.C9027w5;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.TimeZone;
import javax.annotation.Nullable;
import p006a5.C6483e;
import p006a5.C6486h;
import p249s4.C10968a;

/* renamed from: com.google.android.gms.clearcut.a */
public final class C4586a {

    /* renamed from: n */
    private static final C7191a.C7202g<C8985q5> f19936n;

    /* renamed from: o */
    private static final C7191a.C7192a<C8985q5, C7191a.C7195d.C7199d> f19937o;
    @Deprecated

    /* renamed from: p */
    public static final C7191a<C7191a.C7195d.C7199d> f19938p;

    /* renamed from: q */
    private static final ExperimentTokens[] f19939q = new ExperimentTokens[0];

    /* renamed from: r */
    private static final String[] f19940r = new String[0];

    /* renamed from: s */
    private static final byte[][] f19941s = new byte[0][];
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f19942a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f19943b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f19944c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f19945d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f19946e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f19947f;

    /* renamed from: g */
    private String f19948g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final boolean f19949h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C8882d5 f19950i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C10968a f19951j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C6483e f19952k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C4590d f19953l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C4588b f19954m;

    /* renamed from: com.google.android.gms.clearcut.a$a */
    public class C4587a {

        /* renamed from: a */
        private int f19955a;

        /* renamed from: b */
        private String f19956b;

        /* renamed from: c */
        private String f19957c;

        /* renamed from: d */
        private String f19958d;

        /* renamed from: e */
        private C8882d5 f19959e;

        /* renamed from: f */
        private final C4589c f19960f;

        /* renamed from: g */
        private ArrayList<Integer> f19961g;

        /* renamed from: h */
        private ArrayList<String> f19962h;

        /* renamed from: i */
        private ArrayList<Integer> f19963i;

        /* renamed from: j */
        private ArrayList<ExperimentTokens> f19964j;

        /* renamed from: k */
        private ArrayList<byte[]> f19965k;

        /* renamed from: l */
        private boolean f19966l;

        /* renamed from: m */
        private final C8964n5 f19967m;

        /* renamed from: n */
        private boolean f19968n;

        private C4587a(C4586a aVar, byte[] bArr) {
            this(bArr, (C4589c) null);
        }

        private C4587a(byte[] bArr, C4589c cVar) {
            this.f19955a = C4586a.this.f19946e;
            this.f19956b = C4586a.this.f19945d;
            this.f19957c = C4586a.this.f19947f;
            this.f19958d = null;
            this.f19959e = C4586a.this.f19950i;
            this.f19961g = null;
            this.f19962h = null;
            this.f19963i = null;
            this.f19964j = null;
            this.f19965k = null;
            this.f19966l = true;
            C8964n5 n5Var = new C8964n5();
            this.f19967m = n5Var;
            this.f19968n = false;
            this.f19957c = C4586a.this.f19947f;
            this.f19958d = null;
            n5Var.f44651B = C8854b.m41532a(C4586a.this.f19942a);
            n5Var.f44652d = C4586a.this.f19952k.currentTimeMillis();
            n5Var.f44653e = C4586a.this.f19952k.elapsedRealtime();
            C4590d unused = C4586a.this.f19953l;
            n5Var.f44668t = (long) (TimeZone.getDefault().getOffset(n5Var.f44652d) / 1000);
            if (bArr != null) {
                n5Var.f44663o = bArr;
            }
            this.f19960f = null;
        }

        /* synthetic */ C4587a(C4586a aVar, byte[] bArr, C7188b bVar) {
            this(aVar, bArr);
        }

        /* renamed from: a */
        public void mo17878a() {
            if (!this.f19968n) {
                this.f19968n = true;
                zze zze = new zze(new zzr(C4586a.this.f19943b, C4586a.this.f19944c, this.f19955a, this.f19956b, this.f19957c, this.f19958d, C4586a.this.f19949h, this.f19959e), this.f19967m, (C4589c) null, (C4589c) null, C4586a.m19926d((ArrayList<Integer>) null), (String[]) null, C4586a.m19926d((ArrayList<Integer>) null), (byte[][]) null, (ExperimentTokens[]) null, this.f19966l);
                if (C4586a.this.f19954m.mo17880a(zze)) {
                    C4586a.this.f19951j.mo37218d(zze);
                } else {
                    C7212h.m29548b(Status.f28882g, (C7206f) null);
                }
            } else {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
        }

        /* renamed from: b */
        public C4587a mo17879b(int i) {
            this.f19967m.f44656h = i;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.clearcut.a$b */
    public interface C4588b {
        /* renamed from: a */
        boolean mo17880a(zze zze);
    }

    /* renamed from: com.google.android.gms.clearcut.a$c */
    public interface C4589c {
        byte[] zza();
    }

    /* renamed from: com.google.android.gms.clearcut.a$d */
    public static class C4590d {
    }

    static {
        C7191a.C7202g<C8985q5> gVar = new C7191a.C7202g<>();
        f19936n = gVar;
        C7188b bVar = new C7188b();
        f19937o = bVar;
        f19938p = new C7191a<>("ClearcutLogger.API", bVar, gVar);
    }

    private C4586a(Context context, int i, String str, String str2, String str3, boolean z, C10968a aVar, C6483e eVar, C4590d dVar, C4588b bVar) {
        this.f19946e = -1;
        C8882d5 d5Var = C8882d5.DEFAULT;
        this.f19950i = d5Var;
        this.f19942a = context;
        this.f19943b = context.getPackageName();
        this.f19944c = m19924b(context);
        this.f19946e = -1;
        this.f19945d = str;
        this.f19947f = str2;
        this.f19948g = null;
        this.f19949h = z;
        this.f19951j = aVar;
        this.f19952k = eVar;
        this.f19953l = new C4590d();
        this.f19950i = d5Var;
        this.f19954m = bVar;
        if (z) {
            C4604n.m20089b(str2 == null, "can't be anonymous with an upload account");
        }
    }

    public C4586a(Context context, String str, @Nullable String str2) {
        this(context, -1, str, str2, (String) null, false, C9024w2.m42450g(context), C6486h.m28261b(), (C4590d) null, new C9027w5(context));
    }

    /* renamed from: b */
    private static int m19924b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int[] m19926d(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Integer num = arrayList.get(i);
            i++;
            iArr[i2] = num.intValue();
            i2++;
        }
        return iArr;
    }

    /* renamed from: a */
    public final C4587a mo17877a(@Nullable byte[] bArr) {
        return new C4587a(this, bArr, (C7188b) null);
    }
}
