package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0284c;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.view.menu.C0298k;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0382f;
import androidx.appcompat.widget.C0384f0;
import androidx.appcompat.widget.C0398k0;
import androidx.appcompat.widget.C0401l0;
import androidx.appcompat.widget.C0407n;
import androidx.appcompat.widget.C0413r;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0600b;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0775g;
import com.google.android.exoplayer2.extractor.p039ts.PsExtractor;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p001a0.C0024g;
import p010b0.C1523f;
import p072f.C5238a;
import p072f.C5240c;
import p072f.C5243f;
import p072f.C5244g;
import p072f.C5246i;
import p072f.C5247j;
import p078g.C5264a;
import p098k.C5522b;
import p098k.C5525d;
import p098k.C5527f;
import p098k.C5529g;
import p098k.C5534i;
import p104l0.C5643c;
import p110m0.C5684a0;
import p110m0.C5690c0;
import p110m0.C5706e;
import p110m0.C5708f;
import p110m0.C5718p;
import p110m0.C5723u;
import p110m0.C5740y;
import p110m0.C5744z;
import p149t.C6090g;

class AppCompatDelegateImpl extends C0255c implements C0287e.C0288a, LayoutInflater.Factory2 {

    /* renamed from: m0 */
    private static final C6090g<String, Integer> f672m0 = new C6090g<>();

    /* renamed from: n0 */
    private static final boolean f673n0;

    /* renamed from: o0 */
    private static final int[] f674o0 = {16842836};

    /* renamed from: p0 */
    private static final boolean f675p0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: q0 */
    private static final boolean f676q0;

    /* renamed from: r0 */
    private static boolean f677r0 = true;

    /* renamed from: A */
    private boolean f678A;

    /* renamed from: B */
    boolean f679B;

    /* renamed from: C */
    boolean f680C;

    /* renamed from: D */
    boolean f681D;

    /* renamed from: E */
    boolean f682E;

    /* renamed from: F */
    boolean f683F;

    /* renamed from: G */
    private boolean f684G;

    /* renamed from: H */
    private PanelFeatureState[] f685H;

    /* renamed from: I */
    private PanelFeatureState f686I;

    /* renamed from: J */
    private boolean f687J;

    /* renamed from: K */
    private boolean f688K;

    /* renamed from: L */
    private boolean f689L;

    /* renamed from: M */
    private boolean f690M;

    /* renamed from: N */
    boolean f691N;

    /* renamed from: O */
    private int f692O;

    /* renamed from: P */
    private int f693P;

    /* renamed from: Q */
    private boolean f694Q;

    /* renamed from: R */
    private boolean f695R;

    /* renamed from: S */
    private C0243l f696S;

    /* renamed from: T */
    private C0243l f697T;

    /* renamed from: U */
    boolean f698U;

    /* renamed from: V */
    int f699V;

    /* renamed from: W */
    private final Runnable f700W;

    /* renamed from: X */
    private boolean f701X;

    /* renamed from: Y */
    private Rect f702Y;

    /* renamed from: Z */
    private Rect f703Z;

    /* renamed from: e */
    final Object f704e;

    /* renamed from: f */
    final Context f705f;

    /* renamed from: g */
    Window f706g;

    /* renamed from: h */
    private C0241j f707h;

    /* renamed from: i */
    final C0254b f708i;

    /* renamed from: j */
    ActionBar f709j;

    /* renamed from: k */
    MenuInflater f710k;

    /* renamed from: l */
    private CharSequence f711l;

    /* renamed from: l0 */
    private C0258e f712l0;

    /* renamed from: m */
    private C0407n f713m;

    /* renamed from: n */
    private C0238h f714n;

    /* renamed from: o */
    private C0251s f715o;

    /* renamed from: p */
    C5522b f716p;

    /* renamed from: q */
    ActionBarContextView f717q;

    /* renamed from: r */
    PopupWindow f718r;

    /* renamed from: s */
    Runnable f719s;

    /* renamed from: t */
    C5740y f720t;

    /* renamed from: u */
    private boolean f721u;

    /* renamed from: v */
    private boolean f722v;

    /* renamed from: w */
    ViewGroup f723w;

    /* renamed from: x */
    private TextView f724x;

    /* renamed from: y */
    private View f725y;

    /* renamed from: z */
    private boolean f726z;

    protected static final class PanelFeatureState {

        /* renamed from: a */
        int f727a;

        /* renamed from: b */
        int f728b;

        /* renamed from: c */
        int f729c;

        /* renamed from: d */
        int f730d;

        /* renamed from: e */
        int f731e;

        /* renamed from: f */
        int f732f;

        /* renamed from: g */
        ViewGroup f733g;

        /* renamed from: h */
        View f734h;

        /* renamed from: i */
        View f735i;

        /* renamed from: j */
        C0287e f736j;

        /* renamed from: k */
        C0284c f737k;

        /* renamed from: l */
        Context f738l;

        /* renamed from: m */
        boolean f739m;

        /* renamed from: n */
        boolean f740n;

        /* renamed from: o */
        boolean f741o;

        /* renamed from: p */
        public boolean f742p;

        /* renamed from: q */
        boolean f743q = false;

        /* renamed from: r */
        boolean f744r;

        /* renamed from: s */
        Bundle f745s;

        @SuppressLint({"BanParcelableUsage"})
        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0229a();

            /* renamed from: b */
            int f746b;

            /* renamed from: c */
            boolean f747c;

            /* renamed from: d */
            Bundle f748d;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            class C0229a implements Parcelable.ClassLoaderCreator<SavedState> {
                C0229a() {
                }

                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m1116a(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m1116a(parcel, classLoader);
                }

                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            SavedState() {
            }

            /* renamed from: a */
            static SavedState m1116a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f746b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f747c = z;
                if (z) {
                    savedState.f748d = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f746b);
                parcel.writeInt(this.f747c ? 1 : 0);
                if (this.f747c) {
                    parcel.writeBundle(this.f748d);
                }
            }
        }

