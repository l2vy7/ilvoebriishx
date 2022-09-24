package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.analytics.h1 */
/* compiled from: AnalyticsListener */
public final /* synthetic */ class C6580h1 {
    /* renamed from: A */
    public static void m28405A(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, long j) {
    }

    /* renamed from: B */
    public static void m28406B(AnalyticsListener analyticsListener, Player player, AnalyticsListener.Events events) {
    }

    /* renamed from: C */
    public static void m28407C(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z) {
    }

    /* renamed from: D */
    public static void m28408D(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z) {
    }

    /* renamed from: E */
    public static void m28409E(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    /* renamed from: F */
    public static void m28410F(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    /* renamed from: G */
    public static void m28411G(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
    }

    /* renamed from: H */
    public static void m28412H(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Deprecated
    /* renamed from: I */
    public static void m28413I(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z) {
    }

    /* renamed from: J */
    public static void m28414J(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
    }

    /* renamed from: K */
    public static void m28415K(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    /* renamed from: L */
    public static void m28416L(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Metadata metadata) {
    }

    /* renamed from: M */
    public static void m28417M(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    /* renamed from: N */
    public static void m28418N(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    /* renamed from: O */
    public static void m28419O(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    /* renamed from: P */
    public static void m28420P(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    /* renamed from: Q */
    public static void m28421Q(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, ExoPlaybackException exoPlaybackException) {
    }

    /* renamed from: R */
    public static void m28422R(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    @Deprecated
    /* renamed from: S */
    public static void m28423S(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    @Deprecated
    /* renamed from: T */
    public static void m28424T(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    /* renamed from: U */
    public static void m28425U(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }

    /* renamed from: V */
    public static void m28426V(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Object obj, long j) {
    }

    /* renamed from: W */
    public static void m28427W(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    @Deprecated
    /* renamed from: X */
    public static void m28428X(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    @Deprecated
    /* renamed from: Y */
    public static void m28429Y(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    /* renamed from: Z */
    public static void m28430Z(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z) {
    }

    /* renamed from: a */
    public static void m28431a(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
    }

    /* renamed from: a0 */
    public static void m28432a0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z) {
    }

    /* renamed from: b */
    public static void m28433b(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    /* renamed from: b0 */
    public static void m28434b0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, List list) {
    }

    @Deprecated
    /* renamed from: c */
    public static void m28435c(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    /* renamed from: c0 */
    public static void m28436c0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, int i2) {
    }

    /* renamed from: d */
    public static void m28437d(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
    }

    /* renamed from: d0 */
    public static void m28438d0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    /* renamed from: e */
    public static void m28439e(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str) {
    }

    /* renamed from: e0 */
    public static void m28440e0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    /* renamed from: f */
    public static void m28441f(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    /* renamed from: f0 */
    public static void m28442f0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    /* renamed from: g */
    public static void m28443g(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    /* renamed from: g0 */
    public static void m28444g0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Deprecated
    /* renamed from: h */
    public static void m28445h(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Format format) {
    }

    @Deprecated
    /* renamed from: h0 */
    public static void m28446h0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    /* renamed from: i */
    public static void m28447i(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    /* renamed from: i0 */
    public static void m28448i0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
    }

    /* renamed from: j */
    public static void m28449j(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j) {
    }

    /* renamed from: j0 */
    public static void m28450j0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str) {
    }

    /* renamed from: k */
    public static void m28451k(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    /* renamed from: k0 */
    public static void m28452k0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    /* renamed from: l */
    public static void m28453l(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    /* renamed from: l0 */
    public static void m28454l0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    /* renamed from: m */
    public static void m28455m(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    /* renamed from: m0 */
    public static void m28456m0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j, int i) {
    }

    /* renamed from: n */
    public static void m28457n(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    @Deprecated
    /* renamed from: n0 */
    public static void m28458n0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Format format) {
    }

    @Deprecated
    /* renamed from: o */
    public static void m28459o(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
    }

    /* renamed from: o0 */
    public static void m28460o0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Deprecated
    /* renamed from: p */
    public static void m28461p(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
    }

    @Deprecated
    /* renamed from: p0 */
    public static void m28462p0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
    }

    @Deprecated
    /* renamed from: q */
    public static void m28463q(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, String str, long j) {
    }

    /* renamed from: q0 */
    public static void m28464q0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
    }

    @Deprecated
    /* renamed from: r */
    public static void m28465r(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, Format format) {
    }

    /* renamed from: r0 */
    public static void m28466r0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, float f) {
    }

    /* renamed from: s */
    public static void m28467s(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    /* renamed from: t */
    public static void m28468t(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    /* renamed from: u */
    public static void m28469u(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    /* renamed from: v */
    public static void m28470v(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    @Deprecated
    /* renamed from: w */
    public static void m28471w(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    /* renamed from: x */
    public static void m28472x(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    /* renamed from: y */
    public static void m28473y(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    /* renamed from: z */
    public static void m28474z(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }
}
