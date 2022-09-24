package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: androidx.fragment.app.v */
/* compiled from: ListFragment */
public class C0742v extends Fragment {

    /* renamed from: m0 */
    private final Handler f3748m0 = new Handler();

    /* renamed from: n0 */
    private final Runnable f3749n0 = new C0743a();

    /* renamed from: o0 */
    private final AdapterView.OnItemClickListener f3750o0 = new C0744b();

    /* renamed from: p0 */
    ListAdapter f3751p0;

    /* renamed from: q0 */
    ListView f3752q0;

    /* renamed from: r0 */
    View f3753r0;

    /* renamed from: s0 */
    TextView f3754s0;

    /* renamed from: t0 */
    View f3755t0;

    /* renamed from: u0 */
    View f3756u0;

    /* renamed from: v0 */
    CharSequence f3757v0;

    /* renamed from: w0 */
    boolean f3758w0;

    /* renamed from: androidx.fragment.app.v$a */
    /* compiled from: ListFragment */
    class C0743a implements Runnable {
        C0743a() {
        }

        public void run() {
            ListView listView = C0742v.this.f3752q0;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: androidx.fragment.app.v$b */
    /* compiled from: ListFragment */
    class C0744b implements AdapterView.OnItemClickListener {
        C0744b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C0742v.this.mo3916P1((ListView) adapterView, view, i, j);
        }
    }

    /* renamed from: N1 */
    private void m4175N1() {
        if (this.f3752q0 == null) {
            View W = mo3398W();
            if (W != null) {
                if (W instanceof ListView) {
                    this.f3752q0 = (ListView) W;
                } else {
                    TextView textView = (TextView) W.findViewById(16711681);
                    this.f3754s0 = textView;
                    if (textView == null) {
                        this.f3753r0 = W.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f3755t0 = W.findViewById(16711682);
                    this.f3756u0 = W.findViewById(16711683);
                    View findViewById = W.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.f3752q0 = listView;
                        View view = this.f3753r0;
                        if (view != null) {
                            listView.setEmptyView(view);
                        } else {
                            CharSequence charSequence = this.f3757v0;
                            if (charSequence != null) {
                                this.f3754s0.setText(charSequence);
                                this.f3752q0.setEmptyView(this.f3754s0);
                            }
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f3758w0 = true;
                this.f3752q0.setOnItemClickListener(this.f3750o0);
                ListAdapter listAdapter = this.f3751p0;
                if (listAdapter != null) {
                    this.f3751p0 = null;
                    mo3918R1(listAdapter);
                } else if (this.f3755t0 != null) {
                    m4176T1(false, false);
                }
                this.f3748m0.post(this.f3749n0);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    /* renamed from: T1 */
    private void m4176T1(boolean z, boolean z2) {
        m4175N1();
        View view = this.f3755t0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f3758w0 != z) {
            this.f3758w0 = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(mo3466w(), 17432577));
                    this.f3756u0.startAnimation(AnimationUtils.loadAnimation(mo3466w(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f3756u0.clearAnimation();
                }
                this.f3755t0.setVisibility(8);
                this.f3756u0.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(mo3466w(), 17432576));
                this.f3756u0.startAnimation(AnimationUtils.loadAnimation(mo3466w(), 17432577));
            } else {
                view.clearAnimation();
                this.f3756u0.clearAnimation();
            }
            this.f3755t0.setVisibility(0);
            this.f3756u0.setVisibility(8);
        }
    }

    /* renamed from: A0 */
    public void mo3342A0() {
        this.f3748m0.removeCallbacks(this.f3749n0);
        this.f3752q0 = null;
        this.f3758w0 = false;
        this.f3756u0 = null;
        this.f3755t0 = null;
        this.f3753r0 = null;
        this.f3754s0 = null;
        super.mo3342A0();
    }

    /* renamed from: O1 */
    public ListView mo3915O1() {
        m4175N1();
        return this.f3752q0;
    }

    /* renamed from: P1 */
    public void mo3916P1(ListView listView, View view, int i, long j) {
    }

    /* renamed from: Q1 */
    public void mo3917Q1(CharSequence charSequence) {
        m4175N1();
        TextView textView = this.f3754s0;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.f3757v0 == null) {
                this.f3752q0.setEmptyView(this.f3754s0);
            }
            this.f3757v0 = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    /* renamed from: R1 */
    public void mo3918R1(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.f3751p0 != null;
        this.f3751p0 = listAdapter;
        ListView listView = this.f3752q0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f3758w0 && !z2) {
                if (mo3462u1().getWindowToken() != null) {
                    z = true;
                }
                m4176T1(true, z);
            }
        }
    }

    /* renamed from: S0 */
    public void mo3391S0(View view, Bundle bundle) {
        super.mo3391S0(view, bundle);
        m4175N1();
    }

    /* renamed from: S1 */
    public void mo3919S1(boolean z) {
        m4176T1(z, true);
    }

    /* renamed from: x0 */
    public View mo3468x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context t1 = mo3458t1();
        FrameLayout frameLayout = new FrameLayout(t1);
        LinearLayout linearLayout = new LinearLayout(t1);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(t1, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(t1);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(t1);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(t1);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }
}
