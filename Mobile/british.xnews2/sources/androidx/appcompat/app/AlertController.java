package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p072f.C5238a;
import p072f.C5243f;
import p072f.C5247j;
import p110m0.C5723u;

class AlertController {

    /* renamed from: A */
    NestedScrollView f553A;

    /* renamed from: B */
    private int f554B = 0;

    /* renamed from: C */
    private Drawable f555C;

    /* renamed from: D */
    private ImageView f556D;

    /* renamed from: E */
    private TextView f557E;

    /* renamed from: F */
    private TextView f558F;

    /* renamed from: G */
    private View f559G;

    /* renamed from: H */
    ListAdapter f560H;

    /* renamed from: I */
    int f561I = -1;

    /* renamed from: J */
    private int f562J;

    /* renamed from: K */
    private int f563K;

    /* renamed from: L */
    int f564L;

    /* renamed from: M */
    int f565M;

    /* renamed from: N */
    int f566N;

    /* renamed from: O */
    int f567O;

    /* renamed from: P */
    private boolean f568P;

    /* renamed from: Q */
    private int f569Q = 0;

    /* renamed from: R */
    Handler f570R;

    /* renamed from: S */
    private final View.OnClickListener f571S = new C0214a();

    /* renamed from: a */
    private final Context f572a;

    /* renamed from: b */
    final C0256d f573b;

    /* renamed from: c */
    private final Window f574c;

    /* renamed from: d */
    private final int f575d;

    /* renamed from: e */
    private CharSequence f576e;

    /* renamed from: f */
    private CharSequence f577f;

    /* renamed from: g */
    ListView f578g;

    /* renamed from: h */
    private View f579h;

    /* renamed from: i */
    private int f580i;

    /* renamed from: j */
    private int f581j;

    /* renamed from: k */
    private int f582k;

    /* renamed from: l */
    private int f583l;

    /* renamed from: m */
    private int f584m;

    /* renamed from: n */
    private boolean f585n = false;

    /* renamed from: o */
    Button f586o;

    /* renamed from: p */
    private CharSequence f587p;

    /* renamed from: q */
    Message f588q;

    /* renamed from: r */
    private Drawable f589r;

    /* renamed from: s */
    Button f590s;

    /* renamed from: t */
    private CharSequence f591t;

    /* renamed from: u */
    Message f592u;

    /* renamed from: v */
    private Drawable f593v;

    /* renamed from: w */
    Button f594w;

    /* renamed from: x */
    private CharSequence f595x;

    /* renamed from: y */
    Message f596y;

    /* renamed from: z */
    private Drawable f597z;

    public static class RecycleListView extends ListView {

        /* renamed from: b */
        private final int f598b;

