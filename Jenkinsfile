#!groovy
properties([disableConcurrentBuilds()])

pipeline {
    agent any
    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
        timestamps()
        timeout(time: 3, unit: 'MINUTES')
    }
    stages {
        stage('Setup parameters') {
            script {
                properties([
                    parameters([
                        choice(
                            choices: ['maven', 'gradle'],
                            name: 'buildTool'
                        )
                    ])
                ])
            }
        }
        stage("Test") {
                    steps {
                        sh 'mvn surefire:test'
                    }
                }
        stage("Build") {
            steps {
                sh 'mvn clean package'
            }
        }
        stage("Deploy") {
            steps {
                sh 'scp target/jenkins-ci-cd-test-0.0.1-SNAPSHOT.jar root@172.31.1.148:app.jar'
                sh 'ssh root@172.31.1.148 \'sh start.sh\''
            }
        }
    }
}