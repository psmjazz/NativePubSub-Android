// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: nativeBridge.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.pj.core.proto;

@kotlin.jvm.JvmName("-initializecontainer")
public inline fun container(block: com.pj.core.proto.ContainerKt.Dsl.() -> kotlin.Unit): com.pj.core.proto.NativeBridge.Container =
  com.pj.core.proto.ContainerKt.Dsl._create(com.pj.core.proto.NativeBridge.Container.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `Container`
 */
public object ContainerKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.pj.core.proto.NativeBridge.Container.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.pj.core.proto.NativeBridge.Container.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.pj.core.proto.NativeBridge.Container = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class BooleansProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `map<string, bool> booleans = 1;`
     */
     public val booleans: com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Boolean, BooleansProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getBooleansMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getBooleansMap()
      )
    /**
     * `map<string, bool> booleans = 1;`
     */
    @JvmName("putBooleans")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Boolean, BooleansProxy>
      .put(key: kotlin.String, value: kotlin.Boolean) {
         _builder.putBooleans(key, value)
       }
    /**
     * `map<string, bool> booleans = 1;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setBooleans")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Boolean, BooleansProxy>
      .set(key: kotlin.String, value: kotlin.Boolean) {
         put(key, value)
       }
    /**
     * `map<string, bool> booleans = 1;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeBooleans")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Boolean, BooleansProxy>
      .remove(key: kotlin.String) {
         _builder.removeBooleans(key)
       }
    /**
     * `map<string, bool> booleans = 1;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllBooleans")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Boolean, BooleansProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, kotlin.Boolean>) {
         _builder.putAllBooleans(map)
       }
    /**
     * `map<string, bool> booleans = 1;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearBooleans")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Boolean, BooleansProxy>
      .clear() {
         _builder.clearBooleans()
       }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class IntegersProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `map<string, int32> integers = 2;`
     */
     public val integers: com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, IntegersProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getIntegersMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getIntegersMap()
      )
    /**
     * `map<string, int32> integers = 2;`
     */
    @JvmName("putIntegers")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, IntegersProxy>
      .put(key: kotlin.String, value: kotlin.Int) {
         _builder.putIntegers(key, value)
       }
    /**
     * `map<string, int32> integers = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setIntegers")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, IntegersProxy>
      .set(key: kotlin.String, value: kotlin.Int) {
         put(key, value)
       }
    /**
     * `map<string, int32> integers = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeIntegers")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, IntegersProxy>
      .remove(key: kotlin.String) {
         _builder.removeIntegers(key)
       }
    /**
     * `map<string, int32> integers = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllIntegers")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, IntegersProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, kotlin.Int>) {
         _builder.putAllIntegers(map)
       }
    /**
     * `map<string, int32> integers = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearIntegers")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, IntegersProxy>
      .clear() {
         _builder.clearIntegers()
       }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class FloatsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `map<string, float> floats = 3;`
     */
     public val floats: com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Float, FloatsProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getFloatsMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getFloatsMap()
      )
    /**
     * `map<string, float> floats = 3;`
     */
    @JvmName("putFloats")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Float, FloatsProxy>
      .put(key: kotlin.String, value: kotlin.Float) {
         _builder.putFloats(key, value)
       }
    /**
     * `map<string, float> floats = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setFloats")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Float, FloatsProxy>
      .set(key: kotlin.String, value: kotlin.Float) {
         put(key, value)
       }
    /**
     * `map<string, float> floats = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeFloats")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Float, FloatsProxy>
      .remove(key: kotlin.String) {
         _builder.removeFloats(key)
       }
    /**
     * `map<string, float> floats = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllFloats")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Float, FloatsProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, kotlin.Float>) {
         _builder.putAllFloats(map)
       }
    /**
     * `map<string, float> floats = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearFloats")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Float, FloatsProxy>
      .clear() {
         _builder.clearFloats()
       }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class StringsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `map<string, string> strings = 4;`
     */
     public val strings: com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, StringsProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getStringsMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getStringsMap()
      )
    /**
     * `map<string, string> strings = 4;`
     */
    @JvmName("putStrings")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, StringsProxy>
      .put(key: kotlin.String, value: kotlin.String) {
         _builder.putStrings(key, value)
       }
    /**
     * `map<string, string> strings = 4;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setStrings")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, StringsProxy>
      .set(key: kotlin.String, value: kotlin.String) {
         put(key, value)
       }
    /**
     * `map<string, string> strings = 4;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeStrings")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, StringsProxy>
      .remove(key: kotlin.String) {
         _builder.removeStrings(key)
       }
    /**
     * `map<string, string> strings = 4;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllStrings")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, StringsProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, kotlin.String>) {
         _builder.putAllStrings(map)
       }
    /**
     * `map<string, string> strings = 4;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearStrings")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, StringsProxy>
      .clear() {
         _builder.clearStrings()
       }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class BytesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `map<string, bytes> bytes = 5;`
     */
     public val bytes: com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, BytesProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getBytesMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getBytesMap()
      )
    /**
     * `map<string, bytes> bytes = 5;`
     */
    @JvmName("putBytes")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, BytesProxy>
      .put(key: kotlin.String, value: com.google.protobuf.ByteString) {
         _builder.putBytes(key, value)
       }
    /**
     * `map<string, bytes> bytes = 5;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setBytes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, BytesProxy>
      .set(key: kotlin.String, value: com.google.protobuf.ByteString) {
         put(key, value)
       }
    /**
     * `map<string, bytes> bytes = 5;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeBytes")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, BytesProxy>
      .remove(key: kotlin.String) {
         _builder.removeBytes(key)
       }
    /**
     * `map<string, bytes> bytes = 5;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllBytes")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, BytesProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, com.google.protobuf.ByteString>) {
         _builder.putAllBytes(map)
       }
    /**
     * `map<string, bytes> bytes = 5;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearBytes")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, BytesProxy>
      .clear() {
         _builder.clearBytes()
       }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ContainersProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `map<string, .Container> containers = 6;`
     */
     public val containers: com.google.protobuf.kotlin.DslMap<kotlin.String, com.pj.core.proto.NativeBridge.Container, ContainersProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getContainersMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getContainersMap()
      )
    /**
     * `map<string, .Container> containers = 6;`
     */
    @JvmName("putContainers")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.pj.core.proto.NativeBridge.Container, ContainersProxy>
      .put(key: kotlin.String, value: com.pj.core.proto.NativeBridge.Container) {
         _builder.putContainers(key, value)
       }
    /**
     * `map<string, .Container> containers = 6;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setContainers")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.pj.core.proto.NativeBridge.Container, ContainersProxy>
      .set(key: kotlin.String, value: com.pj.core.proto.NativeBridge.Container) {
         put(key, value)
       }
    /**
     * `map<string, .Container> containers = 6;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeContainers")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.pj.core.proto.NativeBridge.Container, ContainersProxy>
      .remove(key: kotlin.String) {
         _builder.removeContainers(key)
       }
    /**
     * `map<string, .Container> containers = 6;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllContainers")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.pj.core.proto.NativeBridge.Container, ContainersProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, com.pj.core.proto.NativeBridge.Container>) {
         _builder.putAllContainers(map)
       }
    /**
     * `map<string, .Container> containers = 6;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearContainers")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.pj.core.proto.NativeBridge.Container, ContainersProxy>
      .clear() {
         _builder.clearContainers()
       }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.pj.core.proto.NativeBridge.Container.copy(block: `com.pj.core.proto`.ContainerKt.Dsl.() -> kotlin.Unit): com.pj.core.proto.NativeBridge.Container =
  `com.pj.core.proto`.ContainerKt.Dsl._create(this.toBuilder()).apply { block() }._build()

