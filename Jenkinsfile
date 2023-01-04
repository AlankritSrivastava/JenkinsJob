pipeline {
  agent any
  tools {
    maven 'maven3' 
  }

  stages {
    stage ('Compile') {
      steps {
        sh 'mvn clean'
      }
    }
    stage ('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage ('Build') {
      steps {
        sh 'mvn install'
      }
    }
  }
}
