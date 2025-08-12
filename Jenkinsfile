pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat '"%MAVEN_HOME%\\bin\\mvn" -B -DskipTests clean package'
            }
        }
        stage('Unit Tests') {
            steps {
                bat '"%MAVEN_HOME%\\bin\\mvn" -B test'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}
