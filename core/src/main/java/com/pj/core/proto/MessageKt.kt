// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: nativeBridge.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.pj.core.proto;

@kotlin.jvm.JvmName("-initializemessage")
public inline fun message(block: com.pj.core.proto.MessageKt.Dsl.() -> kotlin.Unit): com.pj.core.proto.NativeBridge.Message =
  com.pj.core.proto.MessageKt.Dsl._create(com.pj.core.proto.NativeBridge.Message.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `Message`
 */
public object MessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.pj.core.proto.NativeBridge.Message.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.pj.core.proto.NativeBridge.Message.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.pj.core.proto.NativeBridge.Message = _builder.build()

    /**
     * `string key = 1;`
     */
    public var key: kotlin.String
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * `string key = 1;`
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * `.Container container = 2;`
     */
    public var container: com.pj.core.proto.NativeBridge.Container
      @JvmName("getContainer")
      get() = _builder.getContainer()
      @JvmName("setContainer")
      set(value) {
        _builder.setContainer(value)
      }
    /**
     * `.Container container = 2;`
     */
    public fun clearContainer() {
      _builder.clearContainer()
    }
    /**
     * `.Container container = 2;`
     * @return Whether the container field is set.
     */
    public fun hasContainer(): kotlin.Boolean {
      return _builder.hasContainer()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.pj.core.proto.NativeBridge.Message.copy(block: `com.pj.core.proto`.MessageKt.Dsl.() -> kotlin.Unit): com.pj.core.proto.NativeBridge.Message =
  `com.pj.core.proto`.MessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.pj.core.proto.NativeBridge.MessageOrBuilder.containerOrNull: com.pj.core.proto.NativeBridge.Container?
  get() = if (hasContainer()) getContainer() else null

