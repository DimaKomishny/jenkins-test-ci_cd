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
        stage("Build") {
            steps {
                sh 'mvn clean package'
            }
        }
        stage("Second step") {
            steps {
                sh 'ssh root@172.31.1.148 \'uptime\''
            }
        }
    }
}