package british.p015x;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import com.adcolony.sdk.AdColonyAdView;
import com.facebook.ads.AdView;

/* renamed from: british.x.t_rssdetalle */
public class t_rssdetalle extends FragmentActivity_ext_class implements C1592a, View.OnClickListener {

    /* renamed from: B */
    C1692config f9814B;

    /* renamed from: C */
    boolean f9815C = false;

    /* renamed from: D */
    t_rssdetalle_fr f9816D;

    /* renamed from: E */
    C1603c f9817E;

    /* renamed from: F */
    ListView f9818F;

    /* renamed from: british.x.t_rssdetalle$a */
    class C2436a implements SearchManager.OnCancelListener {
        C2436a() {
        }

        public void onCancel() {
            t_rssdetalle t_rssdetalle = t_rssdetalle.this;
            t_rssdetalle.f9815C = false;
            t_rssdetalle.setResult(0);
        }
    }

    /* renamed from: british.x.t_rssdetalle$b */
    class C2437b implements SearchManager.OnDismissListener {
        C2437b() {
        }

        public void onDismiss() {
            t_rssdetalle.this.f6670s = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo8936B() {
        int q0 = this.f9814B.mo7522q0(this);
        int i = this.f9814B.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9818F = listView;
            this.f9814B.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9814B.f7231O1;
                if (i3 >= lVarArr.length) {
                    break;
                }
                if (!lVarArr[i3].f7848B) {
                    findViewById(i3).setOnClickListener(this);
                    i4++;
                    if (i4 == q0) {
                        break;
                    }
                }
                i3++;
            }
            if (findViewById(R.id.idaux9999) != null && findViewById(R.id.idaux9999).getVisibility() == 0) {
                findViewById(R.id.idaux9999).setOnClickListener(this);
            }
        }
        while (true) {
            int[] iArr = this.f9814B.f7249R1;
            if (i2 < iArr.length) {
                if (iArr[i2] > 0) {
                    findViewById(iArr[i2]).setOnClickListener(this);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void abrir_secc(View view) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onClick(View view) {
        C1845j j0 = this.f9814B.mo7510j0(view, this);
        if (j0.f7843b) {
            this.f9815C = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", j0.f7844c);
            setResult(-1, intent);
        }
        if (j0.f7845d) {
            startActivityForResult(j0.f7842a, 0);
        } else {
            Intent intent2 = j0.f7842a;
            if (intent2 != null) {
                if (j0.f7843b) {
                    this.f6671t = false;
                    if (this.f9814B.f7427t4 != 2) {
                        intent2.putExtra("es_root", true);
                    }
                    try {
                        startActivity(j0.f7842a);
                    } catch (Exception unused) {
                    }
                } else {
                    startActivityForResult(intent2, 0);
                }
            }
        }
        if (this.f9815C && !this.f6670s) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        this.f9814B = (C1692config) getApplicationContext();
        super.onCreate(bundle);
        setContentView((int) R.layout.rssdetalle_fr);
        mo8936B();
        boolean z = true;
        this.f9814B.mo7486N0(this, true);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2436a());
        searchManager.setOnDismissListener(new C2437b());
        String string = getIntent().getExtras().getString("url");
        C1692config config = this.f9814B;
        if (!string.contains("youtube.com") && !string.contains("youtu.be")) {
            z = false;
        }
        this.f9817E = config.mo7474A0(this, z);
        t_rssdetalle_fr t_rssdetalle_fr = (t_rssdetalle_fr) mo3505r().mo3589i0(R.id.rssdetalle_fr);
        this.f9816D = t_rssdetalle_fr;
        t_rssdetalle_fr.mo8942N1(string);
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f9814B.f7384n3 == 0 || (cVar3 = this.f9817E) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9814B.f7384n3 == 0 || (cVar2 = this.f9817E) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9814B.f7384n3 == 0 || (cVar = this.f9817E) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f9816D.mo8943O1(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f9814B.f7384n3 == 0 || (cVar = this.f9817E) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f9814B.f7384n3 != 0 && (cVar = this.f9817E) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public boolean onSearchRequested() {
        this.f9815C = true;
        this.f6670s = true;
        return super.onSearchRequested();
    }

    public void onStop() {
        super.onStop();
        if (this.f9815C && !this.f6670s) {
            finish();
        }
    }
}
