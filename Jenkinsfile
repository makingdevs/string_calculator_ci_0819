pipeline {
  agent any

  stages {
    stage('Test unit application') {
      steps {
        sh "./gradlew clean build"
      }
    }
    stage('Test integration application') {
      steps {
        sh "./gradlew clean build"
      }
    }
    stage('Test UI application') {
      steps {
        sh "./gradlew clean build"
      }
    }
  }
}
