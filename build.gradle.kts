/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java Library project to get you started.
 * For more details take a look at the Java Libraries chapter in the Gradle
 * User Manual available at https://docs.gradle.org/5.2/userguide/java_library_plugin.html
 */

group = "com.github.lucassklp.jinq"
version = "0.1.0"

plugins {
    // Apply the java-library plugin to add support for Java Library
    id("com.gradle.plugin-publish") version "0.10.1"
    `java-library`
    `java-gradle-plugin`
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api("org.apache.commons:commons-math3:3.6.1")

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation("com.google.guava:guava:27.0.1-jre")

    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}

gradlePlugin {
    plugins {
        create("jinq") {
            id = "com.github.lucassklp.jinq"
            implementationClass = "com.github.lucassklp.jinq.QueryableList"
        }
    }
}

pluginBundle {
    // These settings are set for the whole plugin bundle
    website = "https://github.com/lucassklp/jinq"
    vcsUrl = "https://github.com/lucassklp/jinq"

    description = "jinq - Java Integrated Query -  LINQ implementation for Java Developers!"

    (plugins) {

        // first plugin
        "jinq" {
            // id is captured from java-gradle-plugin configuration
            displayName = "Gradle Greeting plugin"
            tags = listOf("individual", "tags", "per", "plugin")
            version = "0.1"
        }
    }
}