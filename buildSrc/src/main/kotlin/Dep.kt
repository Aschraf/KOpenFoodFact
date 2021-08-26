object Dep {
  fun ktorClient(module: String) = "io.ktor:ktor-client-$module:1.6.1"


  private const val serializationVersion = "1.2.2"
  const val serializationCore = "org.jetbrains.kotlinx:kotlinx-serialization-core:$serializationVersion"
  const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-core:$serializationVersion"

}