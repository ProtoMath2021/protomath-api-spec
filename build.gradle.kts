plugins {
    id("org.openapi.generator") version "5.4.0"
    `java-library`
}

openApiGenerate {
    generatorName.set("kotlin-spring")
    inputSpec.set("$rootDir/specs/api.yaml")
    templateDir.set("${rootDir}/template")
    configFile.set("$rootDir/api-config.json")
    validateSpec.set(true)
}
