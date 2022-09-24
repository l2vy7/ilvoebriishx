package com.startapp.sdk.ads.video.tracking;

import com.startapp.C12132pb;
import com.startapp.C12349tb;
import com.startapp.C5010hb;
import com.startapp.sdk.ads.video.vast.C12255a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class VideoTrackingDetails implements Serializable {
    private static final long serialVersionUID = -1841622077369870410L;
    @C5010hb(type = AbsoluteTrackingLink.class)
    private AbsoluteTrackingLink[] absoluteTrackingUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] creativeViewUrls;
    @C5010hb(type = FractionTrackingLink.class)
    private FractionTrackingLink[] fractionTrackingUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] impressionUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] inlineErrorTrackingUrls;
    private boolean isVAST;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundMuteUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundUnmuteUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClickTrackingUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClosedUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPausedUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClickTrackingUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClosedUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollImpressionUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoResumedUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoRewardedUrls;
    @C5010hb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoSkippedUrls;

    public VideoTrackingDetails() {
    }

    /* renamed from: a */
    public AbsoluteTrackingLink[] mo46053a() {
        return this.absoluteTrackingUrls;
    }

    /* renamed from: b */
    public ActionTrackingLink[] mo46056b() {
        return this.creativeViewUrls;
    }

    /* renamed from: c */
    public FractionTrackingLink[] mo46057c() {
        return this.fractionTrackingUrls;
    }

    /* renamed from: d */
    public ActionTrackingLink[] mo46058d() {
        return this.impressionUrls;
    }

    /* renamed from: e */
    public ActionTrackingLink[] mo46059e() {
        return this.inlineErrorTrackingUrls;
    }

    /* renamed from: f */
    public ActionTrackingLink[] mo46060f() {
        return this.soundMuteUrls;
    }

    /* renamed from: g */
    public ActionTrackingLink[] mo46061g() {
        return this.soundUnmuteUrls;
    }

    /* renamed from: h */
    public ActionTrackingLink[] mo46062h() {
        return this.videoClickTrackingUrls;
    }

    /* renamed from: i */
    public ActionTrackingLink[] mo46063i() {
        return this.videoClosedUrls;
    }

    /* renamed from: j */
    public ActionTrackingLink[] mo46064j() {
        return this.videoPausedUrls;
    }

    /* renamed from: k */
    public ActionTrackingLink[] mo46065k() {
        return this.isVAST ? this.videoPostRollClickTrackingUrls : this.videoClickTrackingUrls;
    }

    /* renamed from: l */
    public ActionTrackingLink[] mo46066l() {
        return this.videoPostRollClosedUrls;
    }

    /* renamed from: m */
    public ActionTrackingLink[] mo46067m() {
        return this.videoPostRollImpressionUrls;
    }

    /* renamed from: n */
    public ActionTrackingLink[] mo46068n() {
        return this.videoResumedUrls;
    }

    /* renamed from: o */
    public ActionTrackingLink[] mo46069o() {
        return this.videoRewardedUrls;
    }

    /* renamed from: p */
    public ActionTrackingLink[] mo46070p() {
        return this.videoSkippedUrls;
    }

    public String toString() {
        return super.toString();
    }

    public VideoTrackingDetails(C12132pb pbVar) {
        this.isVAST = true;
        this.impressionUrls = m53085b(pbVar.mo45680j());
        this.soundMuteUrls = m53085b(pbVar.mo45682l());
        this.soundUnmuteUrls = m53085b(pbVar.mo45687q());
        this.videoPausedUrls = m53085b(pbVar.mo45683m());
        this.videoResumedUrls = m53085b(pbVar.mo45684n());
        this.videoSkippedUrls = m53085b(pbVar.mo45686p());
        this.videoClosedUrls = m53085b(pbVar.mo45675e());
        this.inlineErrorTrackingUrls = m53085b(pbVar.mo45678h());
        this.videoClickTrackingUrls = m53085b(pbVar.mo45674d());
        this.absoluteTrackingUrls = mo46054a(pbVar.mo45671a());
        this.fractionTrackingUrls = mo46055a(pbVar.mo45679i(), pbVar.mo45677g());
        C12255a f = pbVar.mo45676f();
        if (f != null) {
            this.videoPostRollImpressionUrls = m53085b(f.mo46091d());
            this.videoPostRollClickTrackingUrls = m53085b(f.mo46089b());
        }
    }

    /* renamed from: b */
    public static ActionTrackingLink[] m53085b(List<String> list) {
        if (list == null) {
            return new ActionTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String b : list) {
            ActionTrackingLink actionTrackingLink = new ActionTrackingLink();
            actionTrackingLink.mo46076b(b);
            actionTrackingLink.mo46074a(true);
            actionTrackingLink.mo46073a("");
            arrayList.add(actionTrackingLink);
        }
        return (ActionTrackingLink[]) arrayList.toArray(new ActionTrackingLink[0]);
    }

    /* renamed from: a */
    public final AbsoluteTrackingLink[] mo46054a(List<C12349tb<Integer>> list) {
        if (list == null) {
            return new AbsoluteTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C12349tb next : list) {
            AbsoluteTrackingLink absoluteTrackingLink = new AbsoluteTrackingLink();
            absoluteTrackingLink.mo46076b(next.f54777a);
            if (((Integer) next.f54778b).intValue() != -1) {
                absoluteTrackingLink.mo46046a(((Integer) next.f54778b).intValue());
            }
            absoluteTrackingLink.mo46074a(true);
            absoluteTrackingLink.mo46073a("");
            arrayList.add(absoluteTrackingLink);
        }
        return (AbsoluteTrackingLink[]) arrayList.toArray(new AbsoluteTrackingLink[0]);
    }

    /* renamed from: a */
    public final FractionTrackingLink[] mo46055a(List<C12349tb<Float>> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C12349tb next : list) {
            FractionTrackingLink fractionTrackingLink = new FractionTrackingLink();
            fractionTrackingLink.mo46076b(next.f54777a);
            fractionTrackingLink.mo46049a((int) (((Float) next.f54778b).floatValue() * 100.0f));
            fractionTrackingLink.mo46074a(true);
            fractionTrackingLink.mo46073a("");
            arrayList.add(fractionTrackingLink);
        }
        for (String b : list2) {
            FractionTrackingLink fractionTrackingLink2 = new FractionTrackingLink();
            fractionTrackingLink2.mo46076b(b);
            fractionTrackingLink2.mo46049a(100);
            fractionTrackingLink2.mo46074a(true);
            fractionTrackingLink2.mo46073a("");
            arrayList.add(fractionTrackingLink2);
        }
        return arrayList.size() > 0 ? (FractionTrackingLink[]) arrayList.toArray(new FractionTrackingLink[0]) : new FractionTrackingLink[0];
    }
}
