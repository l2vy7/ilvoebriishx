package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0256d;
import androidx.mediarouter.media.C1001r;
import androidx.mediarouter.media.C1003s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p011b1.C1538f;
import p011b1.C1541i;
import p011b1.C1542j;

/* renamed from: androidx.mediarouter.app.g */
/* compiled from: MediaRouteDynamicChooserDialog */
public class C0881g extends C0256d {

    /* renamed from: d */
    final C1003s f4177d;

    /* renamed from: e */
    private final C0884c f4178e;

    /* renamed from: f */
    Context f4179f;

    /* renamed from: g */
    private C1001r f4180g;

    /* renamed from: h */
    List<C1003s.C1022i> f4181h;

    /* renamed from: i */
    private ImageButton f4182i;

    /* renamed from: j */
    private C0885d f4183j;

    /* renamed from: k */
    private RecyclerView f4184k;

    /* renamed from: l */
    private boolean f4185l;

    /* renamed from: m */
    C1003s.C1022i f4186m;

    /* renamed from: n */
    private long f4187n;

    /* renamed from: o */
    private long f4188o;

    /* renamed from: p */
    private final Handler f4189p;

    /* renamed from: androidx.mediarouter.app.g$a */
    /* compiled from: MediaRouteDynamicChooserDialog */
    class C0882a extends Handler {
        C0882a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C0881g.this.mo4307m((List) message.obj);
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.g$b */
    /* compiled from: MediaRouteDynamicChooserDialog */
    class C0883b implements View.OnClickListener {
        C0883b() {
        }

        public void onClick(View view) {
            C0881g.this.dismiss();
        }
    }

    /* renamed from: androidx.mediarouter.app.g$c */
    /* compiled from: MediaRouteDynamicChooserDialog */
    private final class C0884c extends C1003s.C1005b {
        C0884c() {
        }

        /* renamed from: d */
        public void mo4168d(C1003s sVar, C1003s.C1022i iVar) {
            C0881g.this.mo4304h();
        }

        /* renamed from: e */
        public void mo4169e(C1003s sVar, C1003s.C1022i iVar) {
            C0881g.this.mo4304h();
        }

        /* renamed from: g */
        public void mo4170g(C1003s sVar, C1003s.C1022i iVar) {
            C0881g.this.mo4304h();
        }

        /* renamed from: h */
        public void mo4196h(C1003s sVar, C1003s.C1022i iVar) {
            C0881g.this.dismiss();
        }
    }

    /* renamed from: androidx.mediarouter.app.g$d */
    /* compiled from: MediaRouteDynamicChooserDialog */
    private final class C0885d extends RecyclerView.C1092h<RecyclerView.C1087c0> {

        /* renamed from: a */
        private final ArrayList<C0887b> f4193a = new ArrayList<>();

        /* renamed from: b */
        private final LayoutInflater f4194b;

        /* renamed from: c */
        private final Drawable f4195c;

        /* renamed from: d */
        private final Drawable f4196d;

        /* renamed from: e */
        private final Drawable f4197e;

        /* renamed from: f */
        private final Drawable f4198f;

        /* renamed from: androidx.mediarouter.app.g$d$a */
        /* compiled from: MediaRouteDynamicChooserDialog */
        private class C0886a extends RecyclerView.C1087c0 {

            /* renamed from: a */
            TextView f4200a;

            C0886a(View view) {
                super(view);
                this.f4200a = (TextView) view.findViewById(C1538f.mr_picker_header_name);
            }

            /* renamed from: a */
            public void mo4319a(C0887b bVar) {
                this.f4200a.setText(bVar.mo4320a().toString());
            }
        }

        /* renamed from: androidx.mediarouter.app.g$d$b */
        /* compiled from: MediaRouteDynamicChooserDialog */
        private class C0887b {

            /* renamed from: a */
            private final Object f4202a;

            /* renamed from: b */
            private final int f4203b;

            C0887b(Object obj) {
                this.f4202a = obj;
                if (obj instanceof String) {
                    this.f4203b = 1;
                } else if (obj instanceof C1003s.C1022i) {
                    this.f4203b = 2;
                } else {
                    this.f4203b = 0;
                    Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
                }
            }

            /* renamed from: a */
            public Object mo4320a() {
                return this.f4202a;
            }

