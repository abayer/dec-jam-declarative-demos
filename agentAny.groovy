pipeline {
    agent any
    stages {
        stage("foo") {
            steps {
                sh('echo "THIS WORKS"')
            }
        }
    }
}



