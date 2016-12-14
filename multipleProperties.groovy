pipeline {
    agent none
    parameters {
        booleanParam(defaultValue: true, description: '', name: 'flag')
        // TODO: Be prepared to change this to "stringParam" once we're on a new enough core.
        string(defaultValue: '', description: '', name: 'SOME_STRING')
    }
    triggers {
        cron('@daily')
    }
    properties {
        buildDiscarder(logRotator(numToKeepStr:'1'))
        disableConcurrentBuilds()
    }
    stages {
        stage("foo") {
            steps {
                echo "hello"
            }
        }
    }
}


