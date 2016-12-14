pipeline {
    agent none
    stages {
        stage("foo") {
            agent any
            steps {
                sh('echo "THIS WORKS"')
            }
        }
    }
}



