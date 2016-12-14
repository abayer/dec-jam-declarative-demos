pipeline {
    agent any
    stages {
        stage("One") {
            steps {
                echo "Hello"
            }
        }
        stage("Two") {
            when {
                echo "Should I run?"
                return true
            }
            steps {
                script {
                    echo "World"
                    echo "Heal it"
                }

            }
        }
    }
}