package p065d3;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C3642m;
import com.facebook.appevents.C3406g;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.lang.ref.WeakReference;
import p071e3.C5229a;
import p071e3.C5237f;
import p082g3.C5337b;

/* renamed from: d3.d */
/* compiled from: RCTCodelessLoggingEventListener */
public class C5179d {

    /* renamed from: d3.d$a */
    /* compiled from: RCTCodelessLoggingEventListener */
    public static class C5180a implements View.OnTouchListener {

        /* renamed from: b */
        private C5229a f22641b;

        /* renamed from: c */
        private WeakReference<View> f22642c;

        /* renamed from: d */
        private WeakReference<View> f22643d;

        /* renamed from: e */
        private View.OnTouchListener f22644e;

        /* renamed from: f */
        private boolean f22645f = false;

        /* renamed from: d3.d$a$a */
        /* compiled from: RCTCodelessLoggingEventListener */
        class C5181a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ String f22646b;

            /* renamed from: c */
            final /* synthetic */ Bundle f22647c;

            C5181a(String str, Bundle bundle) {
                this.f22646b = str;
                this.f22647c = bundle;
            }

            public void run() {
                C3406g.m11398h(C3642m.m12279e()).mo11829g(this.f22646b, this.f22647c);
            }
        }

        public C5180a(C5229a aVar, View view, View view2) {
            if (aVar != null && view != null && view2 != null) {
                this.f22644e = C5237f.m23739g(view2);
                this.f22641b = aVar;
                this.f22642c = new WeakReference<>(view2);
                this.f22643d = new WeakReference<>(view);
                this.f22645f = true;
            }
        }

        /* renamed from: b */
        private void m23532b() {
            C5229a aVar = this.f22641b;
            if (aVar != null) {
                String b = aVar.mo21468b();
                Bundle f = C5175c.m23514f(this.f22641b, (View) this.f22643d.get(), (View) this.f22642c.get());
                if (f.containsKey("_valueToSum")) {
                    f.putDouble("_valueToSum", C5337b.m24047f(f.getString("_valueToSum")));
                }
                f.putString("_is_fb_codeless", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                C3642m.m12288n().execute(new C5181a(b, f));
            }
        }

        /* renamed from: a */
        public boolean mo21365a() {
            return this.f22645f;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                m23532b();
            }
            View.OnTouchListener onTouchListener = this.f22644e;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static C5180a m23531a(C5229a aVar, View view, View view2) {
        return new C5180a(aVar, view, view2);
    }
}
