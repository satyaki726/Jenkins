pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
               sh "mvn -version"
               sh "mvn clean install"
            }
        }
    }
}
