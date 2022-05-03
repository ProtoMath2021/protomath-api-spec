plugins {
    id("org.openapi.generator") version "5.4.0"
    `java-library`
    `maven-publish`
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

group = "com.protomath"
version = "0.0.6"

openApiGenerate {
    generatorName.set("spring")
    inputSpec.set("$rootDir/specs/api.yaml")
    templateDir.set("${rootDir}/template")
    outputDir.set("$buildDir/generated")
    configFile.set("$rootDir/api-config.json")
    typeMappings.set(mapOf("integer" to "Long"))
    validateSpec.set(true)
}

sourceSets["main"].java.srcDir(file("$buildDir/generated/src/main/java"))

tasks.compileJava { dependsOn("openApiGenerate") }

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.0.1")
    implementation("javax.validation:validation-api:2.0.1.Final")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("io.swagger.core.v3:swagger-annotations:2.1.13")
    implementation("org.springframework:spring-context:5.3.19")
    implementation("org.springframework:spring-web:5.3.19")
    compileOnly("javax.servlet:servlet-api:2.5")
}

java {
    withJavadocJar()
    withSourcesJar()
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/protomath2021/protomath-api-spec")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}