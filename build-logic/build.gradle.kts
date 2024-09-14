plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.bundles.plugins.gradle)
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}