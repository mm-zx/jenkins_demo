pipeline {
    agent any
    stages{
        stage('Pull Git Demo') {
            steps{
                git credentialsId: '8b485a9e-8a84-4bf5-9557-638c281262ea', url: 'https://github.com/mm-zx/java_concurrent.git'
            }
        }
   }
}