            /* renamed from: b */
            public int mo4321b() {
                return this.f4203b;
            }
        }

        /* renamed from: androidx.mediarouter.app.g$d$c */
        /* compiled from: MediaRouteDynamicChooserDialog */
        private class C0888c extends RecyclerView.C1087c0 {

            /* renamed from: a */
            final View f4205a;

            /* renamed from: b */
            final ImageView f4206b;

            /* renamed from: c */
            final ProgressBar f4207c;

            /* renamed from: d */
            final TextView f4208d;

            /* renamed from: androidx.mediarouter.app.g$d$c$a */
            /* compiled from: MediaRouteDynamicChooserDialog */
            class C0889a implements View.OnClickListener {

                /* renamed from: b */
                final /* synthetic */ C1003s.C1022i f4210b;

                C0889a(C1003s.C1022i iVar) {
                    this.f4210b = iVar;
                }

                public void onClick(View view) {
                    C0881g gVar = C0881g.this;
                    C1003s.C1022i iVar = this.f4210b;
                    gVar.f4186m = iVar;
                    iVar.mo4791I();
                    C0888c.this.f4206b.setVisibility(4);
                    C0888c.this.f4207c.setVisibility(0);
                }
            }

            C0888c(View view) {
                super(view);
                this.f4205a = view;
                this.f4206b = (ImageView) view.findViewById(C1538f.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C1538f.mr_picker_route_progress_bar);
                this.f4207c = progressBar;
                this.f4208d = (TextView) view.findViewById(C1538f.mr_picker_route_name);
                C0912i.m4681t(C0881g.this.f4179f, progressBar);
            }

            /* renamed from: a */
            public void mo4322a(C0887b bVar) {
                C1003s.C1022i iVar = (C1003s.C1022i) bVar.mo4320a();
                this.f4205a.setVisibility(0);
                this.f4207c.setVisibility(4);
                this.f4205a.setOnClickListener(new C0889a(iVar));
                this.f4208d.setText(iVar.mo4807m());
                this.f4206b.setImageDrawable(C0885d.this.mo4312b(iVar));
            }
        }

        C0885d() {
            this.f4194b = LayoutInflater.from(C0881g.this.f4179f);
            this.f4195c = C0912i.m4668g(C0881g.this.f4179f);
            this.f4196d = C0912i.m4678q(C0881g.this.f4179f);
            this.f4197e = C0912i.m4674m(C0881g.this.f4179f);
            this.f4198f = C0912i.m4675n(C0881g.this.f4179f);
            mo4314d();
        }

        /* renamed from: a */
        private Drawable m4600a(C1003s.C1022i iVar) {
            int f = iVar.mo4800f();
            if (f == 1) {
                return this.f4196d;
            }
            if (f == 2) {
                return this.f4197e;
            }
            if (iVar.mo4820y()) {
                return this.f4198f;
            }
            return this.f4195c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Drawable mo4312b(C1003s.C1022i iVar) {
            Uri j = iVar.mo4804j();
            if (j != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(C0881g.this.f4179f.getContentResolver().openInputStream(j), (String) null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e) {
                    Log.w("RecyclerAdapter", "Failed to load " + j, e);
                }
            }
            return m4600a(iVar);
        }

        /* renamed from: c */
        public C0887b mo4313c(int i) {
            return this.f4193a.get(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4314d() {
            this.f4193a.clear();
            this.f4193a.add(new C0887b(C0881g.this.f4179f.getString(C1542j.mr_chooser_title)));
            for (C1003s.C1022i bVar : C0881g.this.f4181h) {
                this.f4193a.add(new C0887b(bVar));
            }
            notifyDataSetChanged();
        }

        public int getItemCount() {
            return this.f4193a.size();
        }

        public int getItemViewType(int i) {
            return this.f4193a.get(i).mo4321b();
        }

        public void onBindViewHolder(RecyclerView.C1087c0 c0Var, int i) {
            int itemViewType = getItemViewType(i);
            C0887b c = mo4313c(i);
            if (itemViewType == 1) {
                ((C0886a) c0Var).mo4319a(c);
            } else if (itemViewType != 2) {
                Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((C0888c) c0Var).mo4322a(c);
            }
        }

        public RecyclerView.C1087c0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new C0886a(this.f4194b.inflate(C1541i.mr_picker_header_item, viewGroup, false));
            }
            if (i == 2) {
                return new C0888c(this.f4194b.inflate(C1541i.mr_picker_route_item, viewGroup, false));
            }
            Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
            return null;
        }
    }

