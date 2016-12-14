pipeline {
    agent dockerfile:true, dockerArgs:"-v /tmp:/tmp -p 8000:8000"
    stages {
        stage("foo") {
            steps {
                sh 'cat /hi-there'
                sh 'echo "The answer is 42"'
            }
        }
    }
}



