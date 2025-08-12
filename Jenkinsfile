pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Unit Tests') {
            steps {
                bat 'mvn -B test'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target\\*.jar', fingerprint: true
        }
    }
}
