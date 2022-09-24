package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0256d;
import androidx.mediarouter.media.C1001r;
import androidx.mediarouter.media.C1003s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p011b1.C1533a;
import p011b1.C1538f;
import p011b1.C1541i;

/* renamed from: androidx.mediarouter.app.a */
/* compiled from: MediaRouteChooserDialog */
public class C0852a extends C0256d {

    /* renamed from: d */
    private final C1003s f4054d;

    /* renamed from: e */
    private final C0854b f4055e;

    /* renamed from: f */
    private TextView f4056f;

    /* renamed from: g */
    private C1001r f4057g;

    /* renamed from: h */
    private ArrayList<C1003s.C1022i> f4058h;

    /* renamed from: i */
    private C0855c f4059i;

    /* renamed from: j */
    private ListView f4060j;

    /* renamed from: k */
    private boolean f4061k;

    /* renamed from: l */
    private long f4062l;

    /* renamed from: m */
    private final Handler f4063m;

    /* renamed from: androidx.mediarouter.app.a$a */
    /* compiled from: MediaRouteChooserDialog */
    class C0853a extends Handler {
        C0853a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C0852a.this.mo4230m((List) message.obj);
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.a$b */
    /* compiled from: MediaRouteChooserDialog */
    private final class C0854b extends C1003s.C1005b {
        C0854b() {
        }

        /* renamed from: d */
        public void mo4168d(C1003s sVar, C1003s.C1022i iVar) {
            C0852a.this.mo4227h();
        }

        /* renamed from: e */
        public void mo4169e(C1003s sVar, C1003s.C1022i iVar) {
            C0852a.this.mo4227h();
        }

        /* renamed from: g */
        public void mo4170g(C1003s sVar, C1003s.C1022i iVar) {
            C0852a.this.mo4227h();
        }

        /* renamed from: h */
        public void mo4196h(C1003s sVar, C1003s.C1022i iVar) {
            C0852a.this.dismiss();
        }
    }

    /* renamed from: androidx.mediarouter.app.a$c */
    /* compiled from: MediaRouteChooserDialog */
    private static final class C0855c extends ArrayAdapter<C1003s.C1022i> implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        private final LayoutInflater f4066b;

        /* renamed from: c */
        private final Drawable f4067c;

        /* renamed from: d */
        private final Drawable f4068d;

        /* renamed from: e */
        private final Drawable f4069e;

        /* renamed from: f */
        private final Drawable f4070f;

        public C0855c(Context context, List<C1003s.C1022i> list) {
            super(context, 0, list);
            this.f4066b = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C1533a.mediaRouteDefaultIconDrawable, C1533a.mediaRouteTvIconDrawable, C1533a.mediaRouteSpeakerIconDrawable, C1533a.mediaRouteSpeakerGroupIconDrawable});
            this.f4067c = obtainStyledAttributes.getDrawable(0);
            this.f4068d = obtainStyledAttributes.getDrawable(1);
            this.f4069e = obtainStyledAttributes.getDrawable(2);
            this.f4070f = obtainStyledAttributes.getDrawable(3);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private Drawable m4515a(C1003s.C1022i iVar) {
            int f = iVar.mo4800f();
            if (f == 1) {
                return this.f4068d;
            }
            if (f == 2) {
                return this.f4069e;
            }
            if (iVar.mo4820y()) {
                return this.f4070f;
            }
            return this.f4067c;
        }

