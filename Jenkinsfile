pipeline {
  agent any

  stages {
    stage('Test application') {
      steps {
        sh "./gradlew clean build"
      }
    }
  }
}
