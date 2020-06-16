pipeline{
    agent any
    stages{

        stage ('Compile Stage'){
            steps{

                    sh 'gradle clean build'

            }
        }

        stage('Run Test'){

            steps{

                    sh 'gradle clean test'

            }
        }

    }
}