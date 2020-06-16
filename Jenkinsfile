pipeline{
    agent any
    stages{

        stage ('Compile Stage'){
            steps{
                withGradle(gradle : 'Gradle_6_5'){
                    sh 'gradle clean build'
                }
            }
        }

        stage('Run Test'){

            steps{
                withGradle(gradle : 'Gradle_6_5'){
                    sh 'gradle clean test'
                }
            }
        }

    }
}