        /* renamed from: c */
        private final int f599c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5247j.f23149h2);
            this.f599c = obtainStyledAttributes.getDimensionPixelOffset(C5247j.f23154i2, -1);
            this.f598b = obtainStyledAttributes.getDimensionPixelOffset(C5247j.f23159j2, -1);
        }

        /* renamed from: a */
        public void mo746a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f598b, getPaddingRight(), z2 ? getPaddingBottom() : this.f599c);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0214a implements View.OnClickListener {
        C0214a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f596y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f586o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f588q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f590s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f592u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f594w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f596y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f570R
                r1 = 1
                androidx.appcompat.app.d r3 = r3.f573b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0214a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0215b implements NestedScrollView.C0611b {

        /* renamed from: a */
        final /* synthetic */ View f601a;

        /* renamed from: b */
        final /* synthetic */ View f602b;

        C0215b(View view, View view2) {
            this.f601a = view;
            this.f602b = view2;
        }

        /* renamed from: a */
        public void mo748a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m978f(nestedScrollView, this.f601a, this.f602b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0216c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f604b;

        /* renamed from: c */
        final /* synthetic */ View f605c;

        C0216c(View view, View view2) {
            this.f604b = view;
            this.f605c = view2;
        }

        public void run() {
            AlertController.m978f(AlertController.this.f553A, this.f604b, this.f605c);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0217d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f607a;

        /* renamed from: b */
        final /* synthetic */ View f608b;

        C0217d(View view, View view2) {
            this.f607a = view;
            this.f608b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m978f(absListView, this.f607a, this.f608b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0218e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f610b;

        /* renamed from: c */
        final /* synthetic */ View f611c;

        C0218e(View view, View view2) {
            this.f610b = view;
            this.f611c = view2;
        }

        public void run() {
            AlertController.m978f(AlertController.this.f578g, this.f610b, this.f611c);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0219f {

        /* renamed from: A */
        public int f613A;

        /* renamed from: B */
        public int f614B;

        /* renamed from: C */
        public int f615C;

        /* renamed from: D */
        public int f616D;

        /* renamed from: E */
        public boolean f617E = false;

        /* renamed from: F */
        public boolean[] f618F;

        /* renamed from: G */
        public boolean f619G;

        /* renamed from: H */
        public boolean f620H;

        /* renamed from: I */
        public int f621I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f622J;

        /* renamed from: K */
        public Cursor f623K;

        /* renamed from: L */
        public String f624L;

        /* renamed from: M */
        public String f625M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f626N;

        /* renamed from: O */
        public C0224e f627O;

        /* renamed from: P */
        public boolean f628P = true;

        /* renamed from: a */
        public final Context f629a;

        /* renamed from: b */
        public final LayoutInflater f630b;

        /* renamed from: c */
        public int f631c = 0;

        /* renamed from: d */
        public Drawable f632d;

        /* renamed from: e */
        public int f633e = 0;

        /* renamed from: f */
        public CharSequence f634f;

        /* renamed from: g */
        public View f635g;

        /* renamed from: h */
        public CharSequence f636h;

        /* renamed from: i */
        public CharSequence f637i;

        /* renamed from: j */
        public Drawable f638j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f639k;

        /* renamed from: l */
        public CharSequence f640l;

        /* renamed from: m */
        public Drawable f641m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f642n;

        /* renamed from: o */
        public CharSequence f643o;

        /* renamed from: p */
        public Drawable f644p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f645q;

        /* renamed from: r */
        public boolean f646r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f647s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f648t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f649u;

        /* renamed from: v */
        public CharSequence[] f650v;

        /* renamed from: w */
        public ListAdapter f651w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f652x;

        /* renamed from: y */
        public int f653y;

        /* renamed from: z */
        public View f654z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0220a extends ArrayAdapter<CharSequence> {

            /* renamed from: b */
            final /* synthetic */ RecycleListView f655b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0220a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f655b = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0219f.this.f618F;
                if (zArr != null && zArr[i]) {
                    this.f655b.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0221b extends CursorAdapter {

            /* renamed from: b */
            private final int f657b;

            /* renamed from: c */
            private final int f658c;

            /* renamed from: d */
            final /* synthetic */ RecycleListView f659d;

            /* renamed from: e */
            final /* synthetic */ AlertController f660e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0221b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f659d = recycleListView;
                this.f660e = alertController;
                Cursor cursor2 = getCursor();
                this.f657b = cursor2.getColumnIndexOrThrow(C0219f.this.f624L);
                this.f658c = cursor2.getColumnIndexOrThrow(C0219f.this.f625M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f657b));
                RecycleListView recycleListView = this.f659d;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f658c) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0219f.this.f630b.inflate(this.f660e.f565M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0222c implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ AlertController f662b;

            C0222c(AlertController alertController) {
                this.f662b = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0219f.this.f652x.onClick(this.f662b.f573b, i);
                if (!C0219f.this.f620H) {
                    this.f662b.f573b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0223d implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ RecycleListView f664b;

            /* renamed from: c */
            final /* synthetic */ AlertController f665c;

            C0223d(RecycleListView recycleListView, AlertController alertController) {
                this.f664b = recycleListView;
                this.f665c = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0219f.this.f618F;
                if (zArr != null) {
                    zArr[i] = this.f664b.isItemChecked(i);
                }
                C0219f.this.f622J.onClick(this.f665c.f573b, i, this.f664b.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0224e {
            /* renamed from: a */
            void mo759a(ListView listView);
        }

        public C0219f(Context context) {
            this.f629a = context;
            this.f646r = true;
            this.f630b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m1004b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f630b
                int r1 = r11.f564L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f619G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f623K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f629a
                int r4 = r11.f565M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f650v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f629a
                android.database.Cursor r4 = r10.f623K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f620H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f566N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f567O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f623K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f629a
                android.database.Cursor r5 = r10.f623K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f624L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f651w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f629a
                java.lang.CharSequence[] r3 = r10.f650v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f627O
                if (r1 == 0) goto L_0x0072
                r1.mo759a(r0)
            L_0x0072:
                r11.f560H = r9
                int r1 = r10.f621I
                r11.f561I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f652x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0091
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f622J
                if (r1 == 0) goto L_0x0091
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f626N
                if (r1 == 0) goto L_0x0098
                r0.setOnItemSelectedListener(r1)
            L_0x0098:
                boolean r1 = r10.f620H
                if (r1 == 0) goto L_0x00a0
                r0.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r1 = r10.f619G
                if (r1 == 0) goto L_0x00a8
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a8:
                r11.f578g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0219f.m1004b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo753a(AlertController alertController) {
            View view = this.f635g;
            if (view != null) {
                alertController.mo738l(view);
            } else {
                CharSequence charSequence = this.f634f;
                if (charSequence != null) {
                    alertController.mo742q(charSequence);
                }
                Drawable drawable = this.f632d;
                if (drawable != null) {
                    alertController.mo740n(drawable);
                }
                int i = this.f631c;
                if (i != 0) {
                    alertController.mo739m(i);
                }
                int i2 = this.f633e;
                if (i2 != 0) {
                    alertController.mo739m(alertController.mo732c(i2));
                }
            }
            CharSequence charSequence2 = this.f636h;
            if (charSequence2 != null) {
                alertController.mo741o(charSequence2);
            }
            CharSequence charSequence3 = this.f637i;
            if (!(charSequence3 == null && this.f638j == null)) {
                alertController.mo737k(-1, charSequence3, this.f639k, (Message) null, this.f638j);
            }
            CharSequence charSequence4 = this.f640l;
            if (!(charSequence4 == null && this.f641m == null)) {
                alertController.mo737k(-2, charSequence4, this.f642n, (Message) null, this.f641m);
            }
            CharSequence charSequence5 = this.f643o;
            if (!(charSequence5 == null && this.f644p == null)) {
                alertController.mo737k(-3, charSequence5, this.f645q, (Message) null, this.f644p);
            }
            if (!(this.f650v == null && this.f623K == null && this.f651w == null)) {
                m1004b(alertController);
            }
            View view2 = this.f654z;
            if (view2 == null) {
                int i3 = this.f653y;
                if (i3 != 0) {
                    alertController.mo743r(i3);
                }
            } else if (this.f617E) {
                alertController.mo745t(view2, this.f613A, this.f614B, this.f615C, this.f616D);
            } else {
                alertController.mo744s(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0225g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f667a;

        public C0225g(DialogInterface dialogInterface) {
            this.f667a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f667a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0226h extends ArrayAdapter<CharSequence> {
        public C0226h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0256d dVar, Window window) {
        this.f572a = context;
        this.f573b = dVar;
        this.f574c = window;
        this.f570R = new C0225g(dVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C5247j.f23015H, C5238a.f22818n, 0);
        this.f562J = obtainStyledAttributes.getResourceId(C5247j.f23020I, 0);
        this.f563K = obtainStyledAttributes.getResourceId(C5247j.f23030K, 0);
        this.f564L = obtainStyledAttributes.getResourceId(C5247j.f23040M, 0);
        this.f565M = obtainStyledAttributes.getResourceId(C5247j.f23045N, 0);
        this.f566N = obtainStyledAttributes.getResourceId(C5247j.f23055P, 0);
        this.f567O = obtainStyledAttributes.getResourceId(C5247j.f23035L, 0);
        this.f568P = obtainStyledAttributes.getBoolean(C5247j.f23050O, true);
        this.f575d = obtainStyledAttributes.getDimensionPixelSize(C5247j.f23025J, 0);
        obtainStyledAttributes.recycle();
        dVar.mo925e(1);
    }

    /* renamed from: a */
    static boolean m976a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m976a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m977b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    static void m978f(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: i */
    private ViewGroup m979i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    private int m980j() {
        int i = this.f563K;
        if (i == 0) {
            return this.f562J;
        }
        if (this.f569Q == 1) {
            return i;
        }
        return this.f562J;
    }

    /* renamed from: p */
    private void m981p(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f574c.findViewById(C5243f.f22893B);
        View findViewById2 = this.f574c.findViewById(C5243f.f22892A);
        if (Build.VERSION.SDK_INT >= 23) {
            C5723u.m25272E0(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f577f != null) {
                this.f553A.setOnScrollChangeListener(new C0215b(findViewById, findViewById2));
                this.f553A.post(new C0216c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f578g;
            if (listView != null) {
                listView.setOnScrollListener(new C0217d(findViewById, findViewById2));
                this.f578g.post(new C0218e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    /* renamed from: u */
    private void m982u(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f586o = button;
        button.setOnClickListener(this.f571S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f587p) || this.f589r != null) {
            this.f586o.setText(this.f587p);
            Drawable drawable = this.f589r;
            if (drawable != null) {
                int i = this.f575d;
                drawable.setBounds(0, 0, i, i);
                this.f586o.setCompoundDrawables(this.f589r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f586o.setVisibility(0);
            z = true;
        } else {
            this.f586o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f590s = button2;
        button2.setOnClickListener(this.f571S);
        if (!TextUtils.isEmpty(this.f591t) || this.f593v != null) {
            this.f590s.setText(this.f591t);
            Drawable drawable2 = this.f593v;
            if (drawable2 != null) {
                int i2 = this.f575d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f590s.setCompoundDrawables(this.f593v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f590s.setVisibility(0);
            z |= true;
        } else {
            this.f590s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f594w = button3;
        button3.setOnClickListener(this.f571S);
        if (!TextUtils.isEmpty(this.f595x) || this.f597z != null) {
            this.f594w.setText(this.f595x);
            Drawable drawable3 = this.f597z;
            if (drawable3 != null) {
                int i3 = this.f575d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f594w.setCompoundDrawables(this.f597z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f594w.setVisibility(0);
            z |= true;
        } else {
            this.f594w.setVisibility(8);
        }
        if (m987z(this.f572a)) {
            if (z) {
                m977b(this.f586o);
            } else if (z) {
                m977b(this.f590s);
            } else if (z) {
                m977b(this.f594w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m983v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f574c.findViewById(C5243f.f22894C);
        this.f553A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f553A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f558F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f577f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f553A.removeView(this.f558F);
            if (this.f578g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f553A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f553A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f578g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: w */
    private void m984w(ViewGroup viewGroup) {
        View view = this.f579h;
        boolean z = false;
        if (view == null) {
            view = this.f580i != 0 ? LayoutInflater.from(this.f572a).inflate(this.f580i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m976a(view)) {
            this.f574c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f574c.findViewById(C5243f.f22928o);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f585n) {
                frameLayout.setPadding(this.f581j, this.f582k, this.f583l, this.f584m);
            }
            if (this.f578g != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m985x(ViewGroup viewGroup) {
        if (this.f559G != null) {
            viewGroup.addView(this.f559G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f574c.findViewById(C5243f.f22912U).setVisibility(8);
            return;
        }
        this.f556D = (ImageView) this.f574c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f576e)) || !this.f568P) {
            this.f574c.findViewById(C5243f.f22912U).setVisibility(8);
            this.f556D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f574c.findViewById(C5243f.f22924k);
        this.f557E = textView;
        textView.setText(this.f576e);
        int i = this.f554B;
        if (i != 0) {
            this.f556D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f555C;
        if (drawable != null) {
            this.f556D.setImageDrawable(drawable);
            return;
        }
        this.f557E.setPadding(this.f556D.getPaddingLeft(), this.f556D.getPaddingTop(), this.f556D.getPaddingRight(), this.f556D.getPaddingBottom());
        this.f556D.setVisibility(8);
    }

    /* renamed from: y */
    private void m986y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f574c.findViewById(C5243f.f22939z);
        int i = C5243f.f22913V;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C5243f.f22927n;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C5243f.f22925l;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C5243f.f22929p);
        m984w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup i4 = m979i(findViewById7, findViewById4);
        ViewGroup i5 = m979i(findViewById8, findViewById5);
        ViewGroup i6 = m979i(findViewById9, findViewById6);
        m983v(i5);
        m982u(i6);
        m985x(i4);
        char c = 0;
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (i4 == null || i4.getVisibility() == 8) ? false : true;
        boolean z3 = (i6 == null || i6.getVisibility() == 8) ? false : true;
        if (!(z3 || i5 == null || (findViewById2 = i5.findViewById(C5243f.f22908Q)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f553A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f577f == null && this.f578g == null)) {
                view = i4.findViewById(C5243f.f22911T);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i5 == null || (findViewById = i5.findViewById(C5243f.f22909R)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f578g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo746a(z2, z3);
        }
        if (!z) {
            View view2 = this.f578g;
            if (view2 == null) {
                view2 = this.f553A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m981p(i5, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f578g;
        if (listView2 != null && (listAdapter = this.f560H) != null) {
            listView2.setAdapter(listAdapter);
            int i7 = this.f561I;
            if (i7 > -1) {
                listView2.setItemChecked(i7, true);
                listView2.setSelection(i7);
            }
        }
    }

    /* renamed from: z */
    private static boolean m987z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5238a.f22817m, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int mo732c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f572a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView mo733d() {
        return this.f578g;
    }

    /* renamed from: e */
    public void mo734e() {
        this.f573b.setContentView(m980j());
        m986y();
    }

    /* renamed from: g */
    public boolean mo735g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f553A;
        return nestedScrollView != null && nestedScrollView.mo3174q(keyEvent);
    }

    /* renamed from: h */
    public boolean mo736h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f553A;
        return nestedScrollView != null && nestedScrollView.mo3174q(keyEvent);
    }

    /* renamed from: k */
    public void mo737k(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f570R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f595x = charSequence;
            this.f596y = message;
            this.f597z = drawable;
        } else if (i == -2) {
            this.f591t = charSequence;
            this.f592u = message;
            this.f593v = drawable;
        } else if (i == -1) {
            this.f587p = charSequence;
            this.f588q = message;
            this.f589r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: l */
    public void mo738l(View view) {
        this.f559G = view;
    }

    /* renamed from: m */
    public void mo739m(int i) {
        this.f555C = null;
        this.f554B = i;
        ImageView imageView = this.f556D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f556D.setImageResource(this.f554B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: n */
    public void mo740n(Drawable drawable) {
        this.f555C = drawable;
        this.f554B = 0;
        ImageView imageView = this.f556D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f556D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: o */
    public void mo741o(CharSequence charSequence) {
        this.f577f = charSequence;
        TextView textView = this.f558F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void mo742q(CharSequence charSequence) {
        this.f576e = charSequence;
        TextView textView = this.f557E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void mo743r(int i) {
        this.f579h = null;
        this.f580i = i;
        this.f585n = false;
    }

    /* renamed from: s */
    public void mo744s(View view) {
        this.f579h = view;
        this.f580i = 0;
        this.f585n = false;
    }

    /* renamed from: t */
    public void mo745t(View view, int i, int i2, int i3, int i4) {
        this.f579h = view;
        this.f580i = 0;
        this.f585n = true;
        this.f581j = i;
        this.f582k = i2;
        this.f583l = i3;
        this.f584m = i4;
    }
}
