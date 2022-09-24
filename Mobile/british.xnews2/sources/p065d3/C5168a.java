package p065d3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.C3642m;
import com.facebook.appevents.C3406g;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.lang.ref.WeakReference;
import p071e3.C5229a;
import p071e3.C5237f;
import p082g3.C5337b;

/* renamed from: d3.a */
/* compiled from: CodelessLoggingEventListener */
public class C5168a {

    /* renamed from: d3.a$a */
    /* compiled from: CodelessLoggingEventListener */
    static class C5169a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f22604b;

        /* renamed from: c */
        final /* synthetic */ Bundle f22605c;

        C5169a(String str, Bundle bundle) {
            this.f22604b = str;
            this.f22605c = bundle;
        }

        public void run() {
            C3406g.m11398h(C3642m.m12279e()).mo11829g(this.f22604b, this.f22605c);
        }
    }

    /* renamed from: d3.a$b */
    /* compiled from: CodelessLoggingEventListener */
    public static class C5170b implements View.OnClickListener {

        /* renamed from: b */
        private C5229a f22606b;

        /* renamed from: c */
        private WeakReference<View> f22607c;

        /* renamed from: d */
        private WeakReference<View> f22608d;

        /* renamed from: e */
        private View.OnClickListener f22609e;

        /* renamed from: f */
        private boolean f22610f;

        /* synthetic */ C5170b(C5229a aVar, View view, View view2, C5169a aVar2) {
            this(aVar, view, view2);
        }

        /* renamed from: a */
        public boolean mo21349a() {
            return this.f22610f;
        }

        public void onClick(View view) {
            View.OnClickListener onClickListener = this.f22609e;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            if (this.f22608d.get() != null && this.f22607c.get() != null) {
                C5168a.m23492d(this.f22606b, (View) this.f22608d.get(), (View) this.f22607c.get());
            }
        }

        private C5170b(C5229a aVar, View view, View view2) {
            this.f22610f = false;
            if (aVar != null && view != null && view2 != null) {
                this.f22609e = C5237f.m23738f(view2);
                this.f22606b = aVar;
                this.f22607c = new WeakReference<>(view2);
                this.f22608d = new WeakReference<>(view);
                this.f22610f = true;
            }
        }
    }

    /* renamed from: d3.a$c */
    /* compiled from: CodelessLoggingEventListener */
    public static class C5171c implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        private C5229a f22611b;

        /* renamed from: c */
        private WeakReference<AdapterView> f22612c;

        /* renamed from: d */
        private WeakReference<View> f22613d;

        /* renamed from: e */
        private AdapterView.OnItemClickListener f22614e;

        /* renamed from: f */
        private boolean f22615f;

        /* synthetic */ C5171c(C5229a aVar, View view, AdapterView adapterView, C5169a aVar2) {
            this(aVar, view, adapterView);
        }

        /* renamed from: a */
        public boolean mo21351a() {
            return this.f22615f;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            AdapterView.OnItemClickListener onItemClickListener = this.f22614e;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            if (this.f22613d.get() != null && this.f22612c.get() != null) {
                C5168a.m23492d(this.f22611b, (View) this.f22613d.get(), (View) this.f22612c.get());
            }
        }

        private C5171c(C5229a aVar, View view, AdapterView adapterView) {
            this.f22615f = false;
            if (aVar != null && view != null && adapterView != null) {
                this.f22614e = adapterView.getOnItemClickListener();
                this.f22611b = aVar;
                this.f22612c = new WeakReference<>(adapterView);
                this.f22613d = new WeakReference<>(view);
                this.f22615f = true;
            }
        }
    }

    /* renamed from: b */
    public static C5170b m23490b(C5229a aVar, View view, View view2) {
        return new C5170b(aVar, view, view2, (C5169a) null);
    }

    /* renamed from: c */
    public static C5171c m23491c(C5229a aVar, View view, AdapterView adapterView) {
        return new C5171c(aVar, view, adapterView, (C5169a) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m23492d(C5229a aVar, View view, View view2) {
        String b = aVar.mo21468b();
        Bundle f = C5175c.m23514f(aVar, view, view2);
        if (f.containsKey("_valueToSum")) {
            f.putDouble("_valueToSum", C5337b.m24047f(f.getString("_valueToSum")));
        }
        f.putString("_is_fb_codeless", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        C3642m.m12288n().execute(new C5169a(b, f));
    }
}
