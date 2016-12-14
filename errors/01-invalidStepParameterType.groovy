pipeline {
    agent none
    stages {
        stage("foo") {
            steps {
                timeout(time: "someTime") {
                    echo "hello"
                }
            }
        }
    }
}
