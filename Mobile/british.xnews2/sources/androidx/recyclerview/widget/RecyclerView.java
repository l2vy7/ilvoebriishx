package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C1127a;
import androidx.recyclerview.widget.C1130b;
import androidx.recyclerview.widget.C1149e;
import androidx.recyclerview.widget.C1162k;
import androidx.recyclerview.widget.C1168o;
import androidx.recyclerview.widget.C1171p;
import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p074f1.C5251a;
import p074f1.C5252b;
import p074f1.C5253c;
import p089i0.C5433k;
import p104l0.C5648h;
import p110m0.C5682a;
import p110m0.C5711i;
import p110m0.C5712j;
import p110m0.C5713k;
import p110m0.C5723u;
import p110m0.C5737v;
import p116n0.C5770b;
import p116n0.C5771c;

public class RecyclerView extends ViewGroup implements C5712j {

    /* renamed from: N0 */
    private static final int[] f5001N0 = {16843830};

    /* renamed from: O0 */
    static final boolean f5002O0;

    /* renamed from: P0 */
    static final boolean f5003P0;

    /* renamed from: Q0 */
    static final boolean f5004Q0;

    /* renamed from: R0 */
    static final boolean f5005R0;

    /* renamed from: S0 */
    private static final boolean f5006S0;

    /* renamed from: T0 */
    private static final boolean f5007T0;

    /* renamed from: U0 */
    private static final Class<?>[] f5008U0;

    /* renamed from: V0 */
    static final Interpolator f5009V0 = new C1086c();

    /* renamed from: A */
    private int f5010A;

    /* renamed from: A0 */
    C1162k f5011A0;

    /* renamed from: B */
    boolean f5012B;

    /* renamed from: B0 */
    private C1096k f5013B0;

    /* renamed from: C */
    private final AccessibilityManager f5014C;

    /* renamed from: C0 */
    private final int[] f5015C0;

    /* renamed from: D */
    private List<C1109q> f5016D;

    /* renamed from: D0 */
    private C5713k f5017D0;

    /* renamed from: E */
    boolean f5018E;

    /* renamed from: E0 */
    private final int[] f5019E0;

    /* renamed from: F */
    boolean f5020F;

    /* renamed from: F0 */
    private final int[] f5021F0;

    /* renamed from: G */
    private int f5022G;

    /* renamed from: G0 */
    final int[] f5023G0;

    /* renamed from: H */
    private int f5024H;

    /* renamed from: H0 */
    final List<C1087c0> f5025H0;

    /* renamed from: I */
    private C1097l f5026I;

    /* renamed from: I0 */
    private Runnable f5027I0;

    /* renamed from: J */
    private EdgeEffect f5028J;

    /* renamed from: J0 */
    private boolean f5029J0;

    /* renamed from: K */
    private EdgeEffect f5030K;

    /* renamed from: K0 */
    private int f5031K0;

    /* renamed from: L */
    private EdgeEffect f5032L;

    /* renamed from: L0 */
    private int f5033L0;

    /* renamed from: M */
    private EdgeEffect f5034M;

    /* renamed from: M0 */
    private final C1171p.C1173b f5035M0;

    /* renamed from: N */
    C1098m f5036N;

    /* renamed from: O */
    private int f5037O;

    /* renamed from: P */
    private int f5038P;

    /* renamed from: Q */
    private VelocityTracker f5039Q;

    /* renamed from: R */
    private int f5040R;

    /* renamed from: S */
    private int f5041S;

    /* renamed from: T */
    private int f5042T;

    /* renamed from: U */
    private int f5043U;

    /* renamed from: V */
    private int f5044V;

    /* renamed from: W */
    private C1110r f5045W;

    /* renamed from: b */
    private final C1117x f5046b;

    /* renamed from: c */
    final C1115v f5047c;

    /* renamed from: d */
    SavedState f5048d;

    /* renamed from: e */
    C1127a f5049e;

    /* renamed from: f */
    C1130b f5050f;

    /* renamed from: g */
    final C1171p f5051g;

    /* renamed from: h */
    boolean f5052h;

    /* renamed from: i */
    final Runnable f5053i;

    /* renamed from: j */
    final Rect f5054j;

    /* renamed from: k */
    private final Rect f5055k;

    /* renamed from: l */
    final RectF f5056l;

    /* renamed from: l0 */
    private final int f5057l0;

    /* renamed from: m */
    C1092h f5058m;

    /* renamed from: m0 */
    private final int f5059m0;

    /* renamed from: n */
    C1104p f5060n;

    /* renamed from: n0 */
    private float f5061n0;

    /* renamed from: o */
    C1116w f5062o;

    /* renamed from: o0 */
    private float f5063o0;

    /* renamed from: p */
    final ArrayList<C1103o> f5064p;

    /* renamed from: p0 */
    private boolean f5065p0;

    /* renamed from: q */
    private final ArrayList<C1111s> f5066q;

    /* renamed from: q0 */
    final C1085b0 f5067q0;

    /* renamed from: r */
    private C1111s f5068r;

    /* renamed from: r0 */
    C1149e f5069r0;

    /* renamed from: s */
    boolean f5070s;

    /* renamed from: s0 */
    C1149e.C1151b f5071s0;

    /* renamed from: t */
    boolean f5072t;

    /* renamed from: t0 */
    final C1121z f5073t0;

    /* renamed from: u */
    boolean f5074u;

    /* renamed from: u0 */
    private C1112t f5075u0;

    /* renamed from: v */
    boolean f5076v;

    /* renamed from: v0 */
    private List<C1112t> f5077v0;

    /* renamed from: w */
    private int f5078w;

    /* renamed from: w0 */
    boolean f5079w0;

    /* renamed from: x */
    boolean f5080x;

    /* renamed from: x0 */
    boolean f5081x0;

    /* renamed from: y */
    boolean f5082y;

    /* renamed from: y0 */
    private C1098m.C1100b f5083y0;

    /* renamed from: z */
    private boolean f5084z;

