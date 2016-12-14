pipeline {
    agent none
    stages {
        stage("foo") {
            agent label:'some-label'
            steps {
                sh('echo HOST=$HOST')
            }
        }
    }
}



