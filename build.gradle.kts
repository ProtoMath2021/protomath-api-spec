plugins {
    id("org.openapi.generator") version "5.4.0"
    `java-library`
}

openApiGenerate {
    generatorName.set("spring")
    inputSpec.set("$rootDir/specs/api.yaml")
    templateDir.set("${rootDir}/template")
    outputDir.set("$buildDir/generated")
    configFile.set("$rootDir/api-config.json")
    typeMappings.set(mapOf("integer" to "Long"))
    validateSpec.set(true)
}
