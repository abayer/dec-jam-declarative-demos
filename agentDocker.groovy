pipeline {
    agent docker:"httpd:2.4.12", dockerArgs:"-v /tmp:/tmp -p 80:80"
    stages {
        stage("foo") {
            steps {
                sh 'cat /usr/local/apache2/conf/extra/httpd-userdir.conf'
                sh 'echo "The answer is 42"'
            }
        }
    }
}



