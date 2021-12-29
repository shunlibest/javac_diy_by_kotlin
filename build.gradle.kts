import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.shunli"
version = "1.0-SNAPSHOT"


repositories {
    maven {
        setUrl("https://maven.aliyun.com/repository/central")
    }
    maven {
        setUrl("https://maven.aliyun.com/repository/public")
    }
    maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin")  }

    mavenLocal()
//
    maven { setUrl("https://maven.aliyun.com/repository/google")  }

//
//    maven {
//        url 'https://mirrors.huaweicloud.com/repository/maven/'
//    }
//    maven { url "http://developer.huawei.com/repo/" }     // 华为 maven 仓库地址

    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}