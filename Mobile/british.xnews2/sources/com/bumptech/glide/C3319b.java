package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p004a3.C0065j;
import p004a3.C0066k;
import p018c2.C2645a;
import p064d2.C5165j;
import p070e2.C5221k;
import p070e2.C5224m;
import p081g2.C5298k;
import p086h2.C5382b;
import p086h2.C5387e;
import p091i2.C5458h;
import p101k2.C5554a;
import p101k2.C5558b;
import p101k2.C5565c;
import p101k2.C5566d;
import p101k2.C5569e;
import p101k2.C5574f;
import p101k2.C5582g;
import p101k2.C5589k;
import p101k2.C5608s;
import p101k2.C5613t;
import p101k2.C5614u;
import p101k2.C5618v;
import p101k2.C5621w;
import p101k2.C5626x;
import p106l2.C5652a;
import p106l2.C5654b;
import p106l2.C5656c;
import p106l2.C5658d;
import p106l2.C5660e;
import p106l2.C5665f;
import p118n2.C5792a;
import p118n2.C5797b;
import p118n2.C5798b0;
import p118n2.C5800c;
import p118n2.C5801c0;
import p118n2.C5813g;
import p118n2.C5814h;
import p118n2.C5817k;
import p118n2.C5831m;
import p118n2.C5837p;
import p118n2.C5843t;
import p118n2.C5845v;
import p118n2.C5848x;
import p118n2.C5850z;
import p123o2.C5868a;
import p129p2.C5900d;
import p129p2.C5901e;
import p136q2.C5938a;
import p141r2.C5978a;
import p141r2.C5982c;
import p141r2.C5984d;
import p141r2.C5992h;
import p141r2.C5994j;
import p146s2.C6017a;
import p146s2.C6018b;
import p146s2.C6019c;
import p146s2.C6020d;
import p152t2.C6108d;
import p152t2.C6118l;
import p157u2.C6187b;
import p157u2.C6189d;
import p168w2.C6309e;
import p168w2.C6310f;
import p173x2.C6384f;
import p173x2.C6386h;

/* renamed from: com.bumptech.glide.b */
/* compiled from: Glide */
public class C3319b implements ComponentCallbacks2 {

    /* renamed from: m */
    private static volatile C3319b f12598m;

    /* renamed from: n */
    private static volatile boolean f12599n;

    /* renamed from: b */
    private final C5298k f12600b;

    /* renamed from: c */
    private final C5387e f12601c;

    /* renamed from: d */
    private final C5458h f12602d;

    /* renamed from: e */
    private final C3323d f12603e;

    /* renamed from: f */
    private final C3327h f12604f;

    /* renamed from: g */
    private final C5382b f12605g;

    /* renamed from: h */
    private final C6118l f12606h;

    /* renamed from: i */
    private final C6108d f12607i;

    /* renamed from: j */
    private final List<C3335j> f12608j = new ArrayList();

    /* renamed from: k */
    private final C3320a f12609k;

    /* renamed from: l */
    private C3324e f12610l = C3324e.NORMAL;

    /* renamed from: com.bumptech.glide.b$a */
    /* compiled from: Glide */
    public interface C3320a {
        C6310f build();
    }