        /* renamed from: b */
        private Drawable m4516b(C1003s.C1022i iVar) {
            Uri j = iVar.mo4804j();
            if (j != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(j), (String) null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e) {
                    Log.w("MediaRouteChooserDialog", "Failed to load " + j, e);
                }
            }
            return m4515a(iVar);
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f4066b.inflate(C1541i.mr_chooser_list_item, viewGroup, false);
            }
            C1003s.C1022i iVar = (C1003s.C1022i) getItem(i);
            TextView textView = (TextView) view.findViewById(C1538f.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(C1538f.mr_chooser_route_desc);
            textView.setText(iVar.mo4807m());
            String d = iVar.mo4798d();
            boolean z = true;
            if (!(iVar.mo4797c() == 2 || iVar.mo4797c() == 1)) {
                z = false;
            }
            if (!z || TextUtils.isEmpty(d)) {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(d);
            }
            view.setEnabled(iVar.mo4819x());
            ImageView imageView = (ImageView) view.findViewById(C1538f.mr_chooser_route_icon);
            if (imageView != null) {
                imageView.setImageDrawable(m4516b(iVar));
            }
            return view;
        }

        public boolean isEnabled(int i) {
            return ((C1003s.C1022i) getItem(i)).mo4819x();
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1003s.C1022i iVar = (C1003s.C1022i) getItem(i);
            if (iVar.mo4819x()) {
                ImageView imageView = (ImageView) view.findViewById(C1538f.mr_chooser_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C1538f.mr_chooser_route_progress_bar);
                if (!(imageView == null || progressBar == null)) {
                    imageView.setVisibility(8);
                    progressBar.setVisibility(0);
                }
                iVar.mo4791I();
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.a$d */
    /* compiled from: MediaRouteChooserDialog */
    static final class C0856d implements Comparator<C1003s.C1022i> {

        /* renamed from: b */
        public static final C0856d f4071b = new C0856d();

        C0856d() {
        }

        /* renamed from: a */
        public int compare(C1003s.C1022i iVar, C1003s.C1022i iVar2) {
            return iVar.mo4807m().compareToIgnoreCase(iVar2.mo4807m());
        }
    }

    public C0852a(Context context) {
        this(context, 0);
    }

    /* renamed from: f */
    public boolean mo4225f(C1003s.C1022i iVar) {
        return !iVar.mo4818w() && iVar.mo4819x() && iVar.mo4787E(this.f4057g);
    }

    /* renamed from: g */
    public void mo4226g(List<C1003s.C1022i> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size > 0) {
                if (!mo4225f(list.get(i))) {
                    list.remove(i);
                }
                size = i;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public void mo4227h() {
        if (this.f4061k) {
            ArrayList arrayList = new ArrayList(this.f4054d.mo4708k());
            mo4226g(arrayList);
            Collections.sort(arrayList, C0856d.f4071b);
            if (SystemClock.uptimeMillis() - this.f4062l >= 300) {
                mo4230m(arrayList);
                return;
            }
            this.f4063m.removeMessages(1);
            Handler handler = this.f4063m;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f4062l + 300);
        }
    }

    /* renamed from: i */
    public void mo4228i(C1001r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f4057g.equals(rVar)) {
            this.f4057g = rVar;
            if (this.f4061k) {
                this.f4054d.mo4711p(this.f4055e);
                this.f4054d.mo4703b(rVar, this.f4055e, 1);
            }
            mo4227h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4229k() {
        getWindow().setLayout(C0880f.m4582b(getContext()), -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4230m(List<C1003s.C1022i> list) {
        this.f4062l = SystemClock.uptimeMillis();
        this.f4058h.clear();
        this.f4058h.addAll(list);
        this.f4059i.notifyDataSetChanged();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4061k = true;
        this.f4054d.mo4703b(this.f4057g, this.f4055e, 1);
        mo4227h();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1541i.mr_chooser_dialog);
        this.f4058h = new ArrayList<>();
        this.f4059i = new C0855c(getContext(), this.f4058h);
        ListView listView = (ListView) findViewById(C1538f.mr_chooser_list);
        this.f4060j = listView;
        listView.setAdapter(this.f4059i);
        this.f4060j.setOnItemClickListener(this.f4059i);
        this.f4060j.setEmptyView(findViewById(16908292));
        this.f4056f = (TextView) findViewById(C1538f.mr_chooser_title);
        mo4229k();
    }

    public void onDetachedFromWindow() {
        this.f4061k = false;
        this.f4054d.mo4711p(this.f4055e);
        this.f4063m.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4056f.setText(charSequence);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0852a(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.C0912i.m4663b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.C0912i.m4664c(r2)
            r1.<init>(r2, r3)
            androidx.mediarouter.media.r r2 = androidx.mediarouter.media.C1001r.f4553c
            r1.f4057g = r2
            androidx.mediarouter.app.a$a r2 = new androidx.mediarouter.app.a$a
            r2.<init>()
            r1.f4063m = r2
            android.content.Context r2 = r1.getContext()
            androidx.mediarouter.media.s r2 = androidx.mediarouter.media.C1003s.m5133h(r2)
            r1.f4054d = r2
            androidx.mediarouter.app.a$b r2 = new androidx.mediarouter.app.a$b
            r2.<init>()
            r1.f4055e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C0852a.<init>(android.content.Context, int):void");
    }

    public void setTitle(int i) {
        this.f4056f.setText(i);
    }
}