    /* renamed from: z0 */
    boolean f5085z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C1082a implements Runnable {
        C1082a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5076v && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f5070s) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f5082y) {
                    recyclerView2.f5080x = true;
                } else {
                    recyclerView2.mo5227v();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class C1083a0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C1084b implements Runnable {
        C1084b() {
        }

        public void run() {
            C1098m mVar = RecyclerView.this.f5036N;
            if (mVar != null) {
                mVar.mo5388u();
            }
            RecyclerView.this.f5085z0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    class C1085b0 implements Runnable {

        /* renamed from: b */
        private int f5093b;

        /* renamed from: c */
        private int f5094c;

        /* renamed from: d */
        OverScroller f5095d;

        /* renamed from: e */
        Interpolator f5096e;

        /* renamed from: f */
        private boolean f5097f = false;

        /* renamed from: g */
        private boolean f5098g = false;

        C1085b0() {
            Interpolator interpolator = RecyclerView.f5009V0;
            this.f5096e = interpolator;
            this.f5095d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m5762a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float b = f2 + (m5763b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: b */
        private float m5763b(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: d */
        private void m5764d() {
            RecyclerView.this.removeCallbacks(this);
            C5723u.m25314g0(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void mo5251c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f5094c = 0;
            this.f5093b = 0;
            Interpolator interpolator = this.f5096e;
            Interpolator interpolator2 = RecyclerView.f5009V0;
            if (interpolator != interpolator2) {
                this.f5096e = interpolator2;
                this.f5095d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f5095d.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo5252e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5252e() {
            if (this.f5097f) {
                this.f5098g = true;
            } else {
                m5764d();
            }
        }

        /* renamed from: f */
        public void mo5253f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m5762a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f5009V0;
            }
            if (this.f5096e != interpolator) {
                this.f5096e = interpolator;
                this.f5095d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f5094c = 0;
            this.f5093b = 0;
            RecyclerView.this.setScrollState(2);
            this.f5095d.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f5095d.computeScrollOffset();
            }
            mo5252e();
        }

        /* renamed from: g */
        public void mo5254g() {
            RecyclerView.this.removeCallbacks(this);
            this.f5095d.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5060n == null) {
                mo5254g();
                return;
            }
            this.f5098g = false;
            this.f5097f = true;
            recyclerView.mo5227v();
            OverScroller overScroller = this.f5095d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f5093b;
                int i4 = currY - this.f5094c;
                this.f5093b = currX;
                this.f5094c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f5023G0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo5074G(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f5023G0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo5224u(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f5058m != null) {
                    int[] iArr3 = recyclerView3.f5023G0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo5161j1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f5023G0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C1118y yVar = recyclerView4.f5060n.f5125g;
                    if (yVar != null && !yVar.mo5561g() && yVar.mo5562h()) {
                        int b = RecyclerView.this.f5073t0.mo5578b();
                        if (b == 0) {
                            yVar.mo5572r();
                        } else if (yVar.mo5560f() >= b) {
                            yVar.mo5570p(b - 1);
                            yVar.mo5564j(i, i2);
                        } else {
                            yVar.mo5564j(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f5064p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f5023G0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo5076H(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f5023G0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo5080J(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C1118y yVar2 = RecyclerView.this.f5060n.f5125g;
                if ((yVar2 != null && yVar2.mo5561g()) || !z) {
                    mo5252e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    C1149e eVar = recyclerView7.f5069r0;
                    if (eVar != null) {
                        eVar.mo5746f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo5103a(i7, currVelocity);
                    }
                    if (RecyclerView.f5005R0) {
                        RecyclerView.this.f5071s0.mo5752b();
                    }
                }
            }
            C1118y yVar3 = RecyclerView.this.f5060n.f5125g;
            if (yVar3 != null && yVar3.mo5561g()) {
                yVar3.mo5564j(0, 0);
            }
            this.f5097f = false;
            if (this.f5098g) {
                m5764d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo5231w1(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    class C1086c implements Interpolator {
        C1086c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public static abstract class C1087c0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        C1092h<? extends C1087c0> mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        C1115v mScrapContainer = null;
        C1087c0 mShadowedHolder = null;
        C1087c0 mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public C1087c0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C5723u.m25291Q(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo5109c0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final C1092h<? extends C1087c0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            C1092h adapter;
            int c0;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (c0 = this.mOwnerRecyclerView.mo5109c0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, c0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C5723u.m25291Q(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f5088c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C5723u.m25351z(this.itemView);
            }
            recyclerView.mo5167m1(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.mo5167m1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* access modifiers changed from: package-private */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m5660s(this);
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (i2 ^ -1));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(C1115v vVar, boolean z) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.mo5526J(this);
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C1088d implements C1171p.C1173b {
        C1088d() {
        }

        /* renamed from: a */
        public void mo5300a(C1087c0 c0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5060n.mo5470m1(c0Var.itemView, recyclerView.f5047c);
        }

        /* renamed from: b */
        public void mo5301b(C1087c0 c0Var, C1098m.C1101c cVar, C1098m.C1101c cVar2) {
            RecyclerView.this.mo5165m(c0Var, cVar, cVar2);
        }

        /* renamed from: c */
        public void mo5302c(C1087c0 c0Var, C1098m.C1101c cVar, C1098m.C1101c cVar2) {
            RecyclerView.this.f5047c.mo5526J(c0Var);
            RecyclerView.this.mo5169o(c0Var, cVar, cVar2);
        }

        /* renamed from: d */
        public void mo5303d(C1087c0 c0Var, C1098m.C1101c cVar, C1098m.C1101c cVar2) {
            c0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5018E) {
                if (recyclerView.f5036N.mo5370b(c0Var, c0Var, cVar, cVar2)) {
                    RecyclerView.this.mo5091P0();
                }
            } else if (recyclerView.f5036N.mo5372d(c0Var, cVar, cVar2)) {
                RecyclerView.this.mo5091P0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C1089e implements C1130b.C1132b {
        C1089e() {
        }

        /* renamed from: a */
        public View mo5304a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        public void addView(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo5235z(view);
        }

        /* renamed from: b */
        public void mo5306b(View view) {
            C1087c0 i0 = RecyclerView.m5650i0(view);
            if (i0 != null) {
                i0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: c */
        public int mo5307c() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: d */
        public void mo5308d() {
            int c = mo5307c();
            for (int i = 0; i < c; i++) {
                View a = mo5304a(i);
                RecyclerView.this.mo5067A(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: e */
        public int mo5309e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: f */
        public C1087c0 mo5310f(View view) {
            return RecyclerView.m5650i0(view);
        }

        /* renamed from: g */
        public void mo5311g(int i) {
            C1087c0 i0;
            View a = mo5304a(i);
            if (!(a == null || (i0 = RecyclerView.m5650i0(a)) == null)) {
                if (!i0.isTmpDetached() || i0.shouldIgnore()) {
                    i0.addFlags(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + i0 + RecyclerView.this.mo5092Q());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: h */
        public void mo5312h(View view) {
            C1087c0 i0 = RecyclerView.m5650i0(view);
            if (i0 != null) {
                i0.onLeftHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: i */
        public void mo5313i(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo5067A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: j */
        public void mo5314j(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C1087c0 i0 = RecyclerView.m5650i0(view);
            if (i0 != null) {
                if (i0.isTmpDetached() || i0.shouldIgnore()) {
                    i0.clearTmpDetachFlag();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + i0 + RecyclerView.this.mo5092Q());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C1090f implements C1127a.C1128a {
        C1090f() {
        }

        /* renamed from: a */
        public void mo5315a(int i, int i2) {
            RecyclerView.this.mo5073F0(i, i2);
            RecyclerView.this.f5079w0 = true;
        }

        /* renamed from: b */
        public void mo5316b(C1127a.C1129b bVar) {
            mo5323i(bVar);
        }

        /* renamed from: c */
        public void mo5317c(int i, int i2, Object obj) {
            RecyclerView.this.mo5237z1(i, i2, obj);
            RecyclerView.this.f5081x0 = true;
        }

        /* renamed from: d */
        public void mo5318d(C1127a.C1129b bVar) {
            mo5323i(bVar);
        }

        /* renamed from: e */
        public C1087c0 mo5319e(int i) {
            C1087c0 a0 = RecyclerView.this.mo5104a0(i, true);
            if (a0 != null && !RecyclerView.this.f5050f.mo5693n(a0.itemView)) {
                return a0;
            }
            return null;
        }

        /* renamed from: f */
        public void mo5320f(int i, int i2) {
            RecyclerView.this.mo5075G0(i, i2, false);
            RecyclerView.this.f5079w0 = true;
        }

        /* renamed from: g */
        public void mo5321g(int i, int i2) {
            RecyclerView.this.mo5072E0(i, i2);
            RecyclerView.this.f5079w0 = true;
        }

        /* renamed from: h */
        public void mo5322h(int i, int i2) {
            RecyclerView.this.mo5075G0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5079w0 = true;
            recyclerView.f5073t0.f5176d += i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo5323i(C1127a.C1129b bVar) {
            int i = bVar.f5254a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f5060n.mo4981R0(recyclerView, bVar.f5255b, bVar.f5257d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f5060n.mo4986U0(recyclerView2, bVar.f5255b, bVar.f5257d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f5060n.mo4987W0(recyclerView3, bVar.f5255b, bVar.f5257d, bVar.f5256c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f5060n.mo4984T0(recyclerView4, bVar.f5255b, bVar.f5257d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    static /* synthetic */ class C1091g {

        /* renamed from: a */
        static final /* synthetic */ int[] f5103a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$h$a[] r0 = androidx.recyclerview.widget.RecyclerView.C1092h.C1093a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5103a = r0
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.C1092h.C1093a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5103a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.C1092h.C1093a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1091g.<clinit>():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class C1092h<VH extends C1087c0> {
        private boolean mHasStableIds = false;
        private final C1094i mObservable = new C1094i();
        private C1093a mStateRestorationPolicy = C1093a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        public enum C1093a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                C5433k.m24388a("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f5088c = true;
                }
                C5433k.m24389b();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean canRestoreState() {
            int i = C1091g.f5103a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C5433k.m24388a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C5433k.m24389b();
            }
        }

        public int findRelativeAdapterPositionIn(C1092h<? extends C1087c0> hVar, C1087c0 c0Var, int i) {
            if (hVar == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final C1093a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo5352a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo5353b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo5355d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo5357f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo5354c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo5355d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo5357f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo5358g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo5358g(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(C1095j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(C1093a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.mo5359h();
        }

        public void unregisterAdapterDataObserver(C1095j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo5356e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo5356e(i, i2, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    static class C1094i extends Observable<C1095j> {
        C1094i() {
        }

        /* renamed from: a */
        public boolean mo5352a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo5353b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1095j) this.mObservers.get(size)).mo5360a();
            }
        }

        /* renamed from: c */
        public void mo5354c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1095j) this.mObservers.get(size)).mo5364e(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void mo5355d(int i, int i2) {
            mo5356e(i, i2, (Object) null);
        }

        /* renamed from: e */
        public void mo5356e(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1095j) this.mObservers.get(size)).mo5362c(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void mo5357f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1095j) this.mObservers.get(size)).mo5363d(i, i2);
            }
        }

        /* renamed from: g */
        public void mo5358g(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1095j) this.mObservers.get(size)).mo5365f(i, i2);
            }
        }

        /* renamed from: h */
        public void mo5359h() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1095j) this.mObservers.get(size)).mo5366g();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class C1095j {
        /* renamed from: a */
        public void mo5360a() {
        }

        /* renamed from: b */
        public void mo5361b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo5362c(int i, int i2, Object obj) {
            mo5361b(i, i2);
        }

        /* renamed from: d */
        public void mo5363d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo5364e(int i, int i2, int i3) {
        }

        /* renamed from: f */
        public void mo5365f(int i, int i2) {
        }

        /* renamed from: g */
        public void mo5366g() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public interface C1096k {
        /* renamed from: a */
        int mo5367a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static class C1097l {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo5368a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class C1098m {

        /* renamed from: a */
        private C1100b f5108a = null;

        /* renamed from: b */
        private ArrayList<C1099a> f5109b = new ArrayList<>();

        /* renamed from: c */
        private long f5110c = 120;

        /* renamed from: d */
        private long f5111d = 120;

        /* renamed from: e */
        private long f5112e = 250;

        /* renamed from: f */
        private long f5113f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        public interface C1099a {
            /* renamed from: a */
            void mo5390a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        interface C1100b {
            /* renamed from: a */
            void mo5391a(C1087c0 c0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        public static class C1101c {

            /* renamed from: a */
            public int f5114a;

            /* renamed from: b */
            public int f5115b;

            /* renamed from: c */
            public int f5116c;

            /* renamed from: d */
            public int f5117d;

            /* renamed from: a */
            public C1101c mo5392a(C1087c0 c0Var) {
                return mo5393b(c0Var, 0);
            }

            /* renamed from: b */
            public C1101c mo5393b(C1087c0 c0Var, int i) {
                View view = c0Var.itemView;
                this.f5114a = view.getLeft();
                this.f5115b = view.getTop();
                this.f5116c = view.getRight();
                this.f5117d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m5809e(C1087c0 c0Var) {
            int i = c0Var.mFlags & 14;
            if (c0Var.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = c0Var.getOldPosition();
            int absoluteAdapterPosition = c0Var.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo5369a(C1087c0 c0Var, C1101c cVar, C1101c cVar2);

        /* renamed from: b */
        public abstract boolean mo5370b(C1087c0 c0Var, C1087c0 c0Var2, C1101c cVar, C1101c cVar2);

        /* renamed from: c */
        public abstract boolean mo5371c(C1087c0 c0Var, C1101c cVar, C1101c cVar2);

        /* renamed from: d */
        public abstract boolean mo5372d(C1087c0 c0Var, C1101c cVar, C1101c cVar2);

        /* renamed from: f */
        public abstract boolean mo5373f(C1087c0 c0Var);

        /* renamed from: g */
        public boolean mo5374g(C1087c0 c0Var, List<Object> list) {
            return mo5373f(c0Var);
        }

        /* renamed from: h */
        public final void mo5375h(C1087c0 c0Var) {
            mo5385r(c0Var);
            C1100b bVar = this.f5108a;
            if (bVar != null) {
                bVar.mo5391a(c0Var);
            }
        }

        /* renamed from: i */
        public final void mo5376i() {
            int size = this.f5109b.size();
            for (int i = 0; i < size; i++) {
                this.f5109b.get(i).mo5390a();
            }
            this.f5109b.clear();
        }

        /* renamed from: j */
        public abstract void mo5377j(C1087c0 c0Var);

        /* renamed from: k */
        public abstract void mo5378k();

        /* renamed from: l */
        public long mo5379l() {
            return this.f5110c;
        }

        /* renamed from: m */
        public long mo5380m() {
            return this.f5113f;
        }

        /* renamed from: n */
        public long mo5381n() {
            return this.f5112e;
        }

        /* renamed from: o */
        public long mo5382o() {
            return this.f5111d;
        }

        /* renamed from: p */
        public abstract boolean mo5383p();

        /* renamed from: q */
        public C1101c mo5384q() {
            return new C1101c();
        }

        /* renamed from: r */
        public void mo5385r(C1087c0 c0Var) {
        }

        /* renamed from: s */
        public C1101c mo5386s(C1121z zVar, C1087c0 c0Var) {
            return mo5384q().mo5392a(c0Var);
        }

        /* renamed from: t */
        public C1101c mo5387t(C1121z zVar, C1087c0 c0Var, int i, List<Object> list) {
            return mo5384q().mo5392a(c0Var);
        }

        /* renamed from: u */
        public abstract void mo5388u();

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5389v(C1100b bVar) {
            this.f5108a = bVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    private class C1102n implements C1098m.C1100b {
        C1102n() {
        }

        /* renamed from: a */
        public void mo5391a(C1087c0 c0Var) {
            c0Var.setIsRecyclable(true);
            if (c0Var.mShadowedHolder != null && c0Var.mShadowingHolder == null) {
                c0Var.mShadowedHolder = null;
            }
            c0Var.mShadowingHolder = null;
            if (!c0Var.shouldBeKeptAsChild() && !RecyclerView.this.mo5100Y0(c0Var.itemView) && c0Var.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(c0Var.itemView, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C1103o {
        @Deprecated
        /* renamed from: d */
        public void mo5394d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo5395e(Rect rect, View view, RecyclerView recyclerView, C1121z zVar) {
            mo5394d(rect, ((LayoutParams) view.getLayoutParams()).mo5238a(), recyclerView);
        }

        @Deprecated
        /* renamed from: f */
        public void mo5396f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo5397g(Canvas canvas, RecyclerView recyclerView, C1121z zVar) {
            mo5396f(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void mo5398h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo5399i(Canvas canvas, RecyclerView recyclerView, C1121z zVar) {
            mo5398h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class C1104p {

        /* renamed from: a */
        C1130b f5119a;

        /* renamed from: b */
        RecyclerView f5120b;

        /* renamed from: c */
        private final C1168o.C1170b f5121c;

        /* renamed from: d */
        private final C1168o.C1170b f5122d;

        /* renamed from: e */
        C1168o f5123e;

        /* renamed from: f */
        C1168o f5124f;

        /* renamed from: g */
        C1118y f5125g;

        /* renamed from: h */
        boolean f5126h = false;

        /* renamed from: i */
        boolean f5127i = false;

        /* renamed from: j */
        boolean f5128j = false;

        /* renamed from: k */
        private boolean f5129k = true;

        /* renamed from: l */
        private boolean f5130l = true;

        /* renamed from: m */
        int f5131m;

        /* renamed from: n */
        boolean f5132n;

        /* renamed from: o */
        private int f5133o;

        /* renamed from: p */
        private int f5134p;

        /* renamed from: q */
        private int f5135q;

        /* renamed from: r */
        private int f5136r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        class C1105a implements C1168o.C1170b {
            C1105a() {
            }

            /* renamed from: a */
            public View mo5493a(int i) {
                return C1104p.this.mo5418I(i);
            }

            /* renamed from: b */
            public int mo5494b(View view) {
                return C1104p.this.mo5429Q(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo5495c() {
                return C1104p.this.mo5452e0();
            }

            /* renamed from: d */
            public int mo5496d() {
                return C1104p.this.mo5473o0() - C1104p.this.mo5454f0();
            }

            /* renamed from: e */
            public int mo5497e(View view) {
                return C1104p.this.mo5433T(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        class C1106b implements C1168o.C1170b {
            C1106b() {
            }

            /* renamed from: a */
            public View mo5493a(int i) {
                return C1104p.this.mo5418I(i);
            }

            /* renamed from: b */
            public int mo5494b(View view) {
                return C1104p.this.mo5434U(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo5495c() {
                return C1104p.this.mo5456g0();
            }

            /* renamed from: d */
            public int mo5496d() {
                return C1104p.this.mo5437W() - C1104p.this.mo5450d0();
            }

            /* renamed from: e */
            public int mo5497e(View view) {
                return C1104p.this.mo5426O(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        public interface C1107c {
            /* renamed from: a */
            void mo5498a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        public static class C1108d {

            /* renamed from: a */
            public int f5139a;

            /* renamed from: b */
            public int f5140b;

            /* renamed from: c */
            public boolean f5141c;

            /* renamed from: d */
            public boolean f5142d;
        }

        public C1104p() {
            C1105a aVar = new C1105a();
            this.f5121c = aVar;
            C1106b bVar = new C1106b();
            this.f5122d = bVar;
            this.f5123e = new C1168o(aVar);
            this.f5124f = new C1168o(bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m5842K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1104p.m5842K(int, int, int, int, boolean):int");
        }

        /* renamed from: L */
        private int[] m5843L(View view, Rect rect) {
            int[] iArr = new int[2];
            int e0 = mo5452e0();
            int g0 = mo5456g0();
            int o0 = mo5473o0() - mo5454f0();
            int W = mo5437W() - mo5450d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - e0;
            int min = Math.min(0, i);
            int i2 = top - g0;
            int min2 = Math.min(0, i2);
            int i3 = width - o0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - W);
            if (mo5440Z() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: f */
        private void m5844f(View view, int i, boolean z) {
            C1087c0 i0 = RecyclerView.m5650i0(view);
            if (z || i0.isRemoved()) {
                this.f5120b.f5051g.mo5826b(i0);
            } else {
                this.f5120b.f5051g.mo5839p(i0);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (i0.wasReturnedFromScrap() || i0.isScrap()) {
                if (i0.isScrap()) {
                    i0.unScrap();
                } else {
                    i0.clearReturnedFromScrapFlag();
                }
                this.f5119a.mo5684c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f5120b) {
                int m = this.f5119a.mo5692m(view);
                if (i == -1) {
                    i = this.f5119a.mo5688g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f5120b.indexOfChild(view) + this.f5120b.mo5092Q());
                } else if (m != i) {
                    this.f5120b.f5060n.mo5404B0(m, i);
                }
            } else {
                this.f5119a.mo5682a(view, i, false);
                layoutParams.f5088c = true;
                C1118y yVar = this.f5125g;
                if (yVar != null && yVar.mo5562h()) {
                    this.f5125g.mo5565k(view);
                }
            }
            if (layoutParams.f5089d) {
                i0.itemView.invalidate();
                layoutParams.f5089d = false;
            }
        }

        /* renamed from: i0 */
        public static C1108d m5845i0(Context context, AttributeSet attributeSet, int i, int i2) {
            C1108d dVar = new C1108d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5253c.f23250f, i, i2);
            dVar.f5139a = obtainStyledAttributes.getInt(C5253c.f23251g, 1);
            dVar.f5140b = obtainStyledAttributes.getInt(C5253c.f23261q, 1);
            dVar.f5141c = obtainStyledAttributes.getBoolean(C5253c.f23260p, false);
            dVar.f5142d = obtainStyledAttributes.getBoolean(C5253c.f23262r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: n */
        public static int m5846n(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: t0 */
        private boolean m5847t0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e0 = mo5452e0();
            int g0 = mo5456g0();
            int o0 = mo5473o0() - mo5454f0();
            int W = mo5437W() - mo5450d0();
            Rect rect = this.f5120b.f5054j;
            mo5428P(focusedChild, rect);
            if (rect.left - i >= o0 || rect.right - i <= e0 || rect.top - i2 >= W || rect.bottom - i2 <= g0) {
                return false;
            }
            return true;
        }

        /* renamed from: v1 */
        private void m5848v1(C1115v vVar, int i, View view) {
            C1087c0 i0 = RecyclerView.m5650i0(view);
            if (!i0.shouldIgnore()) {
                if (!i0.isInvalid() || i0.isRemoved() || this.f5120b.f5058m.hasStableIds()) {
                    mo5487x(i);
                    vVar.mo5521D(view);
                    this.f5120b.f5051g.mo5835k(i0);
                    return;
                }
                mo5478q1(i);
                vVar.mo5520C(i0);
            }
        }

        /* renamed from: w0 */
        private static boolean m5849w0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: y */
        private void m5850y(int i, View view) {
            this.f5119a.mo5685d(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo5400A(RecyclerView recyclerView, C1115v vVar) {
            this.f5127i = false;
            mo5013I0(recyclerView, vVar);
        }

        /* renamed from: A0 */
        public void mo5401A0(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect m0 = this.f5120b.mo5166m0(view);
            int i3 = i + m0.left + m0.right;
            int i4 = i2 + m0.top + m0.bottom;
            int K = m5842K(mo5473o0(), mo5475p0(), mo5452e0() + mo5454f0() + layoutParams.leftMargin + layoutParams.rightMargin + i3, layoutParams.width, mo5031k());
            int K2 = m5842K(mo5437W(), mo5438X(), mo5456g0() + mo5450d0() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, mo5033l());
            if (mo5412F1(view, K, K2, layoutParams)) {
                view.measure(K, K2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A1 */
        public void mo5402A1(int i, int i2) {
            this.f5135q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f5133o = mode;
            if (mode == 0 && !RecyclerView.f5003P0) {
                this.f5135q = 0;
            }
            this.f5136r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f5134p = mode2;
            if (mode2 == 0 && !RecyclerView.f5003P0) {
                this.f5136r = 0;
            }
        }

        /* renamed from: B */
        public View mo5403B(View view) {
            View S;
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView == null || (S = recyclerView.mo5094S(view)) == null || this.f5119a.mo5693n(S)) {
                return null;
            }
            return S;
        }

        /* renamed from: B0 */
        public void mo5404B0(int i, int i2) {
            View I = mo5418I(i);
            if (I != null) {
                mo5487x(i);
                mo5458h(I, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f5120b.toString());
        }

        /* renamed from: B1 */
        public void mo5405B1(int i, int i2) {
            this.f5120b.setMeasuredDimension(i, i2);
        }

        /* renamed from: C */
        public View mo5011C(int i) {
            int J = mo5419J();
            for (int i2 = 0; i2 < J; i2++) {
                View I = mo5418I(i2);
                C1087c0 i0 = RecyclerView.m5650i0(I);
                if (i0 != null && i0.getLayoutPosition() == i && !i0.shouldIgnore() && (this.f5120b.f5073t0.mo5581e() || !i0.isRemoved())) {
                    return I;
                }
            }
            return null;
        }

        /* renamed from: C0 */
        public void mo5406C0(int i) {
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView != null) {
                recyclerView.mo5070C0(i);
            }
        }

        /* renamed from: C1 */
        public void mo4972C1(Rect rect, int i, int i2) {
            mo5405B1(m5846n(i, rect.width() + mo5452e0() + mo5454f0(), mo5448c0()), m5846n(i2, rect.height() + mo5456g0() + mo5450d0(), mo5445b0()));
        }

        /* renamed from: D */
        public abstract LayoutParams mo4973D();

        /* renamed from: D0 */
        public void mo5407D0(int i) {
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView != null) {
                recyclerView.mo5071D0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D1 */
        public void mo5408D1(int i, int i2) {
            int J = mo5419J();
            if (J == 0) {
                this.f5120b.mo5232x(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < J; i7++) {
                View I = mo5418I(i7);
                Rect rect = this.f5120b.f5054j;
                mo5428P(I, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f5120b.f5054j.set(i5, i6, i3, i4);
            mo4972C1(this.f5120b.f5054j, i, i2);
        }

        /* renamed from: E */
        public LayoutParams mo4974E(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* renamed from: E0 */
        public void mo5409E0(C1092h hVar, C1092h hVar2) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E1 */
        public void mo5410E1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f5120b = null;
                this.f5119a = null;
                this.f5135q = 0;
                this.f5136r = 0;
            } else {
                this.f5120b = recyclerView;
                this.f5119a = recyclerView.f5050f;
                this.f5135q = recyclerView.getWidth();
                this.f5136r = recyclerView.getHeight();
            }
            this.f5133o = 1073741824;
            this.f5134p = 1073741824;
        }

        /* renamed from: F */
        public LayoutParams mo4975F(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        /* renamed from: F0 */
        public boolean mo5411F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F1 */
        public boolean mo5412F1(View view, int i, int i2, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.f5129k || !m5849w0(view.getWidth(), i, layoutParams.width) || !m5849w0(view.getHeight(), i2, layoutParams.height);
        }

        /* renamed from: G */
        public int mo5413G() {
            return -1;
        }

        /* renamed from: G0 */
        public void mo5414G0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G1 */
        public boolean mo5012G1() {
            return false;
        }

        /* renamed from: H */
        public int mo5415H(View view) {
            return ((LayoutParams) view.getLayoutParams()).f5087b.bottom;
        }

        @Deprecated
        /* renamed from: H0 */
        public void mo5416H0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H1 */
        public boolean mo5417H1(View view, int i, int i2, LayoutParams layoutParams) {
            return !this.f5129k || !m5849w0(view.getMeasuredWidth(), i, layoutParams.width) || !m5849w0(view.getMeasuredHeight(), i2, layoutParams.height);
        }

        /* renamed from: I */
        public View mo5418I(int i) {
            C1130b bVar = this.f5119a;
            if (bVar != null) {
                return bVar.mo5687f(i);
            }
            return null;
        }

        /* renamed from: I0 */
        public void mo5013I0(RecyclerView recyclerView, C1115v vVar) {
            mo5416H0(recyclerView);
        }

        /* renamed from: I1 */
        public void mo5014I1(RecyclerView recyclerView, C1121z zVar, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: J */
        public int mo5419J() {
            C1130b bVar = this.f5119a;
            if (bVar != null) {
                return bVar.mo5688g();
            }
            return 0;
        }

        /* renamed from: J0 */
        public View mo4976J0(View view, int i, C1115v vVar, C1121z zVar) {
            return null;
        }

        /* renamed from: J1 */
        public void mo5420J1(C1118y yVar) {
            C1118y yVar2 = this.f5125g;
            if (!(yVar2 == null || yVar == yVar2 || !yVar2.mo5562h())) {
                this.f5125g.mo5572r();
            }
            this.f5125g = yVar;
            yVar.mo5571q(this.f5120b, this);
        }

        /* renamed from: K0 */
        public void mo5015K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5120b;
            mo5422L0(recyclerView.f5047c, recyclerView.f5073t0, accessibilityEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K1 */
        public void mo5421K1() {
            C1118y yVar = this.f5125g;
            if (yVar != null) {
                yVar.mo5572r();
            }
        }

        /* renamed from: L0 */
        public void mo5422L0(C1115v vVar, C1121z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f5120b.canScrollVertically(-1) && !this.f5120b.canScrollHorizontally(-1) && !this.f5120b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C1092h hVar = this.f5120b.f5058m;
                if (hVar != null) {
                    accessibilityEvent.setItemCount(hVar.getItemCount());
                }
            }
        }

        /* renamed from: L1 */
        public boolean mo4977L1() {
            return false;
        }

        /* renamed from: M */
        public boolean mo5423M() {
            RecyclerView recyclerView = this.f5120b;
            return recyclerView != null && recyclerView.f5052h;
        }

        /* renamed from: M0 */
        public void mo5424M0(C1115v vVar, C1121z zVar, C5771c cVar) {
            if (this.f5120b.canScrollVertically(-1) || this.f5120b.canScrollHorizontally(-1)) {
                cVar.mo22622a(8192);
                cVar.mo22664x0(true);
            }
            if (this.f5120b.canScrollVertically(1) || this.f5120b.canScrollHorizontally(1)) {
                cVar.mo22622a(4096);
                cVar.mo22664x0(true);
            }
            cVar.mo22630e0(C5771c.C5773b.m25622b(mo4992k0(vVar, zVar), mo4978N(vVar, zVar), mo5485v0(vVar, zVar), mo5467l0(vVar, zVar)));
        }

        /* renamed from: N */
        public int mo4978N(C1115v vVar, C1121z zVar) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N0 */
        public void mo5425N0(C5771c cVar) {
            RecyclerView recyclerView = this.f5120b;
            mo5424M0(recyclerView.f5047c, recyclerView.f5073t0, cVar);
        }

        /* renamed from: O */
        public int mo5426O(View view) {
            return view.getBottom() + mo5415H(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O0 */
        public void mo5427O0(View view, C5771c cVar) {
            C1087c0 i0 = RecyclerView.m5650i0(view);
            if (i0 != null && !i0.isRemoved() && !this.f5119a.mo5693n(i0.itemView)) {
                RecyclerView recyclerView = this.f5120b;
                mo4980P0(recyclerView.f5047c, recyclerView.f5073t0, view, cVar);
            }
        }

        /* renamed from: P */
        public void mo5428P(View view, Rect rect) {
            RecyclerView.m5651j0(view, rect);
        }

        /* renamed from: P0 */
        public void mo4980P0(C1115v vVar, C1121z zVar, View view, C5771c cVar) {
        }

        /* renamed from: Q */
        public int mo5429Q(View view) {
            return view.getLeft() - mo5442a0(view);
        }

        /* renamed from: Q0 */
        public View mo5430Q0(View view, int i) {
            return null;
        }

        /* renamed from: R */
        public int mo5431R(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f5087b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: R0 */
        public void mo4981R0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: S */
        public int mo5432S(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f5087b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: S0 */
        public void mo4982S0(RecyclerView recyclerView) {
        }

        /* renamed from: T */
        public int mo5433T(View view) {
            return view.getRight() + mo5464j0(view);
        }

        /* renamed from: T0 */
        public void mo4984T0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: U */
        public int mo5434U(View view) {
            return view.getTop() - mo5469m0(view);
        }

        /* renamed from: U0 */
        public void mo4986U0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: V */
        public View mo5435V() {
            View focusedChild;
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f5119a.mo5693n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: V0 */
        public void mo5436V0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: W */
        public int mo5437W() {
            return this.f5136r;
        }

        /* renamed from: W0 */
        public void mo4987W0(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo5436V0(recyclerView, i, i2);
        }

        /* renamed from: X */
        public int mo5438X() {
            return this.f5134p;
        }

        /* renamed from: X0 */
        public void mo4988X0(C1115v vVar, C1121z zVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: Y */
        public int mo5439Y() {
            RecyclerView recyclerView = this.f5120b;
            C1092h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: Y0 */
        public void mo4989Y0(C1121z zVar) {
        }

        /* renamed from: Z */
        public int mo5440Z() {
            return C5723u.m25265B(this.f5120b);
        }

        /* renamed from: Z0 */
        public void mo5441Z0(C1115v vVar, C1121z zVar, int i, int i2) {
            this.f5120b.mo5232x(i, i2);
        }

        /* renamed from: a0 */
        public int mo5442a0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f5087b.left;
        }

        @Deprecated
        /* renamed from: a1 */
        public boolean mo5443a1(RecyclerView recyclerView, View view, View view2) {
            return mo5488x0() || recyclerView.mo5230w0();
        }

        /* renamed from: b */
        public void mo5444b(View view) {
            mo5447c(view, -1);
        }

        /* renamed from: b0 */
        public int mo5445b0() {
            return C5723u.m25267C(this.f5120b);
        }

        /* renamed from: b1 */
        public boolean mo5446b1(RecyclerView recyclerView, C1121z zVar, View view, View view2) {
            return mo5443a1(recyclerView, view, view2);
        }

        /* renamed from: c */
        public void mo5447c(View view, int i) {
            m5844f(view, i, true);
        }

        /* renamed from: c0 */
        public int mo5448c0() {
            return C5723u.m25269D(this.f5120b);
        }

        /* renamed from: c1 */
        public void mo5027c1(Parcelable parcelable) {
        }

        /* renamed from: d */
        public void mo5449d(View view) {
            mo5451e(view, -1);
        }

        /* renamed from: d0 */
        public int mo5450d0() {
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: d1 */
        public Parcelable mo5029d1() {
            return null;
        }

        /* renamed from: e */
        public void mo5451e(View view, int i) {
            m5844f(view, i, false);
        }

        /* renamed from: e0 */
        public int mo5452e0() {
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: e1 */
        public void mo5453e1(int i) {
        }

        /* renamed from: f0 */
        public int mo5454f0() {
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f1 */
        public void mo5455f1(C1118y yVar) {
            if (this.f5125g == yVar) {
                this.f5125g = null;
            }
        }

        /* renamed from: g */
        public void mo5030g(String str) {
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView != null) {
                recyclerView.mo5184p(str);
            }
        }

        /* renamed from: g0 */
        public int mo5456g0() {
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g1 */
        public boolean mo5457g1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f5120b;
            return mo5460h1(recyclerView.f5047c, recyclerView.f5073t0, i, bundle);
        }

        /* renamed from: h */
        public void mo5458h(View view, int i) {
            mo5461i(view, i, (LayoutParams) view.getLayoutParams());
        }

        /* renamed from: h0 */
        public int mo5459h0(View view) {
            return ((LayoutParams) view.getLayoutParams()).mo5238a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: h1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo5460h1(androidx.recyclerview.widget.RecyclerView.C1115v r8, androidx.recyclerview.widget.RecyclerView.C1121z r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f5120b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo5437W()
                int r11 = r7.mo5456g0()
                int r8 = r8 - r11
                int r11 = r7.mo5450d0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f5120b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo5473o0()
                int r11 = r7.mo5452e0()
                int r10 = r10 - r11
                int r11 = r7.mo5454f0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo5437W()
                int r10 = r7.mo5456g0()
                int r8 = r8 - r10
                int r10 = r7.mo5450d0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f5120b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo5473o0()
                int r11 = r7.mo5452e0()
                int r10 = r10 - r11
                int r11 = r7.mo5454f0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f5120b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.mo5189r1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1104p.mo5460h1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, int, android.os.Bundle):boolean");
        }

        /* renamed from: i */
        public void mo5461i(View view, int i, LayoutParams layoutParams) {
            C1087c0 i0 = RecyclerView.m5650i0(view);
            if (i0.isRemoved()) {
                this.f5120b.f5051g.mo5826b(i0);
            } else {
                this.f5120b.f5051g.mo5839p(i0);
            }
            this.f5119a.mo5684c(view, i, layoutParams, i0.isRemoved());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i1 */
        public boolean mo5462i1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f5120b;
            return mo5465j1(recyclerView.f5047c, recyclerView.f5073t0, view, i, bundle);
        }

        /* renamed from: j */
        public void mo5463j(View view, Rect rect) {
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo5166m0(view));
            }
        }

        /* renamed from: j0 */
        public int mo5464j0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f5087b.right;
        }

        /* renamed from: j1 */
        public boolean mo5465j1(C1115v vVar, C1121z zVar, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: k */
        public boolean mo5031k() {
            return false;
        }

        /* renamed from: k0 */
        public int mo4992k0(C1115v vVar, C1121z zVar) {
            return -1;
        }

        /* renamed from: k1 */
        public void mo5466k1(C1115v vVar) {
            for (int J = mo5419J() - 1; J >= 0; J--) {
                if (!RecyclerView.m5650i0(mo5418I(J)).shouldIgnore()) {
                    mo5472n1(J, vVar);
                }
            }
        }

        /* renamed from: l */
        public boolean mo5033l() {
            return false;
        }

        /* renamed from: l0 */
        public int mo5467l0(C1115v vVar, C1121z zVar) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l1 */
        public void mo5468l1(C1115v vVar) {
            int j = vVar.mo5538j();
            for (int i = j - 1; i >= 0; i--) {
                View n = vVar.mo5542n(i);
                C1087c0 i0 = RecyclerView.m5650i0(n);
                if (!i0.shouldIgnore()) {
                    i0.setIsRecyclable(false);
                    if (i0.isTmpDetached()) {
                        this.f5120b.removeDetachedView(n, false);
                    }
                    C1098m mVar = this.f5120b.f5036N;
                    if (mVar != null) {
                        mVar.mo5377j(i0);
                    }
                    i0.setIsRecyclable(true);
                    vVar.mo5551y(n);
                }
            }
            vVar.mo5533e();
            if (j > 0) {
                this.f5120b.invalidate();
            }
        }

        /* renamed from: m */
        public boolean mo4993m(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: m0 */
        public int mo5469m0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f5087b.top;
        }

        /* renamed from: m1 */
        public void mo5470m1(View view, C1115v vVar) {
            mo5476p1(view);
            vVar.mo5519B(view);
        }

        /* renamed from: n0 */
        public void mo5471n0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f5087b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f5120b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f5120b.f5056l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: n1 */
        public void mo5472n1(int i, C1115v vVar) {
            View I = mo5418I(i);
            mo5478q1(i);
            vVar.mo5519B(I);
        }

        /* renamed from: o */
        public void mo5037o(int i, int i2, C1121z zVar, C1107c cVar) {
        }

        /* renamed from: o0 */
        public int mo5473o0() {
            return this.f5135q;
        }

        /* renamed from: o1 */
        public boolean mo5474o1(Runnable runnable) {
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: p */
        public void mo5038p(int i, C1107c cVar) {
        }

        /* renamed from: p0 */
        public int mo5475p0() {
            return this.f5133o;
        }

        /* renamed from: p1 */
        public void mo5476p1(View view) {
            this.f5119a.mo5695p(view);
        }

        /* renamed from: q */
        public int mo5039q(C1121z zVar) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q0 */
        public boolean mo5477q0() {
            int J = mo5419J();
            for (int i = 0; i < J; i++) {
                ViewGroup.LayoutParams layoutParams = mo5418I(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q1 */
        public void mo5478q1(int i) {
            if (mo5418I(i) != null) {
                this.f5119a.mo5696q(i);
            }
        }

        /* renamed from: r */
        public int mo4996r(C1121z zVar) {
            return 0;
        }

        /* renamed from: r0 */
        public boolean mo5479r0() {
            return this.f5127i;
        }

        /* renamed from: r1 */
        public boolean mo5480r1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo5481s1(recyclerView, view, rect, z, false);
        }

        /* renamed from: s */
        public int mo4997s(C1121z zVar) {
            return 0;
        }

        /* renamed from: s0 */
        public boolean mo5040s0() {
            return this.f5128j;
        }

        /* renamed from: s1 */
        public boolean mo5481s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] L = m5843L(view, rect);
            int i = L[0];
            int i2 = L[1];
            if ((z2 && !m5847t0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo5171o1(i, i2);
            }
            return true;
        }

        /* renamed from: t */
        public int mo5041t(C1121z zVar) {
            return 0;
        }

        /* renamed from: t1 */
        public void mo5482t1() {
            RecyclerView recyclerView = this.f5120b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: u */
        public int mo4998u(C1121z zVar) {
            return 0;
        }

        /* renamed from: u0 */
        public final boolean mo5483u0() {
            return this.f5130l;
        }

        /* renamed from: u1 */
        public void mo5484u1() {
            this.f5126h = true;
        }

        /* renamed from: v */
        public int mo4999v(C1121z zVar) {
            return 0;
        }

        /* renamed from: v0 */
        public boolean mo5485v0(C1115v vVar, C1121z zVar) {
            return false;
        }

        /* renamed from: w */
        public void mo5486w(C1115v vVar) {
            for (int J = mo5419J() - 1; J >= 0; J--) {
                m5848v1(vVar, J, mo5418I(J));
            }
        }

        /* renamed from: w1 */
        public int mo5000w1(int i, C1115v vVar, C1121z zVar) {
            return 0;
        }

        /* renamed from: x */
        public void mo5487x(int i) {
            m5850y(i, mo5418I(i));
        }

        /* renamed from: x0 */
        public boolean mo5488x0() {
            C1118y yVar = this.f5125g;
            return yVar != null && yVar.mo5562h();
        }

        /* renamed from: x1 */
        public void mo5043x1(int i) {
        }

        /* renamed from: y0 */
        public boolean mo5489y0(View view, boolean z, boolean z2) {
            boolean z3 = this.f5123e.mo5819b(view, 24579) && this.f5124f.mo5819b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: y1 */
        public int mo5001y1(int i, C1115v vVar, C1121z zVar) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo5490z(RecyclerView recyclerView) {
            this.f5127i = true;
            mo5414G0(recyclerView);
        }

        /* renamed from: z0 */
        public void mo5491z0(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f5087b;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z1 */
        public void mo5492z1(RecyclerView recyclerView) {
            mo5402A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C1109q {
        /* renamed from: a */
        void mo5499a(View view);

        /* renamed from: b */
        void mo5500b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C1110r {
        /* renamed from: a */
        public abstract boolean mo5501a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C1111s {
        /* renamed from: a */
        void mo5502a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo5503b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo5504c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C1112t {
        /* renamed from: a */
        public void mo5505a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo5506b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C1113u {

        /* renamed from: a */
        SparseArray<C1114a> f5143a = new SparseArray<>();

        /* renamed from: b */
        private int f5144b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class C1114a {

            /* renamed from: a */
            final ArrayList<C1087c0> f5145a = new ArrayList<>();

            /* renamed from: b */
            int f5146b = 5;

            /* renamed from: c */
            long f5147c = 0;

            /* renamed from: d */
            long f5148d = 0;

            C1114a() {
            }
        }

        /* renamed from: g */
        private C1114a m6002g(int i) {
            C1114a aVar = this.f5143a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1114a aVar2 = new C1114a();
            this.f5143a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5507a() {
            this.f5144b++;
        }

        /* renamed from: b */
        public void mo5508b() {
            for (int i = 0; i < this.f5143a.size(); i++) {
                this.f5143a.valueAt(i).f5145a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5509c() {
            this.f5144b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5510d(int i, long j) {
            C1114a g = m6002g(i);
            g.f5148d = mo5515j(g.f5148d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5511e(int i, long j) {
            C1114a g = m6002g(i);
            g.f5147c = mo5515j(g.f5147c, j);
        }

        /* renamed from: f */
        public C1087c0 mo5512f(int i) {
            C1114a aVar = this.f5143a.get(i);
            if (aVar == null || aVar.f5145a.isEmpty()) {
                return null;
            }
            ArrayList<C1087c0> arrayList = aVar.f5145a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo5513h(C1092h hVar, C1092h hVar2, boolean z) {
            if (hVar != null) {
                mo5509c();
            }
            if (!z && this.f5144b == 0) {
                mo5508b();
            }
            if (hVar2 != null) {
                mo5507a();
            }
        }

        /* renamed from: i */
        public void mo5514i(C1087c0 c0Var) {
            int itemViewType = c0Var.getItemViewType();
            ArrayList<C1087c0> arrayList = m6002g(itemViewType).f5145a;
            if (this.f5143a.get(itemViewType).f5146b > arrayList.size()) {
                c0Var.resetInternal();
                arrayList.add(c0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public long mo5515j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo5516k(int i, long j, long j2) {
            long j3 = m6002g(i).f5148d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo5517l(int i, long j, long j2) {
            long j3 = m6002g(i).f5147c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C1115v {

        /* renamed from: a */
        final ArrayList<C1087c0> f5149a;

        /* renamed from: b */
        ArrayList<C1087c0> f5150b = null;

        /* renamed from: c */
        final ArrayList<C1087c0> f5151c = new ArrayList<>();

        /* renamed from: d */
        private final List<C1087c0> f5152d;

        /* renamed from: e */
        private int f5153e;

        /* renamed from: f */
        int f5154f;

        /* renamed from: g */
        C1113u f5155g;

        public C1115v() {
            ArrayList<C1087c0> arrayList = new ArrayList<>();
            this.f5149a = arrayList;
            this.f5152d = Collections.unmodifiableList(arrayList);
            this.f5153e = 2;
            this.f5154f = 2;
        }

        /* renamed from: H */
        private boolean m6014H(C1087c0 c0Var, int i, int i2, long j) {
            c0Var.mBindingAdapter = null;
            c0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = c0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f5155g.mo5516k(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f5058m.bindViewHolder(c0Var, i);
            this.f5155g.mo5510d(c0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m6015b(c0Var);
            if (!RecyclerView.this.f5073t0.mo5581e()) {
                return true;
            }
            c0Var.mPreLayoutPosition = i2;
            return true;
        }

        /* renamed from: b */
        private void m6015b(C1087c0 c0Var) {
            if (RecyclerView.this.mo5228v0()) {
                View view = c0Var.itemView;
                if (C5723u.m25351z(view) == 0) {
                    C5723u.m25350y0(view, 1);
                }
                C1162k kVar = RecyclerView.this.f5011A0;
                if (kVar != null) {
                    C5682a n = kVar.mo5792n();
                    if (n instanceof C1162k.C1163a) {
                        ((C1162k.C1163a) n).mo5799o(view);
                    }
                    C5723u.m25330o0(view, n);
                }
            }
        }

        /* renamed from: q */
        private void m6016q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m6016q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m6017r(C1087c0 c0Var) {
            View view = c0Var.itemView;
            if (view instanceof ViewGroup) {
                m6016q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo5518A(int i) {
            mo5530a(this.f5151c.get(i), true);
            this.f5151c.remove(i);
        }

        /* renamed from: B */
        public void mo5519B(View view) {
            C1087c0 i0 = RecyclerView.m5650i0(view);
            if (i0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (i0.isScrap()) {
                i0.unScrap();
            } else if (i0.wasReturnedFromScrap()) {
                i0.clearReturnedFromScrapFlag();
            }
            mo5520C(i0);
            if (RecyclerView.this.f5036N != null && !i0.isRecyclable()) {
                RecyclerView.this.f5036N.mo5377j(i0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo5520C(C1087c0 c0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (c0Var.isScrap() || c0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c0Var.isScrap());
                sb.append(" isAttached:");
                if (c0Var.itemView.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo5092Q());
                throw new IllegalArgumentException(sb.toString());
            } else if (c0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c0Var + RecyclerView.this.mo5092Q());
            } else if (!c0Var.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = c0Var.doesTransientStatePreventRecycling();
                C1092h hVar = RecyclerView.this.f5058m;
                if ((hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(c0Var)) || c0Var.isRecyclable()) {
                    if (this.f5154f <= 0 || c0Var.hasAnyOfTheFlags(IronSourceError.ERROR_CAPPED_PER_SESSION)) {
                        z = false;
                    } else {
                        int size = this.f5151c.size();
                        if (size >= this.f5154f && size > 0) {
                            mo5518A(0);
                            size--;
                        }
                        if (RecyclerView.f5005R0 && size > 0 && !RecyclerView.this.f5071s0.mo5754d(c0Var.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f5071s0.mo5754d(this.f5151c.get(i).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f5151c.add(size, c0Var);
                        z = true;
                    }
                    if (!z) {
                        mo5530a(c0Var, true);
                        z2 = z;
                        RecyclerView.this.f5051g.mo5840q(c0Var);
                        if (!z2 && !z3 && doesTransientStatePreventRecycling) {
                            c0Var.mBindingAdapter = null;
                            c0Var.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.f5051g.mo5840q(c0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo5092Q());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo5521D(View view) {
            C1087c0 i0 = RecyclerView.m5650i0(view);
            if (!i0.hasAnyOfTheFlags(12) && i0.isUpdated() && !RecyclerView.this.mo5186q(i0)) {
                if (this.f5150b == null) {
                    this.f5150b = new ArrayList<>();
                }
                i0.setScrapContainer(this, true);
                this.f5150b.add(i0);
            } else if (!i0.isInvalid() || i0.isRemoved() || RecyclerView.this.f5058m.hasStableIds()) {
                i0.setScrapContainer(this, false);
                this.f5149a.add(i0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo5092Q());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo5522E(C1113u uVar) {
            C1113u uVar2 = this.f5155g;
            if (uVar2 != null) {
                uVar2.mo5509c();
            }
            this.f5155g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f5155g.mo5507a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo5523F(C1083a0 a0Var) {
        }

        /* renamed from: G */
        public void mo5524G(int i) {
            this.f5153e = i;
            mo5527K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01b7  */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C1087c0 mo5525I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f5073t0
                int r1 = r1.mo5578b()
                if (r3 >= r1) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f5073t0
                boolean r1 = r1.mo5581e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r16.mo5536h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r16.mo5541m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo5528L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0057
                r1.clearReturnedFromScrapFlag()
            L_0x0057:
                r6.mo5520C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f5049e
                int r5 = r5.mo5666m(r3)
                if (r5 < 0) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f5058m
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f5058m
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r10 = r10.f5058m
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r1 = r1.f5058m
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r6.mo5540l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.mPosition = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.mo5537i()
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r0.mo5512f(r9)
                if (r0 == 0) goto L_0x00ac
                r0.resetInternal()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f5002O0
                if (r1 == 0) goto L_0x00ac
                r6.m6017r(r0)
            L_0x00ac:
                r1 = r0
            L_0x00ad:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00cb
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f5155g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo5517l(r11, r12, r14)
                if (r5 != 0) goto L_0x00cb
                return r2
            L_0x00cb:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r5 = r2.f5058m
                androidx.recyclerview.widget.RecyclerView$c0 r2 = r5.createViewHolder(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f5005R0
                if (r5 == 0) goto L_0x00e6
                android.view.View r5 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m5638W(r5)
                if (r5 == 0) goto L_0x00e6
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x00e6:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f5155g
                long r10 = r10 - r0
                r5.mo5511e(r9, r10)
                r9 = r2
                goto L_0x012d
            L_0x00f4:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.f5073t0
                int r2 = r2.mo5578b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5092Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x012c:
                r9 = r1
            L_0x012d:
                r10 = r4
                if (r10 == 0) goto L_0x0166
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f5073t0
                boolean r0 = r0.mo5581e()
                if (r0 != 0) goto L_0x0166
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x0166
                r9.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f5073t0
                boolean r0 = r0.f5183k
                if (r0 == 0) goto L_0x0166
                int r0 = androidx.recyclerview.widget.RecyclerView.C1098m.m5809e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$m r2 = r1.f5036N
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f5073t0
                java.util.List r4 = r9.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$m$c r0 = r2.mo5387t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo5097U0(r9, r0)
            L_0x0166:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f5073t0
                boolean r0 = r0.mo5581e()
                if (r0 == 0) goto L_0x0179
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x0179
                r9.mPreLayoutPosition = r3
                goto L_0x018c
            L_0x0179:
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x018e
                boolean r0 = r9.needsUpdate()
                if (r0 != 0) goto L_0x018e
                boolean r0 = r9.isInvalid()
                if (r0 == 0) goto L_0x018c
                goto L_0x018e
            L_0x018c:
                r0 = 0
                goto L_0x01a1
            L_0x018e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f5049e
                int r2 = r0.mo5666m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.m6014H(r1, r2, r3, r4)
            L_0x01a1:
                android.view.View r1 = r9.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01b7
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01b7:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01cd
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01cd:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            L_0x01cf:
                r1.f5086a = r9
                if (r10 == 0) goto L_0x01d6
                if (r0 == 0) goto L_0x01d6
                goto L_0x01d7
            L_0x01d6:
                r7 = 0
            L_0x01d7:
                r1.f5089d = r7
                return r9
            L_0x01da:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.f5073t0
                int r2 = r2.mo5578b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5092Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1115v.mo5525I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo5526J(C1087c0 c0Var) {
            if (c0Var.mInChangeScrap) {
                this.f5150b.remove(c0Var);
            } else {
                this.f5149a.remove(c0Var);
            }
            c0Var.mScrapContainer = null;
            c0Var.mInChangeScrap = false;
            c0Var.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo5527K() {
            C1104p pVar = RecyclerView.this.f5060n;
            this.f5154f = this.f5153e + (pVar != null ? pVar.f5131m : 0);
            for (int size = this.f5151c.size() - 1; size >= 0 && this.f5151c.size() > this.f5154f; size--) {
                mo5518A(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo5528L(C1087c0 c0Var) {
            if (c0Var.isRemoved()) {
                return RecyclerView.this.f5073t0.mo5581e();
            }
            int i = c0Var.mPosition;
            if (i < 0 || i >= RecyclerView.this.f5058m.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c0Var + RecyclerView.this.mo5092Q());
            } else if (!RecyclerView.this.f5073t0.mo5581e() && RecyclerView.this.f5058m.getItemViewType(c0Var.mPosition) != c0Var.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.f5058m.hasStableIds() || c0Var.getItemId() == RecyclerView.this.f5058m.getItemId(c0Var.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public void mo5529M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f5151c.size() - 1; size >= 0; size--) {
                C1087c0 c0Var = this.f5151c.get(size);
                if (c0Var != null && (i3 = c0Var.mPosition) >= i && i3 < i4) {
                    c0Var.addFlags(2);
                    mo5518A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5530a(C1087c0 c0Var, boolean z) {
            RecyclerView.m5660s(c0Var);
            View view = c0Var.itemView;
            C1162k kVar = RecyclerView.this.f5011A0;
            if (kVar != null) {
                C5682a n = kVar.mo5792n();
                C5723u.m25330o0(view, n instanceof C1162k.C1163a ? ((C1162k.C1163a) n).mo5798n(view) : null);
            }
            if (z) {
                mo5535g(c0Var);
            }
            c0Var.mBindingAdapter = null;
            c0Var.mOwnerRecyclerView = null;
            mo5537i().mo5514i(c0Var);
        }

        /* renamed from: c */
        public void mo5531c() {
            this.f5149a.clear();
            mo5552z();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5532d() {
            int size = this.f5151c.size();
            for (int i = 0; i < size; i++) {
                this.f5151c.get(i).clearOldPosition();
            }
            int size2 = this.f5149a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f5149a.get(i2).clearOldPosition();
            }
            ArrayList<C1087c0> arrayList = this.f5150b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f5150b.get(i3).clearOldPosition();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5533e() {
            this.f5149a.clear();
            ArrayList<C1087c0> arrayList = this.f5150b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int mo5534f(int i) {
            if (i < 0 || i >= RecyclerView.this.f5073t0.mo5578b()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f5073t0.mo5578b() + RecyclerView.this.mo5092Q());
            } else if (!RecyclerView.this.f5073t0.mo5581e()) {
                return i;
            } else {
                return RecyclerView.this.f5049e.mo5666m(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo5535g(C1087c0 c0Var) {
            C1116w wVar = RecyclerView.this.f5062o;
            if (wVar != null) {
                wVar.mo5553a(c0Var);
            }
            C1092h hVar = RecyclerView.this.f5058m;
            if (hVar != null) {
                hVar.onViewRecycled(c0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5073t0 != null) {
                recyclerView.f5051g.mo5840q(c0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1087c0 mo5536h(int i) {
            int size;
            int m;
            ArrayList<C1087c0> arrayList = this.f5150b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C1087c0 c0Var = this.f5150b.get(i3);
                    if (c0Var.wasReturnedFromScrap() || c0Var.getLayoutPosition() != i) {
                        i3++;
                    } else {
                        c0Var.addFlags(32);
                        return c0Var;
                    }
                }
                if (RecyclerView.this.f5058m.hasStableIds() && (m = RecyclerView.this.f5049e.mo5666m(i)) > 0 && m < RecyclerView.this.f5058m.getItemCount()) {
                    long itemId = RecyclerView.this.f5058m.getItemId(m);
                    while (i2 < size) {
                        C1087c0 c0Var2 = this.f5150b.get(i2);
                        if (c0Var2.wasReturnedFromScrap() || c0Var2.getItemId() != itemId) {
                            i2++;
                        } else {
                            c0Var2.addFlags(32);
                            return c0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C1113u mo5537i() {
            if (this.f5155g == null) {
                this.f5155g = new C1113u();
            }
            return this.f5155g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo5538j() {
            return this.f5149a.size();
        }

        /* renamed from: k */
        public List<C1087c0> mo5539k() {
            return this.f5152d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C1087c0 mo5540l(long j, int i, boolean z) {
            for (int size = this.f5149a.size() - 1; size >= 0; size--) {
                C1087c0 c0Var = this.f5149a.get(size);
                if (c0Var.getItemId() == j && !c0Var.wasReturnedFromScrap()) {
                    if (i == c0Var.getItemViewType()) {
                        c0Var.addFlags(32);
                        if (c0Var.isRemoved() && !RecyclerView.this.f5073t0.mo5581e()) {
                            c0Var.setFlags(2, 14);
                        }
                        return c0Var;
                    } else if (!z) {
                        this.f5149a.remove(size);
                        RecyclerView.this.removeDetachedView(c0Var.itemView, false);
                        mo5551y(c0Var.itemView);
                    }
                }
            }
            int size2 = this.f5151c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C1087c0 c0Var2 = this.f5151c.get(size2);
                if (c0Var2.getItemId() == j && !c0Var2.isAttachedToTransitionOverlay()) {
                    if (i == c0Var2.getItemViewType()) {
                        if (!z) {
                            this.f5151c.remove(size2);
                        }
                        return c0Var2;
                    } else if (!z) {
                        mo5518A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C1087c0 mo5541m(int i, boolean z) {
            View e;
            int size = this.f5149a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C1087c0 c0Var = this.f5149a.get(i3);
                if (c0Var.wasReturnedFromScrap() || c0Var.getLayoutPosition() != i || c0Var.isInvalid() || (!RecyclerView.this.f5073t0.f5180h && c0Var.isRemoved())) {
                    i3++;
                } else {
                    c0Var.addFlags(32);
                    return c0Var;
                }
            }
            if (z || (e = RecyclerView.this.f5050f.mo5686e(i)) == null) {
                int size2 = this.f5151c.size();
                while (i2 < size2) {
                    C1087c0 c0Var2 = this.f5151c.get(i2);
                    if (c0Var2.isInvalid() || c0Var2.getLayoutPosition() != i || c0Var2.isAttachedToTransitionOverlay()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f5151c.remove(i2);
                        }
                        return c0Var2;
                    }
                }
                return null;
            }
            C1087c0 i0 = RecyclerView.m5650i0(e);
            RecyclerView.this.f5050f.mo5698s(e);
            int m = RecyclerView.this.f5050f.mo5692m(e);
            if (m != -1) {
                RecyclerView.this.f5050f.mo5685d(m);
                mo5521D(e);
                i0.addFlags(8224);
                return i0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + i0 + RecyclerView.this.mo5092Q());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public View mo5542n(int i) {
            return this.f5149a.get(i).itemView;
        }

        /* renamed from: o */
        public View mo5543o(int i) {
            return mo5544p(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public View mo5544p(int i, boolean z) {
            return mo5525I(i, z, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo5545s() {
            int size = this.f5151c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) this.f5151c.get(i).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f5088c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo5546t() {
            int size = this.f5151c.size();
            for (int i = 0; i < size; i++) {
                C1087c0 c0Var = this.f5151c.get(i);
                if (c0Var != null) {
                    c0Var.addFlags(6);
                    c0Var.addChangePayload((Object) null);
                }
            }
            C1092h hVar = RecyclerView.this.f5058m;
            if (hVar == null || !hVar.hasStableIds()) {
                mo5552z();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo5547u(int i, int i2) {
            int size = this.f5151c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1087c0 c0Var = this.f5151c.get(i3);
                if (c0Var != null && c0Var.mPosition >= i) {
                    c0Var.offsetPosition(i2, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5548v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f5151c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1087c0 c0Var = this.f5151c.get(i7);
                if (c0Var != null && (i6 = c0Var.mPosition) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        c0Var.offsetPosition(i2 - i, false);
                    } else {
                        c0Var.offsetPosition(i5, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo5549w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f5151c.size() - 1; size >= 0; size--) {
                C1087c0 c0Var = this.f5151c.get(size);
                if (c0Var != null) {
                    int i4 = c0Var.mPosition;
                    if (i4 >= i3) {
                        c0Var.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        c0Var.addFlags(8);
                        mo5518A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo5550x(C1092h hVar, C1092h hVar2, boolean z) {
            mo5531c();
            mo5537i().mo5513h(hVar, hVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo5551y(View view) {
            C1087c0 i0 = RecyclerView.m5650i0(view);
            i0.mScrapContainer = null;
            i0.mInChangeScrap = false;
            i0.clearReturnedFromScrapFlag();
            mo5520C(i0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo5552z() {
            for (int size = this.f5151c.size() - 1; size >= 0; size--) {
                mo5518A(size);
            }
            this.f5151c.clear();
            if (RecyclerView.f5005R0) {
                RecyclerView.this.f5071s0.mo5752b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C1116w {
        /* renamed from: a */
        void mo5553a(C1087c0 c0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C1117x extends C1095j {
        C1117x() {
        }

        /* renamed from: a */
        public void mo5360a() {
            RecyclerView.this.mo5184p((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5073t0.f5179g = true;
            recyclerView.mo5095S0(true);
            if (!RecyclerView.this.f5049e.mo5669p()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: c */
        public void mo5362c(int i, int i2, Object obj) {
            RecyclerView.this.mo5184p((String) null);
            if (RecyclerView.this.f5049e.mo5671r(i, i2, obj)) {
                mo5554h();
            }
        }

        /* renamed from: d */
        public void mo5363d(int i, int i2) {
            RecyclerView.this.mo5184p((String) null);
            if (RecyclerView.this.f5049e.mo5672s(i, i2)) {
                mo5554h();
            }
        }

        /* renamed from: e */
        public void mo5364e(int i, int i2, int i3) {
            RecyclerView.this.mo5184p((String) null);
            if (RecyclerView.this.f5049e.mo5673t(i, i2, i3)) {
                mo5554h();
            }
        }

        /* renamed from: f */
        public void mo5365f(int i, int i2) {
            RecyclerView.this.mo5184p((String) null);
            if (RecyclerView.this.f5049e.mo5674u(i, i2)) {
                mo5554h();
            }
        }

        /* renamed from: g */
        public void mo5366g() {
            C1092h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5048d != null && (hVar = recyclerView.f5058m) != null && hVar.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo5554h() {
            if (RecyclerView.f5004Q0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f5072t && recyclerView.f5070s) {
                    C5723u.m25314g0(recyclerView, recyclerView.f5053i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f5012B = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class C1118y {

        /* renamed from: a */
        private int f5158a = -1;

        /* renamed from: b */
        private RecyclerView f5159b;

        /* renamed from: c */
        private C1104p f5160c;

        /* renamed from: d */
        private boolean f5161d;

        /* renamed from: e */
        private boolean f5162e;

        /* renamed from: f */
        private View f5163f;

        /* renamed from: g */
        private final C1119a f5164g = new C1119a(0, 0);

        /* renamed from: h */
        private boolean f5165h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        public static class C1119a {

            /* renamed from: a */
            private int f5166a;

            /* renamed from: b */
            private int f5167b;

            /* renamed from: c */
            private int f5168c;

            /* renamed from: d */
            private int f5169d;

            /* renamed from: e */
            private Interpolator f5170e;

            /* renamed from: f */
            private boolean f5171f;

            /* renamed from: g */
            private int f5172g;

            public C1119a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }

            /* renamed from: e */
            private void m6079e() {
                if (this.f5170e != null && this.f5168c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f5168c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo5573a() {
                return this.f5169d >= 0;
            }

            /* renamed from: b */
            public void mo5574b(int i) {
                this.f5169d = i;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo5575c(RecyclerView recyclerView) {
                int i = this.f5169d;
                if (i >= 0) {
                    this.f5169d = -1;
                    recyclerView.mo5234y0(i);
                    this.f5171f = false;
                } else if (this.f5171f) {
                    m6079e();
                    recyclerView.f5067q0.mo5253f(this.f5166a, this.f5167b, this.f5168c, this.f5170e);
                    int i2 = this.f5172g + 1;
                    this.f5172g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f5171f = false;
                } else {
                    this.f5172g = 0;
                }
            }

            /* renamed from: d */
            public void mo5576d(int i, int i2, int i3, Interpolator interpolator) {
                this.f5166a = i;
                this.f5167b = i2;
                this.f5168c = i3;
                this.f5170e = interpolator;
                this.f5171f = true;
            }

            public C1119a(int i, int i2, int i3, Interpolator interpolator) {
                this.f5169d = -1;
                this.f5171f = false;
                this.f5172g = 0;
                this.f5166a = i;
                this.f5167b = i2;
                this.f5168c = i3;
                this.f5170e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$b */
        public interface C1120b {
            /* renamed from: a */
            PointF mo5024a(int i);
        }

        /* renamed from: a */
        public PointF mo5555a(int i) {
            C1104p e = mo5559e();
            if (e instanceof C1120b) {
                return ((C1120b) e).mo5024a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C1120b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View mo5556b(int i) {
            return this.f5159b.f5060n.mo5011C(i);
        }

        /* renamed from: c */
        public int mo5557c() {
            return this.f5159b.f5060n.mo5419J();
        }

        /* renamed from: d */
        public int mo5558d(View view) {
            return this.f5159b.mo5129f0(view);
        }

        /* renamed from: e */
        public C1104p mo5559e() {
            return this.f5160c;
        }

        /* renamed from: f */
        public int mo5560f() {
            return this.f5158a;
        }

        /* renamed from: g */
        public boolean mo5561g() {
            return this.f5161d;
        }

        /* renamed from: h */
        public boolean mo5562h() {
            return this.f5162e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo5563i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5564j(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f5159b;
            if (this.f5158a == -1 || recyclerView == null) {
                mo5572r();
            }
            if (this.f5161d && this.f5163f == null && this.f5160c != null && (a = mo5555a(this.f5158a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.mo5161j1((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            this.f5161d = false;
            View view = this.f5163f;
            if (view != null) {
                if (mo5558d(view) == this.f5158a) {
                    mo5569o(this.f5163f, recyclerView.f5073t0, this.f5164g);
                    this.f5164g.mo5575c(recyclerView);
                    mo5572r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f5163f = null;
                }
            }
            if (this.f5162e) {
                mo5566l(i, i2, recyclerView.f5073t0, this.f5164g);
                boolean a2 = this.f5164g.mo5573a();
                this.f5164g.mo5575c(recyclerView);
                if (a2 && this.f5162e) {
                    this.f5161d = true;
                    recyclerView.f5067q0.mo5252e();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo5565k(View view) {
            if (mo5558d(view) == mo5560f()) {
                this.f5163f = view;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public abstract void mo5566l(int i, int i2, C1121z zVar, C1119a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract void mo5567m();

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract void mo5568n();

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public abstract void mo5569o(View view, C1121z zVar, C1119a aVar);

        /* renamed from: p */
        public void mo5570p(int i) {
            this.f5158a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo5571q(RecyclerView recyclerView, C1104p pVar) {
            recyclerView.f5067q0.mo5254g();
            if (this.f5165h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f5159b = recyclerView;
            this.f5160c = pVar;
            int i = this.f5158a;
            if (i != -1) {
                recyclerView.f5073t0.f5173a = i;
                this.f5162e = true;
                this.f5161d = true;
                this.f5163f = mo5556b(mo5560f());
                mo5567m();
                this.f5159b.f5067q0.mo5252e();
                this.f5165h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public final void mo5572r() {
            if (this.f5162e) {
                this.f5162e = false;
                mo5568n();
                this.f5159b.f5073t0.f5173a = -1;
                this.f5163f = null;
                this.f5158a = -1;
                this.f5161d = false;
                this.f5160c.mo5455f1(this);
                this.f5160c = null;
                this.f5159b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static class C1121z {

        /* renamed from: a */
        int f5173a = -1;

        /* renamed from: b */
        private SparseArray<Object> f5174b;

        /* renamed from: c */
        int f5175c = 0;

        /* renamed from: d */
        int f5176d = 0;

        /* renamed from: e */
        int f5177e = 1;

        /* renamed from: f */
        int f5178f = 0;

        /* renamed from: g */
        boolean f5179g = false;

        /* renamed from: h */
        boolean f5180h = false;

        /* renamed from: i */
        boolean f5181i = false;

        /* renamed from: j */
        boolean f5182j = false;

        /* renamed from: k */
        boolean f5183k = false;

        /* renamed from: l */
        boolean f5184l = false;

        /* renamed from: m */
        int f5185m;

        /* renamed from: n */
        long f5186n;

        /* renamed from: o */
        int f5187o;

        /* renamed from: p */
        int f5188p;

        /* renamed from: q */
        int f5189q;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5577a(int i) {
            if ((this.f5177e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f5177e));
            }
        }

        /* renamed from: b */
        public int mo5578b() {
            if (this.f5180h) {
                return this.f5175c - this.f5176d;
            }
            return this.f5178f;
        }

        /* renamed from: c */
        public int mo5579c() {
            return this.f5173a;
        }

        /* renamed from: d */
        public boolean mo5580d() {
            return this.f5173a != -1;
        }

        /* renamed from: e */
        public boolean mo5581e() {
            return this.f5180h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo5582f(C1092h hVar) {
            this.f5177e = 1;
            this.f5178f = hVar.getItemCount();
            this.f5180h = false;
            this.f5181i = false;
            this.f5182j = false;
        }

        /* renamed from: g */
        public boolean mo5583g() {
            return this.f5184l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f5173a + ", mData=" + this.f5174b + ", mItemCount=" + this.f5178f + ", mIsMeasuring=" + this.f5182j + ", mPreviousLayoutItemCount=" + this.f5175c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5176d + ", mStructureChanged=" + this.f5179g + ", mInPreLayout=" + this.f5180h + ", mRunSimpleAnimations=" + this.f5183k + ", mRunPredictiveAnimations=" + this.f5184l + '}';
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            f5001N0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x001c
            r2 = 19
            if (r1 == r2) goto L_0x001c
            r2 = 20
            if (r1 != r2) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = 0
            goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            f5002O0 = r2
            r2 = 23
            if (r1 < r2) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            f5003P0 = r2
            r2 = 16
            if (r1 < r2) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            f5004Q0 = r2
            r2 = 21
            if (r1 < r2) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            f5005R0 = r2
            r2 = 15
            if (r1 > r2) goto L_0x0040
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            f5006S0 = r4
            if (r1 > r2) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            f5007T0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f5008U0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            f5009V0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: B */
    private void m5625B() {
        int i = this.f5010A;
        this.f5010A = 0;
        if (i != 0 && mo5228v0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C5770b.m25530b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: B0 */
    private void m5626B0(int i, int i2, MotionEvent motionEvent, int i3) {
        C1104p pVar = this.f5060n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f5082y) {
            int[] iArr = this.f5023G0;
            int i4 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean k = pVar.mo5031k();
            boolean l = this.f5060n.mo5033l();
            mo5226u1(l ? k | true : k ? 1 : 0, i3);
            if (mo5074G(k ? i : 0, l ? i2 : 0, this.f5023G0, this.f5019E0, i3)) {
                int[] iArr2 = this.f5023G0;
                i -= iArr2[0];
                i2 -= iArr2[1];
            }
            int i5 = k ? i : 0;
            if (l) {
                i4 = i2;
            }
            mo5157i1(i5, i4, motionEvent, i3);
            C1149e eVar = this.f5069r0;
            if (!(eVar == null || (i == 0 && i2 == 0))) {
                eVar.mo5746f(this, i, i2);
            }
            mo5231w1(i3);
        }
    }

    /* renamed from: D */
    private void m5627D() {
        boolean z = true;
        this.f5073t0.mo5577a(1);
        mo5093R(this.f5073t0);
        this.f5073t0.f5182j = false;
        mo5223t1();
        this.f5051g.mo5830f();
        mo5081J0();
        m5633R0();
        m5649g1();
        C1121z zVar = this.f5073t0;
        if (!zVar.f5183k || !this.f5081x0) {
            z = false;
        }
        zVar.f5181i = z;
        this.f5081x0 = false;
        this.f5079w0 = false;
        zVar.f5180h = zVar.f5184l;
        zVar.f5178f = this.f5058m.getItemCount();
        m5636V(this.f5015C0);
        if (this.f5073t0.f5183k) {
            int g = this.f5050f.mo5688g();
            for (int i = 0; i < g; i++) {
                C1087c0 i0 = m5650i0(this.f5050f.mo5687f(i));
                if (!i0.shouldIgnore() && (!i0.isInvalid() || this.f5058m.hasStableIds())) {
                    this.f5051g.mo5829e(i0, this.f5036N.mo5387t(this.f5073t0, i0, C1098m.m5809e(i0), i0.getUnmodifiedPayloads()));
                    if (this.f5073t0.f5181i && i0.isUpdated() && !i0.isRemoved() && !i0.shouldIgnore() && !i0.isInvalid()) {
                        this.f5051g.mo5827c(mo5118d0(i0), i0);
                    }
                }
            }
        }
        if (this.f5073t0.f5184l) {
            mo5154h1();
            C1121z zVar2 = this.f5073t0;
            boolean z2 = zVar2.f5179g;
            zVar2.f5179g = false;
            this.f5060n.mo4988X0(this.f5047c, zVar2);
            this.f5073t0.f5179g = z2;
            for (int i2 = 0; i2 < this.f5050f.mo5688g(); i2++) {
                C1087c0 i02 = m5650i0(this.f5050f.mo5687f(i2));
                if (!i02.shouldIgnore() && !this.f5051g.mo5833i(i02)) {
                    int e = C1098m.m5809e(i02);
                    boolean hasAnyOfTheFlags = i02.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e |= 4096;
                    }
                    C1098m.C1101c t = this.f5036N.mo5387t(this.f5073t0, i02, e, i02.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        mo5097U0(i02, t);
                    } else {
                        this.f5051g.mo5825a(i02, t);
                    }
                }
            }
            mo5221t();
        } else {
            mo5221t();
        }
        mo5083K0();
        mo5229v1(false);
        this.f5073t0.f5177e = 2;
    }

    /* renamed from: E */
    private void m5628E() {
        mo5223t1();
        mo5081J0();
        this.f5073t0.mo5577a(6);
        this.f5049e.mo5664j();
        this.f5073t0.f5178f = this.f5058m.getItemCount();
        this.f5073t0.f5176d = 0;
        if (this.f5048d != null && this.f5058m.canRestoreState()) {
            Parcelable parcelable = this.f5048d.f5090d;
            if (parcelable != null) {
                this.f5060n.mo5027c1(parcelable);
            }
            this.f5048d = null;
        }
        C1121z zVar = this.f5073t0;
        zVar.f5180h = false;
        this.f5060n.mo4988X0(this.f5047c, zVar);
        C1121z zVar2 = this.f5073t0;
        zVar2.f5179g = false;
        zVar2.f5183k = zVar2.f5183k && this.f5036N != null;
        zVar2.f5177e = 4;
        mo5083K0();
        mo5229v1(false);
    }

    /* renamed from: F */
    private void m5629F() {
        this.f5073t0.mo5577a(4);
        mo5223t1();
        mo5081J0();
        C1121z zVar = this.f5073t0;
        zVar.f5177e = 1;
        if (zVar.f5183k) {
            for (int g = this.f5050f.mo5688g() - 1; g >= 0; g--) {
                C1087c0 i0 = m5650i0(this.f5050f.mo5687f(g));
                if (!i0.shouldIgnore()) {
                    long d0 = mo5118d0(i0);
                    C1098m.C1101c s = this.f5036N.mo5386s(this.f5073t0, i0);
                    C1087c0 g2 = this.f5051g.mo5831g(d0);
                    if (g2 == null || g2.shouldIgnore()) {
                        this.f5051g.mo5828d(i0, s);
                    } else {
                        boolean h = this.f5051g.mo5832h(g2);
                        boolean h2 = this.f5051g.mo5832h(i0);
                        if (!h || g2 != i0) {
                            C1098m.C1101c n = this.f5051g.mo5837n(g2);
                            this.f5051g.mo5828d(i0, s);
                            C1098m.C1101c m = this.f5051g.mo5836m(i0);
                            if (n == null) {
                                m5656n0(d0, i0, g2);
                            } else {
                                m5655n(g2, i0, n, m, h, h2);
                            }
                        } else {
                            this.f5051g.mo5828d(i0, s);
                        }
                    }
                }
            }
            this.f5051g.mo5838o(this.f5035M0);
        }
        this.f5060n.mo5468l1(this.f5047c);
        C1121z zVar2 = this.f5073t0;
        zVar2.f5175c = zVar2.f5178f;
        this.f5018E = false;
        this.f5020F = false;
        zVar2.f5183k = false;
        zVar2.f5184l = false;
        this.f5060n.f5126h = false;
        ArrayList<C1087c0> arrayList = this.f5047c.f5150b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C1104p pVar = this.f5060n;
        if (pVar.f5132n) {
            pVar.f5131m = 0;
            pVar.f5132n = false;
            this.f5047c.mo5527K();
        }
        this.f5060n.mo4989Y0(this.f5073t0);
        mo5083K0();
        mo5229v1(false);
        this.f5051g.mo5830f();
        int[] iArr = this.f5015C0;
        if (m5664y(iArr[0], iArr[1])) {
            mo5080J(0, 0);
        }
        m5637V0();
        m5645e1();
    }

    /* renamed from: L */
    private boolean m5630L(MotionEvent motionEvent) {
        C1111s sVar = this.f5068r;
        if (sVar != null) {
            sVar.mo5502a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f5068r = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return m5635U(motionEvent);
        }
    }

    /* renamed from: M0 */
    private void m5631M0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5038P) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5038P = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f5042T = x;
            this.f5040R = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f5043U = y;
            this.f5041S = y;
        }
    }

    /* renamed from: Q0 */
    private boolean m5632Q0() {
        return this.f5036N != null && this.f5060n.mo4977L1();
    }

    /* renamed from: R0 */
    private void m5633R0() {
        boolean z;
        if (this.f5018E) {
            this.f5049e.mo5677y();
            if (this.f5020F) {
                this.f5060n.mo4982S0(this);
            }
        }
        if (m5632Q0()) {
            this.f5049e.mo5675w();
        } else {
            this.f5049e.mo5664j();
        }
        boolean z2 = false;
        boolean z3 = this.f5079w0 || this.f5081x0;
        this.f5073t0.f5183k = this.f5076v && this.f5036N != null && ((z = this.f5018E) || z3 || this.f5060n.f5126h) && (!z || this.f5058m.hasStableIds());
        C1121z zVar = this.f5073t0;
        if (zVar.f5183k && z3 && !this.f5018E && m5632Q0()) {
            z2 = true;
        }
        zVar.f5184l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5634T0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.mo5086N()
            android.widget.EdgeEffect r3 = r6.f5028J
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.C0619f.m3438a(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.mo5088O()
            android.widget.EdgeEffect r3 = r6.f5032L
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C0619f.m3438a(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.mo5090P()
            android.widget.EdgeEffect r9 = r6.f5030K
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0619f.m3438a(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.mo5085M()
            android.widget.EdgeEffect r9 = r6.f5034M
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0619f.m3438a(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            p110m0.C5723u.m25310e0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m5634T0(float, float, float, float):void");
    }

    /* renamed from: U */
    private boolean m5635U(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f5066q.size();
        int i = 0;
        while (i < size) {
            C1111s sVar = this.f5066q.get(i);
            if (!sVar.mo5503b(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f5068r = sVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: V */
    private void m5636V(int[] iArr) {
        int g = this.f5050f.mo5688g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            C1087c0 i0 = m5650i0(this.f5050f.mo5687f(i3));
            if (!i0.shouldIgnore()) {
                int layoutPosition = i0.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: V0 */
    private void m5637V0() {
        View findViewById;
        if (this.f5065p0 && this.f5058m != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f5007T0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f5050f.mo5693n(focusedChild)) {
                            return;
                        }
                    } else if (this.f5050f.mo5688g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                C1087c0 Z = (this.f5073t0.f5186n == -1 || !this.f5058m.hasStableIds()) ? null : mo5101Z(this.f5073t0.f5186n);
                if (Z != null && !this.f5050f.mo5693n(Z.itemView) && Z.itemView.hasFocusable()) {
                    view = Z.itemView;
                } else if (this.f5050f.mo5688g() > 0) {
                    view = m5640X();
                }
                if (view != null) {
                    int i = this.f5073t0.f5187o;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: W */
    static RecyclerView m5638W(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView W = m5638W(viewGroup.getChildAt(i));
            if (W != null) {
                return W;
            }
        }
        return null;
    }

    /* renamed from: W0 */
    private void m5639W0() {
        boolean z;
        EdgeEffect edgeEffect = this.f5028J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f5028J.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f5030K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f5030K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5032L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f5032L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5034M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f5034M.isFinished();
        }
        if (z) {
            C5723u.m25310e0(this);
        }
    }

    /* renamed from: X */
    private View m5640X() {
        C1087c0 Y;
        C1121z zVar = this.f5073t0;
        int i = zVar.f5185m;
        if (i == -1) {
            i = 0;
        }
        int b = zVar.mo5578b();
        int i2 = i;
        while (i2 < b) {
            C1087c0 Y2 = mo5099Y(i2);
            if (Y2 == null) {
                break;
            } else if (Y2.itemView.hasFocusable()) {
                return Y2.itemView;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0 || (Y = mo5099Y(min)) == null) {
                return null;
            }
            if (Y.itemView.hasFocusable()) {
                return Y.itemView;
            }
        }
    }

    /* renamed from: d1 */
    private void m5643d1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f5054j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f5088c) {
                Rect rect = layoutParams2.f5087b;
                Rect rect2 = this.f5054j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f5054j);
            offsetRectIntoDescendantCoords(view, this.f5054j);
        }
        this.f5060n.mo5481s1(this, view, this.f5054j, !this.f5076v, view2 == null);
    }

    /* renamed from: e1 */
    private void m5645e1() {
        C1121z zVar = this.f5073t0;
        zVar.f5186n = -1;
        zVar.f5185m = -1;
        zVar.f5187o = -1;
    }

    /* renamed from: f1 */
    private void m5647f1() {
        VelocityTracker velocityTracker = this.f5039Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo5231w1(0);
        m5639W0();
    }

    /* renamed from: g */
    private void m5648g(C1087c0 c0Var) {
        View view = c0Var.itemView;
        boolean z = view.getParent() == this;
        this.f5047c.mo5526J(mo5153h0(view));
        if (c0Var.isTmpDetached()) {
            this.f5050f.mo5684c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f5050f.mo5683b(view, true);
        } else {
            this.f5050f.mo5691k(view);
        }
    }

    /* renamed from: g1 */
    private void m5649g1() {
        int i;
        C1087c0 c0Var = null;
        View focusedChild = (!this.f5065p0 || !hasFocus() || this.f5058m == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            c0Var = mo5096T(focusedChild);
        }
        if (c0Var == null) {
            m5645e1();
            return;
        }
        this.f5073t0.f5186n = this.f5058m.hasStableIds() ? c0Var.getItemId() : -1;
        C1121z zVar = this.f5073t0;
        if (this.f5018E) {
            i = -1;
        } else if (c0Var.isRemoved()) {
            i = c0Var.mOldPosition;
        } else {
            i = c0Var.getAbsoluteAdapterPosition();
        }
        zVar.f5185m = i;
        this.f5073t0.f5187o = m5652k0(c0Var.itemView);
    }

    private C5713k getScrollingChildHelper() {
        if (this.f5017D0 == null) {
            this.f5017D0 = new C5713k(this);
        }
        return this.f5017D0;
    }

    /* renamed from: i0 */
    static C1087c0 m5650i0(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f5086a;
    }

    /* renamed from: j0 */
    static void m5651j0(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f5087b;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    /* renamed from: k0 */
    private int m5652k0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* renamed from: l0 */
    private String m5653l0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: l1 */
    private void m5654l1(C1092h hVar, boolean z, boolean z2) {
        C1092h hVar2 = this.f5058m;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f5046b);
            this.f5058m.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            mo5098X0();
        }
        this.f5049e.mo5677y();
        C1092h hVar3 = this.f5058m;
        this.f5058m = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f5046b);
            hVar.onAttachedToRecyclerView(this);
        }
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            pVar.mo5409E0(hVar3, this.f5058m);
        }
        this.f5047c.mo5550x(hVar3, this.f5058m, z);
        this.f5073t0.f5179g = true;
    }

    /* renamed from: n */
    private void m5655n(C1087c0 c0Var, C1087c0 c0Var2, C1098m.C1101c cVar, C1098m.C1101c cVar2, boolean z, boolean z2) {
        c0Var.setIsRecyclable(false);
        if (z) {
            m5648g(c0Var);
        }
        if (c0Var != c0Var2) {
            if (z2) {
                m5648g(c0Var2);
            }
            c0Var.mShadowedHolder = c0Var2;
            m5648g(c0Var);
            this.f5047c.mo5526J(c0Var);
            c0Var2.setIsRecyclable(false);
            c0Var2.mShadowingHolder = c0Var;
        }
        if (this.f5036N.mo5370b(c0Var, c0Var2, cVar, cVar2)) {
            mo5091P0();
        }
    }

    /* renamed from: n0 */
    private void m5656n0(long j, C1087c0 c0Var, C1087c0 c0Var2) {
        int g = this.f5050f.mo5688g();
        for (int i = 0; i < g; i++) {
            C1087c0 i0 = m5650i0(this.f5050f.mo5687f(i));
            if (i0 != c0Var && mo5118d0(i0) == j) {
                C1092h hVar = this.f5058m;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + i0 + " \n View Holder 2:" + c0Var + mo5092Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + i0 + " \n View Holder 2:" + c0Var + mo5092Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c0Var2 + " cannot be found but it is necessary for " + c0Var + mo5092Q());
    }

    /* renamed from: p0 */
    private boolean m5657p0() {
        int g = this.f5050f.mo5688g();
        for (int i = 0; i < g; i++) {
            C1087c0 i0 = m5650i0(this.f5050f.mo5687f(i));
            if (i0 != null && !i0.shouldIgnore() && i0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    private void m5658r() {
        m5647f1();
        setScrollState(0);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: r0 */
    private void m5659r0() {
        if (C5723u.m25263A(this) == 0) {
            C5723u.m25352z0(this, 8);
        }
    }

    /* renamed from: s */
    static void m5660s(C1087c0 c0Var) {
        WeakReference<RecyclerView> weakReference = c0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != c0Var.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            c0Var.mNestedRecyclerView = null;
        }
    }

    /* renamed from: s0 */
    private void m5661s0() {
        this.f5050f = new C1130b(new C1089e());
    }

    /* renamed from: w */
    private void m5662w(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String l0 = m5653l0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(l0, false, classLoader).asSubclass(C1104p.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f5008U0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C1104p) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + l0, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + l0, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + l0, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + l0, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + l0, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + l0, e7);
                }
            }
        }
    }

    /* renamed from: x0 */
    private boolean m5663x0(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || mo5094S(view2) == null) {
            return false;
        }
        if (view == null || mo5094S(view) == null) {
            return true;
        }
        this.f5054j.set(0, 0, view.getWidth(), view.getHeight());
        this.f5055k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f5054j);
        offsetDescendantRectToMyCoords(view2, this.f5055k);
        char c = 65535;
        int i3 = this.f5060n.mo5440Z() == 1 ? -1 : 1;
        Rect rect = this.f5054j;
        int i4 = rect.left;
        Rect rect2 = this.f5055k;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i + mo5092Q());
                            } else if (c > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i2 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i2 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c > 0 || (c == 0 && i2 * i3 > 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c < 0 || (c == 0 && i2 * i3 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: y */
    private boolean m5664y(int i, int i2) {
        m5636V(this.f5015C0);
        int[] iArr = this.f5015C0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: y1 */
    private void m5665y1() {
        this.f5067q0.mo5254g();
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            pVar.mo5421K1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo5067A(View view) {
        C1087c0 i0 = m5650i0(view);
        mo5079I0(view);
        C1092h hVar = this.f5058m;
        if (!(hVar == null || i0 == null)) {
            hVar.onViewDetachedFromWindow(i0);
        }
        List<C1109q> list = this.f5016D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f5016D.get(size).mo5499a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo5068A0() {
        int j = this.f5050f.mo5690j();
        for (int i = 0; i < j; i++) {
            C1087c0 i0 = m5650i0(this.f5050f.mo5689i(i));
            if (i0 != null && !i0.shouldIgnore()) {
                i0.addFlags(6);
            }
        }
        mo5236z0();
        this.f5047c.mo5546t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo5069C() {
        if (this.f5058m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f5060n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.f5073t0.f5182j = false;
            boolean z = this.f5029J0 && !(this.f5031K0 == getWidth() && this.f5033L0 == getHeight());
            this.f5031K0 = 0;
            this.f5033L0 = 0;
            this.f5029J0 = false;
            if (this.f5073t0.f5177e == 1) {
                m5627D();
                this.f5060n.mo5492z1(this);
                m5628E();
            } else if (this.f5049e.mo5670q() || z || this.f5060n.mo5473o0() != getWidth() || this.f5060n.mo5437W() != getHeight()) {
                this.f5060n.mo5492z1(this);
                m5628E();
            } else {
                this.f5060n.mo5492z1(this);
            }
            m5629F();
        }
    }

    /* renamed from: C0 */
    public void mo5070C0(int i) {
        int g = this.f5050f.mo5688g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f5050f.mo5687f(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: D0 */
    public void mo5071D0(int i) {
        int g = this.f5050f.mo5688g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f5050f.mo5687f(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo5072E0(int i, int i2) {
        int j = this.f5050f.mo5690j();
        for (int i3 = 0; i3 < j; i3++) {
            C1087c0 i0 = m5650i0(this.f5050f.mo5689i(i3));
            if (i0 != null && !i0.shouldIgnore() && i0.mPosition >= i) {
                i0.offsetPosition(i2, false);
                this.f5073t0.f5179g = true;
            }
        }
        this.f5047c.mo5547u(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void mo5073F0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.f5050f.mo5690j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            C1087c0 i0 = m5650i0(this.f5050f.mo5689i(i7));
            if (i0 != null && (i6 = i0.mPosition) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    i0.offsetPosition(i2 - i, false);
                } else {
                    i0.offsetPosition(i5, false);
                }
                this.f5073t0.f5179g = true;
            }
        }
        this.f5047c.mo5548v(i, i2);
        requestLayout();
    }

    /* renamed from: G */
    public boolean mo5074G(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo22458d(i, i2, iArr, iArr2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public void mo5075G0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.f5050f.mo5690j();
        for (int i4 = 0; i4 < j; i4++) {
            C1087c0 i0 = m5650i0(this.f5050f.mo5689i(i4));
            if (i0 != null && !i0.shouldIgnore()) {
                int i5 = i0.mPosition;
                if (i5 >= i3) {
                    i0.offsetPosition(-i2, z);
                    this.f5073t0.f5179g = true;
                } else if (i5 >= i) {
                    i0.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f5073t0.f5179g = true;
                }
            }
        }
        this.f5047c.mo5549w(i, i2, z);
        requestLayout();
    }

    /* renamed from: H */
    public final void mo5076H(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo22459e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: H0 */
    public void mo5077H0(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo5078I(int i) {
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            pVar.mo5453e1(i);
        }
        mo5087N0(i);
        C1112t tVar = this.f5075u0;
        if (tVar != null) {
            tVar.mo5505a(this, i);
        }
        List<C1112t> list = this.f5077v0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f5077v0.get(size).mo5505a(this, i);
            }
        }
    }

    /* renamed from: I0 */
    public void mo5079I0(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo5080J(int i, int i2) {
        this.f5024H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo5089O0(i, i2);
        C1112t tVar = this.f5075u0;
        if (tVar != null) {
            tVar.mo5506b(this, i, i2);
        }
        List<C1112t> list = this.f5077v0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f5077v0.get(size).mo5506b(this, i, i2);
            }
        }
        this.f5024H--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo5081J0() {
        this.f5022G++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo5082K() {
        int i;
        for (int size = this.f5025H0.size() - 1; size >= 0; size--) {
            C1087c0 c0Var = this.f5025H0.get(size);
            if (c0Var.itemView.getParent() == this && !c0Var.shouldIgnore() && (i = c0Var.mPendingAccessibilityState) != -1) {
                C5723u.m25350y0(c0Var.itemView, i);
                c0Var.mPendingAccessibilityState = -1;
            }
        }
        this.f5025H0.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo5083K0() {
        mo5084L0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo5084L0(boolean z) {
        int i = this.f5022G - 1;
        this.f5022G = i;
        if (i < 1) {
            this.f5022G = 0;
            if (z) {
                m5625B();
                mo5082K();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo5085M() {
        if (this.f5034M == null) {
            EdgeEffect a = this.f5026I.mo5368a(this, 3);
            this.f5034M = a;
            if (this.f5052h) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo5086N() {
        if (this.f5028J == null) {
            EdgeEffect a = this.f5026I.mo5368a(this, 0);
            this.f5028J = a;
            if (this.f5052h) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: N0 */
    public void mo5087N0(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo5088O() {
        if (this.f5032L == null) {
            EdgeEffect a = this.f5026I.mo5368a(this, 2);
            this.f5032L = a;
            if (this.f5052h) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: O0 */
    public void mo5089O0(int i, int i2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo5090P() {
        if (this.f5030K == null) {
            EdgeEffect a = this.f5026I.mo5368a(this, 1);
            this.f5030K = a;
            if (this.f5052h) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo5091P0() {
        if (!this.f5085z0 && this.f5070s) {
            C5723u.m25314g0(this, this.f5027I0);
            this.f5085z0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public String mo5092Q() {
        return " " + super.toString() + ", adapter:" + this.f5058m + ", layout:" + this.f5060n + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final void mo5093R(C1121z zVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f5067q0.f5095d;
            zVar.f5188p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.f5189q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        zVar.f5188p = 0;
        zVar.f5189q = 0;
    }

    /* renamed from: S */
    public View mo5094S(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void mo5095S0(boolean z) {
        this.f5020F = z | this.f5020F;
        this.f5018E = true;
        mo5068A0();
    }

    /* renamed from: T */
    public C1087c0 mo5096T(View view) {
        View S = mo5094S(view);
        if (S == null) {
            return null;
        }
        return mo5153h0(S);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo5097U0(C1087c0 c0Var, C1098m.C1101c cVar) {
        c0Var.setFlags(0, 8192);
        if (this.f5073t0.f5181i && c0Var.isUpdated() && !c0Var.isRemoved() && !c0Var.shouldIgnore()) {
            this.f5051g.mo5827c(mo5118d0(c0Var), c0Var);
        }
        this.f5051g.mo5829e(c0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public void mo5098X0() {
        C1098m mVar = this.f5036N;
        if (mVar != null) {
            mVar.mo5378k();
        }
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            pVar.mo5466k1(this.f5047c);
            this.f5060n.mo5468l1(this.f5047c);
        }
        this.f5047c.mo5531c();
    }

    /* renamed from: Y */
    public C1087c0 mo5099Y(int i) {
        C1087c0 c0Var = null;
        if (this.f5018E) {
            return null;
        }
        int j = this.f5050f.mo5690j();
        for (int i2 = 0; i2 < j; i2++) {
            C1087c0 i0 = m5650i0(this.f5050f.mo5689i(i2));
            if (i0 != null && !i0.isRemoved() && mo5109c0(i0) == i) {
                if (!this.f5050f.mo5693n(i0.itemView)) {
                    return i0;
                }
                c0Var = i0;
            }
        }
        return c0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public boolean mo5100Y0(View view) {
        mo5223t1();
        boolean r = this.f5050f.mo5697r(view);
        if (r) {
            C1087c0 i0 = m5650i0(view);
            this.f5047c.mo5526J(i0);
            this.f5047c.mo5520C(i0);
        }
        mo5229v1(!r);
        return r;
    }

    /* renamed from: Z */
    public C1087c0 mo5101Z(long j) {
        C1092h hVar = this.f5058m;
        C1087c0 c0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j2 = this.f5050f.mo5690j();
            for (int i = 0; i < j2; i++) {
                C1087c0 i0 = m5650i0(this.f5050f.mo5689i(i));
                if (i0 != null && !i0.isRemoved() && i0.getItemId() == j) {
                    if (!this.f5050f.mo5693n(i0.itemView)) {
                        return i0;
                    }
                    c0Var = i0;
                }
            }
        }
        return c0Var;
    }

    /* renamed from: Z0 */
    public void mo5102Z0(C1103o oVar) {
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            pVar.mo5030g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f5064p.remove(oVar);
        if (this.f5064p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo5236z0();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5103a(int i, int i2) {
        if (i < 0) {
            mo5086N();
            if (this.f5028J.isFinished()) {
                this.f5028J.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo5088O();
            if (this.f5032L.isFinished()) {
                this.f5032L.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo5090P();
            if (this.f5030K.isFinished()) {
                this.f5030K.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo5085M();
            if (this.f5034M.isFinished()) {
                this.f5034M.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C5723u.m25310e0(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public C1087c0 mo5104a0(int i, boolean z) {
        int j = this.f5050f.mo5690j();
        C1087c0 c0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C1087c0 i0 = m5650i0(this.f5050f.mo5689i(i2));
            if (i0 != null && !i0.isRemoved()) {
                if (z) {
                    if (i0.mPosition != i) {
                        continue;
                    }
                } else if (i0.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.f5050f.mo5693n(i0.itemView)) {
                    return i0;
                }
                c0Var = i0;
            }
        }
        return c0Var;
    }

    /* renamed from: a1 */
    public void mo5105a1(C1111s sVar) {
        this.f5066q.remove(sVar);
        if (this.f5068r == sVar) {
            this.f5068r = null;
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1104p pVar = this.f5060n;
        if (pVar == null || !pVar.mo5411F0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b0 */
    public boolean mo5107b0(int i, int i2) {
        C1104p pVar = this.f5060n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f5082y) {
            return false;
        } else {
            boolean k = pVar.mo5031k();
            boolean l = this.f5060n.mo5033l();
            if (!k || Math.abs(i) < this.f5057l0) {
                i = 0;
            }
            if (!l || Math.abs(i2) < this.f5057l0) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = k || l;
                dispatchNestedFling(f, f2, z);
                C1110r rVar = this.f5045W;
                if (rVar != null && rVar.mo5501a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (l) {
                        k |= true;
                    }
                    mo5226u1(k ? 1 : 0, 1);
                    int i3 = this.f5059m0;
                    int max = Math.max(-i3, Math.min(i, i3));
                    int i4 = this.f5059m0;
                    this.f5067q0.mo5251c(max, Math.max(-i4, Math.min(i2, i4)));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b1 */
    public void mo5108b1(C1112t tVar) {
        List<C1112t> list = this.f5077v0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public int mo5109c0(C1087c0 c0Var) {
        if (c0Var.hasAnyOfTheFlags(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT) || !c0Var.isBound()) {
            return -1;
        }
        return this.f5049e.mo5662e(c0Var.mPosition);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo5110c1() {
        C1087c0 c0Var;
        int g = this.f5050f.mo5688g();
        for (int i = 0; i < g; i++) {
            View f = this.f5050f.mo5687f(i);
            C1087c0 h0 = mo5153h0(f);
            if (!(h0 == null || (c0Var = h0.mShadowingHolder) == null)) {
                View view = c0Var.itemView;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.f5060n.mo4993m((LayoutParams) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C1104p pVar = this.f5060n;
        if (pVar != null && pVar.mo5031k()) {
            return this.f5060n.mo5039q(this.f5073t0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C1104p pVar = this.f5060n;
        if (pVar != null && pVar.mo5031k()) {
            return this.f5060n.mo4996r(this.f5073t0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C1104p pVar = this.f5060n;
        if (pVar != null && pVar.mo5031k()) {
            return this.f5060n.mo4997s(this.f5073t0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C1104p pVar = this.f5060n;
        if (pVar != null && pVar.mo5033l()) {
            return this.f5060n.mo5041t(this.f5073t0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C1104p pVar = this.f5060n;
        if (pVar != null && pVar.mo5033l()) {
            return this.f5060n.mo4998u(this.f5073t0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C1104p pVar = this.f5060n;
        if (pVar != null && pVar.mo5033l()) {
            return this.f5060n.mo4999v(this.f5073t0);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public long mo5118d0(C1087c0 c0Var) {
        return this.f5058m.hasStableIds() ? c0Var.getItemId() : (long) c0Var.mPosition;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo22455a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo22456b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo22457c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo22460f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f5064p.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f5064p.get(i).mo5399i(canvas, this, this.f5073t0);
        }
        EdgeEffect edgeEffect = this.f5028J;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f5052h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f5028J;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f5030K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f5052h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5030K;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f5032L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5052h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f5032L;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f5034M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5052h) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f5034M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f5036N == null || this.f5064p.size() <= 0 || !this.f5036N.mo5383p()) {
            z3 = z;
        }
        if (z3) {
            C5723u.m25310e0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public int mo5128e0(View view) {
        C1087c0 i0 = m5650i0(view);
        if (i0 != null) {
            return i0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    /* renamed from: f0 */
    public int mo5129f0(View view) {
        C1087c0 i0 = m5650i0(view);
        if (i0 != null) {
            return i0.getLayoutPosition();
        }
        return -1;
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View Q0 = this.f5060n.mo5430Q0(view, i);
        if (Q0 != null) {
            return Q0;
        }
        boolean z2 = true;
        boolean z3 = this.f5058m != null && this.f5060n != null && !mo5230w0() && !this.f5082y;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                mo5227v();
                if (mo5094S(view) == null) {
                    return null;
                }
                mo5223t1();
                view2 = this.f5060n.mo4976J0(view, i, this.f5047c, this.f5073t0);
                mo5229v1(false);
            }
        } else {
            if (this.f5060n.mo5033l()) {
                int i2 = i == 2 ? TsExtractor.TS_STREAM_TYPE_HDMV_DTS : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f5006S0) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f5060n.mo5031k()) {
                int i3 = (this.f5060n.mo5440Z() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (f5006S0) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                mo5227v();
                if (mo5094S(view) == null) {
                    return null;
                }
                mo5223t1();
                this.f5060n.mo4976J0(view, i, this.f5047c, this.f5073t0);
                mo5229v1(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return m5663x0(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m5643d1(view2, (View) null);
        return view;
    }

    @Deprecated
    /* renamed from: g0 */
    public int mo5131g0(View view) {
        return mo5128e0(view);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            return pVar.mo4973D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo5092Q());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            return pVar.mo4974E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo5092Q());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C1092h getAdapter() {
        return this.f5058m;
    }

    public int getBaseline() {
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            return pVar.mo5413G();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C1096k kVar = this.f5013B0;
        if (kVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return kVar.mo5367a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f5052h;
    }

    public C1162k getCompatAccessibilityDelegate() {
        return this.f5011A0;
    }

    public C1097l getEdgeEffectFactory() {
        return this.f5026I;
    }

    public C1098m getItemAnimator() {
        return this.f5036N;
    }

    public int getItemDecorationCount() {
        return this.f5064p.size();
    }

    public C1104p getLayoutManager() {
        return this.f5060n;
    }

    public int getMaxFlingVelocity() {
        return this.f5059m0;
    }

    public int getMinFlingVelocity() {
        return this.f5057l0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f5005R0) {
            return System.nanoTime();
        }
        return 0;
    }

    public C1110r getOnFlingListener() {
        return this.f5045W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5065p0;
    }

    public C1113u getRecycledViewPool() {
        return this.f5047c.mo5537i();
    }

    public int getScrollState() {
        return this.f5037O;
    }

    /* renamed from: h */
    public void mo5152h(C1103o oVar) {
        mo5156i(oVar, -1);
    }

    /* renamed from: h0 */
    public C1087c0 mo5153h0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m5650i0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo5154h1() {
        int j = this.f5050f.mo5690j();
        for (int i = 0; i < j; i++) {
            C1087c0 i0 = m5650i0(this.f5050f.mo5689i(i));
            if (!i0.shouldIgnore()) {
                i0.saveOldPosition();
            }
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo22461j();
    }

    /* renamed from: i */
    public void mo5156i(C1103o oVar, int i) {
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            pVar.mo5030g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f5064p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f5064p.add(oVar);
        } else {
            this.f5064p.add(i, oVar);
        }
        mo5236z0();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public boolean mo5157i1(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo5227v();
        if (this.f5058m != null) {
            int[] iArr = this.f5023G0;
            iArr[0] = 0;
            iArr[1] = 0;
            mo5161j1(i8, i9, iArr);
            int[] iArr2 = this.f5023G0;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i7 = i11;
            i6 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.f5064p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f5023G0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo5076H(i6, i7, i5, i4, this.f5019E0, i3, iArr3);
        int[] iArr4 = this.f5023G0;
        int i12 = i5 - iArr4[0];
        int i13 = i4 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i14 = this.f5042T;
        int[] iArr5 = this.f5019E0;
        this.f5042T = i14 - iArr5[0];
        this.f5043U -= iArr5[1];
        int[] iArr6 = this.f5021F0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C5711i.m25228a(motionEvent2, 8194)) {
                m5634T0(motionEvent.getX(), (float) i12, motionEvent.getY(), (float) i13);
            }
            mo5224u(i, i2);
        }
        if (!(i6 == 0 && i7 == 0)) {
            mo5080J(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z && i6 == 0 && i7 == 0) {
            return false;
        }
        return true;
    }

    public boolean isAttachedToWindow() {
        return this.f5070s;
    }

    public final boolean isLayoutSuppressed() {
        return this.f5082y;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo22463l();
    }

    /* renamed from: j */
    public void mo5160j(C1109q qVar) {
        if (this.f5016D == null) {
            this.f5016D = new ArrayList();
        }
        this.f5016D.add(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo5161j1(int i, int i2, int[] iArr) {
        mo5223t1();
        mo5081J0();
        C5433k.m24388a("RV Scroll");
        mo5093R(this.f5073t0);
        int w1 = i != 0 ? this.f5060n.mo5000w1(i, this.f5047c, this.f5073t0) : 0;
        int y1 = i2 != 0 ? this.f5060n.mo5001y1(i2, this.f5047c, this.f5073t0) : 0;
        C5433k.m24389b();
        mo5110c1();
        mo5083K0();
        mo5229v1(false);
        if (iArr != null) {
            iArr[0] = w1;
            iArr[1] = y1;
        }
    }

    /* renamed from: k */
    public void mo5162k(C1111s sVar) {
        this.f5066q.add(sVar);
    }

    /* renamed from: k1 */
    public void mo5163k1(int i) {
        if (!this.f5082y) {
            mo5233x1();
            C1104p pVar = this.f5060n;
            if (pVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            pVar.mo5043x1(i);
            awakenScrollBars();
        }
    }

    /* renamed from: l */
    public void mo5164l(C1112t tVar) {
        if (this.f5077v0 == null) {
            this.f5077v0 = new ArrayList();
        }
        this.f5077v0.add(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5165m(C1087c0 c0Var, C1098m.C1101c cVar, C1098m.C1101c cVar2) {
        c0Var.setIsRecyclable(false);
        if (this.f5036N.mo5369a(c0Var, cVar, cVar2)) {
            mo5091P0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public Rect mo5166m0(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f5088c) {
            return layoutParams.f5087b;
        }
        boolean z = layoutParams.f5086a.getLayoutPosition() != layoutParams.f5086a.getAbsoluteAdapterPosition();
        if (this.f5073t0.mo5581e() && (layoutParams.mo5239b() || layoutParams.mo5241d() || z)) {
            return layoutParams.f5087b;
        }
        Rect rect = layoutParams.f5087b;
        rect.set(0, 0, 0, 0);
        int size = this.f5064p.size();
        for (int i = 0; i < size; i++) {
            this.f5054j.set(0, 0, 0, 0);
            this.f5064p.get(i).mo5395e(this.f5054j, view, this, this.f5073t0);
            int i2 = rect.left;
            Rect rect2 = this.f5054j;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f5088c = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public boolean mo5167m1(C1087c0 c0Var, int i) {
        if (mo5230w0()) {
            c0Var.mPendingAccessibilityState = i;
            this.f5025H0.add(c0Var);
            return false;
        }
        C5723u.m25350y0(c0Var.itemView, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public boolean mo5168n1(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!mo5230w0()) {
            return false;
        }
        int a = accessibilityEvent != null ? C5770b.m25529a(accessibilityEvent) : 0;
        if (a != 0) {
            i = a;
        }
        this.f5010A |= i;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5169o(C1087c0 c0Var, C1098m.C1101c cVar, C1098m.C1101c cVar2) {
        m5648g(c0Var);
        c0Var.setIsRecyclable(false);
        if (this.f5036N.mo5371c(c0Var, cVar, cVar2)) {
            mo5091P0();
        }
    }

    /* renamed from: o0 */
    public boolean mo5170o0() {
        return !this.f5076v || this.f5018E || this.f5049e.mo5669p();
    }

    /* renamed from: o1 */
    public void mo5171o1(int i, int i2) {
        mo5185p1(i, i2, (Interpolator) null);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5022G = 0;
        boolean z = true;
        this.f5070s = true;
        if (!this.f5076v || isLayoutRequested()) {
            z = false;
        }
        this.f5076v = z;
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            pVar.mo5490z(this);
        }
        this.f5085z0 = false;
        if (f5005R0) {
            ThreadLocal<C1149e> threadLocal = C1149e.f5350f;
            C1149e eVar = threadLocal.get();
            this.f5069r0 = eVar;
            if (eVar == null) {
                this.f5069r0 = new C1149e();
                Display v = C5723u.m25343v(this);
                float f = 60.0f;
                if (!isInEditMode() && v != null) {
                    float refreshRate = v.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C1149e eVar2 = this.f5069r0;
                eVar2.f5354d = (long) (1.0E9f / f);
                threadLocal.set(eVar2);
            }
            this.f5069r0.mo5745a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1149e eVar;
        super.onDetachedFromWindow();
        C1098m mVar = this.f5036N;
        if (mVar != null) {
            mVar.mo5378k();
        }
        mo5233x1();
        this.f5070s = false;
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            pVar.mo5400A(this, this.f5047c);
        }
        this.f5025H0.clear();
        removeCallbacks(this.f5027I0);
        this.f5051g.mo5834j();
        if (f5005R0 && (eVar = this.f5069r0) != null) {
            eVar.mo5748j(this);
            this.f5069r0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f5064p.size();
        for (int i = 0; i < size; i++) {
            this.f5064p.get(i).mo5397g(canvas, this, this.f5073t0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f5060n != null && !this.f5082y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f5060n.mo5033l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f5060n.mo5031k()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        m5626B0((int) (f * this.f5061n0), (int) (f2 * this.f5063o0), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f5060n.mo5033l()) {
                        f2 = -axisValue;
                    } else if (this.f5060n.mo5031k()) {
                        f = axisValue;
                        f2 = 0.0f;
                        m5626B0((int) (f * this.f5061n0), (int) (f2 * this.f5063o0), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            m5626B0((int) (f * this.f5061n0), (int) (f2 * this.f5063o0), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f5082y) {
            return false;
        }
        this.f5068r = null;
        if (m5635U(motionEvent)) {
            m5658r();
            return true;
        }
        C1104p pVar = this.f5060n;
        if (pVar == null) {
            return false;
        }
        boolean k = pVar.mo5031k();
        boolean l = this.f5060n.mo5033l();
        if (this.f5039Q == null) {
            this.f5039Q = VelocityTracker.obtain();
        }
        this.f5039Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f5084z) {
                this.f5084z = false;
            }
            this.f5038P = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f5042T = x;
            this.f5040R = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f5043U = y;
            this.f5041S = y;
            if (this.f5037O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo5231w1(1);
            }
            int[] iArr = this.f5021F0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (l) {
                k |= true;
            }
            mo5226u1(k ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f5039Q.clear();
            mo5231w1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5038P);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5038P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f5037O != 1) {
                int i = x2 - this.f5040R;
                int i2 = y2 - this.f5041S;
                if (!k || Math.abs(i) <= this.f5044V) {
                    z = false;
                } else {
                    this.f5042T = x2;
                    z = true;
                }
                if (l && Math.abs(i2) > this.f5044V) {
                    this.f5043U = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m5658r();
        } else if (actionMasked == 5) {
            this.f5038P = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f5042T = x3;
            this.f5040R = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f5043U = y3;
            this.f5041S = y3;
        } else if (actionMasked == 6) {
            m5631M0(motionEvent);
        }
        if (this.f5037O == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C5433k.m24388a("RV OnLayout");
        mo5069C();
        C5433k.m24389b();
        this.f5076v = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1104p pVar = this.f5060n;
        if (pVar == null) {
            mo5232x(i, i2);
            return;
        }
        boolean z = false;
        if (pVar.mo5040s0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f5060n.mo5441Z0(this.f5047c, this.f5073t0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f5029J0 = z;
            if (!z && this.f5058m != null) {
                if (this.f5073t0.f5177e == 1) {
                    m5627D();
                }
                this.f5060n.mo5402A1(i, i2);
                this.f5073t0.f5182j = true;
                m5628E();
                this.f5060n.mo5408D1(i, i2);
                if (this.f5060n.mo5012G1()) {
                    this.f5060n.mo5402A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f5073t0.f5182j = true;
                    m5628E();
                    this.f5060n.mo5408D1(i, i2);
                }
                this.f5031K0 = getMeasuredWidth();
                this.f5033L0 = getMeasuredHeight();
            }
        } else if (this.f5072t) {
            this.f5060n.mo5441Z0(this.f5047c, this.f5073t0, i, i2);
        } else {
            if (this.f5012B) {
                mo5223t1();
                mo5081J0();
                m5633R0();
                mo5083K0();
                C1121z zVar = this.f5073t0;
                if (zVar.f5184l) {
                    zVar.f5180h = true;
                } else {
                    this.f5049e.mo5664j();
                    this.f5073t0.f5180h = false;
                }
                this.f5012B = false;
                mo5229v1(false);
            } else if (this.f5073t0.f5184l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C1092h hVar = this.f5058m;
            if (hVar != null) {
                this.f5073t0.f5178f = hVar.getItemCount();
            } else {
                this.f5073t0.f5178f = 0;
            }
            mo5223t1();
            this.f5060n.mo5441Z0(this.f5047c, this.f5073t0, i, i2);
            mo5229v1(false);
            this.f5073t0.f5180h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo5230w0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f5048d = savedState;
        super.onRestoreInstanceState(savedState.mo3233a());
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f5048d;
        if (savedState2 != null) {
            savedState.mo5242b(savedState2);
        } else {
            C1104p pVar = this.f5060n;
            if (pVar != null) {
                savedState.f5090d = pVar.mo5029d1();
            } else {
                savedState.f5090d = null;
            }
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo5225u0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f5082y
            r8 = 0
            if (r0 != 0) goto L_0x01df
            boolean r0 = r6.f5084z
            if (r0 == 0) goto L_0x000f
            goto L_0x01df
        L_0x000f:
            boolean r0 = r17.m5630L(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.m5658r()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f5060n
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo5031k()
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f5060n
            boolean r11 = r0.mo5033l()
            android.view.VelocityTracker r0 = r6.f5039Q
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f5039Q = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f5021F0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f5021F0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b3
            if (r0 == r9) goto L_0x0171
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d4
        L_0x0066:
            r17.m5631M0(r18)
            goto L_0x01d4
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f5038P = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5042T = r0
            r6.f5040R = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5043U = r0
            r6.f5041S = r0
            goto L_0x01d4
        L_0x0087:
            r17.m5658r()
            goto L_0x01d4
        L_0x008c:
            int r0 = r6.f5038P
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f5038P
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f5042T
            int r0 = r0 - r13
            int r1 = r6.f5043U
            int r1 = r1 - r14
            int r2 = r6.f5037O
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.f5044V
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.f5044V
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = 1
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.f5044V
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.f5044V
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = 1
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            r15 = r0
            r16 = r1
            int r0 = r6.f5037O
            if (r0 != r9) goto L_0x01d4
            int[] r3 = r6.f5023G0
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x010c
            r1 = r15
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            r2 = r16
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            int[] r4 = r6.f5019E0
            r5 = 0
            r0 = r17
            boolean r0 = r0.mo5074G(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0140
            int[] r0 = r6.f5023G0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f5021F0
            r1 = r0[r8]
            int[] r2 = r6.f5019E0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0140:
            r0 = r16
            int[] r1 = r6.f5019E0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f5042T = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f5043U = r14
            if (r10 == 0) goto L_0x0152
            r1 = r15
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            if (r11 == 0) goto L_0x0157
            r2 = r0
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            boolean r1 = r6.mo5157i1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0165
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0165:
            androidx.recyclerview.widget.e r1 = r6.f5069r0
            if (r1 == 0) goto L_0x01d4
            if (r15 != 0) goto L_0x016d
            if (r0 == 0) goto L_0x01d4
        L_0x016d:
            r1.mo5746f(r6, r15, r0)
            goto L_0x01d4
        L_0x0171:
            android.view.VelocityTracker r0 = r6.f5039Q
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f5039Q
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.f5059m0
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x018d
            android.view.VelocityTracker r1 = r6.f5039Q
            int r2 = r6.f5038P
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018e
        L_0x018d:
            r1 = 0
        L_0x018e:
            if (r11 == 0) goto L_0x019a
            android.view.VelocityTracker r2 = r6.f5039Q
            int r3 = r6.f5038P
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
        L_0x01a3:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.mo5107b0(r0, r1)
            if (r0 != 0) goto L_0x01ae
        L_0x01ab:
            r6.setScrollState(r8)
        L_0x01ae:
            r17.m5647f1()
            r8 = 1
            goto L_0x01d4
        L_0x01b3:
            int r0 = r7.getPointerId(r8)
            r6.f5038P = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5042T = r0
            r6.f5040R = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5043U = r0
            r6.f5041S = r0
            if (r11 == 0) goto L_0x01d1
            r10 = r10 | 2
        L_0x01d1:
            r6.mo5226u1(r10, r8)
        L_0x01d4:
            if (r8 != 0) goto L_0x01db
            android.view.VelocityTracker r0 = r6.f5039Q
            r0.addMovement(r12)
        L_0x01db:
            r12.recycle()
            return r9
        L_0x01df:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5184p(String str) {
        if (mo5230w0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo5092Q());
            }
            throw new IllegalStateException(str);
        } else if (this.f5024H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + mo5092Q()));
        }
    }

    /* renamed from: p1 */
    public void mo5185p1(int i, int i2, Interpolator interpolator) {
        mo5188q1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo5186q(C1087c0 c0Var) {
        C1098m mVar = this.f5036N;
        return mVar == null || mVar.mo5374g(c0Var, c0Var.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo5187q0() {
        this.f5049e = new C1127a(new C1090f());
    }

    /* renamed from: q1 */
    public void mo5188q1(int i, int i2, Interpolator interpolator, int i3) {
        mo5189r1(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo5189r1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C1104p pVar = this.f5060n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f5082y) {
            int i4 = 0;
            if (!pVar.mo5031k()) {
                i = 0;
            }
            if (!this.f5060n.mo5033l()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo5226u1(i4, 1);
                    }
                    this.f5067q0.mo5253f(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C1087c0 i0 = m5650i0(view);
        if (i0 != null) {
            if (i0.isTmpDetached()) {
                i0.clearTmpDetachFlag();
            } else if (!i0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + i0 + mo5092Q());
            }
        }
        view.clearAnimation();
        mo5067A(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f5060n.mo5446b1(this, this.f5073t0, view, view2) && view2 != null) {
            m5643d1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f5060n.mo5480r1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f5066q.size();
        for (int i = 0; i < size; i++) {
            this.f5066q.get(i).mo5504c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f5078w != 0 || this.f5082y) {
            this.f5080x = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s1 */
    public void mo5195s1(int i) {
        if (!this.f5082y) {
            C1104p pVar = this.f5060n;
            if (pVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                pVar.mo5014I1(this, this.f5073t0, i);
            }
        }
    }

    public void scrollBy(int i, int i2) {
        C1104p pVar = this.f5060n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f5082y) {
            boolean k = pVar.mo5031k();
            boolean l = this.f5060n.mo5033l();
            if (k || l) {
                if (!k) {
                    i = 0;
                }
                if (!l) {
                    i2 = 0;
                }
                mo5157i1(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo5168n1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1162k kVar) {
        this.f5011A0 = kVar;
        C5723u.m25330o0(this, kVar);
    }

    public void setAdapter(C1092h hVar) {
        setLayoutFrozen(false);
        m5654l1(hVar, false, true);
        mo5095S0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C1096k kVar) {
        if (kVar != this.f5013B0) {
            this.f5013B0 = kVar;
            setChildrenDrawingOrderEnabled(kVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f5052h) {
            mo5225u0();
        }
        this.f5052h = z;
        super.setClipToPadding(z);
        if (this.f5076v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1097l lVar) {
        C5648h.m24964c(lVar);
        this.f5026I = lVar;
        mo5225u0();
    }

    public void setHasFixedSize(boolean z) {
        this.f5072t = z;
    }

    public void setItemAnimator(C1098m mVar) {
        C1098m mVar2 = this.f5036N;
        if (mVar2 != null) {
            mVar2.mo5378k();
            this.f5036N.mo5389v((C1098m.C1100b) null);
        }
        this.f5036N = mVar;
        if (mVar != null) {
            mVar.mo5389v(this.f5083y0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f5047c.mo5524G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C1104p pVar) {
        if (pVar != this.f5060n) {
            mo5233x1();
            if (this.f5060n != null) {
                C1098m mVar = this.f5036N;
                if (mVar != null) {
                    mVar.mo5378k();
                }
                this.f5060n.mo5466k1(this.f5047c);
                this.f5060n.mo5468l1(this.f5047c);
                this.f5047c.mo5531c();
                if (this.f5070s) {
                    this.f5060n.mo5400A(this, this.f5047c);
                }
                this.f5060n.mo5410E1((RecyclerView) null);
                this.f5060n = null;
            } else {
                this.f5047c.mo5531c();
            }
            this.f5050f.mo5694o();
            this.f5060n = pVar;
            if (pVar != null) {
                if (pVar.f5120b == null) {
                    pVar.mo5410E1(this);
                    if (this.f5070s) {
                        this.f5060n.mo5490z(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f5120b.mo5092Q());
                }
            }
            this.f5047c.mo5527K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo22464m(z);
    }

    public void setOnFlingListener(C1110r rVar) {
        this.f5045W = rVar;
    }

    @Deprecated
    public void setOnScrollListener(C1112t tVar) {
        this.f5075u0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f5065p0 = z;
    }

    public void setRecycledViewPool(C1113u uVar) {
        this.f5047c.mo5522E(uVar);
    }

    public void setRecyclerListener(C1116w wVar) {
        this.f5062o = wVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f5037O) {
            this.f5037O = i;
            if (i != 2) {
                m5665y1();
            }
            mo5078I(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.f5044V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f5044V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C1083a0 a0Var) {
        this.f5047c.mo5523F(a0Var);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo22465o(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo22467q();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f5082y) {
            mo5184p("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f5082y = false;
                if (!(!this.f5080x || this.f5060n == null || this.f5058m == null)) {
                    requestLayout();
                }
                this.f5080x = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f5082y = true;
            this.f5084z = true;
            mo5233x1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo5221t() {
        int j = this.f5050f.mo5690j();
        for (int i = 0; i < j; i++) {
            C1087c0 i0 = m5650i0(this.f5050f.mo5689i(i));
            if (!i0.shouldIgnore()) {
                i0.clearOldPosition();
            }
        }
        this.f5047c.mo5532d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void mo5222t0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo5092Q());
        }
        Resources resources = getContext().getResources();
        new C1144d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C5252b.f23242a), resources.getDimensionPixelSize(C5252b.f23244c), resources.getDimensionPixelOffset(C5252b.f23243b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void mo5223t1() {
        int i = this.f5078w + 1;
        this.f5078w = i;
        if (i == 1 && !this.f5082y) {
            this.f5080x = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo5224u(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f5028J;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f5028J.onRelease();
            z = this.f5028J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5032L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f5032L.onRelease();
            z |= this.f5032L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5030K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f5030K.onRelease();
            z |= this.f5030K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5034M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f5034M.onRelease();
            z |= this.f5034M.isFinished();
        }
        if (z) {
            C5723u.m25310e0(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo5225u0() {
        this.f5034M = null;
        this.f5030K = null;
        this.f5032L = null;
        this.f5028J = null;
    }

    /* renamed from: u1 */
    public boolean mo5226u1(int i, int i2) {
        return getScrollingChildHelper().mo22466p(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo5227v() {
        if (!this.f5076v || this.f5018E) {
            C5433k.m24388a("RV FullInvalidate");
            mo5069C();
            C5433k.m24389b();
        } else if (this.f5049e.mo5669p()) {
            if (this.f5049e.mo5668o(4) && !this.f5049e.mo5668o(11)) {
                C5433k.m24388a("RV PartialInvalidate");
                mo5223t1();
                mo5081J0();
                this.f5049e.mo5675w();
                if (!this.f5080x) {
                    if (m5657p0()) {
                        mo5069C();
                    } else {
                        this.f5049e.mo5663i();
                    }
                }
                mo5229v1(true);
                mo5083K0();
                C5433k.m24389b();
            } else if (this.f5049e.mo5669p()) {
                C5433k.m24388a("RV FullInvalidate");
                mo5069C();
                C5433k.m24389b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public boolean mo5228v0() {
        AccessibilityManager accessibilityManager = this.f5014C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v1 */
    public void mo5229v1(boolean z) {
        if (this.f5078w < 1) {
            this.f5078w = 1;
        }
        if (!z && !this.f5082y) {
            this.f5080x = false;
        }
        if (this.f5078w == 1) {
            if (z && this.f5080x && !this.f5082y && this.f5060n != null && this.f5058m != null) {
                mo5069C();
            }
            if (!this.f5082y) {
                this.f5080x = false;
            }
        }
        this.f5078w--;
    }

    /* renamed from: w0 */
    public boolean mo5230w0() {
        return this.f5022G > 0;
    }

    /* renamed from: w1 */
    public void mo5231w1(int i) {
        getScrollingChildHelper().mo22468r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo5232x(int i, int i2) {
        setMeasuredDimension(C1104p.m5846n(i, getPaddingLeft() + getPaddingRight(), C5723u.m25269D(this)), C1104p.m5846n(i2, getPaddingTop() + getPaddingBottom(), C5723u.m25267C(this)));
    }

    /* renamed from: x1 */
    public void mo5233x1() {
        setScrollState(0);
        m5665y1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo5234y0(int i) {
        if (this.f5060n != null) {
            setScrollState(2);
            this.f5060n.mo5043x1(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo5235z(View view) {
        C1087c0 i0 = m5650i0(view);
        mo5077H0(view);
        C1092h hVar = this.f5058m;
        if (!(hVar == null || i0 == null)) {
            hVar.onViewAttachedToWindow(i0);
        }
        List<C1109q> list = this.f5016D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f5016D.get(size).mo5500b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void mo5236z0() {
        int j = this.f5050f.mo5690j();
        for (int i = 0; i < j; i++) {
            ((LayoutParams) this.f5050f.mo5689i(i).getLayoutParams()).f5088c = true;
        }
        this.f5047c.mo5545s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public void mo5237z1(int i, int i2, Object obj) {
        int i3;
        int j = this.f5050f.mo5690j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.f5050f.mo5689i(i5);
            C1087c0 i0 = m5650i0(i6);
            if (i0 != null && !i0.shouldIgnore() && (i3 = i0.mPosition) >= i && i3 < i4) {
                i0.addFlags(2);
                i0.addChangePayload(obj);
                ((LayoutParams) i6.getLayoutParams()).f5088c = true;
            }
        }
        this.f5047c.mo5529M(i, i2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5251a.f23241a);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1081a();

        /* renamed from: d */
        Parcelable f5090d;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        class C1081a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1081a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5090d = parcel.readParcelable(classLoader == null ? C1104p.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5242b(SavedState savedState) {
            this.f5090d = savedState.f5090d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f5090d, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5046b = new C1117x();
        this.f5047c = new C1115v();
        this.f5051g = new C1171p();
        this.f5053i = new C1082a();
        this.f5054j = new Rect();
        this.f5055k = new Rect();
        this.f5056l = new RectF();
        this.f5064p = new ArrayList<>();
        this.f5066q = new ArrayList<>();
        this.f5078w = 0;
        this.f5018E = false;
        this.f5020F = false;
        this.f5022G = 0;
        this.f5024H = 0;
        this.f5026I = new C1097l();
        this.f5036N = new C1133c();
        this.f5037O = 0;
        this.f5038P = -1;
        this.f5061n0 = Float.MIN_VALUE;
        this.f5063o0 = Float.MIN_VALUE;
        boolean z = true;
        this.f5065p0 = true;
        this.f5067q0 = new C1085b0();
        this.f5071s0 = f5005R0 ? new C1149e.C1151b() : null;
        this.f5073t0 = new C1121z();
        this.f5079w0 = false;
        this.f5081x0 = false;
        this.f5083y0 = new C1102n();
        this.f5085z0 = false;
        this.f5015C0 = new int[2];
        this.f5019E0 = new int[2];
        this.f5021F0 = new int[2];
        this.f5023G0 = new int[2];
        this.f5025H0 = new ArrayList();
        this.f5027I0 = new C1084b();
        this.f5031K0 = 0;
        this.f5033L0 = 0;
        this.f5035M0 = new C1088d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5044V = viewConfiguration.getScaledTouchSlop();
        this.f5061n0 = C5737v.m25402b(viewConfiguration, context);
        this.f5063o0 = C5737v.m25404d(viewConfiguration, context);
        this.f5057l0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5059m0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5036N.mo5389v(this.f5083y0);
        mo5187q0();
        m5661s0();
        m5659r0();
        if (C5723u.m25351z(this) == 0) {
            C5723u.m25350y0(this, 1);
        }
        this.f5014C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1162k(this));
        int[] iArr = C5253c.f23250f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C5723u.m25326m0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(C5253c.f23259o);
        if (obtainStyledAttributes.getInt(C5253c.f23253i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5052h = obtainStyledAttributes.getBoolean(C5253c.f23252h, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C5253c.f23254j, false);
        this.f5074u = z2;
        if (z2) {
            mo5222t0((StateListDrawable) obtainStyledAttributes.getDrawable(C5253c.f23257m), obtainStyledAttributes.getDrawable(C5253c.f23258n), (StateListDrawable) obtainStyledAttributes.getDrawable(C5253c.f23255k), obtainStyledAttributes.getDrawable(C5253c.f23256l));
        }
        obtainStyledAttributes.recycle();
        m5662w(context, string, attributeSet, i, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = f5001N0;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
            C5723u.m25326m0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C1087c0 f5086a;

        /* renamed from: b */
        final Rect f5087b = new Rect();

        /* renamed from: c */
        boolean f5088c = true;

        /* renamed from: d */
        boolean f5089d = false;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo5238a() {
            return this.f5086a.getLayoutPosition();
        }

        /* renamed from: b */
        public boolean mo5239b() {
            return this.f5086a.isUpdated();
        }

        /* renamed from: c */
        public boolean mo5240c() {
            return this.f5086a.isRemoved();
        }

        /* renamed from: d */
        public boolean mo5241d() {
            return this.f5086a.isInvalid();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1104p pVar = this.f5060n;
        if (pVar != null) {
            return pVar.mo4975F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo5092Q());
    }
}
