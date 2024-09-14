plugins {
    id("java")
    id("kotlin")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testImplementation(libs.bundles.test)
}