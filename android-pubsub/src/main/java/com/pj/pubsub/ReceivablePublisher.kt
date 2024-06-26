package com.pj.pubsub

import android.util.Log
import com.pj.pubsub.extensions.Envelope
import com.pj.pubsub.extensions.Message
import com.pj.pubsub.proto.NativePubSub.Envelope

interface Receivable{
    fun setReceivingRule(all: Tag)
    fun matchTag(tag: Tag): Boolean
    fun onReceive(envelopeHolder: EnvelopeHolder)
}
open class Publisher(){

    private object IDCounter {
        private var id: Int = PublisherType.Android.defaultID
        val ID : Int
            get() {
                return ++id
            }
    }
    val id:Int = IDCounter.ID

    private var baseTag: Tag = Tag.none

    fun setBasePublishingTag(tag: Tag){
        baseTag = tag
    }

    fun publish(message: Message){
        val envelope = Envelope(message, this.id)
        MessageManager.mediator.publish(envelope, baseTag)
    }

    fun publish(message : Message, tag: Tag){
        val envelope = Envelope(message, this.id)
        val joined = baseTag.join(tag)
        MessageManager.mediator.publish(envelope, joined)
    }

    internal fun publish(envelope: Envelope, tag: Tag){
        val joined = baseTag.join(tag)
        MessageManager.mediator.publish(envelope, joined)
    }
}
abstract class ReceivablePublisher() : Publisher(), Receivable{
}