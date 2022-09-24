package androidx.mediarouter.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.widget.C0390h0;
import androidx.fragment.app.C0720q;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.mediarouter.media.C1001r;
import androidx.mediarouter.media.C1003s;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import p011b1.C1533a;
import p011b1.C1542j;
import p011b1.C1544l;
import p018c1.C2643j;
import p063d0.C5135a;
import p111m0.C5723u;

public class MediaRouteButton extends View {

    /* renamed from: r */
    private static C0846a f4001r;

    /* renamed from: s */
    static final SparseArray<Drawable.ConstantState> f4002s = new SparseArray<>(2);

    /* renamed from: t */
    private static final int[] f4003t = {16842912};

    /* renamed from: u */
    private static final int[] f4004u = {16842911};

    /* renamed from: b */
    private final C1003s f4005b;

    /* renamed from: c */
    private final C0847b f4006c;

    /* renamed from: d */
    private C1001r f4007d;

    /* renamed from: e */
    private C0879e f4008e;

    /* renamed from: f */
    private boolean f4009f;

    /* renamed from: g */
    private int f4010g;

    /* renamed from: h */
    C0848c f4011h;

    /* renamed from: i */
    private Drawable f4012i;

    /* renamed from: j */
    private int f4013j;

    /* renamed from: k */
    private int f4014k;

    /* renamed from: l */
    private int f4015l;

    /* renamed from: m */
    private ColorStateList f4016m;

    /* renamed from: n */
    private int f4017n;

    /* renamed from: o */
    private int f4018o;

    /* renamed from: p */
    private boolean f4019p;

    /* renamed from: q */
    private boolean f4020q;

    /* renamed from: androidx.mediarouter.app.MediaRouteButton$a */
    private static final class C0846a extends BroadcastReceiver {

        /* renamed from: a */
        private final Context f4021a;

        /* renamed from: b */
        private boolean f4022b = true;

        /* renamed from: c */
        private List<MediaRouteButton> f4023c;

        C0846a(Context context) {
            this.f4021a = context;
            this.f4023c = new ArrayList();
        }

        /* renamed from: a */
        public boolean mo4192a() {
            return this.f4022b;
        }

        /* renamed from: b */
        public void mo4193b(MediaRouteButton mediaRouteButton) {
            if (this.f4023c.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.f4021a.registerReceiver(this, intentFilter);
            }
            this.f4023c.add(mediaRouteButton);
        }

