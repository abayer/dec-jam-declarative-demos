pipeline {
    agent none
    stages {
        stage("foo") {
            steps {
                echo "hello"
            }
        }
    }
    post {
        always {
            echo "I HAVE FINISHED"
        }
        success {
            echo "MOST DEFINITELY FINISHED"
        }
        failure {
            echo "I FAILED"
        }
    }
}



