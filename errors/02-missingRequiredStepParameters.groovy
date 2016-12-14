pipeline {
    agent none
    stages {
        stage("foo") {
            steps {
                timeout {
                    echo "hello"
                }
            }
        }
    }
}