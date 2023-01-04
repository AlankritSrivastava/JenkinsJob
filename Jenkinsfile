pipeline {
  agent any

  stages {
    def mvnHome = tool name: 'Maven3', type: 'maven'
    stage ('Compile') {
      steps {
        sh "${mvnHome}/bin/mvn clean"
      }
    }
    stage ('Test') {
      steps {
        sh "${mvnHome}/bin/mvn test"
      }
    }
    stage ('Build') {
      steps {
        sh "${mvnHome}/bin/mvn install"
      }
    }
  }
}
