#!groovy
properties([disableConcurrentBuilds()])

pipeline {
    agent any
    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
        timestamps()
    }
    stages {
        stage("Build") {
            steps {
                sh 'maven package'
            }
        }
        stage("Second step") {
            steps {
                sh 'ssh root@172.31.1.148 \'uptime\''
            }
        }
    }
}