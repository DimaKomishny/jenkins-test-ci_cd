#!groovy
pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '10') artifactNumToKeepStr: '10')
    }
    stages {
        stage('Build') {
            steps {
                sh 'ssh root@172.31.1.148'
                echo 'Building..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}