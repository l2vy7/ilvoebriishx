package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {
            private final CopyOnWriteArrayList<HandlerAndListener> listeners = new CopyOnWriteArrayList<>();

            private static final class HandlerAndListener {
                /* access modifiers changed from: private */
                public final Handler handler;
                /* access modifiers changed from: private */
                public final EventListener listener;
                /* access modifiers changed from: private */
                public boolean released;

                public HandlerAndListener(Handler handler2, EventListener eventListener) {
                    this.handler = handler2;
                    this.listener = eventListener;
                }

                public void release() {
                    this.released = true;
                }
            }

            public void addListener(Handler handler, EventListener eventListener) {
                Assertions.checkNotNull(handler);
                Assertions.checkNotNull(eventListener);
                removeListener(eventListener);
                this.listeners.add(new HandlerAndListener(handler, eventListener));
            }

            public void bandwidthSample(int i, long j, long j2) {
                Iterator<HandlerAndListener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    HandlerAndListener next = it.next();
                    if (!next.released) {
                        next.handler.post(new C6989b(next, i, j, j2));
                    }
                }
            }

            public void removeListener(EventListener eventListener) {
                Iterator<HandlerAndListener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    HandlerAndListener next = it.next();
                    if (next.listener == eventListener) {
                        next.release();
                        this.listeners.remove(next);
                    }
                }
            }
        }

        void onBandwidthSample(int i, long j, long j2);
    }

    void addEventListener(Handler handler, EventListener eventListener);

    long getBitrateEstimate();

    long getTimeToFirstByteEstimateUs();

    TransferListener getTransferListener();

    void removeEventListener(EventListener eventListener);
}