    C3319b(Context context, C5298k kVar, C5458h hVar, C5387e eVar, C5382b bVar, C6118l lVar, C6108d dVar, int i, C3320a aVar, Map<Class<?>, C3338k<?, ?>> map, List<C6309e<Object>> list, boolean z, boolean z2) {
        C5165j jVar;
        C5165j jVar2;
        Context context2 = context;
        C5387e eVar2 = eVar;
        C5382b bVar2 = bVar;
        Class<C2645a> cls = C2645a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        this.f12600b = kVar;
        this.f12601c = eVar2;
        this.f12605g = bVar2;
        this.f12602d = hVar;
        this.f12606h = lVar;
        this.f12607i = dVar;
        this.f12609k = aVar;
        Resources resources = context.getResources();
        C3327h hVar2 = new C3327h();
        this.f12604f = hVar2;
        hVar2.mo11131o(new C5817k());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            hVar2.mo11131o(new C5837p());
        }
        List<ImageHeaderParser> g = hVar2.mo11123g();
        C5978a aVar2 = new C5978a(context2, g, eVar2, bVar2);
        C5165j<ParcelFileDescriptor, Bitmap> h = C5801c0.m25680h(eVar);
        C5831m mVar = new C5831m(hVar2.mo11123g(), resources.getDisplayMetrics(), eVar2, bVar2);
        if (!z2 || i2 < 28) {
            jVar = new C5813g(mVar);
            jVar2 = new C5850z(mVar, bVar2);
        } else {
            jVar2 = new C5843t();
            jVar = new C5814h();
        }
        Class<byte[]> cls5 = cls4;
        C5900d dVar2 = new C5900d(context2);
        int i3 = i2;
        C5608s.C5611c cVar = new C5608s.C5611c(resources);
        C5608s.C5612d dVar3 = new C5608s.C5612d(resources);
        Class<String> cls6 = cls2;
        C5608s.C5610b bVar3 = new C5608s.C5610b(resources);
        C5608s.C5612d dVar4 = dVar3;
        C5608s.C5609a aVar3 = new C5608s.C5609a(resources);
        C5800c cVar2 = new C5800c(bVar2);
        Class<Integer> cls7 = cls3;
        C6017a aVar4 = new C6017a();
        C6020d dVar5 = new C6020d();
        ContentResolver contentResolver = context.getContentResolver();
        C5608s.C5610b bVar4 = bVar3;
        C5608s.C5611c cVar3 = cVar;
        C5900d dVar6 = dVar2;
        hVar2.mo11118a(ByteBuffer.class, new C5565c()).mo11118a(InputStream.class, new C5613t(bVar2)).mo11122e("Bitmap", ByteBuffer.class, Bitmap.class, jVar).mo11122e("Bitmap", InputStream.class, Bitmap.class, jVar2);
        if (C5224m.m23696c()) {
            hVar2.mo11122e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C5845v(mVar));
        }
        C5900d dVar7 = dVar6;
        hVar2.mo11122e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h).mo11122e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C5801c0.m25675c(eVar)).mo11121d(Bitmap.class, Bitmap.class, C5618v.C5619a.m24907b()).mo11122e("Bitmap", Bitmap.class, Bitmap.class, new C5798b0()).mo11119b(Bitmap.class, cVar2).mo11122e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C5792a(resources, jVar)).mo11122e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C5792a(resources, jVar2)).mo11122e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C5792a(resources, h)).mo11119b(BitmapDrawable.class, new C5797b(eVar2, cVar2)).mo11122e("Gif", InputStream.class, C5982c.class, new C5994j(g, aVar2, bVar2)).mo11122e("Gif", ByteBuffer.class, C5982c.class, aVar2).mo11119b(C5982c.class, new C5984d()).mo11121d(cls, cls, C5618v.C5619a.m24907b()).mo11122e("Bitmap", cls, Bitmap.class, new C5992h(eVar2)).mo11120c(Uri.class, Drawable.class, dVar7).mo11120c(Uri.class, Bitmap.class, new C5848x(dVar7, eVar2)).mo11132p(new C5868a.C5869a()).mo11121d(File.class, ByteBuffer.class, new C5566d.C5568b()).mo11121d(File.class, InputStream.class, new C5574f.C5580e()).mo11120c(File.class, File.class, new C5938a()).mo11121d(File.class, ParcelFileDescriptor.class, new C5574f.C5576b()).mo11121d(File.class, File.class, C5618v.C5619a.m24907b()).mo11132p(new C5221k.C5222a(bVar2));
        if (C5224m.m23696c()) {
            hVar2.mo11132p(new C5224m.C5225a());
        }
        Class cls8 = Integer.TYPE;
        C5608s.C5611c cVar4 = cVar3;
        C5608s.C5610b bVar5 = bVar4;
        Class<Integer> cls9 = cls7;
        C5608s.C5612d dVar8 = dVar4;
        C5608s.C5609a aVar5 = aVar3;
        Class<String> cls10 = cls6;
        Context context3 = context;
        hVar2.mo11121d(cls8, InputStream.class, cVar4).mo11121d(cls8, ParcelFileDescriptor.class, bVar5).mo11121d(cls9, InputStream.class, cVar4).mo11121d(cls9, ParcelFileDescriptor.class, bVar5).mo11121d(cls9, Uri.class, dVar8).mo11121d(cls8, AssetFileDescriptor.class, aVar5).mo11121d(cls9, AssetFileDescriptor.class, aVar5).mo11121d(cls8, Uri.class, dVar8).mo11121d(cls10, InputStream.class, new C5569e.C5572c()).mo11121d(Uri.class, InputStream.class, new C5569e.C5572c()).mo11121d(cls10, InputStream.class, new C5614u.C5617c()).mo11121d(cls10, ParcelFileDescriptor.class, new C5614u.C5616b()).mo11121d(cls10, AssetFileDescriptor.class, new C5614u.C5615a()).mo11121d(Uri.class, InputStream.class, new C5654b.C5655a()).mo11121d(Uri.class, InputStream.class, new C5554a.C5557c(context.getAssets())).mo11121d(Uri.class, ParcelFileDescriptor.class, new C5554a.C5556b(context.getAssets())).mo11121d(Uri.class, InputStream.class, new C5656c.C5657a(context3)).mo11121d(Uri.class, InputStream.class, new C5658d.C5659a(context3));
        int i4 = i3;
        if (i4 >= 29) {
            hVar2.mo11121d(Uri.class, InputStream.class, new C5660e.C5663c(context3));
            hVar2.mo11121d(Uri.class, ParcelFileDescriptor.class, new C5660e.C5662b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        Class<byte[]> cls11 = cls5;
        C6017a aVar6 = aVar4;
        C6020d dVar9 = dVar5;
        hVar2.mo11121d(Uri.class, InputStream.class, new C5621w.C5625d(contentResolver2)).mo11121d(Uri.class, ParcelFileDescriptor.class, new C5621w.C5623b(contentResolver2)).mo11121d(Uri.class, AssetFileDescriptor.class, new C5621w.C5622a(contentResolver2)).mo11121d(Uri.class, InputStream.class, new C5626x.C5627a()).mo11121d(URL.class, InputStream.class, new C5665f.C5666a()).mo11121d(Uri.class, File.class, new C5589k.C5590a(context3)).mo11121d(C5582g.class, InputStream.class, new C5652a.C5653a()).mo11121d(cls11, ByteBuffer.class, new C5558b.C5559a()).mo11121d(cls11, InputStream.class, new C5558b.C5563d()).mo11121d(Uri.class, Uri.class, C5618v.C5619a.m24907b()).mo11121d(Drawable.class, Drawable.class, C5618v.C5619a.m24907b()).mo11120c(Drawable.class, Drawable.class, new C5901e()).mo11133q(Bitmap.class, BitmapDrawable.class, new C6018b(resources)).mo11133q(Bitmap.class, cls11, aVar6).mo11133q(Drawable.class, cls11, new C6019c(eVar2, aVar6, dVar9)).mo11133q(C5982c.class, cls11, dVar9);
        if (i4 >= 23) {
            C5165j<ByteBuffer, Bitmap> d = C5801c0.m25676d(eVar);
            hVar2.mo11120c(ByteBuffer.class, Bitmap.class, d);
            hVar2.mo11120c(ByteBuffer.class, BitmapDrawable.class, new C5792a(resources, d));
        }
        this.f12603e = new C3323d(context, bVar, hVar2, new C6384f(), aVar, map, list, kVar, z, i);
    }

    /* renamed from: a */
    private static void m11096a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f12599n) {
            f12599n = true;
            m11100m(context, generatedAppGlideModule);
            f12599n = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: c */
    public static C3319b m11097c(Context context) {
        if (f12598m == null) {
            GeneratedAppGlideModule d = m11098d(context.getApplicationContext());
            synchronized (C3319b.class) {
                if (f12598m == null) {
                    m11096a(context, d);
                }
            }
        }
        return f12598m;
    }

    /* renamed from: d */
    private static GeneratedAppGlideModule m11098d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (InstantiationException e) {
            m11102q(e);
        } catch (IllegalAccessException e2) {
            m11102q(e2);
        } catch (NoSuchMethodException e3) {
            m11102q(e3);
        } catch (InvocationTargetException e4) {
            m11102q(e4);
        }
        return null;
    }

    /* renamed from: l */
    private static C6118l m11099l(Context context) {
        C0065j.m248e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m11097c(context).mo11098k();
    }

    /* renamed from: m */
    private static void m11100m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m11101n(context, new C3321c(), generatedAppGlideModule);
    }

    /* renamed from: n */
    private static void m11101n(Context context, C3321c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<C6187b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo23606c()) {
            emptyList = new C6189d(applicationContext).mo23610a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo11089d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.mo11089d();
            Iterator<C6187b> it = emptyList.iterator();
            while (it.hasNext()) {
                C6187b next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C6187b bVar : emptyList) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + bVar.getClass());
            }
        }
        cVar.mo11108b(generatedAppGlideModule != null ? generatedAppGlideModule.mo11090e() : null);
        for (C6187b a : emptyList) {
            a.mo23607a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo23605b(applicationContext, cVar);
        }
        C3319b a2 = cVar.mo11107a(applicationContext);
        for (C6187b next2 : emptyList) {
            try {
                next2.mo23608b(applicationContext, a2, a2.f12604f);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + next2.getClass().getName(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo23609a(applicationContext, a2, a2.f12604f);
        }
        applicationContext.registerComponentCallbacks(a2);
        f12598m = a2;
    }

    /* renamed from: q */
    private static void m11102q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static C3335j m11103t(Context context) {
        return m11099l(context).mo23447e(context);
    }

    /* renamed from: b */
    public void mo11091b() {
        C0066k.m249a();
        this.f12602d.mo21923b();
        this.f12601c.mo21826b();
        this.f12605g.mo21804b();
    }

    /* renamed from: e */
    public C5382b mo11092e() {
        return this.f12605g;
    }

    /* renamed from: f */
    public C5387e mo11093f() {
        return this.f12601c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C6108d mo11094g() {
        return this.f12607i;
    }

    /* renamed from: h */
    public Context mo11095h() {
        return this.f12603e.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C3323d mo11096i() {
        return this.f12603e;
    }

    /* renamed from: j */
    public C3327h mo11097j() {
        return this.f12604f;
    }

    /* renamed from: k */
    public C6118l mo11098k() {
        return this.f12606h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo11099o(C3335j jVar) {
        synchronized (this.f12608j) {
            if (!this.f12608j.contains(jVar)) {
                this.f12608j.add(jVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo11091b();
    }

    public void onTrimMemory(int i) {
        mo11104r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo11103p(C6386h<?> hVar) {
        synchronized (this.f12608j) {
            for (C3335j w : this.f12608j) {
                if (w.mo11167w(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void mo11104r(int i) {
        C0066k.m249a();
        for (C3335j onTrimMemory : this.f12608j) {
            onTrimMemory.onTrimMemory(i);
        }
        this.f12602d.mo21917a(i);
        this.f12601c.mo21825a(i);
        this.f12605g.mo21803a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo11105s(C3335j jVar) {
        synchronized (this.f12608j) {
            if (this.f12608j.contains(jVar)) {
                this.f12608j.remove(jVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
