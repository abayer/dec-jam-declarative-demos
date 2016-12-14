pipeline {
    agent none
    stages {
        stage("foo") {
            steps {
                parallel(
                         first: {
                                 echo "First branch"
                             },
                         second: {
                                 echo "Second branch"
                             }
                         )
            }
        }
    }
}



