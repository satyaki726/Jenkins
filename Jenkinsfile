pipeline {
    agent any
    
    tools{
        maven "3.19"
    }

    stages {
        stage('Hello') {
            steps {
               sh "mvn clean install"
            }
        }
    }
    post {
       always {
              cleanWs()
              }
         }     
}
