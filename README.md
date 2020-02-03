# Android-Java-Kotlin-Jacoco

This project generates a jacoco test report and send it to sonarqube (needs to add your host url).
Its a multi module project with java and kotlin classes.


## Getting started

1. Build your project
2. run gradle task "testDebugUnitTest"
3. run jacoco gradle task "jacocoTestReport" (created in jacoco.gradle and your report is in "../app/build/reports/rep")
4. run sonarqube task
