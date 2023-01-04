pipeline {
  agent any

  stages {
    stage ('Compile') {
      steps {
        withMaven(maven : 'Maven3'){
        bat'mvn clean'
        }
      }
    }
    stage ('Test') {
      steps {
        withMaven(maven : 'Maven3'){
        bat'mvn test'
        }
      }
    }
    stage ('Build') {
      steps {
        withMaven(maven : 'Maven3'){
        bat'mvn install'
        }
      }
    }
  }
}
