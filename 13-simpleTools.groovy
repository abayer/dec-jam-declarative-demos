pipeline {
    agent label:"some-label"
    tools {
        maven "apache-maven-3.0.1"
    }
    stages {
        stage("foo") {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
