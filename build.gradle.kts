import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.github.aschraf.foodclient"

plugins {
  kotlin("jvm") version "1.7.10"
  kotlin("plugin.serialization") version "1.5.30"
  id("io.gitlab.arturbosch.detekt") version "1.18.0"
}



detekt {
  buildUponDefaultConfig = true

  config = files("$projectDir/detekt/detekt-config.yml") // point to your custom config defining rules to run, overwriting default behavior
  baseline = file("$projectDir/detekt/detekt-baseline.xml") // a way of suppressing issues before introducing detekt


  reports {
    html.enabled = true // observe findings in your browser with structure and code snippets
  }
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(Dep.ktorClient("core"))
  implementation(Dep.ktorClient("cio"))
  implementation(Dep.ktorClient("serialization"))
}

val javaVersionString = "11"

tasks {

  withType<KotlinCompile>() {
    kotlinOptions {
      jvmTarget = javaVersionString
    }
  }

  withType<JavaCompile>().configureEach {
    sourceCompatibility = javaVersionString
    targetCompatibility = javaVersionString
  }
}