        /* renamed from: c */
        public void mo4194c(MediaRouteButton mediaRouteButton) {
            this.f4023c.remove(mediaRouteButton);
            if (this.f4023c.size() == 0) {
                this.f4021a.unregisterReceiver(this);
            }
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && this.f4022b != (!intent.getBooleanExtra("noConnectivity", false))) {
                this.f4022b = z;
                for (MediaRouteButton c : this.f4023c) {
                    c.mo4172c();
                }
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.MediaRouteButton$b */
    private final class C0847b extends C1003s.C1005b {
        C0847b() {
        }

        /* renamed from: a */
        public void mo4165a(C1003s sVar, C1003s.C1021h hVar) {
            MediaRouteButton.this.mo4171b();
        }

        /* renamed from: b */
        public void mo4166b(C1003s sVar, C1003s.C1021h hVar) {
            MediaRouteButton.this.mo4171b();
        }

        /* renamed from: c */
        public void mo4167c(C1003s sVar, C1003s.C1021h hVar) {
            MediaRouteButton.this.mo4171b();
        }

        /* renamed from: d */
        public void mo4168d(C1003s sVar, C1003s.C1022i iVar) {
            MediaRouteButton.this.mo4171b();
        }

        /* renamed from: e */
        public void mo4169e(C1003s sVar, C1003s.C1022i iVar) {
            MediaRouteButton.this.mo4171b();
        }

        /* renamed from: g */
        public void mo4170g(C1003s sVar, C1003s.C1022i iVar) {
            MediaRouteButton.this.mo4171b();
        }

        /* renamed from: h */
        public void mo4196h(C1003s sVar, C1003s.C1022i iVar) {
            MediaRouteButton.this.mo4171b();
        }

        /* renamed from: k */
        public void mo4197k(C1003s sVar, C1003s.C1022i iVar) {
            MediaRouteButton.this.mo4171b();
        }
    }

    /* renamed from: androidx.mediarouter.app.MediaRouteButton$c */
    private final class C0848c extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a */
        private final int f4025a;

        /* renamed from: b */
        private final Context f4026b;

        C0848c(int i, Context context) {
            this.f4025a = i;
            this.f4026b = context;
        }

        /* renamed from: a */
        private void m4484a(Drawable drawable) {
            if (drawable != null) {
                MediaRouteButton.f4002s.put(this.f4025a, drawable.getConstantState());
            }
            MediaRouteButton.this.f4011h = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Drawable doInBackground(Void... voidArr) {
            if (MediaRouteButton.f4002s.get(this.f4025a) == null) {
                return this.f4026b.getResources().getDrawable(this.f4025a);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onCancelled(Drawable drawable) {
            m4484a(drawable);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void onPostExecute(Drawable drawable) {
            if (drawable != null) {
                m4484a(drawable);
            } else {
                Drawable.ConstantState constantState = MediaRouteButton.f4002s.get(this.f4025a);
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                MediaRouteButton.this.f4011h = null;
            }
            MediaRouteButton.this.setRemoteIndicatorDrawableInternal(drawable);
        }
    }

    public MediaRouteButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m4466a() {
        if (this.f4013j > 0) {
            C0848c cVar = this.f4011h;
            if (cVar != null) {
                cVar.cancel(false);
            }
            C0848c cVar2 = new C0848c(this.f4013j, getContext());
            this.f4011h = cVar2;
            this.f4013j = 0;
            cVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: e */
    private boolean m4467e(int i) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            C1003s.C1022i l = this.f4005b.mo4709l();
            if (l.mo4818w() || !l.mo4787E(this.f4007d)) {
                if (fragmentManager.mo3592j0("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                    Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                    return false;
                }
                C0857b b = this.f4008e.mo4300b();
                b.mo4243j2(this.f4007d);
                if (i == 2) {
                    b.mo4244k2(true);
                }
                C0720q m = fragmentManager.mo3598m();
                m.mo3852d(b, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
                m.mo3673h();
            } else if (fragmentManager.mo3592j0("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                return false;
            } else {
                C0878d c = this.f4008e.mo4301c();
                c.mo4298i2(this.f4007d);
                if (i == 2) {
                    c.mo4299j2(true);
                }
                C0720q m2 = fragmentManager.mo3598m();
                m2.mo3852d(c, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
                m2.mo3673h();
            }
            return true;
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }

    /* renamed from: f */
    private boolean m4468f() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        Intent putExtra = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName()).putExtra("key_media_session_token", this.f4005b.mo4706i());
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(putExtra, 0)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & TsExtractor.TS_STREAM_TYPE_AC3) != 0) {
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m4469g() {
        int i;
        int i2 = this.f4015l;
        if (i2 == 1) {
            i = C1542j.mr_cast_button_connecting;
        } else if (i2 != 2) {
            i = C1542j.mr_cast_button_disconnected;
        } else {
            i = C1542j.mr_cast_button_connected;
        }
        String string = getContext().getString(i);
        setContentDescription(string);
        if (!this.f4020q || TextUtils.isEmpty(string)) {
            string = null;
        }
        C0390h0.m2064a(this, string);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private FragmentManager getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).mo3505r();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4171b() {
        C1003s.C1022i l = this.f4005b.mo4709l();
        boolean z = false;
        int c = !l.mo4818w() && l.mo4787E(this.f4007d) ? l.mo4797c() : 0;
        if (this.f4015l != c) {
            this.f4015l = c;
            m4469g();
            refreshDrawableState();
        }
        if (c == 1) {
            m4466a();
        }
        if (this.f4009f) {
            if (this.f4019p || this.f4005b.mo4710n(this.f4007d, 1)) {
                z = true;
            }
            setEnabled(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4172c() {
        int i;
        if (this.f4010g != 0 || this.f4019p || f4001r.mo4192a()) {
            i = this.f4010g;
        } else {
            i = 4;
        }
        super.setVisibility(i);
        Drawable drawable = this.f4012i;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    /* renamed from: d */
    public boolean mo4173d() {
        if (!this.f4009f) {
            return false;
        }
        C2643j j = this.f4005b.mo4707j();
        if (j == null) {
            return m4467e(1);
        }
        if (!j.mo9299c() || !C1003s.m5134m() || !m4468f()) {
            return m4467e(j.mo9297a());
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4012i != null) {
            this.f4012i.setState(getDrawableState());
            if (this.f4012i.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f4012i.getCurrent();
                int i = this.f4015l;
                if (i == 1 || this.f4014k != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.f4014k = this.f4015l;
    }

    public C0879e getDialogFactory() {
        return this.f4008e;
    }

    public C1001r getRouteSelector() {
        return this.f4007d;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4012i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.f4009f = true;
            if (!this.f4007d.mo4693f()) {
                this.f4005b.mo4702a(this.f4007d, this.f4006c);
            }
            mo4171b();
            f4001r.mo4193b(this);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1003s sVar = this.f4005b;
        if (sVar == null) {
            return onCreateDrawableState;
        }
        C2643j j = sVar.mo4707j();
        boolean z = false;
        if (j != null) {
            z = j.mo9298b().getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON");
        }
        if (z) {
            return onCreateDrawableState;
        }
        int i2 = this.f4015l;
        if (i2 == 1) {
            View.mergeDrawableStates(onCreateDrawableState, f4004u);
        } else if (i2 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4003t);
        }
        return onCreateDrawableState;
    }

    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f4009f = false;
            if (!this.f4007d.mo4693f()) {
                this.f4005b.mo4711p(this.f4006c);
            }
            f4001r.mo4194c(this);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4012i != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.f4012i.getIntrinsicWidth();
            int intrinsicHeight = this.f4012i.getIntrinsicHeight();
            int i = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i2 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.f4012i.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f4012i.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.f4017n;
        Drawable drawable = this.f4012i;
        int i4 = 0;
        int max = Math.max(i3, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i5 = this.f4018o;
        Drawable drawable2 = this.f4012i;
        if (drawable2 != null) {
            i4 = drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
        }
        int max2 = Math.max(i5, i4);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        m4466a();
        if (mo4173d() || performClick) {
            return true;
        }
        return false;
    }

    public void setAlwaysVisible(boolean z) {
        if (z != this.f4019p) {
            this.f4019p = z;
            mo4172c();
            mo4171b();
        }
    }

    /* access modifiers changed from: package-private */
    public void setCheatSheetEnabled(boolean z) {
        if (z != this.f4020q) {
            this.f4020q = z;
            m4469g();
        }
    }

    public void setDialogFactory(C0879e eVar) {
        if (eVar != null) {
            this.f4008e = eVar;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.f4013j = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        C0848c cVar = this.f4011h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        Drawable drawable2 = this.f4012i;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f4012i);
        }
        if (drawable != null) {
            if (this.f4016m != null) {
                drawable = C5135a.m23418r(drawable.mutate());
                C5135a.m23415o(drawable, this.f4016m);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.f4012i = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(C1001r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f4007d.equals(rVar)) {
            if (this.f4009f) {
                if (!this.f4007d.mo4693f()) {
                    this.f4005b.mo4711p(this.f4006c);
                }
                if (!rVar.mo4693f()) {
                    this.f4005b.mo4702a(rVar, this.f4006c);
                }
            }
            this.f4007d = rVar;
            mo4171b();
        }
    }

    public void setVisibility(int i) {
        this.f4010g = i;
        mo4172c();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4012i;
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1533a.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(C0912i.m4662a(context), attributeSet, i);
        Drawable.ConstantState constantState;
        this.f4007d = C1001r.f4553c;
        this.f4008e = C0879e.m4578a();
        this.f4010g = 0;
        this.f4014k = 0;
        Context context2 = getContext();
        int[] iArr = C1544l.f6562A;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C5723u.m25326m0(this, context2, iArr, attributeSet, obtainStyledAttributes, i, 0);
        if (isInEditMode()) {
            this.f4005b = null;
            this.f4006c = null;
            this.f4012i = getResources().getDrawable(obtainStyledAttributes.getResourceId(C1544l.f6566E, 0));
            return;
        }
        this.f4005b = C1003s.m5133h(context2);
        this.f4006c = new C0847b();
        if (f4001r == null) {
            f4001r = new C0846a(context2.getApplicationContext());
        }
        this.f4016m = obtainStyledAttributes.getColorStateList(C1544l.f6567F);
        this.f4017n = obtainStyledAttributes.getDimensionPixelSize(C1544l.f6563B, 0);
        this.f4018o = obtainStyledAttributes.getDimensionPixelSize(C1544l.f6564C, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C1544l.f6566E, 0);
        this.f4013j = obtainStyledAttributes.getResourceId(C1544l.f6565D, 0);
        obtainStyledAttributes.recycle();
        int i2 = this.f4013j;
        if (!(i2 == 0 || (constantState = f4002s.get(i2)) == null)) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.f4012i == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = f4002s.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    C0848c cVar = new C0848c(resourceId, getContext());
                    this.f4011h = cVar;
                    cVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                m4466a();
            }
        }
        m4469g();
        setClickable(true);
    }
}
