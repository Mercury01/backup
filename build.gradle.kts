plugins {
    kotlin("jvm") version "1.3.61"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

application {
    mainClassName = "Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.google.api-client:google-api-client:1.23.0")
    implementation("com.google.oauth-client:google-oauth-client-jetty:1.23.0")
    implementation("com.google.apis:google-api-services-drive:v3-rev110-1.23.0")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

}
//task getSquare(type: JavaExec) {
//    classpath sourceSets.main.runtimeClasspath
//            main = "com.example.SquareKt"
//    args "5"
//}