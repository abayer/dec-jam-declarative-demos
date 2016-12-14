pipeline {
    // If we'd gone with "agent none", the sh step below would fail,
    // since we wouldn't be running on an agent!
    agent any
    stages {
        stage("foo") {
            steps {
                sh('echo "THIS WORKS"')
            }
        }
    }
}



