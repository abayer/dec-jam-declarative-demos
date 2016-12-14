pipeline {
    agent any

    environment {
        FOO = "BAZ"
    }

    stages {
        stage("baz") {
            steps {
                sh 'echo "FOO is $FOO"'
            }
        }
        stage("bar") {
            environment {
                FOO = "BAR"
            }

            steps {
                sh 'echo "FOO is $FOO"'
            }
        }
    }
}