        PanelFeatureState(int i) {
            this.f727a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0298k mo856a(C0296j.C0297a aVar) {
            if (this.f736j == null) {
                return null;
            }
            if (this.f737k == null) {
                C0284c cVar = new C0284c(this.f738l, C5244g.f22951l);
                this.f737k = cVar;
                cVar.mo1031g(aVar);
                this.f736j.mo1124b(this.f737k);
            }
            return this.f737k.mo1070j(this.f733g);
        }

        /* renamed from: b */
        public boolean mo857b() {
            if (this.f734h == null) {
                return false;
            }
            if (this.f735i == null && this.f737k.mo1069a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo858c(C0287e eVar) {
            C0284c cVar;
            C0287e eVar2 = this.f736j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.mo1104Q(this.f737k);
                }
                this.f736j = eVar;
                if (eVar != null && (cVar = this.f737k) != null) {
                    eVar.mo1124b(cVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo859d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C5238a.f22805a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C5238a.f22794H, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C5246i.f22977c, true);
            }
            C5525d dVar = new C5525d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f738l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C5247j.f22986B0);
            this.f728b = obtainStyledAttributes.getResourceId(C5247j.f23001E0, 0);
            this.f732f = obtainStyledAttributes.getResourceId(C5247j.f22996D0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    class C0230a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f749a;

        C0230a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f749a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m1120a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m1120a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f749a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f749a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    class C0231b implements Runnable {
        C0231b() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f699V & 1) != 0) {
                appCompatDelegateImpl.mo818V(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f699V & 4096) != 0) {
                appCompatDelegateImpl2.mo818V(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f698U = false;
            appCompatDelegateImpl3.f699V = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    class C0232c implements C5718p {
        C0232c() {
        }

        /* renamed from: a */
        public C5690c0 mo870a(View view, C5690c0 c0Var) {
            int l = c0Var.mo22413l();
            int M0 = AppCompatDelegateImpl.this.mo812M0(c0Var, (Rect) null);
            if (l != M0) {
                c0Var = c0Var.mo22417q(c0Var.mo22411j(), M0, c0Var.mo22412k(), c0Var.mo22410i());
            }
            return C5723u.m25302a0(view, c0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    class C0233d implements C0413r.C0414a {
        C0233d() {
        }

        /* renamed from: a */
        public void mo871a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.mo812M0((C5690c0) null, rect);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    class C0234e implements ContentFrameLayout.C0338a {
        C0234e() {
        }

        /* renamed from: a */
        public void mo872a() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.mo816T();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    class C0235f implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f$a */
        class C0236a extends C5684a0 {
            C0236a() {
            }

            /* renamed from: b */
            public void mo875b(View view) {
                AppCompatDelegateImpl.this.f717q.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f720t.mo22509f((C5744z) null);
                AppCompatDelegateImpl.this.f720t = null;
            }

            /* renamed from: c */
            public void mo876c(View view) {
                AppCompatDelegateImpl.this.f717q.setVisibility(0);
            }
        }

        C0235f() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f718r.showAtLocation(appCompatDelegateImpl.f717q, 55, 0, 0);
            AppCompatDelegateImpl.this.mo819W();
            if (AppCompatDelegateImpl.this.mo805E0()) {
                AppCompatDelegateImpl.this.f717q.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f720t = C5723u.m25307d(appCompatDelegateImpl2.f717q).mo22504a(1.0f);
                AppCompatDelegateImpl.this.f720t.mo22509f(new C0236a());
                return;
            }
            AppCompatDelegateImpl.this.f717q.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f717q.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    class C0237g extends C5684a0 {
        C0237g() {
        }

        /* renamed from: b */
        public void mo875b(View view) {
            AppCompatDelegateImpl.this.f717q.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f720t.mo22509f((C5744z) null);
            AppCompatDelegateImpl.this.f720t = null;
        }

        /* renamed from: c */
        public void mo876c(View view) {
            AppCompatDelegateImpl.this.f717q.setVisibility(0);
            AppCompatDelegateImpl.this.f717q.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f717q.getParent() instanceof View) {
                C5723u.m25324l0((View) AppCompatDelegateImpl.this.f717q.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    private final class C0238h implements C0296j.C0297a {
        C0238h() {
        }

        /* renamed from: b */
        public void mo877b(C0287e eVar, boolean z) {
            AppCompatDelegateImpl.this.mo811M(eVar);
        }

        /* renamed from: c */
        public boolean mo878c(C0287e eVar) {
            Window.Callback g0 = AppCompatDelegateImpl.this.mo828g0();
            if (g0 == null) {
                return true;
            }
            g0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    class C0239i implements C5522b.C5523a {

        /* renamed from: a */
        private C5522b.C5523a f758a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i$a */
        class C0240a extends C5684a0 {
            C0240a() {
            }

            /* renamed from: b */
            public void mo875b(View view) {
                AppCompatDelegateImpl.this.f717q.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f718r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f717q.getParent() instanceof View) {
                    C5723u.m25324l0((View) AppCompatDelegateImpl.this.f717q.getParent());
                }
                AppCompatDelegateImpl.this.f717q.removeAllViews();
                AppCompatDelegateImpl.this.f720t.mo22509f((C5744z) null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f720t = null;
                C5723u.m25324l0(appCompatDelegateImpl2.f723w);
            }
        }

        public C0239i(C5522b.C5523a aVar) {
            this.f758a = aVar;
        }

        /* renamed from: a */
        public boolean mo879a(C5522b bVar, MenuItem menuItem) {
            return this.f758a.mo879a(bVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo880b(C5522b bVar, Menu menu) {
            return this.f758a.mo880b(bVar, menu);
        }

        /* renamed from: c */
        public boolean mo881c(C5522b bVar, Menu menu) {
            C5723u.m25324l0(AppCompatDelegateImpl.this.f723w);
            return this.f758a.mo881c(bVar, menu);
        }

        /* renamed from: d */
        public void mo882d(C5522b bVar) {
            this.f758a.mo882d(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f718r != null) {
                appCompatDelegateImpl.f706g.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f719s);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f717q != null) {
                appCompatDelegateImpl2.mo819W();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f720t = C5723u.m25307d(appCompatDelegateImpl3.f717q).mo22504a(0.0f);
                AppCompatDelegateImpl.this.f720t.mo22509f(new C0240a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            C0254b bVar2 = appCompatDelegateImpl4.f708i;
            if (bVar2 != null) {
                bVar2.mo776d(appCompatDelegateImpl4.f716p);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f716p = null;
            C5723u.m25324l0(appCompatDelegateImpl5.f723w);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    private class C0242k extends C0243l {

        /* renamed from: c */
        private final PowerManager f762c;

        C0242k(Context context) {
            super();
            this.f762c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo894b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo895c() {
            if (Build.VERSION.SDK_INT < 21 || !this.f762c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        /* renamed from: d */
        public void mo896d() {
            AppCompatDelegateImpl.this.mo807G();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    abstract class C0243l {

        /* renamed from: a */
        private BroadcastReceiver f764a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l$a */
        class C0244a extends BroadcastReceiver {
            C0244a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0243l.this.mo896d();
            }
        }

        C0243l() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo897a() {
            BroadcastReceiver broadcastReceiver = this.f764a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f705f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f764a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo894b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo895c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo896d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo898e() {
            mo897a();
            IntentFilter b = mo894b();
            if (b != null && b.countActions() != 0) {
                if (this.f764a == null) {
                    this.f764a = new C0244a();
                }
                AppCompatDelegateImpl.this.f705f.registerReceiver(this.f764a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    private class C0245m extends C0243l {

        /* renamed from: c */
        private final C0268i f767c;

        C0245m(C0268i iVar) {
            super();
            this.f767c = iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo894b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo895c() {
            return this.f767c.mo958d() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo896d() {
            AppCompatDelegateImpl.this.mo807G();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    static class C0246n {
        /* renamed from: a */
        static void m1147a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    static class C0247o {
        /* renamed from: a */
        static void m1148a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    static class C0248p {
        /* renamed from: a */
        static void m1149a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    private static class C0249q {
        /* renamed from: a */
        static void m1150a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$r */
    private class C0250r extends ContentFrameLayout {
        public C0250r(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m1151c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo817U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m1151c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.mo813O(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C5264a.m23789d(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s */
    private final class C0251s implements C0296j.C0297a {
        C0251s() {
        }

        /* renamed from: b */
        public void mo877b(C0287e eVar, boolean z) {
            C0287e F = eVar.mo1094F();
            boolean z2 = F != eVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                eVar = F;
            }
            PanelFeatureState Z = appCompatDelegateImpl.mo820Z(eVar);
            if (Z == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo810L(Z.f727a, Z, F);
                AppCompatDelegateImpl.this.mo814P(Z, true);
                return;
            }
            AppCompatDelegateImpl.this.mo814P(Z, z);
        }

        /* renamed from: c */
        public boolean mo878c(C0287e eVar) {
            Window.Callback g0;
            if (eVar != eVar.mo1094F()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f679B || (g0 = appCompatDelegateImpl.mo828g0()) == null || AppCompatDelegateImpl.this.f691N) {
                return true;
            }
            g0.onMenuOpened(108, eVar);
            return true;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i < 21;
        f673n0 = z2;
        if (i >= 17) {
            z = true;
        }
        f676q0 = z;
        if (z2 && !f677r0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0230a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    AppCompatDelegateImpl(Activity activity, C0254b bVar) {
        this(activity, (Window) null, bVar, activity);
    }

    /* renamed from: A0 */
    private boolean m1027A0(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        C0287e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f739m || m1028B0(panelFeatureState, keyEvent)) && (eVar = panelFeatureState.f736j) != null) {
            z = eVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f713m == null) {
            mo814P(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: B0 */
    private boolean m1028B0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        C0407n nVar;
        C0407n nVar2;
        C0407n nVar3;
        if (this.f691N) {
            return false;
        }
        if (panelFeatureState.f739m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f686I;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            mo814P(panelFeatureState2, false);
        }
        Window.Callback g0 = mo828g0();
        if (g0 != null) {
            panelFeatureState.f735i = g0.onCreatePanelView(panelFeatureState.f727a);
        }
        int i = panelFeatureState.f727a;
        boolean z = i == 0 || i == 108;
        if (z && (nVar3 = this.f713m) != null) {
            nVar3.mo1329c();
        }
        if (panelFeatureState.f735i == null && (!z || !(mo855z0() instanceof C0261g))) {
            C0287e eVar = panelFeatureState.f736j;
            if (eVar == null || panelFeatureState.f744r) {
                if (eVar == null && (!m1052k0(panelFeatureState) || panelFeatureState.f736j == null)) {
                    return false;
                }
                if (z && this.f713m != null) {
                    if (this.f714n == null) {
                        this.f714n = new C0238h();
                    }
                    this.f713m.mo1327a(panelFeatureState.f736j, this.f714n);
                }
                panelFeatureState.f736j.mo1140h0();
                if (!g0.onCreatePanelMenu(panelFeatureState.f727a, panelFeatureState.f736j)) {
                    panelFeatureState.mo858c((C0287e) null);
                    if (z && (nVar2 = this.f713m) != null) {
                        nVar2.mo1327a((Menu) null, this.f714n);
                    }
                    return false;
                }
                panelFeatureState.f744r = false;
            }
            panelFeatureState.f736j.mo1140h0();
            Bundle bundle = panelFeatureState.f745s;
            if (bundle != null) {
                panelFeatureState.f736j.mo1105R(bundle);
                panelFeatureState.f745s = null;
            }
            if (!g0.onPreparePanel(0, panelFeatureState.f735i, panelFeatureState.f736j)) {
                if (z && (nVar = this.f713m) != null) {
                    nVar.mo1327a((Menu) null, this.f714n);
                }
                panelFeatureState.f736j.mo1137g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f742p = z2;
            panelFeatureState.f736j.setQwertyMode(z2);
            panelFeatureState.f736j.mo1137g0();
        }
        panelFeatureState.f739m = true;
        panelFeatureState.f740n = false;
        this.f686I = panelFeatureState;
        return true;
    }

    /* renamed from: C0 */
    private void m1029C0(boolean z) {
        C0407n nVar = this.f713m;
        if (nVar == null || !nVar.mo1331d() || (ViewConfiguration.get(this.f705f).hasPermanentMenuKey() && !this.f713m.mo1333e())) {
            PanelFeatureState e0 = mo825e0(0, true);
            e0.f743q = true;
            mo814P(e0, false);
            m1057y0(e0, (KeyEvent) null);
            return;
        }
        Window.Callback g0 = mo828g0();
        if (this.f713m.mo1328b() && z) {
            this.f713m.mo1334f();
            if (!this.f691N) {
                g0.onPanelClosed(108, mo825e0(0, true).f736j);
            }
        } else if (g0 != null && !this.f691N) {
            if (this.f698U && (this.f699V & 1) != 0) {
                this.f706g.getDecorView().removeCallbacks(this.f700W);
                this.f700W.run();
            }
            PanelFeatureState e02 = mo825e0(0, true);
            C0287e eVar = e02.f736j;
            if (eVar != null && !e02.f744r && g0.onPreparePanel(0, e02.f735i, eVar)) {
                g0.onMenuOpened(108, e02.f736j);
                this.f713m.mo1336g();
            }
        }
    }

    /* renamed from: D0 */
    private int m1030D0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: F0 */
    private boolean m1031F0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f706g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C5723u.m25293S((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: H */
    private boolean m1032H(boolean z) {
        if (this.f691N) {
            return false;
        }
        int K = m1037K();
        boolean K0 = m1038K0(mo836o0(this.f705f, K), z);
        if (K == 0) {
            m1048d0(this.f705f).mo898e();
        } else {
            C0243l lVar = this.f696S;
            if (lVar != null) {
                lVar.mo897a();
            }
        }
        if (K == 3) {
            m1047c0(this.f705f).mo898e();
        } else {
            C0243l lVar2 = this.f697T;
            if (lVar2 != null) {
                lVar2.mo897a();
            }
        }
        return K0;
    }

    /* renamed from: I */
    private void m1033I() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f723w.findViewById(16908290);
        View decorView = this.f706g.getDecorView();
        contentFrameLayout.mo1696b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f705f.obtainStyledAttributes(C5247j.f22986B0);
        obtainStyledAttributes.getValue(C5247j.f23046N0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C5247j.f23051O0, contentFrameLayout.getMinWidthMinor());
        int i = C5247j.f23036L0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C5247j.f23041M0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C5247j.f23026J0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C5247j.f23031K0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: I0 */
    private void m1034I0() {
        if (this.f722v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: J */
    private void m1035J(Window window) {
        if (this.f706g == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0241j)) {
                C0241j jVar = new C0241j(callback);
                this.f707h = jVar;
                window.setCallback(jVar);
                C0384f0 u = C0384f0.m1993u(this.f705f, (AttributeSet) null, f674o0);
                Drawable h = u.mo2102h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                u.mo2114w();
                this.f706g = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: J0 */
    private AppCompatActivity m1036J0() {
        Context context = this.f705f;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    /* renamed from: K */
    private int m1037K() {
        int i = this.f692O;
        return i != -100 ? i : C0255c.m1167j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1038K0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f705f
            r1 = 0
            android.content.res.Configuration r0 = r6.m1042Q(r0, r7, r1)
            boolean r2 = r6.m1054m0()
            android.content.Context r3 = r6.f705f
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.f688K
            if (r8 == 0) goto L_0x0047
            boolean r8 = f675p0
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.f689L
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f704e
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f704e
            android.app.Activity r8 = (android.app.Activity) r8
            p001a0.C0008a.m33o(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.m1039L0(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f704e
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            r8.mo767F(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m1038K0(int, boolean):boolean");
    }

    /* renamed from: L0 */
    private void m1039L0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f705f.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            C0260f.m1224a(resources);
        }
        int i3 = this.f693P;
        if (i3 != 0) {
            this.f705f.setTheme(i3);
            if (i2 >= 23) {
                this.f705f.getTheme().applyStyle(this.f693P, true);
            }
        }
        if (z) {
            Object obj = this.f704e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C0775g) {
                    if (((C0775g) activity).mo639a().mo3985b().mo3988a(C0769d.C0772c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f690M) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: N */
    private void m1040N() {
        C0243l lVar = this.f696S;
        if (lVar != null) {
            lVar.mo897a();
        }
        C0243l lVar2 = this.f697T;
        if (lVar2 != null) {
            lVar2.mo897a();
        }
    }

    /* renamed from: N0 */
    private void m1041N0(View view) {
        int i;
        if ((C5723u.m25287M(view) & 8192) != 0) {
            i = C0600b.m3292d(this.f705f, C5240c.f22833b);
        } else {
            i = C0600b.m3292d(this.f705f, C5240c.f22832a);
        }
        view.setBackgroundColor(i);
    }

    /* renamed from: Q */
    private Configuration m1042Q(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: R */
    private ViewGroup m1043R() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f705f.obtainStyledAttributes(C5247j.f22986B0);
        int i = C5247j.f23011G0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C5247j.f23056P0, false)) {
                mo854z(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo854z(108);
            }
            if (obtainStyledAttributes.getBoolean(C5247j.f23016H0, false)) {
                mo854z(109);
            }
            if (obtainStyledAttributes.getBoolean(C5247j.f23021I0, false)) {
                mo854z(10);
            }
            this.f682E = obtainStyledAttributes.getBoolean(C5247j.f22991C0, false);
            obtainStyledAttributes.recycle();
            m1045Y();
            this.f706g.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f705f);
            if (this.f683F) {
                viewGroup = this.f681D ? (ViewGroup) from.inflate(C5244g.f22956q, (ViewGroup) null) : (ViewGroup) from.inflate(C5244g.f22955p, (ViewGroup) null);
            } else if (this.f682E) {
                viewGroup = (ViewGroup) from.inflate(C5244g.f22947h, (ViewGroup) null);
                this.f680C = false;
                this.f679B = false;
            } else if (this.f679B) {
                TypedValue typedValue = new TypedValue();
                this.f705f.getTheme().resolveAttribute(C5238a.f22810f, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C5525d(this.f705f, typedValue.resourceId);
                } else {
                    context = this.f705f;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C5244g.f22957r, (ViewGroup) null);
                C0407n nVar = (C0407n) viewGroup.findViewById(C5243f.f22930q);
                this.f713m = nVar;
                nVar.setWindowCallback(mo828g0());
                if (this.f680C) {
                    this.f713m.mo1343h(109);
                }
                if (this.f726z) {
                    this.f713m.mo1343h(2);
                }
                if (this.f678A) {
                    this.f713m.mo1343h(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    C5723u.m25266B0(viewGroup, new C0232c());
                } else if (viewGroup instanceof C0413r) {
                    ((C0413r) viewGroup).setOnFitSystemWindowsListener(new C0233d());
                }
                if (this.f713m == null) {
                    this.f724x = (TextView) viewGroup.findViewById(C5243f.f22910S);
                }
                C0401l0.m2126c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C5243f.f22915b);
                ViewGroup viewGroup2 = (ViewGroup) this.f706g.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f706g.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0234e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f679B + ", windowActionBarOverlay: " + this.f680C + ", android:windowIsFloating: " + this.f682E + ", windowActionModeOverlay: " + this.f681D + ", windowNoTitle: " + this.f683F + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: X */
    private void m1044X() {
        if (!this.f722v) {
            this.f723w = m1043R();
            CharSequence f0 = mo827f0();
            if (!TextUtils.isEmpty(f0)) {
                C0407n nVar = this.f713m;
                if (nVar != null) {
                    nVar.setWindowTitle(f0);
                } else if (mo855z0() != null) {
                    mo855z0().mo724w(f0);
                } else {
                    TextView textView = this.f724x;
                    if (textView != null) {
                        textView.setText(f0);
                    }
                }
            }
            m1033I();
            mo853x0(this.f723w);
            this.f722v = true;
            PanelFeatureState e0 = mo825e0(0, false);
            if (this.f691N) {
                return;
            }
            if (e0 == null || e0.f736j == null) {
                m1053l0(108);
            }
        }
    }

    /* renamed from: Y */
    private void m1045Y() {
        if (this.f706g == null) {
            Object obj = this.f704e;
            if (obj instanceof Activity) {
                m1035J(((Activity) obj).getWindow());
            }
        }
        if (this.f706g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: a0 */
    private static Configuration m1046a0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0247o.m1148a(configuration, configuration2, configuration3);
            } else if (!C5643c.m24954a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & PsExtractor.AUDIO_STREAM;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & PsExtractor.AUDIO_STREAM)) {
                configuration3.screenLayout |= i21 & PsExtractor.AUDIO_STREAM;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0248p.m1149a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            if (i5 >= 17) {
                C0246n.m1147a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* renamed from: c0 */
    private C0243l m1047c0(Context context) {
        if (this.f697T == null) {
            this.f697T = new C0242k(context);
        }
        return this.f697T;
    }

    /* renamed from: d0 */
    private C0243l m1048d0(Context context) {
        if (this.f696S == null) {
            this.f696S = new C0245m(C0268i.m1257a(context));
        }
        return this.f696S;
    }

    /* renamed from: h0 */
    private void m1049h0() {
        m1044X();
        if (this.f679B && this.f709j == null) {
            Object obj = this.f704e;
            if (obj instanceof Activity) {
                this.f709j = new C0270j((Activity) this.f704e, this.f680C);
            } else if (obj instanceof Dialog) {
                this.f709j = new C0270j((Dialog) this.f704e);
            }
            ActionBar actionBar = this.f709j;
            if (actionBar != null) {
                actionBar.mo718q(this.f701X);
            }
        }
    }

    /* renamed from: i0 */
    private boolean m1050i0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f735i;
        if (view != null) {
            panelFeatureState.f734h = view;
            return true;
        } else if (panelFeatureState.f736j == null) {
            return false;
        } else {
            if (this.f715o == null) {
                this.f715o = new C0251s();
            }
            View view2 = (View) panelFeatureState.mo856a(this.f715o);
            panelFeatureState.f734h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: j0 */
    private boolean m1051j0(PanelFeatureState panelFeatureState) {
        panelFeatureState.mo859d(mo823b0());
        panelFeatureState.f733g = new C0250r(panelFeatureState.f738l);
        panelFeatureState.f729c = 81;
        return true;
    }

    /* renamed from: k0 */
    private boolean m1052k0(PanelFeatureState panelFeatureState) {
        Context context = this.f705f;
        int i = panelFeatureState.f727a;
        if ((i == 0 || i == 108) && this.f713m != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C5238a.f22810f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C5238a.f22811g, typedValue, true);
            } else {
                theme.resolveAttribute(C5238a.f22811g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C5525d dVar = new C5525d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0287e eVar = new C0287e(context);
        eVar.mo1109V(this);
        panelFeatureState.mo858c(eVar);
        return true;
    }

    /* renamed from: l0 */
    private void m1053l0(int i) {
        this.f699V = (1 << i) | this.f699V;
        if (!this.f698U) {
            C5723u.m25314g0(this.f706g.getDecorView(), this.f700W);
            this.f698U = true;
        }
    }

    /* renamed from: m0 */
    private boolean m1054m0() {
        if (!this.f695R && (this.f704e instanceof Activity)) {
            PackageManager packageManager = this.f705f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f705f, this.f704e.getClass()), i >= 29 ? 269221888 : i >= 24 ? 786432 : 0);
                this.f694Q = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f694Q = false;
            }
        }
        this.f695R = true;
        return this.f694Q;
    }

    /* renamed from: r0 */
    private boolean m1055r0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState e0 = mo825e0(i, true);
        if (!e0.f741o) {
            return m1028B0(e0, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1056u0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            k.b r0 = r4.f716p
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r4.mo825e0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.n r5 = r4.f713m
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.mo1331d()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f705f
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.n r5 = r4.f713m
            boolean r5 = r5.mo1328b()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f691N
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.m1028B0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.n r5 = r4.f713m
            boolean r0 = r5.mo1336g()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.n r5 = r4.f713m
            boolean r0 = r5.mo1334f()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f741o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f740n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f739m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f744r
            if (r5 == 0) goto L_0x005b
            r2.f739m = r1
            boolean r5 = r4.m1028B0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.m1057y0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = 0
            goto L_0x0068
        L_0x0064:
            r4.mo814P(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f705f
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m1056u0(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: y0 */
    private void m1057y0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!panelFeatureState.f741o && !this.f691N) {
            if (panelFeatureState.f727a == 0) {
                if ((this.f705f.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback g0 = mo828g0();
            if (g0 == null || g0.onMenuOpened(panelFeatureState.f727a, panelFeatureState.f736j)) {
                WindowManager windowManager = (WindowManager) this.f705f.getSystemService("window");
                if (windowManager != null && m1028B0(panelFeatureState, keyEvent)) {
                    ViewGroup viewGroup = panelFeatureState.f733g;
                    if (viewGroup == null || panelFeatureState.f743q) {
                        if (viewGroup == null) {
                            if (!m1051j0(panelFeatureState) || panelFeatureState.f733g == null) {
                                return;
                            }
                        } else if (panelFeatureState.f743q && viewGroup.getChildCount() > 0) {
                            panelFeatureState.f733g.removeAllViews();
                        }
                        if (!m1050i0(panelFeatureState) || !panelFeatureState.mo857b()) {
                            panelFeatureState.f743q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f734h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        panelFeatureState.f733g.setBackgroundResource(panelFeatureState.f728b);
                        ViewParent parent = panelFeatureState.f734h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(panelFeatureState.f734h);
                        }
                        panelFeatureState.f733g.addView(panelFeatureState.f734h, layoutParams2);
                        if (!panelFeatureState.f734h.hasFocus()) {
                            panelFeatureState.f734h.requestFocus();
                        }
                    } else {
                        View view = panelFeatureState.f735i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            panelFeatureState.f740n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f730d, panelFeatureState.f731e, 1002, 8519680, -3);
                            layoutParams3.gravity = panelFeatureState.f729c;
                            layoutParams3.windowAnimations = panelFeatureState.f732f;
                            windowManager.addView(panelFeatureState.f733g, layoutParams3);
                            panelFeatureState.f741o = true;
                            return;
                        }
                    }
                    i = -2;
                    panelFeatureState.f740n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f730d, panelFeatureState.f731e, 1002, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.f729c;
                    layoutParams32.windowAnimations = panelFeatureState.f732f;
                    windowManager.addView(panelFeatureState.f733g, layoutParams32);
                    panelFeatureState.f741o = true;
                    return;
                }
                return;
            }
            mo814P(panelFeatureState, true);
        }
    }

    /* renamed from: A */
    public void mo800A(int i) {
        m1044X();
        ViewGroup viewGroup = (ViewGroup) this.f723w.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f705f).inflate(i, viewGroup);
        this.f707h.mo22060a().onContentChanged();
    }

    /* renamed from: B */
    public void mo801B(View view) {
        m1044X();
        ViewGroup viewGroup = (ViewGroup) this.f723w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f707h.mo22060a().onContentChanged();
    }

    /* renamed from: C */
    public void mo802C(View view, ViewGroup.LayoutParams layoutParams) {
        m1044X();
        ViewGroup viewGroup = (ViewGroup) this.f723w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f707h.mo22060a().onContentChanged();
    }

    /* renamed from: D */
    public void mo803D(Toolbar toolbar) {
        if (this.f704e instanceof Activity) {
            ActionBar m = mo832m();
            if (!(m instanceof C0270j)) {
                this.f710k = null;
                if (m != null) {
                    m.mo714m();
                }
                if (toolbar != null) {
                    C0261g gVar = new C0261g(toolbar, mo827f0(), this.f707h);
                    this.f709j = gVar;
                    this.f706g.setCallback(gVar.mo953z());
                } else {
                    this.f709j = null;
                    this.f706g.setCallback(this.f707h);
                }
                mo835o();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: E */
    public void mo804E(int i) {
        this.f693P = i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f723w;
     */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo805E0() {
        /*
            r1 = this;
            boolean r0 = r1.f722v
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f723w
            if (r0 == 0) goto L_0x0010
            boolean r0 = p110m0.C5723u.m25294T(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo805E0():boolean");
    }

    /* renamed from: F */
    public final void mo806F(CharSequence charSequence) {
        this.f711l = charSequence;
        C0407n nVar = this.f713m;
        if (nVar != null) {
            nVar.setWindowTitle(charSequence);
        } else if (mo855z0() != null) {
            mo855z0().mo724w(charSequence);
        } else {
            TextView textView = this.f724x;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: G */
    public boolean mo807G() {
        return m1032H(true);
    }

    /* renamed from: G0 */
    public C5522b mo808G0(C5522b.C5523a aVar) {
        C0254b bVar;
        if (aVar != null) {
            C5522b bVar2 = this.f716p;
            if (bVar2 != null) {
                bVar2.mo975c();
            }
            C0239i iVar = new C0239i(aVar);
            ActionBar m = mo832m();
            if (m != null) {
                C5522b x = m.mo725x(iVar);
                this.f716p = x;
                if (!(x == null || (bVar = this.f708i) == null)) {
                    bVar.mo783l(x);
                }
            }
            if (this.f716p == null) {
                this.f716p = mo809H0(iVar);
            }
            return this.f716p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p098k.C5522b mo809H0(p098k.C5522b.C5523a r8) {
        /*
            r7 = this;
            r7.mo819W()
            k.b r0 = r7.f716p
            if (r0 == 0) goto L_0x000a
            r0.mo975c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.C0239i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$i r0 = new androidx.appcompat.app.AppCompatDelegateImpl$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.b r0 = r7.f708i
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f691N
            if (r2 != 0) goto L_0x0022
            k.b r0 = r0.mo782j(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f716p = r0
            goto L_0x0162
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f717q
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f682E
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f705f
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p072f.C5238a.f22810f
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f705f
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            k.d r4 = new k.d
            android.content.Context r6 = r7.f705f
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f705f
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f717q = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p072f.C5238a.f22813i
            r5.<init>(r4, r1, r6)
            r7.f718r = r5
            r6 = 2
            androidx.core.widget.C0623j.m3449b(r5, r6)
            android.widget.PopupWindow r5 = r7.f718r
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f717q
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f718r
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p072f.C5238a.f22806b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f717q
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f718r
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$f r0 = new androidx.appcompat.app.AppCompatDelegateImpl$f
            r0.<init>()
            r7.f719s = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f723w
            int r4 = p072f.C5243f.f22921h
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo823b0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo2038a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f717q = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f717q
            if (r0 == 0) goto L_0x0162
            r7.mo819W()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f717q
            r0.mo1311k()
            k.e r0 = new k.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f717q
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f717q
            android.widget.PopupWindow r6 = r7.f718r
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo977e()
            boolean r8 = r8.mo880b(r0, r3)
            if (r8 == 0) goto L_0x0160
            r0.mo981k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f717q
            r8.mo1309h(r0)
            r7.f716p = r0
            boolean r8 = r7.mo805E0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f717q
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f717q
            m0.y r8 = p110m0.C5723u.m25307d(r8)
            m0.y r8 = r8.mo22504a(r0)
            r7.f720t = r8
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = new androidx.appcompat.app.AppCompatDelegateImpl$g
            r0.<init>()
            r8.mo22509f(r0)
            goto L_0x0150
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f717q
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f717q
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f717q
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f717q
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0150
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f717q
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p110m0.C5723u.m25324l0(r8)
        L_0x0150:
            android.widget.PopupWindow r8 = r7.f718r
            if (r8 == 0) goto L_0x0162
            android.view.Window r8 = r7.f706g
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f719s
            r8.post(r0)
            goto L_0x0162
        L_0x0160:
            r7.f716p = r1
        L_0x0162:
            k.b r8 = r7.f716p
            if (r8 == 0) goto L_0x016d
            androidx.appcompat.app.b r0 = r7.f708i
            if (r0 == 0) goto L_0x016d
            r0.mo783l(r8)
        L_0x016d:
            k.b r8 = r7.f716p
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo809H0(k.b$a):k.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo810L(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f685H;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f736j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f741o) && !this.f691N) {
            this.f707h.mo22060a().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo811M(C0287e eVar) {
        if (!this.f684G) {
            this.f684G = true;
            this.f713m.mo1344i();
            Window.Callback g0 = mo828g0();
            if (g0 != null && !this.f691N) {
                g0.onPanelClosed(108, eVar);
            }
            this.f684G = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public final int mo812M0(C5690c0 c0Var, Rect rect) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int i5 = 0;
        if (c0Var != null) {
            i = c0Var.mo22413l();
        } else {
            i = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f717q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f717q.getLayoutParams();
            boolean z3 = true;
            if (this.f717q.isShown()) {
                if (this.f702Y == null) {
                    this.f702Y = new Rect();
                    this.f703Z = new Rect();
                }
                Rect rect2 = this.f702Y;
                Rect rect3 = this.f703Z;
                if (c0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c0Var.mo22411j(), c0Var.mo22413l(), c0Var.mo22412k(), c0Var.mo22410i());
                }
                C0401l0.m2124a(this.f723w, rect2, rect3);
                int i6 = rect2.top;
                int i7 = rect2.left;
                int i8 = rect2.right;
                C5690c0 I = C5723u.m25279I(this.f723w);
                if (I == null) {
                    i2 = 0;
                } else {
                    i2 = I.mo22411j();
                }
                if (I == null) {
                    i3 = 0;
                } else {
                    i3 = I.mo22412k();
                }
                if (marginLayoutParams2.topMargin == i6 && marginLayoutParams2.leftMargin == i7 && marginLayoutParams2.rightMargin == i8) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i6;
                    marginLayoutParams2.leftMargin = i7;
                    marginLayoutParams2.rightMargin = i8;
                    z2 = true;
                }
                if (i6 <= 0 || this.f725y != null) {
                    View view = this.f725y;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i4 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3))) {
                        marginLayoutParams.height = i4;
                        marginLayoutParams.leftMargin = i2;
                        marginLayoutParams.rightMargin = i3;
                        this.f725y.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f705f);
                    this.f725y = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i3;
                    this.f723w.addView(this.f725y, -1, layoutParams);
                }
                View view3 = this.f725y;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m1041N0(this.f725y);
                }
                if (!this.f681D && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f717q.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f725y;
        if (view4 != null) {
            if (!z) {
                i5 = 8;
            }
            view4.setVisibility(i5);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo813O(int i) {
        mo814P(mo825e0(i, true), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo814P(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        C0407n nVar;
        if (!z || panelFeatureState.f727a != 0 || (nVar = this.f713m) == null || !nVar.mo1328b()) {
            WindowManager windowManager = (WindowManager) this.f705f.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f741o || (viewGroup = panelFeatureState.f733g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo810L(panelFeatureState.f727a, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f739m = false;
            panelFeatureState.f740n = false;
            panelFeatureState.f741o = false;
            panelFeatureState.f734h = null;
            panelFeatureState.f743q = true;
            if (this.f686I == panelFeatureState) {
                this.f686I = null;
                return;
            }
            return;
        }
        mo811M(panelFeatureState.f736j);
    }

    /* renamed from: S */
    public View mo815S(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f712l0 == null) {
            String string = this.f705f.obtainStyledAttributes(C5247j.f22986B0).getString(C5247j.f23006F0);
            if (string == null) {
                this.f712l0 = new C0258e();
            } else {
                try {
                    this.f712l0 = (C0258e) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f712l0 = new C0258e();
                }
            }
        }
        boolean z3 = f673n0;
        if (z3) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m1031F0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f712l0.mo949q(view, str, context, attributeSet, z, z3, true, C0398k0.m2092b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo816T() {
        C0287e eVar;
        C0407n nVar = this.f713m;
        if (nVar != null) {
            nVar.mo1344i();
        }
        if (this.f718r != null) {
            this.f706g.getDecorView().removeCallbacks(this.f719s);
            if (this.f718r.isShowing()) {
                try {
                    this.f718r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f718r = null;
        }
        mo819W();
        PanelFeatureState e0 = mo825e0(0, false);
        if (e0 != null && (eVar = e0.f736j) != null) {
            eVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public boolean mo817U(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f704e;
        boolean z = true;
        if (((obj instanceof C5706e.C5707a) || (obj instanceof C0256d)) && (decorView = this.f706g.getDecorView()) != null && C5706e.m25210d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f707h.mo22060a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo842q0(keyCode, keyEvent) : mo847t0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo818V(int i) {
        PanelFeatureState e0;
        PanelFeatureState e02 = mo825e0(i, true);
        if (e02.f736j != null) {
            Bundle bundle = new Bundle();
            e02.f736j.mo1107T(bundle);
            if (bundle.size() > 0) {
                e02.f745s = bundle;
            }
            e02.f736j.mo1140h0();
            e02.f736j.clear();
        }
        e02.f744r = true;
        e02.f743q = true;
        if ((i == 108 || i == 0) && this.f713m != null && (e0 = mo825e0(0, false)) != null) {
            e0.f739m = false;
            m1028B0(e0, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo819W() {
        C5740y yVar = this.f720t;
        if (yVar != null) {
            yVar.mo22505b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public PanelFeatureState mo820Z(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f685H;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f736j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo821a(C0287e eVar, MenuItem menuItem) {
        PanelFeatureState Z;
        Window.Callback g0 = mo828g0();
        if (g0 == null || this.f691N || (Z = mo820Z(eVar.mo1094F())) == null) {
            return false;
        }
        return g0.onMenuItemSelected(Z.f727a, menuItem);
    }

    /* renamed from: b */
    public void mo822b(C0287e eVar) {
        m1029C0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final Context mo823b0() {
        ActionBar m = mo832m();
        Context j = m != null ? m.mo711j() : null;
        return j == null ? this.f705f : j;
    }

    /* renamed from: d */
    public void mo824d(View view, ViewGroup.LayoutParams layoutParams) {
        m1044X();
        ((ViewGroup) this.f723w.findViewById(16908290)).addView(view, layoutParams);
        this.f707h.mo22060a().onContentChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public PanelFeatureState mo825e0(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f685H;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f685H = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: f */
    public Context mo826f(Context context) {
        boolean z = true;
        this.f688K = true;
        int o0 = mo836o0(context, m1037K());
        Configuration configuration = null;
        if (f676q0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0249q.m1150a((ContextThemeWrapper) context, m1042Q(context, o0, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C5525d) {
            try {
                ((C5525d) context).mo22015a(m1042Q(context, o0, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f675p0) {
            return super.mo826f(context);
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = m1046a0(configuration2, configuration3);
            }
            Configuration Q = m1042Q(context, o0, configuration);
            C5525d dVar = new C5525d(context, C5246i.f22978d);
            dVar.mo22015a(Q);
            boolean z2 = false;
            try {
                if (context.getTheme() == null) {
                    z = false;
                }
                z2 = z;
            } catch (NullPointerException unused3) {
            }
            if (z2) {
                C1523f.C1529d.m7900a(dVar.getTheme());
            }
            return super.mo826f(dVar);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Application failed to obtain resources from itself", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final CharSequence mo827f0() {
        Object obj = this.f704e;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f711l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final Window.Callback mo828g0() {
        return this.f706g.getCallback();
    }

    /* renamed from: i */
    public <T extends View> T mo829i(int i) {
        m1044X();
        return this.f706g.findViewById(i);
    }

    /* renamed from: k */
    public int mo830k() {
        return this.f692O;
    }

    /* renamed from: l */
    public MenuInflater mo831l() {
        if (this.f710k == null) {
            m1049h0();
            ActionBar actionBar = this.f709j;
            this.f710k = new C5529g(actionBar != null ? actionBar.mo711j() : this.f705f);
        }
        return this.f710k;
    }

    /* renamed from: m */
    public ActionBar mo832m() {
        m1049h0();
        return this.f709j;
    }

    /* renamed from: n */
    public void mo833n() {
        LayoutInflater from = LayoutInflater.from(this.f705f);
        if (from.getFactory() == null) {
            C5708f.m25215b(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: n0 */
    public boolean mo834n0() {
        return this.f721u;
    }

    /* renamed from: o */
    public void mo835o() {
        ActionBar m = mo832m();
        if (m == null || !m.mo712k()) {
            m1053l0(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public int mo836o0(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return m1047c0(context).mo895c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() != 0) {
                return m1048d0(context).mo895c();
            } else {
                return -1;
            }
        }
        return i;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo815S(view, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo839p(Configuration configuration) {
        ActionBar m;
        if (this.f679B && this.f722v && (m = mo832m()) != null) {
            m.mo713l(configuration);
        }
        C0382f.m1971b().mo2089g(this.f705f);
        m1032H(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public boolean mo840p0() {
        C5522b bVar = this.f716p;
        if (bVar != null) {
            bVar.mo975c();
            return true;
        }
        ActionBar m = mo832m();
        if (m == null || !m.mo708g()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public void mo841q(Bundle bundle) {
        this.f688K = true;
        m1032H(false);
        m1045Y();
        Object obj = this.f704e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0024g.m57c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar z0 = mo855z0();
                if (z0 == null) {
                    this.f701X = true;
                } else {
                    z0.mo718q(true);
                }
            }
            C0255c.m1164c(this);
        }
        this.f689L = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public boolean mo842q0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f687J = z;
        } else if (i == 82) {
            m1055r0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo843r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f704e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0255c.m1168x(r3)
        L_0x0009:
            boolean r0 = r3.f698U
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f706g
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f700W
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.f690M = r0
            r0 = 1
            r3.f691N = r0
            int r0 = r3.f692O
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f704e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            t.g<java.lang.String, java.lang.Integer> r0 = f672m0
            java.lang.Object r1 = r3.f704e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f692O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            t.g<java.lang.String, java.lang.Integer> r0 = f672m0
            java.lang.Object r1 = r3.f704e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.ActionBar r0 = r3.f709j
            if (r0 == 0) goto L_0x005e
            r0.mo714m()
        L_0x005e:
            r3.m1040N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo843r():void");
    }

    /* renamed from: s */
    public void mo844s(Bundle bundle) {
        m1044X();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public boolean mo845s0(int i, KeyEvent keyEvent) {
        ActionBar m = mo832m();
        if (m != null && m.mo715n(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f686I;
        if (panelFeatureState == null || !m1027A0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f686I == null) {
                PanelFeatureState e0 = mo825e0(0, true);
                m1028B0(e0, keyEvent);
                boolean A0 = m1027A0(e0, keyEvent.getKeyCode(), keyEvent, 1);
                e0.f739m = false;
                if (A0) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.f686I;
        if (panelFeatureState2 != null) {
            panelFeatureState2.f740n = true;
        }
        return true;
    }

    /* renamed from: t */
    public void mo846t() {
        ActionBar m = mo832m();
        if (m != null) {
            m.mo721t(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean mo847t0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f687J;
            this.f687J = false;
            PanelFeatureState e0 = mo825e0(0, false);
            if (e0 != null && e0.f741o) {
                if (!z) {
                    mo814P(e0, true);
                }
                return true;
            } else if (mo840p0()) {
                return true;
            }
        } else if (i == 82) {
            m1056u0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public void mo848u(Bundle bundle) {
    }

    /* renamed from: v */
    public void mo849v() {
        this.f690M = true;
        mo807G();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo850v0(int i) {
        ActionBar m;
        if (i == 108 && (m = mo832m()) != null) {
            m.mo709h(true);
        }
    }

    /* renamed from: w */
    public void mo851w() {
        this.f690M = false;
        ActionBar m = mo832m();
        if (m != null) {
            m.mo721t(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo852w0(int i) {
        if (i == 108) {
            ActionBar m = mo832m();
            if (m != null) {
                m.mo709h(false);
            }
        } else if (i == 0) {
            PanelFeatureState e0 = mo825e0(i, true);
            if (e0.f741o) {
                mo814P(e0, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo853x0(ViewGroup viewGroup) {
    }

    /* renamed from: z */
    public boolean mo854z(int i) {
        int D0 = m1030D0(i);
        if (this.f683F && D0 == 108) {
            return false;
        }
        if (this.f679B && D0 == 1) {
            this.f679B = false;
        }
        if (D0 == 1) {
            m1034I0();
            this.f683F = true;
            return true;
        } else if (D0 == 2) {
            m1034I0();
            this.f726z = true;
            return true;
        } else if (D0 == 5) {
            m1034I0();
            this.f678A = true;
            return true;
        } else if (D0 == 10) {
            m1034I0();
            this.f681D = true;
            return true;
        } else if (D0 == 108) {
            m1034I0();
            this.f679B = true;
            return true;
        } else if (D0 != 109) {
            return this.f706g.requestFeature(D0);
        } else {
            m1034I0();
            this.f680C = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public final ActionBar mo855z0() {
        return this.f709j;
    }

    AppCompatDelegateImpl(Dialog dialog, C0254b bVar) {
        this(dialog.getContext(), dialog.getWindow(), bVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f672m0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AppCompatDelegateImpl(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.C0254b r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f720t = r0
            r0 = 1
            r2.f721u = r0
            r0 = -100
            r2.f692O = r0
            androidx.appcompat.app.AppCompatDelegateImpl$b r1 = new androidx.appcompat.app.AppCompatDelegateImpl$b
            r1.<init>()
            r2.f700W = r1
            r2.f705f = r3
            r2.f708i = r5
            r2.f704e = r6
            int r3 = r2.f692O
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.AppCompatActivity r3 = r2.m1036J0()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.c r3 = r3.mo764B()
            int r3 = r3.mo830k()
            r2.f692O = r3
        L_0x0032:
            int r3 = r2.f692O
            if (r3 != r0) goto L_0x0059
            t.g<java.lang.String, java.lang.Integer> r3 = f672m0
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.f692O = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.m1035J(r4)
        L_0x005e:
            androidx.appcompat.widget.C0382f.m1973h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.b, java.lang.Object):void");
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    class C0241j extends C5534i {
        C0241j(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final ActionMode mo883b(ActionMode.Callback callback) {
            C5527f.C5528a aVar = new C5527f.C5528a(AppCompatDelegateImpl.this.f705f, callback);
            C5522b G0 = AppCompatDelegateImpl.this.mo808G0(aVar);
            if (G0 != null) {
                return aVar.mo22041e(G0);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo817U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo845s0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0287e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.mo850v0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo852w0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0287e eVar = menu instanceof C0287e ? (C0287e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.mo1134e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (eVar != null) {
                eVar.mo1134e0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0287e eVar;
            PanelFeatureState e0 = AppCompatDelegateImpl.this.mo825e0(0, true);
            if (e0 == null || (eVar = e0.f736j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.mo834n0()) {
                return mo883b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo834n0() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo883b(callback);
        }
    }
}
