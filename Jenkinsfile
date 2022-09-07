pipeline {
    agent any
    
    tools{
        maven "maven-3.8.6"
    }

    stages {
        stage('Hello') {
            steps {
               bat "clean install"
            }
        }
    }  
}