    /* renamed from: androidx.mediarouter.app.g$e */
    /* compiled from: MediaRouteDynamicChooserDialog */
    static final class C0890e implements Comparator<C1003s.C1022i> {

        /* renamed from: b */
        public static final C0890e f4212b = new C0890e();

        C0890e() {
        }

        /* renamed from: a */
        public int compare(C1003s.C1022i iVar, C1003s.C1022i iVar2) {
            return iVar.mo4807m().compareToIgnoreCase(iVar2.mo4807m());
        }
    }

    public C0881g(Context context) {
        this(context, 0);
    }

    /* renamed from: f */
    public boolean mo4302f(C1003s.C1022i iVar) {
        return !iVar.mo4818w() && iVar.mo4819x() && iVar.mo4787E(this.f4180g);
    }

    /* renamed from: g */
    public void mo4303g(List<C1003s.C1022i> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size > 0) {
                if (!mo4302f(list.get(i))) {
                    list.remove(i);
                }
                size = i;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public void mo4304h() {
        if (this.f4186m == null && this.f4185l) {
            ArrayList arrayList = new ArrayList(this.f4177d.mo4708k());
            mo4303g(arrayList);
            Collections.sort(arrayList, C0890e.f4212b);
            if (SystemClock.uptimeMillis() - this.f4188o >= this.f4187n) {
                mo4307m(arrayList);
                return;
            }
            this.f4189p.removeMessages(1);
            Handler handler = this.f4189p;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f4188o + this.f4187n);
        }
    }

    /* renamed from: i */
    public void mo4305i(C1001r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f4180g.equals(rVar)) {
            this.f4180g = rVar;
            if (this.f4185l) {
                this.f4177d.mo4711p(this.f4178e);
                this.f4177d.mo4703b(rVar, this.f4178e, 1);
            }
            mo4304h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4306k() {
        getWindow().setLayout(C0880f.m4583c(this.f4179f), C0880f.m4581a(this.f4179f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4307m(List<C1003s.C1022i> list) {
        this.f4188o = SystemClock.uptimeMillis();
        this.f4181h.clear();
        this.f4181h.addAll(list);
        this.f4183j.mo4314d();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4185l = true;
        this.f4177d.mo4703b(this.f4180g, this.f4178e, 1);
        mo4304h();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1541i.mr_picker_dialog);
        C0912i.m4680s(this.f4179f, this);
        this.f4181h = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(C1538f.mr_picker_close_button);
        this.f4182i = imageButton;
        imageButton.setOnClickListener(new C0883b());
        this.f4183j = new C0885d();
        RecyclerView recyclerView = (RecyclerView) findViewById(C1538f.mr_picker_list);
        this.f4184k = recyclerView;
        recyclerView.setAdapter(this.f4183j);
        this.f4184k.setLayoutManager(new LinearLayoutManager(this.f4179f));
        mo4306k();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4185l = false;
        this.f4177d.mo4711p(this.f4178e);
        this.f4189p.removeMessages(1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0881g(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.C0912i.m4663b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.C0912i.m4664c(r2)
            r1.<init>(r2, r3)
            androidx.mediarouter.media.r r2 = androidx.mediarouter.media.C1001r.f4553c
            r1.f4180g = r2
            androidx.mediarouter.app.g$a r2 = new androidx.mediarouter.app.g$a
            r2.<init>()
            r1.f4189p = r2
            android.content.Context r2 = r1.getContext()
            androidx.mediarouter.media.s r3 = androidx.mediarouter.media.C1003s.m5133h(r2)
            r1.f4177d = r3
            androidx.mediarouter.app.g$c r3 = new androidx.mediarouter.app.g$c
            r3.<init>()
            r1.f4178e = r3
            r1.f4179f = r2
            android.content.res.Resources r2 = r2.getResources()
            int r3 = p011b1.C1539g.mr_update_routes_delay_ms
            int r2 = r2.getInteger(r3)
            long r2 = (long) r2
            r1.f4187n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C0881g.<init>(android.content.Context, int):void");
    }
}
