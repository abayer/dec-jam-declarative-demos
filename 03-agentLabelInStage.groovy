pipeline {
    agent none
    stages {
        stage("foo") {
            agent label:'some-label'
            steps {
                sh('echo "THIS WORKS"')
            }
        }
    }
}



