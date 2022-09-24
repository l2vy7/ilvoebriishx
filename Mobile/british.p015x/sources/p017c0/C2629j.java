package p017c0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p010b0.C1515c;
import p095j0.C5484f;

/* renamed from: c0.j */
/* compiled from: TypefaceCompatBaseImpl */
class C2629j {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    private ConcurrentHashMap<Long, C1515c.C1517b> f10386a = new ConcurrentHashMap<>();

    /* renamed from: c0.j$a */
    /* compiled from: TypefaceCompatBaseImpl */
    class C2630a implements C2632c<C5484f.C5486b> {
        C2630a() {
        }

        /* renamed from: c */
        public int mo9278a(C5484f.C5486b bVar) {
            return bVar.mo21959e();
        }

        /* renamed from: d */
        public boolean mo9279b(C5484f.C5486b bVar) {
            return bVar.mo21960f();
        }
    }

    /* renamed from: c0.j$b */
    /* compiled from: TypefaceCompatBaseImpl */
    class C2631b implements C2632c<C1515c.C1518c> {
        C2631b() {
        }

        /* renamed from: c */
        public int mo9278a(C1515c.C1518c cVar) {
            return cVar.mo7074e();
        }

        /* renamed from: d */
        public boolean mo9279b(C1515c.C1518c cVar) {
            return cVar.mo7075f();
        }
    }

    /* renamed from: c0.j$c */
    /* compiled from: TypefaceCompatBaseImpl */
    private interface C2632c<T> {
        /* renamed from: a */
        int mo9278a(T t);

        /* renamed from: b */
        boolean mo9279b(T t);
    }

    C2629j() {
    }

    /* renamed from: a */
    private void m9187a(Typeface typeface, C1515c.C1517b bVar) {
        long j = m9190j(typeface);
        if (j != 0) {
            this.f10386a.put(Long.valueOf(j), bVar);
        }
    }

    /* renamed from: f */
    private C1515c.C1518c m9188f(C1515c.C1517b bVar, int i) {
        return (C1515c.C1518c) m9189g(bVar.mo7069a(), i, new C2631b());
    }

    /* renamed from: g */
    private static <T> T m9189g(T[] tArr, int i, C2632c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo9278a(t2) - i2) * 2) + (cVar.mo9279b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    private static long m9190j(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* renamed from: b */
    public Typeface mo9264b(Context context, C1515c.C1517b bVar, Resources resources, int i) {
        C1515c.C1518c f = m9188f(bVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = C2622d.m9143d(context, resources, f.mo7071b(), f.mo7070a(), i);
        m9187a(d, bVar);
        return d;
    }

    /* renamed from: c */
    public Typeface mo9265c(Context context, CancellationSignal cancellationSignal, C5484f.C5486b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo9276h(bVarArr, i).mo21958d());
            try {
                Typeface d = mo9275d(context, inputStream);
                C2633k.m9207a(inputStream);
                return d;
            } catch (IOException unused) {
                C2633k.m9207a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C2633k.m9207a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C2633k.m9207a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C2633k.m9207a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo9275d(Context context, InputStream inputStream) {
        File e = C2633k.m9211e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C2633k.m9210d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo9267e(Context context, Resources resources, int i, String str, int i2) {
        File e = C2633k.m9211e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C2633k.m9209c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C5484f.C5486b mo9276h(C5484f.C5486b[] bVarArr, int i) {
        return (C5484f.C5486b) m9189g(bVarArr, i, new C2630a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1515c.C1517b mo9277i(Typeface typeface) {
        long j = m9190j(typeface);
        if (j == 0) {
            return null;
        }
        return this.f10386a.get(Long.valueOf(j));
    }
}
